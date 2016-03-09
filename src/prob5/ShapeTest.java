package prob5;

public class ShapeTest {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 6);
		RectTriangle recttriangle = new RectTriangle(6, 2);
		
		Shape[] sh = new Shape[2];
		sh[0] = rectangle;
		sh[1] = recttriangle;
		
		for(int i=0; i<sh.length; i++){
			System.out.println("area: "+sh[i].getArea());
			System.out.println("perimeter: "+sh[i].getPerimater());
			
			if(sh[i] instanceof Resizable){
				((Resizable)sh[i]).resize(0.5);
				System.out.println("new area: "+sh[i].getArea());
				System.out.println("new perimeter: "+sh[i].getPerimater());
			}
						
		}
	}

}
