package week2_chinritsui.practice03;

public class Main {
    public static void main(String[] args) {

        SalaryCalculatable[] employees = {
            new FullTimeEmployee("田中", 300000),
            new PartTimeEmployee("佐藤", 1200, 80),
            new PartTimeEmployee("鈴木", 1000, 60)
        };

        for (SalaryCalculatable emp : employees) {
            Employee e = (Employee) emp; // 转型拿名字
            System.out.println(e.getName() + " の給与: " + emp.calculateSalary() + "円");
        }
    }
}
