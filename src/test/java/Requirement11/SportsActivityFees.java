package Requirement11;

public class SportsActivityFees implements Payable {
	private final double equipmentCharges;
	private final double tournamentFees;
	private final double teamUniformCost;
	private final double discountforStatePlayers;
	private double finalSportsFee;

	public SportsActivityFees(double equipmentCharges, double tournamentFees, double teamUniformCost,
			double discountforStatePlayers) {
		super();
		this.equipmentCharges = equipmentCharges;
		this.tournamentFees = tournamentFees;
		this.teamUniformCost = teamUniformCost;
		this.discountforStatePlayers = discountforStatePlayers;
	}

	@Override
	public double calculatePayment() {
		finalSportsFee = equipmentCharges + tournamentFees + teamUniformCost - discountforStatePlayers;
		return finalSportsFee;
	}

	@Override
	public void generateReceipt() {
		System.out.println("***************GENERATING SPORTS FEES RECEIPT******************");
		System.out.println(" ");
		System.out.println("Equipment Charges :" + equipmentCharges);
		System.out.println("Tournament Fees : " + tournamentFees);
		System.out.println("Team Uniform Cost : " + teamUniformCost);
		System.out.println("Discount for State Players : -" + discountforStatePlayers);
		System.out.println("Final Amount to be Paid :" + finalSportsFee);
		System.out.println(" ");
		System.out.println("******************* THANK YOU !!!************************");
		System.out.println(" ");
	}

	@Override
	public double getDiscount() {
		return discountforStatePlayers;
	}

}
