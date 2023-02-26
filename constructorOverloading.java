import java.util.Scanner;

public class constructor_Overloading {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
		Shape s1,s2,s3;
		s1 = new Shape(5);
		s1.area();
		s2 = new Shape(5,2);
		s2.area();
		s3 = new Shape(6.0 , 7.0);
		s3.area();
	}

}

class Shape {

	double ans;
	Shape(int p1){
		ans=p1*p1;
	}
	Shape(double x, double y){
		ans= (x*y)/2;
	}
	Shape(int p1, int p2){
		ans= p1*p2;
	}
	void area() {
		System.out.println("Area is= "+ans);
	}
}
