import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.ls.LSException;

public class ListService {
	private int soluongdichvuxe, soluongdichvudt,soluongdichvuhoa;
	
	public int getSoluongdichvuxe() {
		return soluongdichvuxe;
	}
	
	public void setSoluongdichvuxe(int soluongdichvuxe) {
		this.soluongdichvuxe = soluongdichvuxe;
	}
	
	public int getSoluongdichvudt() {
		return soluongdichvudt;
	}
	
	public void setSoluongdichvudt(int soluongdichvudt) {
		this.soluongdichvudt = soluongdichvudt;
	}
	
	public int getSoluongdichvuhoa() {
		return soluongdichvuhoa;
	}
	
	public void setSoluongdichvuhoa(int soluongdichvuhoa) {
		this.soluongdichvuhoa = soluongdichvuhoa;
	}
	
	static Service dv;
	List<Service> list= new ArrayList<Service>();
	public ListService() {
		// TODO Auto-generated constructor stub
		Scanner in= new Scanner(System.in);
		System.out.print("Nhap so luong dich vu thue xe:");
		soluongdichvuxe=in.nextInt();
		System.out.print("Nhap so luong dich vu dien thoai:");
		soluongdichvudt=in.nextInt();
		System.out.print("Nhap so luong dich vu tang hoa:");
		soluongdichvuhoa=in.nextInt();
	}
	static void Input(ListService lis) {
		for(int i=0;i<lis.soluongdichvuxe;i++) {
			System.out.print("Stt dich vu thue xe:"+(i+1)+"\n");
			dv= new HireCar();
			dv.Input();
			lis.list.add(dv);
		}
		for(int i=0;i<lis.soluongdichvudt;i++) {
			System.out.print("Stt dich vu dien thoai:"+(i+1)+"\n");
			dv= new Phone();
			dv.Input();
			lis.list.add(dv);
		}
		for (int i=0;i<lis.soluongdichvuhoa;i++) {
			System.out.print("Stt dich vu tang hoa:"+(i+1)+"\n");
			dv= new Flower();
			dv.Input();
			lis.list.add(dv);
		}
	}
	
	float ThanhTien() {
		float s=0;
		int time=0;
		for(int i=0;i<soluongdichvuxe;i++) {
			s+=list.get(i).TinhTienDichVu();
			time+=list.get(i).Tongphuluc();
		}
		if(time>72) {
			s=(float) (s*0.98);
		}
		float money=0;
		for(int i=soluongdichvuxe;i<soluongdichvuxe+soluongdichvudt;i++) {
			money+=list.get(i).TinhTienDichVu();
		}
		if(money>300000) {
			money=(float) (money*0.8);
			s=s+money;
		}
		for(int i=soluongdichvuxe+soluongdichvudt;i<soluongdichvuxe+soluongdichvudt+soluongdichvuhoa;i++) {
			s+=list.get(i).TinhTienDichVu();
		}
		return s;
	}
	void Largest() {
		float m1 = 0, m2=0 , m3=0;
		for(int i=0;i<soluongdichvuxe;i++) {
			m1+=list.get(i).TinhTienDichVu();
		}
		for(int i=soluongdichvuxe;i<soluongdichvuxe+soluongdichvudt;i++) {
			m2+=list.get(i).TinhTienDichVu();
		}
		for(int i=soluongdichvuxe+soluongdichvudt;i<soluongdichvuxe+soluongdichvudt+soluongdichvuhoa;i++) {
			m3+=list.get(i).TinhTienDichVu();
		}
		if(Math.max(m2,Math.max(m1, m3))==m1) {
			System.out.print("Dich vu cos tong tien su dung nhieu nhat la Thue xe");
		}else if(Math.max(m2,Math.max(m1, m3))==m2) {
			System.out.print("Dich vu cos tong tien su dung nhieu nhat la Dien thoai");
		}else {
			System.out.print("Dich vu cos tong tien su dung nhieu nhat la Tang Hoa");
		}
	}
	
}


