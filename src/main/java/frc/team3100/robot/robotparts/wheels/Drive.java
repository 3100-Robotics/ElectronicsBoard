package frc.team3100.robot.robotparts.wheels;

import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.Robot;
import frc.team3100.robot.mapping.RobotMap;
import frc.team3100.robot.mapping.XBoxDrive;

public class Drive extends Command {


    public Drive(){
        super("Drive");
        requires(Robot.drive);
    }
    private static XBoxDrive controller = RobotMap.driveControls;


    protected void initialize() {

    }

    protected void execute() {
        Robot.drive.driveArcade(controller.getLeftStickY(), controller.getLeftStickX());
    }


    protected boolean isFinished() {
        return false;
    }


    protected void interrupted(){
        Robot.drive.driveArcade(0, 0);
    }

    protected void end() {

    }
}




