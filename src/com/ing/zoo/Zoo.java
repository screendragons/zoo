package com.ing.zoo;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        Lion henk = new Lion();
        henk.name = "henk";
        Hippo elsa = new Hippo();
        elsa.name = "elsa";
        Pig dora = new Pig();
        dora.name = "dora";
        Tiger wally = new Tiger();
        wally.name = "wally";
        Zebra marty = new Zebra();
        marty.name = "marty";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        String input = scanner.nextLine();

        // if input is only hello, then all the animals way hello
        if (input.equals(commands[0])) {
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
        }

        String henkInput = commands[0] + " " + henk.name;
        String elsaInput = commands[0] + " " + elsa.name;
        String doraInput = commands[0] + " " + dora.name;
        String wallyInput = commands[0] + " " + wally.name;
        String martyInput = commands[0] + " " + marty.name;
        String unknownCommand = "Unknown command: " + input;

        // if there is an specific name after the input hello, then only the animal with that name will reply
        if (input.equals(henkInput)) {
            henk.sayHello();
        } else if (input.equals(elsaInput)) {
            elsa.sayHello();
        } else if (input.equals(doraInput)) {
            dora.sayHello();
        } else if (input.equals(wallyInput)) {
            wally.sayHello();
        } else if (input.equals(martyInput)) {
            marty.sayHello();
        } else if ((!input.equals(commands[0])) || (!input.equals(henkInput)) || (!input.equals(elsaInput)) || (!input.equals(doraInput)) || (!input.equals(wallyInput)) || (!input.equals(martyInput))) {
            System.out.println(unknownCommand);
        }

        // eats leaves
        if (input.equals(commands[1])) {
            elsa.eatLeaves();
            dora.eatLeaves();
            marty.eatLeaves();
            // eats meat
        } else if (input.equals(commands[2])) {
            henk.eatMeat();
            dora.eatMeat();
            wally.eatMeat();
        } else {
            System.out.println(unknownCommand);
        }

        if(input.equals(commands[3])) {
            dora.performTrick();
            wally.performTrick();
        } else {
            System.out.println(unknownCommand);
        }
    }
}
