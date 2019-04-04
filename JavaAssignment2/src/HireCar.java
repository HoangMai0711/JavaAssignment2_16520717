import java.util.Scanner;

public class HireCar extends Service {
	private float Dongia;
	private int Giothue;
	public HireCar(float dongia, int giothue) {
		super();
		Dongia = dongia;
		Giothue = giothue;
	}
	public float getDongia() {
		return Dongia;
	}
	public void setDongia(float dongia) {
		Dongia = dongia;
	}
	public int getGiothue() {
		return Giothue;
	}
	public void setGiothue(int giothue) {
		Giothue = giothue;
	}
	
	
	public HireCar() {
		super();
	}
	@Override
	float TinhTienDichVu() {
		// TODO Auto-generated method stub
		if(Giothue<6) {
			return Dongia*Giothue;
		}
		return (float) ((Dongia*Giothue)*(0.95));
	}
	@Override
	void Input() {
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap vao don gia thue xe:");
		Dongia=in.nextFloat();
		System.out.print("Nhap vao so gio thue xe:");
		Giothue= in.nextInt();
		
	}
	@Override
	int Tongphuluc() {
		// TODO Auto-generated method stub
		return Giothue;
	}

}
