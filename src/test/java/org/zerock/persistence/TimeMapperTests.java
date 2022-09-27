package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.mapper.TimeMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

//	MyBatis 연동해서 데이터베이스를 처리하는 테스트

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class TimeMapperTests {
	@Setter(onMethod_=@Autowired)
	private TimeMapper timeMapper;
	
	@Test
	public void testGetTime() {
		//	TimeMapper인터페이스 구현객체의 이름을 출력
		log.info(timeMapper.getClass().getName());
		log.info(timeMapper.getTime());		//	현재시간을 출력
	}	
}
