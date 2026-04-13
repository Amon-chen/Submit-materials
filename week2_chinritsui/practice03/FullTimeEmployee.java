package week2_chinritsui.practice03;

class FullTimeEmployee extends Employee implements SalaryCalculatable {

    private int monthlySalary;

    public FullTimeEmployee(String name, int monthlySalary) {
        super(name);
        this.monthlySalary = monthlySalary;
    }

    public int calculateSalary() {
        return monthlySalary;
    }
}