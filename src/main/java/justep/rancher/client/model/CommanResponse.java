package justep.rancher.client.model;

import java.util.List;

public class CommanResponse<T> {
	private List<T> data;
	private Pagination pagination;
	
	public List<T> getData() {
		return data;
	}
	public void setData(List<T> data) {
		this.data = data;
	}
	public Pagination getPagination() {
		return pagination;
	}
	public void setPagination(Pagination pagination) {
		this.pagination = pagination;
	}
}
