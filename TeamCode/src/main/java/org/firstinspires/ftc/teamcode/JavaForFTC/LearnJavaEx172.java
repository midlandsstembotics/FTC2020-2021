package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;



@Autonomous
public class LearnJavaEx172 extends OpMode {//declares the class. must be same as filename
    @Override
    public void  init(){
        telemetry.addData("Hello","World");
        telemetry.update();
    }

    @Override
    public void loop(){
        
    }

}
