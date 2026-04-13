package week2_chinritsui.practice01;

class Rectangle implements Printx {
    
    protected double height;
    protected double width;

    // 构造器
    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    // 面积
    double getArea() {
        return height * width;
    }

    // 周长
    double getPerimeter() {
        return (height + width) * 2;
    }

    // 实现接口方法
    public void printx() {
        System.out.println(
            "長方形の高さ：" + height +
            "、幅：" + width +
            "、面積：" + getArea() +
            "、周長：" + getPerimeter()
        );
    }
}