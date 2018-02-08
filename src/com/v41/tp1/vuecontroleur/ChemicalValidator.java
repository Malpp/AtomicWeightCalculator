package com.v41.tp1.vuecontroleur;


//Attention, cette classe deviendra un singleton
//La convertir en conséquence
public enum ChemicalValidator
{
    
    INSTANCE;
    
    private String[] errorMessages;

    private ChemicalValidator()
    {
        errorMessages = new String[10];
        errorMessages[0] = "Error: Formula does not contain anything.";
        errorMessages[1] = "Error: Formula starts with a number";
        errorMessages[2] = "Error: This is not a valid element";
        errorMessages[3] = "Error: A multiplier must be after an element or parenthesis.";
        errorMessages[4] = "Error: Multiplier less than 2.";
        errorMessages[5] = "Error: Extra 0 before a multiplier.";;
        errorMessages[6] = "Error: Empty parenthesis.";
        errorMessages[7] = "Error: Missing opening parenthesis.";
        errorMessages[8] = "Error: Missing closing parenthesis.";
        errorMessages[9] = "Erreo: Invalid characters";
    }
}