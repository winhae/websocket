//package web.websocket;
//
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.websocket.OnClose;
//import javax.websocket.OnMessage;
//import javax.websocket.OnOpen;
//import javax.websocket.Session;
//import javax.websocket.server.ServerEndpoint;
//
//@ServerEndpoint("/websocket")
//public class WebSocket {
//
//	public static Set<Session> clients = Collections.synchronizedSet(new HashSet<>());
//	private static int connectorCount = 1;
//	@OnOpen
//	public void handleOpen(Session session) {
//		//client 가 들어왔을 때 할 행동을 여기에 작성할 거임. 이렇게 골뱅이 쓰고 url 입력하는게 
//		clients.add(session);
//		System.out.println(connectorCount++ + "사용자가 접속했습니다.");
//	}
//
//	@OnMessage
//	public void handleMessage(String message)throws Exception{
//		for(Session tmp:clients) {
//			tmp.getBasicRemote().sendText(message);
//			
//			
//		}
//
//	}
//	
//	@OnClose
//	public void handleClose(Session session) {
//		clients.remove(session); // 클라이언트가 연결을 끊으면 소켓 지우겠다.
//	}
//
//	public void handleError(Throwable t) {
//		//자료형이 able로 끝나면 보통 인터페이스다 거의. Exception 보통 throws 가능하다. 즉 Throwable 상속받은거임.
//	}
//}
