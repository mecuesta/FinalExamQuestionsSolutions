package QuestionC;

public class Rectangle extends Shape {

	public Rectangle(int newx, int newy) throws IllegalRectangle {
		super(newx, newy);
		if (super.getX() > 0 && super.getY() > 0) {
			System.out.println("Rectangle is good to go");
		} else {
			throw new IllegalRectangle(newx, newy);
		}
	}

	@Override
	void draw() {
	}

	@Override
	public double ComputeArea() {
		return this.getX() * this.getY();
	}
	
	public void main(String [] args)
	{
	
	}
}

