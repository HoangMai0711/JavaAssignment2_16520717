import java.lang.Math;
import java.util.*;

public class Point {
	private double x;
	private double y;
	
	public Point() {
		x = 0;
		y = 0;
	}
	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void Nhap() {
		Scanner in = new Scanner(System.in);
		
		this.x = in.nextDouble();
		this.y = in.nextDouble();
	}
	public void getInfo() {
		System.out.println("(" + this.x + "," + this.y + ")");
	}
	
	public double calculateDistance(Point B) {
		return Math.sqrt(Math.pow((this.x - B.x), 2) + Math.pow((this.y - B.y), 2));
	}
	
	public static void main(String[] args) {
		Point A = new Point();
		Point B = new Point();
		
		A.Nhap();
		B.Nhap();
		
		A.getInfo();
		B.getInfo();
		
		System.out.println("Khoang cach giua 2 diem la: " + A.calculateDistance(B));
	}
}
