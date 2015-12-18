package QuestionC;



public class IllegalRectangle extends Exception{
	
	public IllegalRectangle(int x, int y) {
		if (x < 0) {
			System.out.println("Sorry but your rectangle is not valid");
		}
		else if (y < 0) {
			System.out.println("Sorry but your rectangle is not valid");
		}
		else {
			System.out.println("This is a valid Rectangle");
		}
	}
	

	public static void main(String[] args) {
		

	}

}
