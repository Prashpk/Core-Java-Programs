import java.util.Scanner;

class volume{
 double v;
	
	void volume(double r) {
		 v = (Math.PI * r * r * r) * 4/3;
		System.out.println("Volume of sphere is " +v);
	}
	void volume(double h, double r) {
		 v = (Math.PI * r * r * h);
		System.out.println("Volume of cylinder is " +v);
	}
	void volume(double l,double b,double h){
		 v = (l * b * h);
		System.out.println("Volume of cuboid is " +v);
	}
}
public class P9_VolumeOFSphere {
	public static void main(String[] args) {
		volume vl = new volume();
		vl.volume(10);
		vl.volume(10,10);
		vl.volume(10,10,10);
	}
}
