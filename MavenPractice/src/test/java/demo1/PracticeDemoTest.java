package demo1;

import org.testng.annotations.Test;

public class PracticeDemoTest {
	
	@Test
	public void startTest() {
		System.out.println("This is Start Test Method");
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		
				
	}
	
	@Test
	public void modifyStartTest() {
		System.out.println("This is Modify Start Test");
	}
	
	

}
