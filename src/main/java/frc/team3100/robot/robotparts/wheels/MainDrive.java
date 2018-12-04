package frc.team3100.robot.robotparts.wheels;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team3100.robot.Dashboard;
import frc.team3100.robot.mapping.RobotMap;
import frc.team3100.robot.robotparts.gyro.BNO055;


public class MainDrive extends Subsystem implements Dashboard.DashboardUpdatable {

    private SpeedController leftMotor = RobotMap.leftMotor;
    private SpeedController rightMotor = RobotMap.rightMotor;
    private DifferentialDrive driveTrain = new DifferentialDrive(leftMotor,rightMotor);
    private Encoder leftEncoder = RobotMap.leftDriveEncoder;
    private Encoder rightEncoder = RobotMap.rightDriveEncoder;
    private BNO055 gyro = RobotMap.imu;

    private double changeTurn;
    private double changeDrive;
    private double limit = 0.08; //0.1
    private double limitRot = 0.08; //0.08
    private double limitedJoystickDrive;
    private double limitedJoystickTurn;

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(new Drive());
    }

    public void initSD() {

    }

    public void driveArcade(double move, double rotate) {

        changeTurn = rotate - limitedJoystickTurn;
        if(changeTurn > limitRot) {
            changeTurn = limitRot;
        } else if (changeTurn < -limitRot) {
            changeTurn = -limitRot;
        }
        limitedJoystickTurn += changeTurn;

        changeDrive = move - limitedJoystickDrive;
        if(changeDrive > limit) {
            changeDrive = limit;
        } else if (changeDrive < -limit) {
            changeDrive = -limit;
        }
        limitedJoystickDrive += changeDrive;

        driveTrain.arcadeDrive(limitedJoystickDrive,limitedJoystickTurn);

    }

    public void updateSD() {
        SmartDashboard.putNumber("limitedRotate", limitedJoystickTurn);
        SmartDashboard.putNumber("limitedMove",limitedJoystickDrive);
    }

    public void driveTank(double left, double right) {
        driveTrain.tankDrive(left,right);
    }


}