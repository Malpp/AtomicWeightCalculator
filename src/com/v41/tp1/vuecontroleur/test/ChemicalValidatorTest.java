package com.v41.tp1.vuecontroleur.test;

public class ChemicalValidatorTest
{
    @org.junit.jupiter.api.Test
    public void A_initialiser_AvecComposeChimiqueValideSansParenthese_DevraitRetournerVrai() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper messageUtilisateur = new StringWrapper();
//
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("H"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("H2O"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("NaCl"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("O2"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("C11H23COOH"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("C12H22O11"), messageUtilisateur));
    }

    @org.junit.jupiter.api.Test
    public void B_initialiser_AvecComposeChimiqueValideContenantParenthesesNonImbriquees_DevraitRetournerVrai() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper messageUtilisateur = new StringWrapper();
//
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H)"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(NaCl)4"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(O2)3"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(CN)4(O2)3"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("CO(CH2OH)2"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("C18H24N2O6"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("NaCl(O3H5)2H4"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(CH3)2CO"), messageUtilisateur));
    }

    @org.junit.jupiter.api.Test
    public void C_initialiser_AvecComposeChimiqueValideContenantParenthesesImbriquees_DevraitRetournerVrai() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper messageUtilisateur = new StringWrapper();
//
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H(CN)4)5"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("B(Ar(CF3)2)4"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("B(Ar(CF3)2)4"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("((MgFe)7Si8(OH)22)"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(Al2Si2O5(OH)4)"), messageUtilisateur));
//        assertTrue(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2SO4(Be)3(H2O))2"), messageUtilisateur));
    }

    @org.junit.jupiter.api.Test
    public void D_initialiser_AvecMauvaiseUtilisationParentheses_DevraitRetournerFaux() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper messageUtilisateur = new StringWrapper();
//
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique((")("), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("H2("), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("H)O("), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(NaCl))"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("((NaCl)"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique((")(H2N2)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("()H2N2)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2)N2)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2N2))4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2N2)4)"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("((H2N2)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2(N2)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2N2()4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2N2)(4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(H2N2)4("), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("()"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(())"), messageUtilisateur));
    }

    @org.junit.jupiter.api.Test
    public void E_initialiser_AvecComposesChimiquesInvalides_DevraitRetournerFaux() throws Exception
    {
//        PeriodicTable.INSTANCE.loadTableFromString("tableauPeriodique.txt");
//        StringWrapper messageUtilisateur = new StringWrapper();
//
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("h"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("nacl"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("CH1"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("Al0"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("BONDs007"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("H002O"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("al"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("fe"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("Hu"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("abc"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique((" "), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("!"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("H 2"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("Na+"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("3Al"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("3(Al)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(3Al)4"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(3Al)"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("((3Al))"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("9"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("(3)2"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("2(3)"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique(("H2 O2"), messageUtilisateur));
//        assertFalse(ChemicalValidator.INSTANCE.validerFormuleChimique((""), messageUtilisateur));
    }
}