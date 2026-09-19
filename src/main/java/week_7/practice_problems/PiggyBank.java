public class PiggyBank {
    private final String id; 
    private double savings; 

    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.savings += amount;
            System.out.println("savings = " + this.savings);
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            return;
        }

        if (amount > this.savings) {
            System.out.println("rejected, savings stays " + this.savings);
        } else {
            this.savings -= amount;
            System.out.println("savings = " + this.savings);
        }
    }

    public double getSavings() {
        return this.savings;
    }

    public String getId() {
        return this.id;
    }
}
