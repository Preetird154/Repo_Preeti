package window_handling;

import java.util.Set;

public class WindowHandling extends OrangeHRM {

	public static void handle() throws InterruptedException {

		String parentHandle = driver.getWindowHandle();
		System.out.println("Parent Window - " + parentHandle);

		clicklink();
		
		Set<String> handles = driver.getWindowHandles();
		System.out.println(handles);

		for (String handle : handles) {
			if (!handle.equals(parentHandle)) {
				driver.switchTo().window(handle);
				enteremail();
				Thread.sleep(3000);
				driver.close();

				Thread.sleep(3000);
			}
		}

		driver.switchTo().window(parentHandle);
		actions();
		driver.close();
	}
}
