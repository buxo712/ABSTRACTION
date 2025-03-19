
    class Organisation extends Bankadmnistraction {
        private String matricule1;


        public Organisation(String admnistractionname, int monthsalary, String matricule1) {
            super(admnistractionname, monthsalary);
            this.matricule1 = matricule1;
        }
        public void displayDetails() {
            System.out.println("Admnistractioname: " + getAdmnistractionname() +
                    ", Monthsalary: " + getMonthsalary() +
                    ", Matricule1: " + matricule1);
        }
    }

