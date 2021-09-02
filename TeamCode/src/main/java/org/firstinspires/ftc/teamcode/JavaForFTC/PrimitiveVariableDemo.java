package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class PrimitiveVariableDemo extends OpMode {//declares the class. must be same as filename
    @Override
    public void  init(){
        int teamNumber = 18308;
        double motorSpeed = 0.5;
        boolean touchSensorPressed = true;

        telemetry.addData("Team Number", teamNumber);
        telemetry.addData("Motor Speed", motorSpeed);
        telemetry.addData("Touch Sensor is Pressed", touchSensorPressed);
    }

    @Override
    public void loop(){

        telemetry.update();
    }
}