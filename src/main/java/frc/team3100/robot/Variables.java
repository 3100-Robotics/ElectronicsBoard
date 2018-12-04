package frc.team3100.robot;

public class Variables {

    public enum RelativeDirection {
        LEFT,
        RIGHT,
        FRONT,
        BACK,
        TOP,
        BOTTOM
    }

    public enum autoStart {
        LEFT,
        RIGHT,
        CENTER
    }

    public enum autoTarget {
        SWITCH,
        SCALE
    }


    public enum ArmPosition {
        GROUND,
        SWITCH,
        SCALE
    }
    public boolean clawOpenState = false;
    public boolean climbState = false;
    public boolean cubeHeld = false;
}

