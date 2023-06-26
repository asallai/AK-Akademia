package AK2VariableAndOperatorDemo;

public class VariableAndOperatorDemo {

    public static void main(String[] args) {

        // primitive types
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        boolean g;
        char h;

        int i = 10;
        System.out.println(i);
        i = 15;
        System.out.println(i);
        i = 100;
        System.out.println(i);

        int apples = 7;
        int pears = 12;
        System.out.println(apples);
        System.out.println(pears);
        int fruits = apples + pears;
        System.out.println(fruits);

        int numberOfBoxes = 100;
        int numberOfBoxesSold = 17;
        int numberOfBoxesRemaining = numberOfBoxes - numberOfBoxesSold;
        System.out.println(numberOfBoxesRemaining);

        int j, k;
        i = 17;
        j = 5;
        k = i % j;
        System.out.println(k);

        boolean b1 = true;
        boolean b2 = false;
        boolean result = b1 && b2;
        System.out.println(result);




        // non-primitive (reference) types


    }
    
}
