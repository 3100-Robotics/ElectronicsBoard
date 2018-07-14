package frc.team3100.robot;

import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.interfaces.Gyro;


public class RobotMap {

    // Designate the ports for everything the program has to interface with


    //     C O N T R O L L E R S
    // Port is set on DriverStation -- use 1 / 2 / 3
    private static int driveController = 1;


    //     P W M
    // RoboRIO PWM ports



    //     P C M
    // Pneumatic Control Module Ports


    //     D I O
    // RoboRIO DIO Ports




    // Initalize versions of everything the robot interfaces with

    //     X B O X   C O N T R O L L E R S
    public static XBoxDrive driveControls = new XBoxDrive(driveController);

    //     S P E E D   C O N T R O L L E R S


    //    P N E U M A T I C   C O N T R O L L E R S


    //    S E R V O S


    //    S E N S O R S






}
