package com.ing.zoo;

import com.ing.zoo.animal.*;

import java.util.Scanner;

public class Zoo {
    public static void main(String[] args) {
        String[] commands = new String[4];
        commands[0] = "hello";
        commands[1] = "give leaves";
        commands[2] = "give meat";
        commands[3] = "perform trick";

        //initialize the animals
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
        Bear joe = new Bear();
        joe.name = "joe";
        Owl misty = new Owl();
        misty.name = "misty";

        // create a variable for the hello output
        String henkHello = commands[0] + " " + henk.name;
        String elsaHello = commands[0] + " " + elsa.name;
        String doraHello = commands[0] + " " + dora.name;
        String wallyHello = commands[0] + " " + wally.name;
        String martyHello = commands[0] + " " + marty.name;
        String joeHello = commands[0] + " " + joe.name;
        String mistyHello = commands[0] + " " + misty.name;

        // scanner to enter a value
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer uw command in: ");

        // nextLine so the answer can be behind the question and not on the next rule
        String input = scanner.nextLine();

        // to show that the command is not recognized
        String unknownCommand = "Unknown command: " + input;

        // if input is only hello, then all the animals way hello
        if (input.equals(commands[0])) {
            henk.sayHello();
            elsa.sayHello();
            dora.sayHello();
            wally.sayHello();
            marty.sayHello();
            joe.sayHello();
            misty.sayHello();
        }

        // if there is an specific name after the input hello, then only the animal with that name will reply
        if (input.equals(henkHello)) {
            henk.sayHello();
        } else if (input.equals(elsaHello)) {
            elsa.sayHello();
        } else if (input.equals(doraHello)) {
            dora.sayHello();
        } else if (input.equals(wallyHello)) {
            wally.sayHello();
        } else if (input.equals(martyHello)) {
            marty.sayHello();
        } else if (input.equals(joeHello)) {
            joe.sayHello();
        } else if (input.equals(mistyHello)) {
            misty.sayHello();
        }

        // switch between the actions from the input
        switch (input) {
            // eats leaves
            case "give leaves":
                elsa.eatLeaves();
                dora.eatLeaves();
                marty.eatLeaves();
                joe.eatLeaves();
                break;
            // eats meat
            case "give meat":
                henk.eatMeat();
                dora.eatMeat();
                wally.eatMeat();
                joe.eatMeat();
                misty.eatMeat();
                break;
            // perform trick
            case "perform trick":
                dora.performTrick();
                wally.performTrick();
                misty.performTrick();
                break;
        }
    }
}
