package com.training;

import com.training.classes.ModelT1000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Main {
    private static final String PATH_XML = "context.xml";

    private static final String ID_SONY = "t1000Sony";
    private static final String ID_TOSHIBA = "t1000Toshiba";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(PATH_XML);

        ModelT1000 t1000Sony = (ModelT1000) context.getBean(ID_SONY);
        t1000Sony.action();

        ModelT1000 t1000Toshiba = (ModelT1000) context.getBean(ID_TOSHIBA);
        t1000Toshiba.action();
    }
}


