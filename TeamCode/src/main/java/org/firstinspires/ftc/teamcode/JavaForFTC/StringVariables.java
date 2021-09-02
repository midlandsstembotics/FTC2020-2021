package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class StringVariables extends OpMode {

    @Override
    public void  init() {
        String myName = "Dan";
        telemetry.addData("Hello, my name is", myName);
    }

    @Override
    public void loop() {

        telemetry.update();
    }
}