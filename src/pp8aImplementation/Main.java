package pp8aImplementation;

public class Main {
    public static void main(String[] args) {
        Employee mahin = new FullTimeEmployee("Mahin", 1001, "SWE", 60000);
        Employee omor = new ContractEmployee("Omor", 1002, "SWE", "System Development", 85000);
        Employee labib = new PartTimeEmployee("Labib", 1003, "SWE", 250, 25);

        System.out.println("Full-Time Employee (Mahin):");
        mahin.displayInfo();
        System.out.println("Pay: $ " + mahin.calculatePay());
        System.out.println();

        System.out.println("Contract Employee (Omor):");
        omor.displayInfo();
        System.out.println("Pay: $ " + omor.calculatePay());
        System.out.println();

        System.out.println("Part-Time Employee (Labib):");
        labib.displayInfo();
        System.out.println("Pay: $ " + labib.calculatePay());
    }
}

