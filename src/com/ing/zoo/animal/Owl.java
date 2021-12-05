package com.ing.zoo.animal;

import java.util.Random;

public class Owl {
    public String name;
    public String helloText;
    public String eatText;
    public String trick;

    public Owl()
    {
    }

    public void sayHello()
    {
        helloText = "oehoehoehoehoe";
        System.out.println(helloText);
    }

    public void eatMeat()
    {
        eatText = "nomnomnom oehoehoe";
        System.out.println(eatText);
    }

    public void performTrick()
    {
        Random random = new Random();
        int rnd = random.nextInt(2);
        if(rnd == 0)
        {
            trick = "spreads wings";
        }
        else
        {
            trick = "flies in circles";
        }
        System.out.println(trick);
    }
}
