package justep.rancher.client.model;

import java.util.HashSet;
import java.util.Set;

public class LinkGroup {
	//Only for API: 'addservicelink' and 'removeservicelink'
	private ServiceLink serviceLink;
	//Only for API: 'setservicelinks'
	private Set<ServiceLink> serviceLinks;
	public ServiceLink getServiceLink() {
		return serviceLink;
	}
	public void setServiceLink(ServiceLink serviceLink) {
		this.serviceLink = serviceLink;
	}
	
	public Set<ServiceLink> getServiceLinks() {
		return serviceLinks;
	}
	public void setServiceLinks(Set<ServiceLink> serviceLinks) {
		this.serviceLinks = serviceLinks;
	}
	
	public static LinkGroup LinkBuilder(String serviceId,String name){
		LinkGroup link =new LinkGroup();
		link.serviceLink=new ServiceLink(serviceId,name);
		return link;
	}
	
	public static LinksBuilder LinksBuilder() {
		return new LinksBuilder();
	}
	
	public static class LinksBuilder{
		private Set<ServiceLink> serviceLinks;
		public LinksBuilder addLink(String serviceId,String name){
			if(serviceLinks==null){
				this.serviceLinks=new HashSet<ServiceLink>();
			}
			ServiceLink link = new ServiceLink(serviceId,name);
			this.serviceLinks.add(link);
			return this;
		}
		public LinkGroup build(){
			LinkGroup link =new LinkGroup();
			link.setServiceLinks(this.serviceLinks);
			return link;
		}
	}
	
}
