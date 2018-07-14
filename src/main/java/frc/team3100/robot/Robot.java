package frc.team3100.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team3100.robot.subsystems.Claw;


public class Robot extends IterativeRobot{

    // Define subsystems for Commands to access
    public static Claw claw;
    public static OI oi;



    public void robotInit() {
        //Creates instances of all of the subsystems for the commands to access.
        claw = new Claw();

        // ALWAYS initialize OI after subsystems
        oi = new OI();

    }


    public void autonomousInit() {
        // What to run ONCE at the beginning of auto

    }

    public void autonomousPeriodic() {
        // What to run every 10ms or so during auto

    }

    public void teleopInit() {
        // What to run ONCE at the beginning of teleop

    }

    public void teleopPeriodic() {
        // Runs every 10ms dring teleop
        // Starts the scheduler for the teleop period to run the commands
        Scheduler.getInstance().run();

    }

}

