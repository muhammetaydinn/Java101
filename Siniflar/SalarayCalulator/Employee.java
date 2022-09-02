package Siniflar.SalarayCalulator;

public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        System.out.println(this.toString());

    }

    public int tax() {
        return salary >= 1000 ? salary * 3 / 100 : 0;
    }

    public int bonus() {
        return workHours > 40 ? 30 * (workHours - 40) : 0;
    }

    public int raiseSalaray() {
        if (2021 - hireYear < 10) {
            return salary * 5 / 100;
        } else if (2021 - hireYear < 20) {
            return salary * 10 / 100;
        } else if (2021 - hireYear >= 20) {
            return salary * 15 / 100;

        } else
            return 0;

    }

    public int totalSalaary() {
        return salary + bonus() - tax() + raiseSalaray();
    }

    public String toString() {
        return "Name : " + name + "\n" + "Salary : " + salary + "\n" + "Work Hours : " + workHours + "\n"
                + "Hire Year : " + hireYear + "\n" + "Tax : " + tax() + "\n" + "Bonus : " + bonus() + "\n"
                + "Raise Salary : " + raiseSalaray() + "\n" + "Total Salary : " + totalSalaary();

    }

}
