package sample01;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

//공통코드
//Aspect
@Aspect
@Component
public class LoggingAdvice {

	@Before("execution(public void sample01.MessageBeanImpl.*Before())")
	public void beforeTrace() {
		System.out.println("before trace"); // impl에 있는 showPrintBefore,viewPrintBefore에 넣겠다

	}

	@After("execution(public * *.*.*After(..))")
	public void afterTrace() {
		System.out.println("after trace");
	}

	@Around("execution(public * *.MessageBeanImpl.*Print(..))")
	public void trace(ProceedingJoinPoint JoinPoint) throws Throwable {
		// 앞에 삽입될 코드
		String methodName = JoinPoint.getSignature().toShortString();
		System.out.println("메소드" + methodName);

		StopWatch sw = new StopWatch();
		sw.start(methodName);

		Object ob = JoinPoint.proceed(); // 학심코드 호출
		System.out.println("반환값 =" + ob);

		sw.stop();
		System.out.println("처리 시간 = " + sw.getTotalTimeMillis() / 1000 + "초");

		// 뒤에 삽입될 코드
	}

}

/*
 * target은 MessageBeanImpl
 * 
 * joinPoint: target에 있는 모든 메소드 : public void showPrintBefore : public void
 * viewPrintBefore : display
 * 
 * pointCut : joinPoint중에 선택된 메소드 : public void showPrintBefore : public void
 * viewPrintBefore
 * 
 */

/*
 * 1. before : beforeTrace() - showPrintBefore() 호출
 * 
 * 2.after :showPrintAfter() - afterTrace() 호출
 * 
 * 3.around
 * 
 */