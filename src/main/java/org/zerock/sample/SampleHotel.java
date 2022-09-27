package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;

@Component	//	스프링에서 주입받는 객체라고 알린다.
@ToString	//	toString() 메소드를 설정
@Getter		//	
public class SampleHotel {
	//	생성자로 주입을 받겠다. (필드가 한 개일 경우)
	//	스프링 4.3부터 필드가 한개일 경우는 다른 어노테이션을 하지 않더라도 자동으로 
	//	주입을 받는다. -> 대신에 생성자를 정의해주어야 한다.
	private Chef chef;
	
	//	생성자
	public SampleHotel(Chef chef) {		//	Chef 객체를 매개변수로 정의한 생성자
		this.chef = chef;
	}
}
