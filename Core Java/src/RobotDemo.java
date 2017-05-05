import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class RobotDemo {

	Robot robot;
	void method() throws Exception
	{
		robot=new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}
}
