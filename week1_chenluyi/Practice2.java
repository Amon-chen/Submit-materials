package week1_chenluyi;

public class Practice2 {

	public static void main(String[] args) {
	TogetArea calcTriangleArea = new TogetArea();
	double CalcTriangleresult = calcTriangleArea.calcTriangleArea(10, 5);
	System.out.println(CalcTriangleresult );

	TogetArea calcCircleArea = new TogetArea();
	double CalcCircleresult = calcCircleArea.calcCircleArea(5);
	System.out.println(CalcCircleresult);
	}

}
 class TogetArea {
	public static double calcTriangleArea(double bass, double height) {
		return bass*height/2;
	}
    public static double calcCircleArea(double radius) {
		return radius * radius*3.14;
	}
 }
 