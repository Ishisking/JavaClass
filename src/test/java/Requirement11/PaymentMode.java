package Requirement11;

public enum PaymentMode implements Demo {
	CASH("Payment via Cash") {
		@Override
		public void test() {
			System.out.println("Test Method from CASH");
		}
	},
	UPI("Payment via Google-Pay") {
		@Override
		public void test() {
			System.out.println("Test Method from Google-Pay");
		}
	},
	CARD("Payment via Credit/Debit Card") {
		@Override
		public void test() {
			System.out.println("Test Method from CREDIT/DEBIT CARD");
		}
	};

	private String description; // instance variable

	private PaymentMode(String description) { // constructor
		this.description = description;
	}

	public String getDescription() { // Method
		return description;
	}

	public abstract void test();

	@Override
	public void demo() {
		System.out.println("From the Payment Mode Demo Method");

	}
}
