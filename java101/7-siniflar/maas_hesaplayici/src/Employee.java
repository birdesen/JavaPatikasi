public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary > 1000) {
            return this.salary * 0.03;
        }
        return 0;
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }

    double raiseSalary() {
        int year = 2021 - this.hireYear;
        if (year > 19) {
            return this.salary * 0.15;
        } else if (9 < year && year < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.05;
        }
    }

    void print() {
        System.out.println("Adı: " + this.name +
                "\nMaaşı: " + this.salary +
                "\nHaftalık çalışma saati: " + this.workHours +
                "\nİşe giriş yılı: " + this.hireYear +
                "\nVergi: " + tax() +
                "\nBonus: " + bonus() +
                "\nMaaş artışı: " + raiseSalary() +
                "\nVergi ve bonuslarla birlikte maaş: " + (this.salary - tax() + bonus()) +
                "\nToplam maaş: " + (this.salary - tax() + bonus() + raiseSalary()));
    }


}
