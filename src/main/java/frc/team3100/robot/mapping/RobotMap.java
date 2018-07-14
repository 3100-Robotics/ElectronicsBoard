package frc.team3100.robot.mapping;

import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import frc.team3100.robot.mapping.XBoxDrive;


public class RobotMap {

    // Designate the ports for everything the program has to interface with


    //     C O N T R O L L E R S
    // Port is set on DriverStation -- use 1 / 2 / 3
    private static int driveController = 1;


    //     P W M
    private static int clawMotorChannel = 3;


    //     P C M
    private static int clawCloseChannel = 0;
    private static int clawOpenChannel = 1;

    //     D I O

    // Initialize versions of everything the robot interfaces with

    //     X B O X   C O N T R O L L E R S
    public static XBoxDrive driveControls = new XBoxDrive(driveController);

    //     S P E E D   C O N T R O L L E R S


    //    P N E U M A T I C   C O N T R O L L E R S


    //    S E R V O S


    //    S E N S O R S






}
