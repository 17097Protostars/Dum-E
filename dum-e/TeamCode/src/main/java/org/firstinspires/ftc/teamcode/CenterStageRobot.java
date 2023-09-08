package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class CenterStageRobot extends DriveTrain{
    DcMotor Right;
    DcMotor Left;
    Servo Lifter;
    Servo Claw;


    public void initialize (HardwareMap iHW){
        super.initialize(iHW);
        Right = iHW.dcMotor.get("R");
        Left = iHW.dcMotor.get("L");
        Lifter = iHW.servo.get("LS");
        Claw = iHW.servo.get("C");
    }
}
