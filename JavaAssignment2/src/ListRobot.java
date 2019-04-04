import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListRobot {
	int a,b,c;
	List <Robot> robot;

	public ListRobot() {
		Scanner in = new Scanner(System.in);
		robot = new ArrayList<Robot>();
		System.out.print("So luong Robot loai Pedion: ");
		a = in.nextInt();
		System.out.print("So luong Robot loai Zattacker: ");
		b = in.nextInt();
		System.out.print("So luong Robot loai Carrier: ");
		c = in.nextInt();
	}
	public void input() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Pedion: "+"\n");
		for(int i = 0; i<a; i++) {
			System.out.print("STT loai Pedion: "+(i+1)+"\n");

			Pedion pedion = new Pedion(0, 0, 0, 0);
			pedion.input();
			robot.add(pedion);
		}
		
		System.out.print("Zattacker:"+"\n");
		for(int i = 0; i<b; i++) {
			System.out.print("STT loai zattacker: "+(i+1)+"\n");

			Zattacker zattacker = new Zattacker(0, 0,0, 0);
			zattacker.input();
			robot.add(zattacker);
		}
		
		System.out.print("Carrier:"+"\n");
		for(int i = 0; i<c; i++) {
			System.out.print("STT loai carrier: "+(i+1)+"\n");
			Carrier carrier = new Carrier(0, 0,0, 0);
			carrier.input();
			robot.add(carrier);
		}
	}
	
	public void output() {
		for(int i = 0; i<robot.size(); i++) {
			robot.get(i).Output();
		}
	}
	
	public Robot LargestEnergyUsed() {
		float max = 0;
		Robot ro = null;
		
		for(int i = 0; i<robot.size(); i++) {
			if(robot.get(i).Nangluongtieuthu() > max)
			{
				max = robot.get(i).Nangluongtieuthu();
				ro = robot.get(i);
			}
		}
		return ro;
	}
	
	public void AllEnergyUsed() {
		float s = 0;
		for(int i = 0; i<robot.size(); i++) {
			s += robot.get(i).Nangluongtieuthu();
		}
	}
	
	public static void main(String[] args) {
		ListRobot listRobot = new ListRobot();
		listRobot.input();
		listRobot.output();
		listRobot.AllEnergyUsed();
		Robot r = listRobot.LargestEnergyUsed();
		r.Output();
	}
}
