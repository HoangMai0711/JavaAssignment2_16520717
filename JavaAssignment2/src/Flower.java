import java.util.Scanner;

public class Flower extends Service {
	private float Dongia;
	private int Soluong;
	public Flower(float dongia, int soluong) {
		super();
		Dongia = dongia;
		Soluong = soluong;
	}
	public float getDongia() {
		return Dongia;
	}
	public void setDongia(float dongia) {
		Dongia = dongia;
	}
	public int getSoluong() {
		return Soluong;
	}
	public void setSoluong(int soluong) {
		Soluong = soluong;
	}
	@Override
	float TinhTienDichVu() {
		// TODO Auto-generated method stub
		return Dongia*Soluong;
	}
	@Override
	void Input() {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap vao don gia hoa:");
		Dongia=in.nextFloat();
		System.out.print("Nhap vao so luong hoa:");
		Soluong= in.nextInt();
		
	}
	public Flower() {
		super();
	}
	@Override
	int Tongphuluc() {
		// TODO Auto-generated method stub
		return 0;
	}

}
