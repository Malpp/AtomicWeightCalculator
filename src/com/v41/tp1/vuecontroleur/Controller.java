package com.v41.tp1.vuecontroleur;

import com.v41.tp1.modele.ChemicalComposition;
import com.v41.tp1.modele.PeriodicTable;

public enum Controller
{
	INSTANCE;
	
	private View view;
	private ChemicalComposition composition;
	
	private Controller()
	{
	
	}
	
	public void init(View view, String fileName)
	{
		this.view = view;
		PeriodicTable.INSTANCE.loadTableFromString(fileName);
		composition = new ChemicalComposition(view);
	}
	
	public String parseUserInput(String input)
	{
		StringWrapper userMessage = new StringWrapper();
		if (ChemicalValidator.INSTANCE.validateChemicalFormula(input, userMessage))
		{
			composition.init(ChemicalValidator.INSTANCE.getTokens());
		}
		return userMessage.contenu;
	}
	
}
