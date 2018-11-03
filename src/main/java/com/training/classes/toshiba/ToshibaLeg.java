package com.training.classes.toshiba;

import com.training.interfaces.other.Leg;

public class ToshibaLeg implements Leg {
    @Override
    public void go() {
        System.out.println("Go to Toshiba!");
    }
}

