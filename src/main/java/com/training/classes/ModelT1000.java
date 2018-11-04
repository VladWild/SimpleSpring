package com.training.classes;

import com.training.interfaces.Robot;
import com.training.interfaces.other.Hand;
import com.training.interfaces.other.Head;
import com.training.interfaces.other.Leg;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ModelT1000 implements Robot, InitializingBean, DisposableBean{
    private Hand hand;
    private Leg leg;
    private Head head;
    private String name;

    public ModelT1000(){
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String name2) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.name = name;
    }

    @Override
    public void action() {
        head.calc();
        hand.catchSomething();
        leg.go();
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Disposable");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing");
    }
}


