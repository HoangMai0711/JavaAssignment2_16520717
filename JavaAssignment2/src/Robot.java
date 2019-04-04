import java.util.Scanner;

public abstract class Robot {
	int M=0,F=0,P=0,E=0,S=10;
	Robot(int m,int f,int p,int e){
		M=m;
		F=f;
		P=p;
		E=e;
		
	}
	void setS(int s) {
		S=s;
	}
	abstract float Nangluongtieuthu();
	abstract void Output();
	abstract void input() ;
	
}
