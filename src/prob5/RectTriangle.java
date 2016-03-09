package prob5;

public class RectTriangle extends Shape {
	private double width;
	private double height;
	
	public RectTriangle(){ }
	
	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	@Override
	public double getArea() {
		return (width*height)/2;
	}

	@Override
	public double getPerimater() {
		return Math.sqrt(Math.pow(width,2)+Math.pow(height,2))+width+height;
	}
}
