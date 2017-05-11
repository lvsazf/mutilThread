package justep.rancher.client;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.JedisPubSub;

public class URLSubscribe extends JedisPubSub {
	ServiceHelper sc=RancherClient.getInstance("http://192.168.2.91:8080", ServiceHelper.class,"EF7558FE1DB0FFF489BE","HTojXE7xuMnKR3EJnGpHyZZ52igxAEznu2vHqs8L");
	
	 // 取得订阅的消息后的处理  
    public void onMessage(String channel, String message) {  
        System.out.println(channel + "=" + message);  
    }  
  
    // 初始化订阅时候的处理  
    public void onSubscribe(String channel, int subscribedChannels) {  
        // System.out.println(channel + "=" + subscribedChannels);  
    }  
  
    // 取消订阅时候的处理  
    public void onUnsubscribe(String channel, int subscribedChannels) {  
        // System.out.println(channel + "=" + subscribedChannels);  
    }  
  
    // 初始化按表达式的方式订阅时候的处理  
    public void onPSubscribe(String pattern, int subscribedChannels) {  
        // System.out.println(pattern + "=" + subscribedChannels);  
    }  
  
    // 取消按表达式的方式订阅时候的处理  
    public void onPUnsubscribe(String pattern, int subscribedChannels) {  
        // System.out.println(pattern + "=" + subscribedChannels);  
    }  
  
    // 取得按表达式的方式订阅的消息后的处理  
    public void onPMessage(String pattern, String channel, String message) {
    	Map<String,String> map=new HashMap<String, String>();
		map.put("tomcat6.xpaas.cn", "1s18");
		map.put("tomcat8.xpaas.cn", "1s24");
        System.out.println(channel + " = " + message);
        switch (channel) {
		case "__keyevent@0__:set":
			try {
				sc.activate(map.get(message));
			} catch (Exception e) {
				System.out.println("Service is running!");
			}
			break;
		case "__keyevent@0__:expired":
//			sc.deactivate(map.get(message));
			break;
		default:
			break;
		}
    }  
}