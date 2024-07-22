public class RewardValue {
    private double cashValue;
    private double milesValue;

    private static final double miles_to_cash_rate = 0.0035;

    // Constructor that accepts a cash value
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / miles_to_cash_rate;
    }

    // Constructor that accepts a value in miles
    public RewardValue(double milesValue, boolean isMiles) {
        if (isMiles) {
            this.milesValue = milesValue;
            this.cashValue = milesValue * miles_to_cash_rate;
        }
    }

    // Method to get the cash value
    public double getCashValue() {
        return cashValue;
    }

    // Method to get the miles value
    public double getMilesValue() {
        return milesValue;
    }

    public static void main(String[] args) {
        RewardValue rewardFromCash = new RewardValue(100.0);
        System.out.println("Cash Value: $" + rewardFromCash.getCashValue());
        System.out.println("Miles Value: " + rewardFromCash.getMilesValue() + " miles");

        RewardValue rewardFromMiles = new RewardValue(1000.0, true);
        System.out.println("Cash Value: $" + rewardFromMiles.getCashValue());
        System.out.println("Miles Value: " + rewardFromMiles.getMilesValue() + " miles");
    }
}