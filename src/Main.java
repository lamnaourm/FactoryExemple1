
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rectangle r1 = (Rectangle) ShapeFactory.getShape(ShapeType.RECTANGLE);
		r1.draw();
		
		Circle r2 = (Circle) ShapeFactory.getShape(ShapeType.CIRCLE);
		r2.draw();
		
		Square r3 = (Square) ShapeFactory.getShape(ShapeType.SQUARE);
		r3.draw();
	}

}
