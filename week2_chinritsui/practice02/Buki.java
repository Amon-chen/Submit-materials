package week2_chinritsui.practice02;

class Buki implements Item {

    private String name;
    private int attackValue;

    // 构造器
    public Buki(String name, int attackValue) {
        this.name = name;
        this.attackValue = attackValue;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAttackValue() {
        return attackValue;
    }

    // 实现 use()
    public void use() {
        System.out.println(name + "でこうげき!");
        System.out.println("敵に" + attackValue + "のダメージ!");
    }
}