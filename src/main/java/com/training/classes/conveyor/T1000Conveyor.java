package com.training.classes.conveyor;

import com.training.interfaces.Robot;
import com.training.interfaces.RobotConveyor;

public abstract class T1000Conveyor implements RobotConveyor {
    @Override
    public abstract Robot createRobot();
}

