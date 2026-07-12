package Requirement11;

public class TransportFee implements Payable {
	private double baseFee;
	private double siblingDiscount;
	private int paymentMonths;
	private double finalAmount;

	public TransportFee(double baseFee, double siblingDiscount, int paymentMonths) {
		super();
		this.baseFee = baseFee;
		this.siblingDiscount = siblingDiscount;
		this.paymentMonths = paymentMonths;
	}

	@Override
	public double calculatePayment() {
		finalAmount = (baseFee * paymentMonths) - siblingDiscount;
		return finalAmount;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************GENERATING TRANSPORT FEE RECEIPT******************");
		System.out.println(" ");
		System.out.println("Base Fee(per Month) :" + baseFee);
		System.out.println("No of Payable Months of Transport: " + paymentMonths);
		System.out.println("Sibling Discount  : -" + siblingDiscount);
		System.out.println("Final Amount to be Paid :" + finalAmount);
		System.out.println(" ");
		System.out.println("******************* THANK YOU !!!************************");
		System.out.println(" ");
	}

	@Override
	public double getDiscount() {
		return siblingDiscount;
	}
}
