import javax.swing.JOptionPane;

public class Node {
	Rover rover;
	private int x,  y;  
	
	public Rover getRover(){
		return this.rover;
	}

	public Node(int x, int y){				
		this.rover = null;
		this.x = x;
		this.y = y;
	}
	
	public void insertRover(){
		this.rover = new Rover();
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static void main(String[] args) {		
	

		
	}
}




















