package com.training.context;

import com.training.classes.ModelT1000;
import com.training.classes.sony.SonyHand;
import com.training.classes.sony.SonyHead;
import com.training.classes.sony.SonyLeg;
import com.training.interfaces.Robot;
import com.training.interfaces.other.Hand;
import com.training.interfaces.other.Head;
import com.training.interfaces.other.Leg;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    @Bean(name = "t1000Sony")
    public Robot robot(){
        ModelT1000 t1000Sony = new ModelT1000();
        t1000Sony.setHand(hand());
        t1000Sony.setLeg(leg());
        t1000Sony.setHead(head());
        return t1000Sony;
    }

    @Bean
    public Hand hand(){
        return new SonyHand();
    }

    @Bean
    public Leg leg(){
        return new SonyLeg();
    }

    @Bean
    public Head head(){
        return new SonyHead();
    }
}
