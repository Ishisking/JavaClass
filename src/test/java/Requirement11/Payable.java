package Requirement11;

public interface Payable {
	/*
	 * Interface is always going to have Variables as CONSTANT !! Methods are
	 * Abstract before java 8 From java 8 introduced Default Methods:-Methods which
	 * have Body!! Java 9 onwards methods are private
	 */
	public abstract double calculatePayment();

	public default boolean processPayment(String paymentMode) {
		if ((paymentMode.equalsIgnoreCase("CASH")) || (paymentMode.equalsIgnoreCase("CARD"))
				|| (paymentMode.equalsIgnoreCase("UPI"))) {
			System.out.println("Processing Payment......");
			System.out.println("Payment Successful !!!");
			return true;
		} else {
			System.err.println("Something Went Wrong....");
		}
		return false;
	}

	public default boolean processPayment(PaymentMode paymentMode) {
		if (paymentMode == PaymentMode.CASH || paymentMode == PaymentMode.UPI || paymentMode == PaymentMode.CARD) {
			System.out.println("Processing Payment......");
			System.out.println("Payment Successful with :" + paymentMode);
			return true;
		} else {
			System.err.println("Something Went Wrong....");
		}
		return false;
	}

	public abstract void generateReceipt();

	public abstract double getDiscount();
}
