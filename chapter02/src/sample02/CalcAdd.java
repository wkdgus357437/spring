package sample02;


import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CalcAdd implements Calc {

	private int x;
	private int y;

	@Override
	public void calculate() {
		System.out.println(x + "+" + y + "=" + (x + y));
	}

}

/*
 package sample02;

public class CalcAdd implements Calc {
	int x, y;

	public CalcAdd(int x,int y) {
		this.x=x;
		this.y=y;

	}
	
	@Override
	public void calculate() {
		System.out.println(x+" + "+ y +" = "+(x+y));
	}
}


  */
