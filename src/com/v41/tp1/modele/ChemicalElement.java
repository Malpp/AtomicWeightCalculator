package com.v41.tp1.modele;

public class ChemicalElement
{
	private String name;
	private String symbol;
	private int elementNumber;
	private double atomicWeight;
	
	public ChemicalElement()
	{
		this("", "", 0, 0);
	}
	
	public ChemicalElement(String symbol, String name, int elementNumber, double atomicWeight)
	{
		this.symbol = symbol;
		this.name = name;
		this.elementNumber = elementNumber;
		this.atomicWeight = atomicWeight;
	}
	
	public void loadElementFromString(String element)
	{
		//À COMPLÉTER
		//Hydrogène,H,1,1.00794
		String[] result = element.split("\\,");
		name = result[0];
		symbol = result[1];
		elementNumber = Integer.parseInt(result[2]);
		atomicWeight = Double.parseDouble(result[3]);
		//WHAT ARE ERRORS
		//THIS IS THE MODEL
		//THEY HAVE NO POWER HERE
	}
	
	
	public String getSymbol()
	{
		return symbol;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getElementNo()
	{
		return elementNumber;
	}
	
	public double getAtomicWeight()
	{
		return atomicWeight;
	}
	
	@Override
	public String toString()
	{
		return "Element no " + elementNumber + ": " + name + " (" + symbol + "), Atomic weight: " + atomicWeight;
	}
}
