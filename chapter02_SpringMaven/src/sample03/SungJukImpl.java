package sample03;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SungJukImpl implements SungJuk {
	
	@Autowired 		// (스프링컨테이너가 @Component로 설정된 빈에서 SungJukDTO타입을 찾아서 자동으로주입)
	private SungJukDTO sungJukDTO=null;
	
	
	/*------------------------------------------------------------------------------------------
	 (스프링컨테이너가 @Component로 설정된 빈에서 SungJukDOT타입을 찾아서 자동으로주입 하기 떄문에 여기는 필요가 없음)
	public SungJukImpl(SungJukDTO sungJukDTO) {
		this.sungJukDTO = sungJukDTO;
	}
	------------------------------------------------------------------------------------------
	*/

	@Override
	public void calcTot() {
		sungJukDTO.setTot(sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath());
	}

	@Override
	public void calcAvg() {
		sungJukDTO.setAvg((sungJukDTO.getKor() + sungJukDTO.getEng() + sungJukDTO.getMath())/(3.0));
	}

	@Override
	public void display() {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");	
		System.out.println(sungJukDTO);
		System.out.println();
	}

	@Override
	public void modify() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		sungJukDTO.setName(scan.next());
		System.out.print("국어 점수를 입력하세요 : ");
		sungJukDTO.setKor(scan.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");
		sungJukDTO.setEng(scan.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		sungJukDTO.setMath(scan.nextInt());
		System.out.println();
		calcTot();
		calcAvg();
		display();
	}

}
