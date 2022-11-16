package chapterfour;

import static java.lang.System.out;

public class SwitchCase {

    public static void main(String... args) {

        int switchValue = 3 ;

        switch (switchValue) {
            case 1:
                out.println(" value was 1 ");
                break;
            case 2:
                out.println(" value was 1 or 2 ");
                break;
            default:
                out.println(" was not 1 or 2 ");
                break;
        }
        int value = 2;

        if (value == 1) {
            out.println(" value was 1 ");
        } else if (value <= 2) {
            out.println(" value was 1 or 2 ");
        } else {
            out.println(" was not 1 or 2 ");
        }

       String charValue = "G";
        switch(charValue){
            case "A":
                out.println(" A was found ");
                break;
            case "B":
                out.println(" B was found ");
                break;
            case "C": case "D": case "E":
                out.println(charValue + " was found ");
                break;
            default:
                out.println(" could not find A, B, c, D or E ");
                break;

        }
        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                out.println(" Jan ");
                break;
            case "February":
                out.println(" Feb ");
                break;
            default:
                out.println(" not sure ");
                break;


        }

        }

    }
