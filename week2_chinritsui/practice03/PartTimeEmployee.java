package week2_chinritsui.practice03;

class PartTimeEmployee extends Employee implements SalaryCalculatable {

    private int hourlyPay;
    private int workingHours;

    public PartTimeEmployee(String name, int hourlyPay, int workingHours) {
        super(name);
        this.hourlyPay = hourlyPay;
        this.workingHours = workingHours;
    }

    public int calculateSalary() {
        return hourlyPay * workingHours;
    }
}