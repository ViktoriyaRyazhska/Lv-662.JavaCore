package l7HWQ1;

public class ContractEmployee extends Employee implements Payment {
	private int fixedPay;
	private String federalTaxIdmember;
	
	ContractEmployee() {}
	
	ContractEmployee (String eID, String eName, int ePay, String eFTID) {
		this.employeeid = eID;
		this.Name = eName;
		setPay(ePay);
		setfederalTaxIdmember(eFTID);
		
	}
	
	public void setPay(int pay) {
		this.fixedPay =  pay;
	}
	
	public int getPay() {
		return this.fixedPay;
	}
	
	public void setfederalTaxIdmember(String ftm) {
		this.federalTaxIdmember =  ftm;
	}
	
	public String getfederalTaxIdmember() {
		return this.federalTaxIdmember;
	}

	@Override
	public int calculatePay() {
		return getPay() / 12;
	}
}
