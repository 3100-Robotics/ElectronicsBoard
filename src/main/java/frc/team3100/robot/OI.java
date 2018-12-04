package frc.team3100.robot;

import frc.team3100.robot.mapping.RobotMap;
import frc.team3100.robot.mapping.XBoxDrive;


public class OI {

    // Initialize the XBox Controllers
    private XBoxDrive driveControls = RobotMap.driveControls;

    // Defining state variables to log the states of different subsystems
    public String autoStatus = "NO PATH LOADED";


    public OI() {

    }
}


