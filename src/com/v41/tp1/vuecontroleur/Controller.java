package com.v41.tp1.vuecontroleur;

import com.v41.tp1.modele.PeriodicTable;

public enum Controller
{
	INSTANCE;
	
	private View view;
	
	private Controller()
	{
	
	}
	
	public void init(View view, String fileName)
	{
		this.view = view;
		PeriodicTable.INSTANCE.loadTableFromString(fileName);
	}
	
	public String parseUserUnpit(String input){
		return "";
	}
	
}
