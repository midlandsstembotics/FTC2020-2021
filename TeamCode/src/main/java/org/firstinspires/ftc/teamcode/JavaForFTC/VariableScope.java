package org.firstinspires.ftc.teamcode.JavaForFTC;

public class VariableScope {

    public void loop() {
        int x = 5;
        // x is visible here
        {
            int y = 4;
            // x and y are visible here
        }
        // only x is visible here
    }
}

