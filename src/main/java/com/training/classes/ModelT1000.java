package com.training.classes;

import com.training.interfaces.Robot;
import com.training.interfaces.other.Hand;
import com.training.interfaces.other.Head;
import com.training.interfaces.other.Leg;

public class ModelT1000 implements Robot {
    private Hand hand;
    private Leg leg;
    private Head head;

    public ModelT1000(){
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }


    @Override
    public void fire() {

    }

    @Override
    public void dance() {
        System.out.println();
    }
}
