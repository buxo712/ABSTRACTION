public abstract class Bankadmnistraction {
        private String admnistractionname;
        private int monthsalary;
        // Constructor to initialize  monthsalary
        public Bankadmnistraction(String admnistractionname, int monthsalary) {
            this.admnistractionname = admnistractionname;
            this.monthsalary = monthsalary;
        }

    // Abstract method to display details
    public abstract void displayDetails();
    // Concrete method to compute a value based on a parameter
    public int computeValue(int parameter) {
        return parameter ;
    }

    // Getters for monthsalary
    public String getAdmnistractionname() {
        return admnistractionname;
    }



