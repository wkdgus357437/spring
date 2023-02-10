package sample05;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpring {

	String name;
	int kor;
	int eng;
	int math;

	public HelloSpring() { // 기본생성자
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		name = scan.next();
		System.out.print("국어 입력 : ");
		kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		eng = scan.nextInt();
		System.out.print("수학 입력 : ");
		math = scan.nextInt();
		System.out.println();
	}//HelloSpring

	public static void main(String[] args) {
		HelloSpring helloSpring = new HelloSpring();

		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SungJuk sungJuk = (SungJuk) context.getBean("sungJuk");
		sungJuk.calc(helloSpring.kor, helloSpring.eng, helloSpring.math);
		sungJuk.display(helloSpring.name);
		System.out.println();

	}

}
