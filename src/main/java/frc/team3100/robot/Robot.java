package frc.team3100.robot;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import frc.team3100.robot.autonomous.path;
import frc.team3100.robot.robotparts.wheels.MainDrive;


public class Robot extends IterativeRobot{

    // Define subsystems for Commands to access
    public static final PowerDistributionPanel pdp = new PowerDistributionPanel();
    public static final Compressor compressor = new Compressor();
    public static MainDrive drive;
    public static path autoPath;
    public static OI oi;
    public static SendableChooser startPos = new SendableChooser();
    public static SendableChooser targetLoc = new SendableChooser();
    public static SendableChooser crossover = new SendableChooser();


    public void robotInit() {
        //Creates instances of all of the subsystems for the commands to access.
        drive = new MainDrive();
        // ALWAYS initialize OI after subsystems
        oi = new OI();

        //Begin dashboard connection and load the auto choosers
        Dashboard.initDashboard();
        startPos.addDefault("Right",Variables.autoStart.RIGHT);
        startPos.addObject("Left",Variables.autoStart.LEFT);
        startPos.addObject("Center",Variables.autoStart.CENTER);
        targetLoc.addDefault("Scale",Variables.autoTarget.SCALE);
        targetLoc.addObject("Switch",Variables.autoTarget.SWITCH);
        crossover.addDefault("Yes",true);
        crossover.addObject("No",false);

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
        // Runs every 10ms during teleop
        // Starts the scheduler for the teleop period to run the commands
        Dashboard.updateDashboard();
        Scheduler.getInstance().run();

    }
    public void disabledPeriodic() {

    }

}

