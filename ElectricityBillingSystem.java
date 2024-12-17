import java.util.ArrayList;
import java.util.Scanner;

public class ElectricityBillingSystem {
    private ArrayList<Customer> customers;
    private int customerIdCounter;

    public ElectricityBillingSystem() {
        customers = new ArrayList<>();
        customerIdCounter = 1;
    }

    public void addCustomer(String name) {
        Customer customer = new Customer(name, customerIdCounter++);
        customers.add(customer);
    }

    public void recordElectricityUsage(int customerId, double units) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) { 
                customer.addConsumption(units);
                return;
            }
        }
        System.out.println("Customer not found with ID: " + customerId);
    }
    
    public void generateBill(int customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId() == customerId) { 
                double billAmount = customer.calculateBill();
                System.out.println("Bill for Customer ID " + customerId + ": $" + billAmount);
                return;
            }
        }
        System.out.println("Customer not found with ID: " + customerId);
    }
    

    public static void main(String[] args) {
        ElectricityBillingSystem billingSystem = new ElectricityBillingSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nElectricity Billing System Menu:");
            System.out.println("1. Add Customer");
            System.out.println("2. Record Electricity Usage");
            System.out.println("3. Generate Bill");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = scanner.next();
                    billingSystem.addCustomer(name);
                    break;
                case 2:
                    System.out.print("Enter customer ID: ");
                    int customerId = scanner.nextInt();
                    System.out.print("Enter units consumed: ");
                    double units = scanner.nextDouble();
                    billingSystem.recordElectricityUsage(customerId, units);
                    break;
                case 3:
                    System.out.print("Enter customer ID: ");
                    customerId = scanner.nextInt();
                    billingSystem.generateBill(customerId);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
                scanner.close();
            }
        }
    }
}
