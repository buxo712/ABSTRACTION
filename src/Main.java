public class Main {
    public static void main(String[] args) {

// Create instances of the subclasses
        Company comp = new Company("liberty" ,2300,"67");
        Organisation org = new Organisation("social", 7800, "ugbr4589kjl");
        // Display details for each object
        comp.displayDetails();
        org.displayDetails();
        // Compute and display values
        System.out.println("Computed Value for Company: " + comp.computeValue(344));
        System.out.println("_____________________________________________________");
        System.out.println("Computed Value for Organisation: " + org.computeValue(105));
    }
}