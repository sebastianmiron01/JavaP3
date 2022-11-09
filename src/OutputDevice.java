import java.io.IOException;
import java.io.OutputStream;

public class OutputDevice {

    public OutputStream outputDevice;
    public OutputDevice(OutputStream outputDevice)
    {
        this.outputDevice=outputDevice;
    }
    public void writeMessage(String mess) {
        System.out.println(mess);
    }

    public void writeMessage(Double mess) {
        System.out.println(mess);
    }

    public void writeMessage(int numericalMessage) {
        System.out.println(numericalMessage);
    }

    public void writeMessage(String[] messArr) {
        for(String arg: messArr){
            this.writeMessage(arg);
        }
    }

}
