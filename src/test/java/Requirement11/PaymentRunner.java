package Requirement11;

import static com.BuilderDesignPattern.Student.*;

public class PaymentRunner {

	public static void main(String[] args) {
		Payable payable1 = new TutionFees(50000, 10000, 5000);
		payable1.calculatePayment();
		payable1.generateReceipt();
		payable1.processPayment(PaymentMode.CASH);
		System.out.println("Total Discount offerred :" + payable1.getDiscount());

		Payable payable2 = new SportsActivityFees(5000, 3000, 2000, 1000);
		payable2.calculatePayment();
		payable2.generateReceipt();
		payable2.processPayment(PaymentMode.CARD);
		// payable2.processPayment("CARD");
		System.out.println("Total Discount for State Players : " + payable2.getDiscount());

		Payable payable3 = new TransportFee(1000, 500, 9);
		payable3.calculatePayment();
		payable3.generateReceipt();
		// payable3.processPayment("UPI");
		payable3.processPayment(PaymentMode.UPI);
		System.out.println("Total Discount Received :" + payable3.getDiscount());

		Payable payable4 = new LibraryFee(500, 200, 100);
		payable4.calculatePayment();
		payable4.generateReceipt();
		payable4.processPayment("bitcoin");
		System.out.println(PaymentMode.CASH.getDescription());
		System.out.println(PaymentMode.UPI.getDescription());
		System.out.println(PaymentMode.CARD.getDescription());
		int index = PaymentMode.CARD.ordinal(); // give me the index of the value
		System.out.println(index);

		// Convert String to ENUM
		PaymentMode p = PaymentMode.valueOf("UPI");
		System.out.println(p);
		PaymentMode modes[] = PaymentMode.values(); // Retrieve all the values from the enum using values
		for (PaymentMode mode : modes) {
			System.out.println(mode);
		}
	PaymentMode.CARD.demo();
	PaymentMode.CASH.test();
	
	}

}
