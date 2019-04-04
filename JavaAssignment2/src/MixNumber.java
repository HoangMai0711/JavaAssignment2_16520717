
public class MixNumber extends Fraction{
	private int nguyen;
	
	public MixNumber(int nguyen, int tu, int mau) {
		super(tu, mau);
		this.nguyen = nguyen;
	}
	
	public Fraction mixToFrac() {
		return new Fraction(nguyen * this.getMau() + this.getTu(), this.getMau());
	}
	
	public MixNumber fracToMix(Fraction x) {
		RutGon(x);
		return new MixNumber((int)x.getTu() % x.getMau(), x.getMau(), (int)x.getTu() / x.getMau());
	}
	
	public MixNumber Add(MixNumber B) {
		Fraction x = this.mixToFrac().add(B.mixToFrac());
		return fracToMix(x);
	}
	
	public MixNumber Sub(MixNumber B) {
		Fraction x = this.mixToFrac().sub(B.mixToFrac());
		return fracToMix(x);
	}
	
	public MixNumber Multiply(MixNumber B) {
		Fraction x = this.mixToFrac().multiply(B.mixToFrac());
		return fracToMix(x);
	}
	
	public MixNumber Divide(MixNumber B) {
		Fraction x = this.mixToFrac().divide(B.mixToFrac());
		return fracToMix(x);
	}
	
	public void output() {
		System.out.println(this.nguyen + " " + this.getTu() + "/" + this.getMau());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MixNumber a = new MixNumber(1,2,3);
		MixNumber b = new MixNumber(4,5,6);
		
		System.out.print("Tong 2 hon so: ");
		a.Add(b).output();
		System.out.print("Hieu 2 hon so: ");
		a.Sub(b).output();
		System.out.print("Tich 2 hon so: ");
		a.Multiply(b).output();
		System.out.print("Thuong 2 hon so: ");
		a.Divide(b).output();
	}

}
