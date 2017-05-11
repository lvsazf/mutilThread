package justep.rancher.client;

import redis.clients.jedis.Jedis;

public class RedisTest {

	/**
	 * <p>MethodName: main</p>
	 * <p>Description: (这里用一句话描述这个方法的作用)</p>
	 * @param args
	 */
	public static void main(String[] args) {
		Jedis jedis = new Jedis("192.168.2.85");
		jedis.psubscribe(new URLSubscribe(), "__keyevent@0__:*");
        try {
            Thread.sleep(10000L);
        }catch (InterruptedException e) {
            System.out.println("延时失败:"+e);  
        }
        jedis.close();
        System.out.println("Test run finished");
	}
}
