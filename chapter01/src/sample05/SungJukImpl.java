package sample05;

public class SungJukImpl implements SungJuk {

	//calc의 매개변수 담을 곳을 선언 해준다
	int k;
	int e;
	int m;
	int sum;
	double avg;
	
	@Override
	public void calc(int x, int y, int z) {
		this.k = x;
		this.e = y;
		this.m = z;
		this.sum= x+y+z;
		this.avg=(double)sum/3;	
		
	}//calc

	@Override
	public void display(String name) {
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+k+"\t"+e+"\t"+m+"\t"+sum+"\t"+String.format("%.3f",avg)); //소수점 n번째 자리까지 반올림
		
	}//display

}
