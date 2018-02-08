package com.v41.tp1.modele;

import com.v41.tp1.modele.portal.IPortalModel;
import com.v41.tp1.vuecontroleur.portal.IPortalView;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ChemicalComposition implements IPortalModel
{
	
	private double weight;
	private ArrayList<Token> tokens;
	private TreeMap<String, Double> compositon;
	private IPortalView view;
	
	public ChemicalComposition()
	{
	}
	
	public ChemicalComposition(IPortalView view)
	{
		this();
		this.view = view;
	}
	
	public void init(ArrayList<Token> tokens)
	{
		weight = 0;
		compositon = new TreeMap<>();
		this.tokens = tokens;
		
		//Single thing of weights
		for (Token token :
				tokens)
		{
			if (token.getType() == TokenType.ELEMENT)
			{
				String token_string = token.getContent();
				ChemicalElement element = PeriodicTable.INSTANCE.getChemicalElement(token_string);
				compositon.put(token_string, element.getAtomicWeight());
			}
		}
		
		// B(Ar(CF3)2)4
		ArrayList<Integer> multipliers = new ArrayList<>();
		multipliers.add(1);
		int min_multipliers = 1;
		
		for (int i = tokens.size() - 1; i >= 0; i--)
		{
			Token current_token = tokens.get(i);
			String token_string = current_token.getContent();
			switch (current_token.getType())
			{
				case NUMBER:
					multipliers.add(Integer.parseInt(token_string));
					break;
				case PARENTHESES:
					if (token_string.equals(")"))
					{
						if (multipliers.size() <= min_multipliers) //If no multiplier was added before
						{
							multipliers.add(1);
						}
						min_multipliers++;
					} else if (token_string.equals("("))
					{
						min_multipliers--;
						multipliers.remove(multipliers.size() - 1); //Remove last
					}
					break;
				case ELEMENT:
					int current_multi = calculateMultiplier(multipliers);
					ChemicalElement element = PeriodicTable.INSTANCE.getChemicalElement(token_string);
					weight += element.getAtomicWeight() * current_multi;
					if (multipliers.size() > min_multipliers)
					{
						multipliers.remove(multipliers.size() - 1);
					}
					break;
			}
		}
		
		if(view != null)
			view.notify(this);
	}
	
	private int calculateMultiplier(ArrayList<Integer> multiplier)
	{
		int ret = 1;
		for (int i = 0; i < multiplier.size(); i++)
		{
			ret *= multiplier.get(i);
		}
		return ret;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	@Override
	public String getCompositionInformation()
	{
		String mapResult = "";
		for(Map.Entry<String, Double> entry : compositon.entrySet()){ //https://stackoverflow.com/questions/5757202/how-would-i-print-all-values-in-a-treemap
			mapResult += entry.getKey() + ": " + entry.getValue() + "\n";
		}
		return weight + "\n\n" + mapResult;
	}
}
