package com.v41.tp1.vuecontroleur;


import com.v41.tp1.modele.portal.IPortalModel;
import com.v41.tp1.vuecontroleur.portal.IPortalView;

import java.util.Scanner;

public final class View implements IPortalView {
    protected boolean running;
    protected String[] textesInterface;
    private Scanner scanner;

    public View() {
        running = true;
        textesInterface = new String[3];
        scanner = new Scanner(System.in);

        textesInterface[0] = "\n"; //pas de message de traitement au départ
        textesInterface[1] = "Bienvenue au prototype console du TP1\n";
        textesInterface[2] = "Entrez une formule chimique: ";

        Controller.INSTANCE.init(this, "periodicTableEnglish.txt");
    }

    public void Run() {
        while (running) {
            for (int i = 0; i < 3; i++) {
                System.out.print(textesInterface[i]);
            }

            //Ici on fera appel au controleur, on lui passera notre formule chimique, écrite par l'utilisateutr et il
            //retournera dans textesInterface[0] un string qui dit si la formule était valide ou non (et sinon pourquoi).
            // Si elle est valide, il lancera aussi les instructions pertinentes au modèle.
            String result = Controller.INSTANCE.parseUserInput(scanner.nextLine());
            System.out.print("\n" + result);
        }
    }

    @Override
    public void notify(IPortalModel model) {
        System.out.println(model.getCompositionInformation());
    }
}