package org.zerock.mapper;

import org.apache.ibatis.annotations.Select;

//	기존에 JSP에서 수행했던 DAO와 유사한 동작을 하는 것이다.
//	인터페이스이며 구현 객체는 스프링이 자동으로 생성을 하고 동작을 한다.
//	따라서 개발자는 신경쓸 필요가 없다.
public interface TimeMapper {
	//	데이터베이스 연동하는 방법 2가지
	//	1. SQL문을 인터페이스의 메소드에 어노테이션으로 작성하는 방법 -> 간단한 경우에 사용
	@Select("SELECT now() from dual")
	public String getTime();	//	메소드를 추가 : 현재시간을 가져온다.

	//	2.Mapper XML 파일을 작성해서 인터페이스와 XML mapper와 연동하는 방법
	//	
	
}
