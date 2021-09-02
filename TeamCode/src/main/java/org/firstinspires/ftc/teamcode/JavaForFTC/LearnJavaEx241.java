package org.firstinspires.ftc.teamcode.JavaForFTC;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp

public class LearnJavaEx241 extends OpMode {

    @Override
    public void  init() {
        String favoriteAnimal = "Elephant";
        telemetry.addData("Hello, my name is", favoriteAnimal);
    }

    @Override
    public void loop() {

        telemetry.update();
    }
}