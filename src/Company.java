
    class Company extends Bankadmnistraction {
         String matricule2;
        public Company(String admnistractionname, int monthsalary, String matricule2) {
            super(admnistractionname, Integer.parseInt(matricule2));
            this.matricule2= matricule2;
        }

        public void displayDetails() {
            System.out.println("admnistractionname: " + getAdmnistractionname() +
                    ", monthsalary: " + getMonthsalary() +
                    ", matricule2: " + matricule2);
            ""
        }
    }




