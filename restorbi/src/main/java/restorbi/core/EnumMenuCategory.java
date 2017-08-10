package restorbi.core;

public enum EnumMenuCategory {

	YIYECEK("yiyecek",1),
	ICECEK("icecek",2);
	
	private String label;
	private int code;
	
	private EnumMenuCategory(String label, int code) {
		this.label = label;
		this.code = code;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	
	
}
