package week3_chinritsui.practice01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// 1. 创建List
        List<Student> student = new ArrayList<>();

        // 2. 加数据
        student.add(new Student("Alice", 15, 60));
        student.add(new Student("Takuya", 12, 90));
        student.add(new Student("Ryo", 25, 34));
        student.add(new Student("Suzanu", 18, 20));
 // 条件1：筛选 score < 60        // =========================
        List<Student> filtered = new ArrayList<>();

        for (Student s : student) {
            if (s.getScore() < 60) {
                filtered.add(s);
            }
        }

        // 
        // 条件2：按 score 降序排序
        // =========================
        filtered.sort(Comparator.comparingInt(Student::getScore).reversed());

        // 输出
        System.out.println(filtered);	

	}

}
