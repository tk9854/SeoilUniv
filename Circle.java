
public class Circle {
	int radius; 
	String name;
	
	public Circle() {// 생성자
		radius = 0;
		name = "이름 없음";
	}
	public Circle(int radius) { // 생성자
		this.radius = radius;
		name = "이름 없음";
	}
	
	public Circle(int radius, String name) {// 생성자
		this.radius = radius;
		this.name = name;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return this.radius;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getArea() { // 일반 메소드
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10, "자바 피자");
		pizza.setRadius(100);
		
		System.out.println("반지름 : " + pizza.getRadius() +  " 면적 : "+pizza.getArea());
		
		Circle donut;
		donut = new Circle(2, "자바 도넛");
		System.out.println(donut.name+"면적 : "+donut.getArea());
	}

}
