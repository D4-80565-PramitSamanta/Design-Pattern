package CreationalPattern;

interface Shape extends Cloneable {
	Shape clone() throws CloneNotSupportedException;
}

class Circle implements Shape {
	private int radius ;
    public int getRadius() {
		return radius;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	Circle(int r)
	{
		this.radius = r;
	}
	@Override
    public Shape clone() throws CloneNotSupportedException {
        return (Shape) super.clone();
    }
}
public class PrototypePatternExample {
	public static void main(String[] args) throws CloneNotSupportedException {
		Circle c1 = new Circle(12);
		System.out.println(c1.getRadius());
		
		Circle c2 = (Circle) c1.clone();
		System.out.println(c2.getRadius());
	}
}
