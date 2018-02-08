package com.v41.tp1.vuecontroleur;


public final class View
{
	protected boolean running;
	protected String[] textesInterface;
	
	public View()
	{
		running = true;
		textesInterface = new String[3];
		
		textesInterface[0] = ""; //pas de message de traitement au départ
		textesInterface[1] = "Bienvenue au prototype console du TP1";
		textesInterface[2] = "Entrez une formule chimique: ";
		
		Controller.INSTANCE.init(this, "periodicTableEnglish.txt");
	}
	
	public void Run()
	{
		while (running)
		{
			for (int i = 0; i < 3; i++)
			{
				System.out.println(textesInterface[i]);
			}
			
			break; //Juste pour que la vérification initiale de compilation reste pas dans la boucle infini
			//Effeacez dès que vous avez une option de sortie.
			
			//Ici on fera appel au controleur, on lui passera notre formule chimique, écrite par l'utilisateutr et il
			//retournera dans textesInterface[0] un string qui dit si la formule était valide ou non (et sinon pourquoi).
			// Si elle est valide, il lancera aussi les instructions pertinentes au modèle.
		}
	}
}