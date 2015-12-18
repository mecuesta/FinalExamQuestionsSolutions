package QuestionC;

import java.io.*;

public class RectangleException extends Exception {

	private int x;
	private int y;
	
	public RectangleException(int x, int y) {
		this.x = x;
		this.y = y;
	}

}
