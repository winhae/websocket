//package web.websocket;
//
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.servlet.http.HttpServlet;
//import javax.websocket.OnClose;
//import javax.websocket.OnMessage;
//import javax.websocket.OnOpen;
//import javax.websocket.Session;
//import javax.websocket.server.ServerEndpoint;
//
///**
// * Servlet implementation class FrontController_chat
// */
//@ServerEndpoint("/web")
//public class FrontController_chat extends HttpServlet {
//	
//	public static Set<Session> clients = Collections.synchronizedSet(new HashSet<>());
//	private static int conCount = 1;
//	
//	@OnOpen
//		public void open(Session session) {
//		clients.add(session);
//		System.out.println(conCount++ +" 번째 사용자 접속...");
//	}
//	@OnMessage
//	public void message(String msg)throws Exception{
//		for(Session tmp: clients) {
//			tmp.getBasicRemote().sendText(msg);
//		}
//	}
//	@OnClose
//	public void close(Session session) {
//		clients.remove(session);
//			
//	}
//	
//	
//
//
//		
//	
//
//
//}
