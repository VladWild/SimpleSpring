package com.training;

import com.training.classes.ModelT1000;
import com.training.context.AppContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Main {
    private static final String ID_SONY = "t1000Sony";

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        ModelT1000 t1000Sony = (ModelT1000) context.getBean(ID_SONY);
        t1000Sony.action();
    }
}


