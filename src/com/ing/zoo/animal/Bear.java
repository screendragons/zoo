package com.ing.zoo.animal;

import java.util.Random;

public class Bear {
    public String name;
    public String helloText;
    public String eatText;

    public Bear()
    {
    }

    public void sayHello()
    {
        helloText = "grrrrrr";
        System.out.println(helloText);
    }

    public void eatLeaves()
    {
        eatText = "munch munch munch nice";
        System.out.println(eatText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom grr";
        System.out.println(eatText);
    }
}
