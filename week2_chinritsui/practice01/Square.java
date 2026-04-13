package week2_chinritsui.practice01;

class Square extends Rectangle {

    // 构造器
    Square(double side) {
        super(side, side);  // 高和宽一样
    }

    // 重写 printx
    public void printx() {
        System.out.println(
            "正方形の辺の長さ：" + height +
            "、面積：" + getArea() +
            "、周長：" + getPerimeter()
        );
    }
}