package sample05;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Scope("prototype")
public class SungJukInput implements SungJuk {
	@Autowired
	private SungJukDTO2 sungJukDTO2 = null;
	// 스프링 컨테이너가 빈(@Component,@Bean 등) 으로 생성된 것들중에서
	// SungJukDTO2 타입을 찾아서 자동으로 주입해라.

	@Autowired
	@Qualifier("arrayList") //어떠한게 들어갈지 꼭 찝어 알려주자 (SpringConfiguration 참고)
	private List<SungJukDTO2> list;
	// 스프링 컨테이너가 빈(@Component,@Bean 등) 으로 생성된 것들중에서
	// SungJukDTO2 타입을 찾아서 자동으로 주입해라.

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.print("이름 입력 : ");
		String name = scan.next();
		System.out.print("국어 입력 : ");
		int kor = scan.nextInt();
		System.out.print("영어 입력 : ");
		int eng = scan.nextInt();
		System.out.print("수학 입력 :");
		int math = scan.nextInt();
		System.out.println();

		int tot = kor + eng + math;
		double avg = (double) tot / 3;

		sungJukDTO2.setName(name);
		sungJukDTO2.setKor(kor);
		sungJukDTO2.setEng(eng);
		sungJukDTO2.setMath(math);
		sungJukDTO2.setTot(tot);
		sungJukDTO2.setAvg(avg);

		list.add(sungJukDTO2);
		System.out.println(list);

		// 응답
		System.out.println();
		System.out.println(name + "님의 데이터를 저장 하였습니다.");

	}

}
