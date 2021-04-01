package testProject;

import java.text.MessageFormat;

public class FormatTest {
	public static void main(String[] args) {
		String pattern = "'{'\"userName\":\"{0}\", \"blogLink\":\"{1}\"'}'}";
		Object[] arguments = {"연로그", "https://yeonyeon.tistory.com"};
		  
		String result = MessageFormat.format(pattern, arguments);
		System.out.println(result);
	}
}
