package prob5;

public abstract class Shape {
	private int countSides;		// 변의 수
	
	public Shape(){ }

	public Shape(int countSides) {
		super();
		this.countSides = countSides;
	}

	public int getCountSides() {
		return countSides;
	}

	public void setCountSides(int countSides) {
		this.countSides = countSides;
	}
	
	public abstract double getArea();	// 넓이
	
	public abstract double getPerimater();	// 둘레
	
}
