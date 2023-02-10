package sample05;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data
public class SungJukDelete implements SungJuk {

	private List<SungJukDTO2> list;

	@Override
	public void execute() {
		System.out.println();
		Scanner scan = new Scanner(System.in);

		System.out.print("삭제 할 이름 입력 : ");
		String name = scan.next();

		int sw = 0;
		Iterator<SungJukDTO2> it = list.iterator();
		while (it.hasNext()) { // 항목이 있다 true , 없다false
			SungJukDTO2 sungJukDTO2 = it.next();

			if (sungJukDTO2.getName().equals(name)) {
				sw = 1;
				it.remove();

			}
		} // while
		if (sw == 0)
			System.out.println("찾고자 하는 이름이 없습니다.");
	}

}
