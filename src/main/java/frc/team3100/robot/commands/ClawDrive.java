package frc.team3100.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.Robot;
import frc.team3100.robot.RobotMap;
import frc.team3100.robot.XBoxDrive;

public class ClawDrive extends Command {


    public ClawDrive(){
        super("ClawDrive");
        requires(Robot.claw);
    }

    private static XBoxDrive controller = RobotMap.driveControls;
    private double triggerError = 0.1;

    @Override
    protected void initialize() {

    }

    @Override
    protected void execute() {


        if(controller.getLeftTrigger() > triggerError) {
            Robot.claw.run(controller.getLeftTrigger());

        } else if(controller.getRightTrigger() > triggerError) {
            Robot.claw.run(-controller.getRightTrigger());

        } else {
            Robot.claw.run(0);

        }

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
