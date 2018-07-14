package frc.team3100.robot;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team3100.robot.commands.*;
import frc.team3100.robot.subsystems.*;


public class Robot extends IterativeRobot{

    // Define subsystems for Commands to access
    public static MainDrive drive;
    public static OI oi;

    // Define variables used later in the Robot class
    public static boolean autoVal;


    public void robotInit() {
        //Creates instances of all of the subsystems for the commands to access.
        drive = new MainDrive();

        // ALWAYS initialize OI after subsystems
        oi = new OI();

    }


    public void autonomousInit() {
        // What to run ONCE at the beginning of auto
        autoVal = true;

    }

    public void autonomousPeriodic() {
        // What to run every 10ms or so during auto

    }

    public void teleopInit() {
        // What to run ONCE at the beginning of teleop
        autoVal = false;

    }

    public void teleopPeriodic() {
        // Runs every 10ms dring teleop
        // Starts the scheduler for the teleop period to run the commands
        Scheduler.getInstance().run();

    }

}

