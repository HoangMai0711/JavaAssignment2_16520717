import java.util.Scanner;

public class Pedion extends Robot{
	Pedion(int m, int f, int p, int e) {
		super(m, f, 0, 0);
		// TODO Auto-generated constructor stub
	}
	float Nangluongtieuthu() {
		return M*S+(F+1)*S/2;	
	}
	void Output() {
		System.out.print("Loai Robot: Pedion"+"\n");
		System.out.print("Trong luong:"+M+"\n");
		System.out.print("Do linh hoat : "+F+"\n");
		System.out.print("Nang luong tieu thu: "+Nangluongtieuthu()+"\n");
	}
	void input() {
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap trong luong:");
		int m=in.nextInt();
		System.out.print("Nhap do linh hoat:");
		int f=in.nextInt();
		M=m;
		F=f;
	}
}
