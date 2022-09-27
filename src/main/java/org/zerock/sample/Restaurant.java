package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component		//	주입을 받는 빈이다.
@Data			//	lombok getter/setter, 생성자, toString()을 자동으로 만들어준다.
public class Restaurant {
	//	setter를 이용해서 스프링으로부터 주입을 받겠다고 선언 : 어노테이션을 이용
	@Setter(onMethod_= @Autowired)
	private Chef chef;
}
