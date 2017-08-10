package restorbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import restorbi.core.BasicModel;

@Entity
public class Order extends BasicModel{

	@OneToMany(fetch = FetchType.LAZY)
	@Column(name="memu")
	private Menu menu=null;
	private int deskNumber=0;
	private Customer customer=null;
	
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public int getDeskNumber() {
		return deskNumber;
	}
	public void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	
	
}
