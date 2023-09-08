package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@Autonomous(name = "DumEAutonomous",group = "DumE")
public class DumEAutonomous extends LinearOpMode {
    CenterStageRobot Robot = new CenterStageRobot();

    @Override
    public void runOpMode() throws InterruptedException {
        Robot.initialize(hardwareMap);

        // Wait for the game to begin
        telemetry.addData(">", "Press Play to start op mode");

        waitForStart();

        if (opModeIsActive()) {
            Robot.driveTime(1,3000, DriveTrain.DriveDirection.FORWARD);
            Robot.timeTurn(1, 500, DriveTrain.TurnTime.SPINLEFT);
        }
    }
}
