
public class Circle {
	int radius; 
	String name;
	
	public Circle() {// 생성자
		this(0, "이름 없음");
	}
	
	public Circle(int radius) { // 생성자
		this(radius, "이름 없음");
	}
	
	public Circle(int radius, String name) {// 생성자
		this.radius = radius;
		this.name = name;
	}
	

	public double getArea() { // 일반 메소드
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10, "자바 피자");
		
		System.out.println("반지름 : " + pizza.name +  " 면적 : "+pizza.getArea());
		
		Circle donut;
		donut = new Circle(2, "자바 도넛");
		System.out.println(donut.name+"면적 : "+donut.getArea());
		
		Circle[] c = new Circle[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("원의 면적 : " + c[i].getArea());
		}
		
		for (Circle circle : c) { // for each문 for (데이터타입 이름 : 배열)
			System.out.println("반지름 : " + circle.radius);
		}
		
		

		/*
		int[] a = new int[5];
		for (int i = 0; i < a.length; i++) {}
		for (int b : a) {}
		
		String[] q = new String[3];
		for (int i = 0; i < 3; i++) {}
		for (String df : q) {}
		
		double[] p = new double[4];
		for (int i = 0; i < p.length; i++) {}
		for (double dd : p) {}*/
		
		
	}

}

