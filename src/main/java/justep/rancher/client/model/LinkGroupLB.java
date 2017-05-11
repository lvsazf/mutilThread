package justep.rancher.client.model;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang.StringUtils;

public class LinkGroupLB {
	//Only for API: 'addservicelink' and 'removeservicelink'
	private LoadBalancerServiceLink serviceLink;
	//Only for API: 'setservicelinks'
	private Set<LoadBalancerServiceLink> serviceLinks;
	public LoadBalancerServiceLink getServiceLink() {
		return serviceLink;
	}
	public void setServiceLink(LoadBalancerServiceLink serviceLink) {
		this.serviceLink = serviceLink;
	}
	
	public Set<LoadBalancerServiceLink> getServiceLinks() {
		return serviceLinks;
	}
	public void setServiceLinks(Set<LoadBalancerServiceLink> serviceLinks) {
		this.serviceLinks = serviceLinks;
	}
	
	public static LinkBuilder LinkBuilder(String serviceId) {
		return new LinkBuilder(serviceId);
	}
	
	public static LinksBuilder LinksBuilder() {
		return new LinksBuilder();
	}
	
	public static class LinkBuilder{
		private LoadBalancerServiceLink serviceLink;
		LinkBuilder(String serviceId) {
			serviceLink = new LoadBalancerServiceLink(serviceId);
		}
		
		public LinkBuilder addPort(String domain,Integer hostPort,Integer containerPort){
			if(hostPort!=null&&StringUtils.isNotBlank(domain)){
				serviceLink.addPort(domain, hostPort, containerPort);
			}
			return this;
		}
		public LinkGroupLB build(){
			LinkGroupLB link =new LinkGroupLB();
			link.setServiceLink(this.serviceLink);
			return link;
		}
	}
	
	public static class LinksBuilder{
		private Set<LoadBalancerServiceLink> serviceLinks;
		public LinksBuilder addLink(String serviceId,String domain,Integer hostPort,Integer containerPort){
			if(serviceLinks==null){
				this.serviceLinks=new HashSet<LoadBalancerServiceLink>();
			}
			LoadBalancerServiceLink link = new LoadBalancerServiceLink(serviceId);
			if(hostPort!=null&&StringUtils.isNotBlank(domain)){
				link.addPort(domain, hostPort, containerPort);
			}
			this.serviceLinks.add(link);
			return this;
		}
		/**
		 * port format : domain:hostPort:containerPort
		 */
		public LinksBuilder addLink(String serviceId,Set<String> ports){
			if(serviceLinks==null){
				this.serviceLinks=new HashSet<LoadBalancerServiceLink>();
			}
			LoadBalancerServiceLink link = new LoadBalancerServiceLink(serviceId);
			if(ports!=null&&ports.size()>0){
				link.setPorts(ports);
			}
			this.serviceLinks.add(link);
			return this;
		}
		public LinksBuilder addSimpleLink(String serviceId){
			return addLink(serviceId, null, null, null);
		}
		public LinkGroupLB build(){
			LinkGroupLB link =new LinkGroupLB();
			link.setServiceLinks(this.serviceLinks);
			return link;
		}
	}
	
}
