package com.qualcomm.ftcrobotcontroller.opmodes;

/**
 * Created by Mike on 6/4/2015.
 */

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyOp extends OpMode{
    private String startDate;
    /**
     * Constructor
     */
    public MyOp() {

    }

    /*
     * Code to run when the op mode is first enabled goes here
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#start()
     */
    @Override
    public void start() {
        startDate = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(new Date());
    }

    /*
     * This method will be called repeatedly in a loop
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#loop()
     */
    @Override
    public void loop() {
        telemetry.addData("1 Start", "MyOp started at " + startDate);
        telemetry.addData("2 Status", "Hello World! " );
    }

    /*
     * Code to run when the op mode is first disabled goes here
     * @see com.qualcomm.robotcore.eventloop.opmode.OpMode#stop()
     */
    @Override
    public void stop() {

    }
}
