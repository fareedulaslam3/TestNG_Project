package TestNG_projects;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TimeOut {
	
	@Test(timeOut = 2000,expectedExceptions = ThreadTimeoutException.class)
		private void fblaunch() throws InterruptedException {
			
			Thread.sleep(4000);
			System.out.println("url launched");
		}}