package justep.rancher.client.model;

public class Pagination {
	private String first;
	private String previous;
	private String next;
	private Integer limit;
	private Integer total;
	private Boolean partial;
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	public String getPrevious() {
		return previous;
	}
	public void setPrevious(String previous) {
		this.previous = previous;
	}
	public String getNext() {
		return next;
	}
	public void setNext(String next) {
		this.next = next;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTotal() {
		return total;
	}
	public void setTotal(Integer total) {
		this.total = total;
	}
	public Boolean getPartial() {
		return partial;
	}
	public void setPartial(Boolean partial) {
		this.partial = partial;
	}
}
