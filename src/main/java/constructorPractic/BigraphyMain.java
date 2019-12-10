package constructorPractic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BigraphyMain {

	public static void main(String[] args) {

		ApplicationContext apc = new ClassPathXmlApplicationContext("constructor.xml");

		Biography bg = (Biography) apc.getBean("bipgrph");
		bg.show();

	}

}
