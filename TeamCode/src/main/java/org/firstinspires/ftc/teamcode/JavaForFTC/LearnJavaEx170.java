package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public class LearnJavaEx170 extends OpMode {//declares the class. must be same as filename
    @Override
    public void  init(){
        telemetry.addData("Hello","World");
        telemetry.update();
    }

    @Override
    public void loop(){

    }

}
