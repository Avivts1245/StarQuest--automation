package PageObjects;

import org.openqa.selenium.WebDriver;

public class Name {
	
		WebDriver driver;
		public Name(WebDriver driver) {
			this.driver=driver;
		
		}
		
		public static void EnterFirst_Name(SignUpPage signpage,String name)
		{
			signpage.getFirst_Name().sendKeys(name);
		}
		public static void EnterLast_Name(SignUpPage signpage,String name)
		{
			signpage.getLast_Name().sendKeys(name);
		}
		
		
		
		public static void FirstNameTests(SignUpPage signpage) {
			EnterFirst_Name(signpage,"Aviv");// 1 enter valid name in English
//			EnterFirst_Name(signpage,"אביב");// 2 enter valid name in Hebrew
//			EnterFirst_Name(signpage,"Aviv9");// 3 enter number in the name
//			EnterFirst_Name(signpage,"Aviv#");// 4 enter special char
//			EnterFirst_Name(signpage,"A");// 5 enter one letter
//			EnterFirst_Name(signpage,"Aviv Avraham");// 6 enter Two words or more with space
//			EnterFirst_Name(signpage,"Aviv A");// 7 enter Second String of single letter
//			EnterFirst_Name(signpage,"");// 8 empty field
//			EnterFirst_Name(signpage,"Aא");// 9 enter Two or more languiges	
		
		}
		public static void LastNameTests(SignUpPage signpage) {
			EnterLast_Name(signpage,"Tsoref");// 1 enter valid name in English
//			EnterLast_Name(signpage,"צורף");// 2 enter valid name in Hebrew
//			EnterLast_Name(signpage,"Aviv9");// 3 enter number in the name
//			EnterLast_Name(signpage,"Aviv#");// 4 enter special char
//			EnterLast_Name(signpage,"A");// 5 enter one letter
//			EnterLast_Name(signpage,"Aviv Avraham");// 6 enter Two words or more with space
//			EnterLast_Name(signpage,"Aviv A");// 7 enter Second String of single letter
//			EnterLast_Name(signpage,"");// 8 empty field
//			EnterLast_Name(signpage,"Aא");// 9 enter Two or more languiges	
		
		}
		
		

}
