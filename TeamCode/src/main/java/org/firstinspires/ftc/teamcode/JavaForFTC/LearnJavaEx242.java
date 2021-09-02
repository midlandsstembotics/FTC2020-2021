package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class LearnJavaEx242 extends OpMode {

    @Override
    public void  init() {
        String myName = "Dan";
        int grade = 100;
        telemetry.addData("Hello, my name is", myName);
        telemetry.addData("Grade", grade);
    }

    @Override
    public void loop() {

        telemetry.update();
    }
}