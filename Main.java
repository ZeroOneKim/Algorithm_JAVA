import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Main  {
    static Robot robot;
    public static void main(String[] args) throws Exception{
        robot=new Robot();
        while(true) {
            AltT();
        }
    }
    public static void AltT(){
        robot.keyPress(KeyEvent.VK_ALT);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_ALT);
        robot.delay(5000);
    }
}