package com.training.classes.sony;

import com.training.interfaces.other.Leg;

public class SonyLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Sony!");
    }
}

