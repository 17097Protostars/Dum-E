package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp(name = "Dum-E TeleOp", group = "Dum-E")
public class DumETeleOp extends OpMode {
    CenterStageRobot Robot = new CenterStageRobot();
    double speed = .5;

    @Override
    public void init() {
        Robot.initialize(hardwareMap);
        Robot.Lifter.setPosition(0);
        Robot.Claw.setPosition(0);
    }

    @Override
    public void loop() {
        double R = gamepad1.right_stick_y;
        double L = -gamepad1.left_stick_y;

        //set power for drive motors
        Robot.Left.setPower(L * speed);
        Robot.Right.setPower(R * speed);

        //change position of lifter servo
        if (gamepad2.right_bumper) {
            Robot.Lifter.setPosition(1);
        } else if (gamepad2.left_bumper) {
            Robot.Lifter.setPosition(0);
        }

        //change position of grabber servo
        if (gamepad2.a) {
            //grab
            Robot.Claw.setPosition(1);
        } else if (gamepad2.b) {
            //release
            Robot.Claw.setPosition(0);
        }
    }
}




