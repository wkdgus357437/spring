package sample05;

import java.util.Scanner;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component("sungJukImpl") //()의 값은 xml에서 id값으로 정한걸로,, 어노테이션을 쓸때는 xml에 적용된 bean 없애기 // context:component-scan base-package=   로 대체함 
@Scope("prototype")
public class SungJukImpl implements SungJuk {
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	public SungJukImpl() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		name= scan.next();
		System.out.print("국어 점수를 입력하세요 : ");
		kor= scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		eng= scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		math= scan.nextInt();
		
	}
	
	@Override
	public void calc() {
		tot = kor + eng + math;
		avg = tot / 3.0;
		
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name + "\t"
					   	+ kor + "\t" 
					   	+ eng + "\t" 
					   	+ math + "\t" 
					   	+ tot + "\t" 
					   	+ String.format("%.3f", avg));
		
	}
}


























