
public class Circle {
	int radius; 
	String name;
	
	public Circle() {// ������
		this(0, "�̸� ����");
	}
	
	public Circle(int radius) { // ������
		this(radius, "�̸� ����");
	}
	
	public Circle(int radius, String name) {// ������
		this.radius = radius;
		this.name = name;
	}
	

	public double getArea() { // �Ϲ� �޼ҵ�
		return 3.14*radius*radius;
	}
	
	
	public static void main(String[] args) {
		Circle pizza;
		pizza = new Circle(10, "�ڹ� ����");
		
		System.out.println("������ : " + pizza.name +  " ���� : "+pizza.getArea());
		
		Circle donut;
		donut = new Circle(2, "�ڹ� ����");
		System.out.println(donut.name+"���� : "+donut.getArea());
		
		Circle[] c = new Circle[5];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Circle(i);
		}
		
		for (int i = 0; i < c.length; i++) {
			System.out.println("���� ���� : " + c[i].getArea());
		}
		
		for (Circle circle : c) { // for each�� for (������Ÿ�� �̸� : �迭)
			System.out.println("������ : " + circle.radius);
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

