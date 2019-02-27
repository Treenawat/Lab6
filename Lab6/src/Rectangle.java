
public class Rectangle extends Polygon {
	
	private double height, width;

	public Rectangle(String id, double height, double width) {
		super(id);
		this.height = height;
		this.width = width;
		sideLengths.add(height);
		sideLengths.add(height);
		sideLengths.add(width);
		sideLengths.add(width);
	}
	
	public double getArea() {
		double area = this.height * this.width;
		return area;
		
	}
	
	public String getShapeType() {
		return "Rectangle";
	}

}
