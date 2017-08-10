package restorbi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import restorbi.core.BasicModel;

@Entity
public class Adisyon extends BasicModel{
 //
	@Column(name="desk_number")
	private int deskNumber=0;
	
	@OneToMany(fetch=FetchType.LAZY) //Ýnner join arkadar yapar.Lazy yazmazsan adisyonun menuleri ni de getiriyor. Performans için lazy.	
	@Column(name="menu")
	private Menu menu;
	
	@Column(name="porsion")
	private String porsion="";
	
	@Column(name="detail")
	private String detail;
	
	public int getDeskNumber() {
		return deskNumber;
	}
	public void setDeskNumber(int deskNumber) {
		this.deskNumber = deskNumber;
	}
	public Menu getMenu() {
		return menu;
	}
	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	public String getPorsion() {
		return porsion;
	}
	public void setPorsion(String porsion) {
		this.porsion = porsion;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	
	
	
}
