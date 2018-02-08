package com.v41.tp1.modele;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.TreeMap;

public enum PeriodicTable
{
	INSTANCE;
	
	private TreeMap<String, ChemicalElement> elements;
	
	private PeriodicTable()
	{
		elements = new TreeMap<String, ChemicalElement>();
	}
	
	public void loadTableFromString(String fileName)
	{
		BufferedReader br = null;
		
		try
		{
			br = new BufferedReader(new FileReader(fileName));
			
			String line = br.readLine();
			
			while (line != null)
			{
				ChemicalElement element = new ChemicalElement();
				element.loadElementFromString(line);
				
				if (element.getAtomicWeight() > 0)
				{
					elements.put(element.getSymbol(), element);
				}
				
				line = br.readLine();
			}
			
			br.close();
		} catch (Exception e)
		{
			System.out.println(e.toString());
		}
	}
	
	ChemicalElement getChemicalElement(String symbole)
	{
		return elements.get(symbole);
	}
	
	public boolean isSymbol(String symbole)
	{
		ChemicalElement valeur = elements.get(symbole);
		
		if (valeur == null)
		{
			return false;
		}
		return true;
	}
}
