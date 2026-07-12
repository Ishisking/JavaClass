package Requirement11;

public class TutionFees implements Payable {
	private final double baseFees;
	private final double scholarshipDeduction;
	private final double earlyPaymentDiscount;
	private double finalFeesAmount;

	public TutionFees(double baseFees, double scholarshipDeduction, double earlyPaymentDiscount) {
		super();
		this.baseFees = baseFees;
		this.scholarshipDeduction = scholarshipDeduction;
		this.earlyPaymentDiscount = earlyPaymentDiscount;
	}

	@Override
	public double calculatePayment() {
		finalFeesAmount = baseFees - scholarshipDeduction - earlyPaymentDiscount;
		return finalFeesAmount;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************GENERATING FEES RECEIPT******************");
		System.out.println(" ");
		System.out.println("Base Fees :" + baseFees);
		System.out.println("Deductions Offerred : -" + scholarshipDeduction);
		System.out.println("Early Payment Discount : -" + earlyPaymentDiscount);
		System.out.println("Total Amount to be Paid : " + finalFeesAmount);
		System.out.println(" ");
		System.out.println("******************* THANK YOU !!!************************");
		System.out.println(" ");
	}

	@Override
	public double getDiscount() {
		return (scholarshipDeduction + earlyPaymentDiscount);
	}

}
