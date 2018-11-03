package com.training.classes.toshiba;

import com.training.interfaces.other.Hand;

public class ToshibaHand implements Hand{
    @Override
    public void catchSomething() {
        System.out.println("Catch from Toshiba!");
    }
}
