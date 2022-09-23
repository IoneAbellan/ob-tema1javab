package ejercicioT1;

public class Ejercicio1 {

    public static void main(String[] args) {

        printNumbers();
        printDecimals();
        printBooleans();
        printTexts();
    }
    public static void printNumbers(){

        byte variable1 = 1;
        short variable2 = 22;
        int variable3 = 333;
        long variable4 = 4444;

        System.out.println("Tipos de datos, numeros:");
        System.out.println(variable1 + ", " + variable2 + ", " +  variable3 + ", " +  variable4);

    }
    public static void printDecimals(){
        float variable5 = 5.5f;
        double variable6 = 66.66;

        System.out.println("Tipos de datos, decimales:");
        System.out.println(variable5 + ", " + variable6);
    }
    public static void printBooleans() {
        boolean variable7 = true;
        boolean variable8 = false;

        System.out.println("Tipos de datos, boleanas:");
        System.out.println(variable7 + ", " + variable8);

    }
    public static void printTexts(){
        char variable9 = 'i';
        String variable10 = "Ione";

        System.out.println("Tipos de datos, textos:");
        System.out.println(variable9 + ", " + variable10);
    }
}
