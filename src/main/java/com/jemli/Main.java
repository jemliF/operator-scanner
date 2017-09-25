package com.jemli;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fathi Jemli
 */
public class Main {

    public static void main(String[] args) {
        Operator operator1 = new Operator("A");
        operator1.addPriceUnit(new PriceUnit("1", 0.9));
        operator1.addPriceUnit(new PriceUnit("268", 5.1));
        operator1.addPriceUnit(new PriceUnit("46", 0.17));
        operator1.addPriceUnit(new PriceUnit("4620", 0.0));
        operator1.addPriceUnit(new PriceUnit("468", 0.15));
        operator1.addPriceUnit(new PriceUnit("4631", 0.15));
        operator1.addPriceUnit(new PriceUnit("4673", 0.9));
        operator1.addPriceUnit(new PriceUnit("46732", 1.1));

        Operator operator2 = new Operator("B");
        operator2.addPriceUnit(new PriceUnit("1", 0.92));
        operator2.addPriceUnit(new PriceUnit("44", 0.5));
        operator2.addPriceUnit(new PriceUnit("46", 0.2));
        operator2.addPriceUnit(new PriceUnit("467", 1.0));
        operator2.addPriceUnit(new PriceUnit("48", 1.2));
        operator2.addPriceUnit(new PriceUnit("48", 1.2));

        List<Operator> operators = new ArrayList<Operator>();
        operators.add(operator1);
        operators.add(operator2);
        //System.out.println(com.jemli.Operator.bestPriceFromListOperators(operators, "+46-73-212345"));

        Scanner in = new Scanner(System.in);
        String retry = null, number = "";
        do {
            System.out.println("Enter a phone number to check best price...");
            number = in.nextLine();
            System.out.println(Operator.bestPriceFromListOperators(operators, number));
            System.out.println("Type Y to try another phone number, else to exit...");
            retry = in.nextLine();
        } while (retry.equalsIgnoreCase("Y"));
    }
}
