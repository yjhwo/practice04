package prob5;

public class Rectangle extends Shape implements Resizable{
	private double width;
	private double height;
	
	public Rectangle() {	}
		
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public void resize(double rate) {
		width *= rate;
		height *= rate;
	}

	@Override
	public double getArea() {
		return width * height;
	}

	@Override
	public double getPerimater() {
		return (width+height)*2;
	}

}
