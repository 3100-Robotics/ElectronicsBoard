package frc.team3100.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.Trigger;
import edu.wpi.first.wpilibj.command.Command;
import frc.team3100.robot.commands.*;


public class OI {

    // Initialize the XBox Controllers
    private XBoxDrive driveControls = RobotMap.driveControls;
    public Button clawOpenClose = new JoystickButton(driveControls,XBoxDrive.aButton);





    // Defining state variables to log the states of different subsystems
    public boolean clawOpenState = false;


    public int distanceDriven = 0;

    public double getDriveMoveSpeed() {
            return driveControls.getLeftStickY();
        }

    public double getRotateSpeed() {return driveControls.getRightStickX(); }




    public OI() {

        clawOpenClose.whenPressed(new ClawActuate());


    }
}
