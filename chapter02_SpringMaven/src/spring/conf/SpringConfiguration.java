package spring.conf;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import sample01.MessageBeanImpl;
import sample02.CalcAdd;
import sample02.CalcMul;
import sample05.SungJukDTO2;

@Configuration // == applicationContext.xml
public class SpringConfiguration { // applicationContext.xml을 대신 해주는 자바 파일이다. 빈 생성하는 자바파일.

	
	//sample01
	@Bean
	public MessageBeanImpl messageBeanImpl(){  // sample01
		return new MessageBeanImpl("사과");
		
	}
	
	//sample02
	@Bean
	public CalcAdd calcAdd() {
	return new CalcAdd(30,50);
	}
	
	@Bean(name="calcMul")
	public CalcMul calcMul() {
	return new CalcMul();
	}
	
	//
	
	//sample05 //ArrayList는 자바에서 제공하는 것이기 떄문에 여기서 생성한다
	@Bean
	//public ArrayList<SungJukDTO2> arrayList(){
	public List<SungJukDTO2> arrayList(){
		return new ArrayList<SungJukDTO2>();
	}
}

/*
 @Bean
 - return 되는 클래스의 빈을 생성한다.
 - 반드시 메소드의 이름은 id명으로 설정해야한다.
 */