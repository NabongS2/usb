package edu.kh.project.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.HandshakeInterceptor;

import edu.kh.project.chatting.model.websocket.ChattingWebsocketHandler;

@Configuration // config 파일
@EnableWebSocket // 웹소켓을 사용하겠다.
public class WebSocketConfig implements WebSocketConfigurer{

	@Autowired
	private ChattingWebsocketHandler chattingWebsocketHandler;
	
	// 가로챘을 때 어떻게 처리
	@Autowired
	private HandshakeInterceptor handshakeInterceptor;
	
	// 웹소켓 등록
	@Override
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
								// 어떤 핸들러 , 어떤 주소
		registry.addHandler(chattingWebsocketHandler, "/chattingSock")
		.addInterceptors(handshakeInterceptor)
		.setAllowedOriginPatterns("http://localhost/","http://127.0.0.1") // 나중에 배포하면 그 주소 추가해주면 됨
		.withSockJS(); // 웹소켓을 지원하지 않으면 지원하겠다.
		
		//registry.addHandler("chattingWebsocketHandler", "/chattingSock").addInterceptor(handshakeInterceptor).setAllowedOriginPattern("http://localhost/","http://127.0.0.1").withSockJS(); 
		
		
		
	}		
	
	

}
