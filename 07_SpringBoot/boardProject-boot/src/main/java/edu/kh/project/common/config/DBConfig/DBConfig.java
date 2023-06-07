package edu.kh.project.common.config.DBConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.zaxxer.hikari.HikariConfig;

@Configuration // Configuration : 구성
// 스프링 애플리케이션을 구성하기 위한 설정용 Bean 생성 클래스
// 기존에 xml 파일로 설정하던 것을 class로 변환

// @PropertySource : properties 파일의 내용을 이용하겠다는 어노테이션
//다른 properties도 추가하고 싶으면 어노테이션을 계속 추가
@PropertySource("classpath:/config.properties")
public class DBConfig {
	
	@Autowired
	private ApplicationContext applicationContext; // application scope 객체
	
	@Bean 
	// 개발자가 수동으로 bean을 등록하는 어노테이션
	// @Bean 어노테이션이 작성된 메서드에서 반환된 객체는 spring Controller가 관리함 (IOC)
	private HikariConfig hikariConfig() {
		return new HikariConfig();
	}
	
}
