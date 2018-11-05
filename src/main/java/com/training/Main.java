package com.training;

import com.training.classes.ModelT1000;
import com.training.interfaces.Robot;
import com.training.interfaces.RobotConveyor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.StaticApplicationContext;

public class Main {
    private static final String PATH_XML = "all_context.xml";

    private static final String ID_SONY = "t1000Sony";
    private static final String ID_TOSHIBA = "t1000Toshiba";

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(PATH_XML);

        RobotConveyor t1000Conveyor = (RobotConveyor) context.getBean("t1000Conveyor");

        Robot robot = t1000Conveyor.createRobot();
        Robot robot2 = t1000Conveyor.createRobot();
        Robot robot3 = t1000Conveyor.createRobot();

        System.out.println(robot);
        System.out.println(robot2);
        System.out.println(robot3);

    }
}




