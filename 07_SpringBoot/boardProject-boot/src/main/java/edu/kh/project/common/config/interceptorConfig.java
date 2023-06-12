package edu.kh.project.common.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import edu.kh.project.common.interceptor.BoardTypeInterceptor;

@Configuration
public class interceptorConfig implements WebMvcConfigurer{
	
	@Bean
	public BoardTypeInterceptor boardTypeInterceptor() {
		return new BoardTypeInterceptor();
	}

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		// Bean으로 등록된 BoardTypeInterceptor를 얻어와 인터셉터로 등록
		registry.addInterceptor(boardTypeInterceptor())
		.addPathPatterns("/**") // 가로챌 경로 지정 (여러개 작성시 ,로 구분)
		.excludePathPatterns("/css/**", "/image/**", "/js/**"); // 가로채지 않을 경로
		
		// 다른 인터셉터 만들면 아래에 위 구문 추가해서 사용 가능~~
		
		
	}
	
	
}
