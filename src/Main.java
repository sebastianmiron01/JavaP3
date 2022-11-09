import jdk.jfr.StackTrace;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Throwable{
        InputDevice inputDevice = new InputDevice(System.in);
        OutputDevice outputDevice = new OutputDevice(System.out);

        //int i=inputDevice.nextnum();
        //outputDevice.writeMessage(i);
        //outputDevice.writeMessage(args);
        try {
            Application mainApp = new Application(inputDevice, outputDevice, args[0]);
            mainApp.run();
        }
        catch(Exception e)
        {
           e.printStackTrace();
        }

    }
}
