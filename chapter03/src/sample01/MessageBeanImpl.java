package sample01;

import lombok.Setter;

//Target
public class MessageBeanImpl implements MessageBean {
	@Setter
	private String str;

	@Override
	public void showPrintBefore() {
		System.out.println("showprintBefore 메세지" + str);// 핵심코드

	}

	@Override
	public void viewPrintBefore() {
		try {
			Thread.sleep(1000);// 1초 딜레이- 기본단위 1/1000초
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("viewprintBefore 메세지" + str);// 핵심코드

	}

	@Override
	public void showPrintAfter() {
		System.out.println("showPrintAfter 메세지" + str);

	}

	@Override
	public void viewPrintAfter() {

		try {
			Thread.sleep(1000);// 1초 딜레이- 기본단위 1/1000초
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println("viewPrintAfter 메세지" + str);

	}

	@Override
	public String showPrint() {
		System.out.println("showPrint 메세지" + str);
		return "Hello Spring";

	}

	@Override
	public void viewPrint() {
		System.out.println("viewPrint 메세지" + str);
		try {
			Thread.sleep(1000);// 1초 딜레이- 기본단위 1/1000초
		} catch (InterruptedException e) {

			e.printStackTrace();
		}

	}

	@Override
	public void display() {
		System.out.println("display 메세지" + str);// 핵심코드

	}
}

//핵심코드 ->담당 메소드가 해야하는 일
