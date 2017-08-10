package restorbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import restorbi.core.BasicModel;

@Entity
public class Material extends BasicModel{

	@Column(name="m_name")
	private String name ="";
	
	@Column(name="m_number")
	private int number=0;
	
	@Column(name="m_weight")
	private float weight;
	
	@Column(name="m_remainAmount")
	private float remainAmount;
	
	@Column(name="m_supplier")
	private String supplier="";
	
	@Column(name="m_price")
	private float price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public float getRemainAmount() {
		return remainAmount;
	}
	public void setRemainAmount(float remainAmount) {
		this.remainAmount = remainAmount;
	}
	public String getSupplier() {
		return supplier;
	}
	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	
	
	
}
