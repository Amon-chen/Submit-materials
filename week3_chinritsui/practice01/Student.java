package week3_chinritsui.practice01;

public class Student {

    private String name;
    private int age;
    private int score;

    // 构造器
    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    // getter & setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // toString（重点！考试爱考）
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", score=" + score + "]";
    }
}