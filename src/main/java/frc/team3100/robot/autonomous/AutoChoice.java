package frc.team3100.robot.autonomous;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team3100.robot.Robot;
import frc.team3100.robot.Variables;
import frc.team3100.robot.mapping.RobotMap;
import frc.team3100.robot.mapping.XBoxDrive;

import java.util.ArrayList;

public class AutoChoice extends Command {
    public Variables.autoStart LEFT = Variables.autoStart.LEFT;
    public Variables.autoStart RIGHT = Variables.autoStart.RIGHT;
    public Variables.autoStart CENTER = Variables.autoStart.CENTER;
    public Variables.autoTarget SCALE = Variables.autoTarget.SCALE;
    public Variables.autoTarget SWITCH = Variables.autoTarget.SWITCH;
    public static String autoFilePath = null;
    ArrayList<dataPoint> talonPath = null;

    public AutoChoice(Variables.autoStart start, Variables.autoTarget target, boolean crossover) {
        super("AutoChoice");
        Robot.oi.autoStatus = "Calculating Route...";
        if(start == RIGHT){
            if(target == SCALE) {
                if(crossover) {
                    autoFilePath = "RScale_left.csv";
                }
            }
        }

        if(autoFilePath == null) {
            autoFilePath = "baseline.csv";
        }
        talonPath = Robot.autoPath.generate(autoFilePath);
        Robot.oi.autoStatus = "Ready for Match";
    }


    protected void initialize() {

    }

    protected void execute() {

    }


    protected boolean isFinished() {
        return false;
    }


    protected void interrupted(){

    }

    protected void end() {

    }



}
