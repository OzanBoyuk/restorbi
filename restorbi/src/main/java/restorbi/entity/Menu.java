package restorbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import restorbi.core.BasicModel;
import restorbi.core.EnumMenuCategory;

@Entity
public class Menu extends BasicModel{

	@Column(name="menu_name")
	private String name="";
	
	@Column(name="menu_price")
	private float price;
	
	@Column(name="menu_category")
	private EnumMenuCategory category;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public EnumMenuCategory getCategory() {
		return category;
	}
	public void setCategory(EnumMenuCategory category) {
		this.category = category;
	}
	
	
	
	
}
