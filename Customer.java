class Customer {
    private String name;
    private int customerId;
    private double unitsConsumed;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
        this.unitsConsumed = 0;
    }

    public void addConsumption(double units) {
        this.unitsConsumed += units;
    }

    public double calculateBill() {
        // You can implement your own billing logic here
        // For simplicity, let's assume a fixed rate per unit
        double ratePerUnit = 5.0; // Change this as needed
        return unitsConsumed * ratePerUnit;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\nName: " + name + "\nUnits Consumed: " + unitsConsumed;
    }

    public int getCustomerId() {
        return customerId;
    }
    
}