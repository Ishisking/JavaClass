package Requirement11;

public class LibraryFee implements Payable {
	private final double basicSubscription;
	private final double additionalBookCharges;
	private final double lateReturnPenalty;
	private double finalAmount;

	public LibraryFee(double basicSubscription, double additionalBookCharges, double lateReturnPenalty) {
		super();
		this.basicSubscription = basicSubscription;
		this.additionalBookCharges = additionalBookCharges;
		this.lateReturnPenalty = lateReturnPenalty;
	}

	@Override
	public double calculatePayment() {
		finalAmount = basicSubscription + additionalBookCharges + lateReturnPenalty;
		return finalAmount;
	}

	@Override
	public boolean processPayment(String paymentMode) {
		if ((paymentMode.equalsIgnoreCase("BITCOIN"))) {
			System.out.println("Connecting to Wallet and Transferring 0.000001 bitcoin");
			System.out.println("Payment Successful !!!");
			return true;
		} else {
			System.err.println("Something Went Wrong....");
		}
		return false;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************GENERATING lIBRARY FEE RECEIPT******************");
		System.out.println(" ");
		System.out.println("Basic Subscription Fee :" + basicSubscription);
		System.out.println("Additional Book Charges : " + additionalBookCharges);
		System.out.println("Penalty for Late Return  : " + lateReturnPenalty);
		System.out.println("Final Library Fees to be Paid :" + finalAmount);
		System.out.println(" ");
		System.out.println("******************* THANK YOU !!!************************");
		System.out.println(" ");
	}

	@Override
	public double getDiscount() {
		return 0;
	}

}
