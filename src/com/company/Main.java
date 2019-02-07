package com.company;

public class Main {

    public static void main(String[] args) {
	// switch statements

        int number = 4;
        String numString;
        switch(number){
            case 1: numString = "uno";
            break;
            case 2: numString = "dos";
                break;
            case 3: numString = "tres";
                break;
            case 4: numString = "cuatro";
                break;
            case 5: numString = "cinco";
                break;
            case 6: numString = "seis";
                break;
            case 7: numString = "siete";
                break;
            case 8: numString = "ocho";
                break;
            case 9: numString = "nueve";
                break;
            case 10: numString = "diez";
                break;
            default: numString = "That was an invalid entry";

        }
        System.out.println(numString);
    }
}
