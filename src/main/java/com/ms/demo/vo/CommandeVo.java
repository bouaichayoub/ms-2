package com.ms.demo.vo;


public class CommandeVo {
	
	private Long id;
	private String ref;
	private double total;
	private double totalPaye;
	
	
	public CommandeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotalPaye() {
		return totalPaye;
	}
	public void setTotalPaye(double totalPaye) {
		this.totalPaye = totalPaye;
	}
}
