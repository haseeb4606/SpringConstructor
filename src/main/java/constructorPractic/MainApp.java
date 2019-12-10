package constructorPractic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("constructor.xml");

		Company com = (Company) apc.getBean("comp");

		com.companyInfo();

	}

}
