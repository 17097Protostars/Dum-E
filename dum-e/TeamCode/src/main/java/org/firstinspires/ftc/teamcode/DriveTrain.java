package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class DriveTrain {
    DcMotor Right;
    DcMotor Left;
    Servo Lifter;
    Servo Claw;
    double power;

    enum DriveDirection{
        FORWARD, BACKWARD,
    }

    enum TurnTime{
        SPINRIGHT, SPINLEFT,
    }

    public void initialize(HardwareMap iHW){
        Right = iHW.dcMotor.get("R");
        Left = iHW.dcMotor.get("L");
        Lifter = iHW.servo.get("LS");
        Claw = iHW.servo.get("C");

        Left.setDirection(DcMotorSimple.Direction.REVERSE);
    }

    public void driveTime(double iPower, int iTime, DriveDirection iDir) throws InterruptedException {
        if (iDir == DriveDirection.BACKWARD) {
            Right.setPower(-iPower);
            Left.setPower(-iPower);
        } else if(iDir == DriveDirection.FORWARD) {
            Right.setPower(iPower);
            Left.setPower(iPower);
        }

        Thread.sleep(iTime);

        Left.setPower(0.0);
        Right.setPower(0.0);
    }

    public void timeTurn(double iPower, int iTime, TurnTime iDir) throws InterruptedException {
        if (iDir == TurnTime.SPINLEFT) {
            Right.setPower(-iPower);
            Left.setPower(iPower);
        } else if(iDir == TurnTime.SPINRIGHT) {
            Right.setPower(iPower);
            Left.setPower(-iPower);
        }

        Thread.sleep(iTime);

        Left.setPower(0.0);
        Right.setPower(0.0);
    }
}
