package frc.team3100.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.Robot;
import frc.team3100.robot.mapping.RobotMap;
import frc.team3100.robot.mapping.XBoxDrive;

public class ClawDrive extends Command {


    public ClawDrive(){
        super("ClawDrive");
        requires(Robot.claw);
    }

    private static XBoxDrive controller = RobotMap.driveControls;

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {
    }


    protected boolean isFinished() {
        return false;
    }


    protected void interrupted(){

    }

    @Override
    protected void end() {

    }
}
