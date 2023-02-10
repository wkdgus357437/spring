package sample03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SungJuk sungJuk = (SungJuk)context.getBean("sungJukImpl"); //부모 = 자식
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		sungJuk.modify();
		System.out.println();
		
		/*
		sungJuk.modify();
		sungJuk.calcTot();
		sungJuk.calcAvg();
		sungJuk.display();
		*/
		
	}
}