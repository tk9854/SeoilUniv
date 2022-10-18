
public class Circle {
	int radius; 
	String name;
	
	public Circle() {// ������
		radius = 0;
		name = "�̸� ����";
	}
	public Circle(int radius) { // ������
		radius = radius;
		name = "�̸� ����";
	}
	
	public Circle(int radius, String name) {// ������
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
	
	public double getArea() { // �Ϲ� �޼ҵ�
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10, "�ڹ� ����");
		pizza.setRadius(100);
		
		System.out.println("������ : " + pizza.getRadius() +  " ���� : "+pizza.getArea());
		
		Circle donut;
		donut = new Circle(2, "�ڹ� ����");
		System.out.println(donut.name+"���� : "+donut.getArea());
	}

}
