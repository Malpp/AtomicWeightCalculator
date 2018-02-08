package com.v41.tp1.modele.test;


//import com.v41.tp1.modele.ComposeChimique;


public class ComposeChimiqueTest
{
    private final double PRECISION = 0.005;  //Si jamais ça ne passe pas descendez la précision
                                             // 0.01 devrait fonctionner avec tout le monde
     @org.junit.jupiter.api.Test
    public void F_getPoids_AvecComposeChimiqueSansParenthese_DevraitRetournerLePoidsCorrespondant() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper sw = new StringWrapper();
//        ComposeChimique composeChimique = new ComposeChimique();
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("H", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 1.007947, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("H2O", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 18.01532, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("NaCl", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 58.4430, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("O2", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 31.99886, PRECISION);
    }

    @org.junit.jupiter.api.Test
    public void G_getPoids_AvecComposeChimiqueContenantParenthesesNonImbriquees_DevraitRetournerLePoidsCorrespondant() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper sw = new StringWrapper();
//        ComposeChimique composeChimique = new ComposeChimique();
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(NaCl)4", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 233.7719, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(O2)3", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 95.99658, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("CO(CH2OH)2", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 90.07831, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(CH3)2CO", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 58.07945, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("NaCl(O3H5)2H4", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 168.5508, PRECISION);
    }

    @org.junit.jupiter.api.Test
    public void H_getPoids_AvecComposeChimiqueContenantParenthesesImbriquées_DevraitRetournerLePoidsCorrespondant() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper sw = new StringWrapper();
//        ComposeChimique composeChimique = new ComposeChimique();
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(H(CN)4)5", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 525.3897, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(CN)4(O2)3", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 200.0666, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("B(Ar(CF3)2)4", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 722.6520, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(Al2Si2O5(OH)4)", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 258.1608, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(Ca4Si2O6(CO3)(OHF))2", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 816.9922, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(H2SO4(Be)3(H2O))2", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 286.2620, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("B(Ar(CF3)2)4", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 722.6520, PRECISION);
    }

    @org.junit.jupiter.api.Test
    public void I_getPoids_AvecComposeChimiqueContenantNombrePlusGrandQue9_DevraitRetournerLePoidsCorrespondant() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper sw = new StringWrapper();
//        ComposeChimique composeChimique = new ComposeChimique();
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("((MgFe)7Si8(OH)22)", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 1159.8984, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("(C18H24N2O6)", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 364.3948, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("C11H23COOH", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 200.3189, PRECISION);
//
//        ChemicalValidator.INSTANCE.validerFormuleChimique("C12H22O11", sw);
//        composeChimique.initialiser(ChemicalValidator.INSTANCE.getJetonsDeFormule());
//        assertEquals(composeChimique.getPoids(), 342.2979, PRECISION);
    }
}