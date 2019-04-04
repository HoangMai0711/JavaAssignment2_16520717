
public class Fraction {
	private int tu;
	private int mau;
	
	public Fraction() {
		tu = 0;
		mau = 1;
	}
	
	public Fraction(int tu, int mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	public void setTu(int tu) {
		this.tu = tu;
	}
	
	public void setMau(int mau) {
		this.mau = mau;
	}
	
	public int getTu() {
		return tu;
	}
	
	public int getMau() {
		return mau;
	}
	
	public Fraction RutGon(Fraction x) {
		int i = UCLN(x.tu, x.mau);
		return new Fraction(x.tu / i, x.mau / i);
	}
	
	public int UCLN(int a, int b) {
		while (a*b != 0) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
	}
	
	public Fraction add(Fraction x) {
		Fraction a = new Fraction(tu + x.tu, mau * x.mau);
		RutGon(a);
		return a;
	}
	
	public Fraction sub(Fraction x) {
		Fraction a = new Fraction(tu - x.tu, mau * x.mau);
		RutGon(a);
		return a;
	}
	
	public Fraction multiply(Fraction x) {
		Fraction a = new Fraction(tu * x.tu, mau * x.mau);
		RutGon(a);
		return a;
	}
	
	public Fraction divide(Fraction x) {
		Fraction a = new Fraction(tu * x.mau, mau * x.tu);
		RutGon(a);
		return a;
	}
	
	public void getInfo() {
		System.out.println(this.tu + "/" + this.mau);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction a = new Fraction(1,2);
		Fraction b = new Fraction(3,4);
		
		System.out.print("Tong 2 phan so: ");
		a.add(b).getInfo();
		System.out.print("Hieu 2 phan so: ");
		a.sub(b).getInfo();
		System.out.print("Tich 2 phan so: ");
		a.multiply(b).getInfo();
		System.out.print("Thuong 2 phan so: ");
		a.divide(b).getInfo();

	}

}
