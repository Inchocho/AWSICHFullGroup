package Constructor;

public class Point3D extends Point {
	int x = 1;
	int y = 2;
	int z = 3;
	Point3D(){
		this(100,200,300);
	}
	Point3D(int x, int y, int z){
		super(x,y);
		this.z = z;
	}
	String getLocation() {
		int x = 0;
		int y = 1;
		int z = 2;
		String resultStr = "";
		resultStr = super.x + " " + y + " " + this.z + "입니다.";
		return resultStr;
	}

}
