package frc.team3100.robot.mapping;


import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import frc.team3100.robot.robotparts.gyro.BNO055;

public class RobotMap {

    // Designate the ports for everything the program has to interface with


    //     C O N T R O L L E R S
    //     Port is set on DriverStation
    private static int driveController = 0;

    //     P W M
    private static int leftMotorChannel = 0;
    private static int rightMotorChannel = 1;
    //     P C M

    //     D I O
    private static int leftEncoderChannelA = 0;
    private static int leftEncoderChannelB = 1;
    private static int rightEncoderChannelA = 2;
    private static int rightEncoderChannelB = 3;
    // Initialize versions of everything the robot interfaces with

    //     X B O X   C O N T R O L L E R S
    public static XBoxDrive driveControls = new XBoxDrive(driveController);

    //     S P E E D   C O N T R O L L E R S
    public static SpeedController leftMotor = new Spark(leftMotorChannel);
    public static SpeedController rightMotor = new Spark(rightMotorChannel);

    //    P N E U M A T I C   C O N T R O L L E R S


    //    S E R V O S


    //    S E N S O R S
    public static Encoder leftDriveEncoder = new Encoder(leftEncoderChannelA,leftEncoderChannelB);
    public static Encoder rightDriveEncoder = new Encoder(rightEncoderChannelA,rightEncoderChannelB);
    public static BNO055 imu = BNO055.getInstance(BNO055.opmode_t.OPERATION_MODE_IMUPLUS,
                                                  BNO055.vector_type_t.VECTOR_EULER);







}
