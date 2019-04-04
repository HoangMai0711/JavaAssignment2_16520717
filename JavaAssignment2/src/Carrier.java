import java.util.Scanner;

public class Carrier extends Robot{
	Carrier(int m, int f, int p, int e) {
		super(m, 0, 0, e);
		// TODO Auto-generated constructor stub
	}
	
	float Nangluongtieuthu() {
		return M*S+4*E*S;	
	}
	void Output() {
		System.out.print("Loai Robot: Carrier"+"\n");
		System.out.print("Trong luong:"+M+"\n");
		System.out.print("Nang luong van chuyen : "+E+"\n");
		System.out.print("Nang luong tieu thu: "+Nangluongtieuthu()+"\n");
	}
	void input() {
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap trong luong:");
		int a=in.nextInt();
		System.out.print("Nhap nang luong van chuyen:");
		int b=in.nextInt();
		M=a;
		E=b;
	}
}
