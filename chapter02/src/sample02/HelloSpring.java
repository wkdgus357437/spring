package sample02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = context.getBean("calcAdd", Calc.class);
		calc.calculate();
		
		calc = (Calc) context.getBean("calcMul", Calc.class);
		calc.calculate();
	}

}

/*

public class HelloSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Calc calc = context.getBean("calcAdd",CalcAdd.class);
		calc.calculate();
		calc = context.getBean("calcMul",CalcMul.class);
		calc.calculate();
	}

}

*/