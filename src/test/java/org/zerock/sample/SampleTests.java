package org.zerock.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//	테스트 코드 : 테스트를 jUnit으로 한다.
@RunWith(SpringJUnit4ClassRunner.class)
//	root-context.xml 파일의 경로를 알려준다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j	//	로깅을 위해
public class SampleTests {
	//	setter를 이용해서 Restaurant 객체를 주입받는다.
	@Setter(onMethod_= { @Autowired })
	private Restaurant restaurant;
	
	//	테스트를 수행한느 메소드 : Unit 테스트
	@Test
	public void testExists() {	
		assertNotNull(restaurant);	//	restaurant 객체가 not null(null이 아니면)이면 테스트 성공
		
		//	콘솔창에 출력 : log를 사용하기 위하여 @Log4j 어노테이션을 사용.
		log.info(restaurant);	//	restaurant 객체가 주입받았는지 확인
		log.info("-----------------------");
		log.info(restaurant.getChef());	//	chef 객체가 주입받았는지 확인
	}
}
