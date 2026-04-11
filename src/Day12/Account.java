package Day12;

public class Account
{	public void setAccno(long accno) {
		this.accno = accno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	public long getAccno() {
		return accno;
	}
	public String getName() {
		return name;
	}
	public double getAmount() {
		return amount;
	}
	
	private long accno;
	private String name;
	private double amount;
	
	
	
}
