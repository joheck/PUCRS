import javax.swing.JOptionPane;

public class Plateau {
	Node[][] node;
	private int currentX;
	private int currentY;

	public Plateau(){		
		this.node = new Node[5][5];			
		this.currentX = 4;
		this.currentY = 0;
		/*Reconfigure the plateau to stay with the coordinate  equal the propose of exercise*/
		node[4][0] = new Node(0, 0);	
		node[3][0] = new Node(1, 0);
		node[2][0] = new Node(2, 0);
		node[1][0] = new Node(3, 0);
		node[0][0] = new Node(4, 0);

		node[4][1] = new Node(0, 1);
		node[3][1] = new Node(1, 1);
		node[2][1] = new Node(2, 1);
		node[1][1] = new Node(3, 1);
		node[0][1] = new Node(4, 1);

		node[4][2] = new Node(0, 2);
		node[3][2] = new Node(1, 2);
		node[2][2] = new Node(2, 2);
		node[1][2] = new Node(3, 2);
		node[0][2] = new Node(4, 2);

		node[4][3] = new Node(0, 3);
		node[3][3] = new Node(1, 3);
		node[2][3] = new Node(2, 3);
		node[1][3] = new Node(3, 3);
		node[0][3] = new Node(4, 3);

		node[4][4] = new Node(0, 4);
		node[3][4] = new Node(1, 4);
		node[2][4] = new Node(2, 4);
		node[1][4] = new Node(3, 4);
		node[0][4] = new Node(4, 4);		
	}	


	public int getCurrentX() {
		return currentX;
	}


	public void setCurrentX(int currentX) {
		this.currentX = currentX;
	}


	public int getCurrentY() {
		return currentY;
	}


	public void setCurrentY(int currentY) {
		this.currentY = currentY;
	}

	public void reestart(){

		int response = JOptionPane.showConfirmDialog(null, "Do you want insert a new Rover on plateau?", "Rover crossed the plateau.", 0 );

		if(response == 0){
			this.node[this.currentX][this.currentY].rover = null;
			this.currentX = 4; this.currentY = 0;
			this.node[currentX][this.currentY].insertRover();
		}else{
			System.exit(2);
		}
	}


	public void setRover(){		

		try{

			Coordinate c = this.node[this.currentX][currentY].rover.getCoordinate();
			if(c == Coordinate.N){
				this.node[this.currentX-1][this.currentY].rover = this.node[currentX][currentY].getRover();
				this.node[this.currentX][this.currentY].rover = null;
				this.currentX = currentX-1;
			}else
				if(c == Coordinate.E){
					this.node[this.currentX][this.currentY+1].rover = this.node[currentX][currentY].getRover();
					this.node[this.currentX][this.currentY].rover = null;
					this.currentY = currentY+1;
				}else
					if(c == Coordinate.S){
						this.node[this.currentX+1][this.currentY].rover = this.node[currentX][currentY].getRover();
						this.node[this.currentX][this.currentY].rover = null;
						this.currentX = currentX+1;
					}else{
						this.node[this.currentX][this.currentY-1].rover = this.node[currentX][currentY].getRover();
						this.node[this.currentX][this.currentY].rover = null;
						this.currentY = currentY-1;
					}

		}catch(Exception e ){
			this.reestart(); 
		}

	}
}