public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;
    private int currentYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.currentYear = 2021;
    }

    public double tax() {
        if (salary < 1000) {
            return 0;
        } else {
            return salary * 0.03;
        }
    }

    public double bonus() {
        if (workHours > 40) {
            int extraHours = workHours - 40;
            return extraHours * 30;
        } else {
            return 0;
        }
    }

    public double raiseSalary() {
        int yearsWorked = currentYear - hireYear;
        double salaryIncrease = 0;
        if (yearsWorked < 10) {
            salaryIncrease = salary * 1.05;
        } else if (yearsWorked < 20) {
            salaryIncrease = salary * 1.1;
        } else {
            salaryIncrease = salary * 1.15;
        }
        return salaryIncrease;
    }

    public void printInfo() {
        double taxAmount = tax();
        double bonusAmount = bonus();
        double totalSalary = salary - taxAmount + bonusAmount;
        double salaryIncrease = raiseSalary();

        System.out.println("Adı: " + name);
        System.out.println("Maaşı: " + salary + " TL");
        System.out.println("Çalışma Saati: " + workHours);
        System.out.println("Başlangıç Yılı: " + hireYear);
        System.out.println("Maaş Artışı: " + salaryIncrease + " TL");
        System.out.println("Vergi: " + taxAmount + " TL");
        System.out.println("Bonus: " + bonusAmount + " TL");
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalSalary + " TL");
        System.out.println("Toplam Maaş: " + (totalSalary + raiseSalary()) + " TL");
    }
}
