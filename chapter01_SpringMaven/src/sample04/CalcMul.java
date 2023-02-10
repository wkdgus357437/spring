package sample04;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("calcMul")
@Scope("prototype")
public class CalcMul implements Calc {

	@Override
	public void calculate(int x, int y) {
		System.out.println(x + "*" + y + "=" + (x * y));
		
	}

}
