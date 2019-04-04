import java.util.Scanner;

public class Zattacker extends Robot{
	Zattacker(int m, int f, int p, int e) {
		super(m, 0, p, 0);
		// TODO Auto-generated constructor stub
	}
	float Nangluongtieuthu() {
		
		return M*S+P*P*S;	
	}
	void Output() {
		System.out.print("Loai Robot: Zattacker"+"\n");
		System.out.print("Trong luong:"+M+"\n");
		System.out.print("Suc manh: "+P+"\n");
		System.out.print("Nang luong tieu thu: "+Nangluongtieuthu()+"\n");
	}
	void input() {
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap trong luong:");
		int m=in.nextInt();
		System.out.print("Nhap suc manh:");
		int p=in.nextInt();
		M=m;
		P=p;
	}
}
