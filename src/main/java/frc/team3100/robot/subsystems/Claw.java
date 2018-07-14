package frc.team3100.robot.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team3100.robot.commands.ClawDrive;
import frc.team3100.robot.mapping.RobotMap;


public class Claw extends Subsystem {



    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new ClawDrive());
    }


}

