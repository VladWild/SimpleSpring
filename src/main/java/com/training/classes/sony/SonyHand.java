package com.training.classes.sony;

import com.training.interfaces.other.Hand;

public class SonyHand implements Hand{
    @Override
    public void catchSomething() {
        System.out.println("Catch from Sony!");
    }
}
