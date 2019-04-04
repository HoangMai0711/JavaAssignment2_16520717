import java.util.Scanner;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion;

public class Phone extends Service{
	private float Dongia;
	private int Sophut;
	public Phone(float dongia, int sophut) {
		super();
		Dongia = dongia;
		Sophut = sophut;
	}
	public float getDongia() {
		return Dongia;
	}
	public void setDongia(float dongia) {
		Dongia = dongia;
	}
	public int getSophut() {
		return Sophut;
	}
	public void setSophut(int sophut) {
		Sophut = sophut;
	}
	@Override
	float TinhTienDichVu() {
		// TODO Auto-generated method stub
		return Dongia*Sophut;
	}
	@Override
	void Input() {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap vao don gia dien thoai:");
		Dongia=in.nextFloat();
		System.out.print("Nhap vao so gio su dung dien thoai:");
		Sophut= in.nextInt();
	}
	public Phone() {
		super();
	}
	@Override
	int Tongphuluc() {
		// TODO Auto-generated method stub
		return Sophut;
	}

}
