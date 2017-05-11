package justep.rancher.client;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import justep.rancher.client.model.CommanResponse;
import justep.rancher.client.model.Container;
import justep.rancher.client.model.ContainerLogs;
import justep.rancher.client.model.Host;
import justep.rancher.client.model.LaunchBuilder;
import justep.rancher.client.model.LaunchConfig;
import justep.rancher.client.model.LinkGroupLB;
import justep.rancher.client.model.Machine;
import justep.rancher.client.model.RegistrationToken;
import justep.rancher.client.model.Registry;
import justep.rancher.client.model.Registrycredential;
import justep.rancher.client.model.Service;
import justep.rancher.client.model.Sidekick;
import justep.rancher.client.utils.ModelUtils;
import justep.rancher.client.utils.RancherException;


public class Test {

	/**
	 * <p>MethodName: main</p>
	 * <p>Description: (这里用一句话描述这个方法的作用)</p>
	 * @param args
	 */
	public static void main(String[] args) {
		ProjectHelper pc=RancherClient.getInstance("http://rancher.xpaas.net", ProjectHelper.class,"42081CD6175D2F77A305","hjvzVu3uYS2WAN87dYGemV98cWgukLhsrvCw7bPq");
//		EnvironmentHelper ec=RancherClient.getInstance("http://192.168.2.91:8080", EnvironmentHelper.class,"EF7558FE1DB0FFF489BE","HTojXE7xuMnKR3EJnGpHyZZ52igxAEznu2vHqs8L");
		ServiceHelper lb=RancherClient.getInstance("http://rancher.xpaas.net", ServiceHelper.class,"D57DB4C090EF82E1C5DC","usdXNSKFjaa3KdpeGtjP3Emf8DzzXtAwAR9oLGUz");
		LoadBalancerHelper lc=RancherClient.getInstance("http://rancher.xpaas.net", LoadBalancerHelper.class,"D57DB4C090EF82E1C5DC","usdXNSKFjaa3KdpeGtjP3Emf8DzzXtAwAR9oLGUz");
//		ContainerHelper cc=RancherClient.getInstance("http://123.56.31.158:8080", ContainerHelper.class,"EF7558FE1DB0FFF489BE","HTojXE7xuMnKR3EJnGpHyZZ52igxAEznu2vHqs8L");
		//		ServiceHelper sc=RancherClient.getInstance("http://123.56.31.158:8080", ServiceHelper.class);
////		HostHelper sc=RancherClient.getInstance("http://rancher.xpaas.net", HostHelper.class,"42081CD6175D2F77A305","hjvzVu3uYS2WAN87dYGemV98cWgukLhsrvCw7bPq");
//		MachineHelper mh=RancherClient.getInstance("http://rancher.xpaas.net", MachineHelper.class,"42081D6175D2F77A305","hjvzVu3uYS2WAN87dYGemV98cWgukLhsrvCw7bPq");
//		Machine m=Machine.MachineBuilder("Host34").accessKey("RWWYzDOowCvy35k2", "4VjwFi3JKe2JhUrMDrMAt22LcOkuWb").imageId("m-25lwvhdsu")
//				.instanceType("ecs.n1.small").ioOptimized("optimized").region("cn-beijing").securityGroup("test-group")
//				.sshPassword("aliyun@tiger435").systemDiskCategory("cloud_efficiency").vpc("vpc-255juavb5", "vsw-259ed1v5v")
//				.privateAddressOnly(true).diskConfig("cloud_efficiency", "20").build();
//		try {
//			mh.create("1a84", m);
//		} catch (RancherException e) {
//			e.printStackTrace();
//		}
//		Registry registry=new Registry();
//		registry.setServerAddress("cloudx5.com");
//		registry.setName("cloudx5.com");
//		registry=pc.createRegistry("1a84", registry);
//		
//		Registrycredential credential =new Registrycredential();
//		credential.setEmail("tiger435@qq.com");
//		credential.setPublicValue("admin");
//		credential.setSecretValue("1");
//		credential.setRegistryId(registry.getId());
//		pc.createRegistrycredential("1a84", credential);
//		Map<String,String> labels=new HashMap<String,String>();
//		labels.put("mode", "host");
//		List<RegistrationToken> tokens=pc.registrationtokens("1a5").getData();
//		if(tokens.size()>0){
//			String commondPrefix="sudo docker run -e CATTLE_HOST_LABELS='PlaceHolder'";
//			RegistrationToken token=tokens.get(0);
//			String commond=token.getCommand();
//			StringBuffer sb=new StringBuffer();
//			for(Map.Entry<String, String> entry:labels.entrySet()){
//				sb.append(entry.getKey());
//				sb.append("=");
//				sb.append(entry.getValue());
//				sb.append("&");
//			}
//			if(sb.length()>0){
//				sb.deleteCharAt(sb.length()-1);
//				commondPrefix=commondPrefix.replace("PlaceHolder", sb.toString());
//				commond=commond.replace("sudo docker run", commondPrefix);
//			}
//			System.out.println(commond);
//		}
//		List<Host> host=sc.queryHostWithIp("1a5", new HashMap<String,Object>()).getData();
//		System.out.println(host.size());
//		System.out.println(ModelUtils.toString(m));
//		mh.create("1a5", m);
		
//		System.out.println(sc.ipaddresses("1h1").getData().get(0).getAddress());
//		EnvironmentHelper ec=RancherClient.getInstance("http://192.168.2.91:8080", EnvironmentHelper.class,"1AA3A46537ED3DEE6157","KPVgSKH4ppa1u6DaigdaALtHoYbGqTcyxTH9KLzg");
		
//		CommanResponse<Project> cp=pc.query();
//		System.out.println(cp.getData().size());
//		
//		CommanResponse<Environment> ce=ec.query(new HashMap<String,Object>());
//		System.out.println(ce.getData().size());
//		
//		CommanResponse<Service> cs=sc.query("1a5",new HashMap<String,Object>());
//		System.out.println(cs.getData().size());
		
//		CommanResponse<Service> cs=lc.query("1a5",new HashMap<String,Object>());
//		System.out.println(cs.getData().size());
		//创建Stack
//		Environment e=new Environment();
//		e.setName("TestX");
//		e.setStartOnCreate(true);
//		ec.create("1a5", e);
		
//		创建普通Service+sidekick
//		LaunchConfig config=LaunchBuilder.init("registry.super.com/tomcat:6.0").volume("/tmp/test", "/tmp/test", "rw").scheduling("", "host_label", "mode", "host").build();
////		Sidekick sidekick1=LaunchBuilder.init("registry.super.com/tomcat:6.0").startOnce().build("T1-1");
//		Service s=Service.ServiceBuilder("T1", "1e1").startOnCreate(true).launchConfig(config).build();
//		System.out.println(ModelUtils.toString(s));
//		sc.create("1a5", s);
		
//		创建LB服务
//		Service lb=Service.ServiceBuilder("LB-TEST3", "1e20", "rancher/agent-instance:v0.8.1").portMapping(80, 8080).build();
//		lb=lc.create("1a5", lb);
		//创建简单的LB服务Link
//		LinkGroupLB link=LinkGroupLB.SimpleLinkBuilder("1s93");
//		lc.addLink(lb.getId(), link);
		//创建复杂的LB服务Link
		try {
			System.out.println(lb.get("1s410"));
		} catch (RancherException e1) {
			e1.printStackTrace();
		}
//		LinkGroupLB link=LinkGroupLB.LinksBuilder().addLink("1s410","111a.xpaas.net", 80, 8080).build();
		LinkGroupLB link=LinkGroupLB.LinkBuilder("1s410").addPort("111a.xpaas.net", 80, 8080).addPort("222a.xpaas.net", 80, 8080).build();
		try {
			lc.addLink("1s20", link);
		} catch (RancherException e) {
			e.printStackTrace();
		}
//		LinkGroupLB link2=LinkGroupLB.LinksBuilder().addLink("1s410","222a.xpaas.net", 80, 8080).build();
//		LinkGroupLB link2=LinkGroupLB.LinkBuilder("1s410","222a.xpaas.net", 80, 8080);
//		try {
//			lc.addLink("1s20", link2);
//		} catch (RancherException e) {
//			e.printStackTrace();
//		}
		
		//普通应用Link
//		LinkGroup linkGroup=LinkGroup.LinksBuilder().addLink("1s55", "T8").addLink("1s38", "T6").build();
//		Service s=sc.setLinks("1s91", linkGroup);
		
//		sc.restart("1s93",new RestartStrategy(1,1000));
		
//		System.out.println(ModelUtils.toString(new RestartStrategy(1,20)));
		
//		Service s=Service.ServiceBuilder("Tm", "1e20", "registry.super.com/tomcat:6.0", 0.5, 64.0, 2).addEnvironment("MYSQL_PASSWORD", "1")
//				.volume("/temp/data").startOnce().build();
//		System.out.println(s.toString());
//		sc.create("1a5", s);
		
//		cc.restart("1i29");
//		CommanResponse<Container> cs=cc.query("1s88");
//		System.out.println(cs.getData().size());
//		cc.restart("1i757");
		
		
//		ContainerLogs log=new ContainerLogs();
//		log.setFollow(true);
//		log.setLines(100);
//		System.out.println(ModelUtils.toString(cc.stats("1i29")));
		
//		CommanResponse<Container> query = cc.query("1s236");
//		System.out.println(query.getData().size());
	}

}
