package sample01;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.springframework.util.StopWatch;

//공통코드
//Aspect
public class LoggingAdvice {
	public void beforeTrace() {
		System.out.println("before trace"); //impl에 있는 showPrintBefore,viewPrintBefore에 넣겠다 
		
		
	}
	public void afterTrace() {
		System.out.println("after trace");
	}
	
	public void trace(ProceedingJoinPoint JoinPoint) throws Throwable{
		//앞에 삽입될 코드
		String methodName = JoinPoint.getSignature().toShortString();
		System.out.println("메소드" + methodName);
		
		StopWatch sw = new StopWatch();
		sw.start(methodName);
		
		
		
		Object ob = JoinPoint.proceed(); //학심코드 호출
		System.out.println("반환값 =" + ob);
		
		sw.stop();
		System.out.println("처리 시간 = " + sw.getTotalTimeMillis()/1000 + "초");
		
		
		//뒤에 삽입될 코드
	}

}


/*
target은 MessageBeanImpl

joinPoint: target에 있는 모든 메소드 
: public void showPrintBefore		  
: public void  viewPrintBefore
: display

pointCut : joinPoint중에 선택된 메소드
: public void showPrintBefore		  
: public void viewPrintBefore

*/

/*
1. before
: beforeTrace() - showPrintBefore() 호출

2.after
 :showPrintAfter() - afterTrace() 호출
 
 3.around

 */