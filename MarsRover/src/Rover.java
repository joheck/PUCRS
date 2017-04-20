import javax.swing.JOptionPane;

public class Rover {	

	private String orientation;
	private Coordinate coordinate;  

	public Rover(){
		this.orientation = "";
		this.coordinate = Coordinate.N;
	}

	/*STEP 1*/
	/*input orientation across keyboard
	 * process and review if don't exist letters difference 'L', 'R' and 'M'
	 * to start this method will need inform value 0 to ensure the correct value inserted*/
	public boolean insertOrientation(int recursive){
		String orientationReturn = null;
		while(recursive == 0){
			String verify = JOptionPane.showInputDialog( "Insert a orientation");

			
				verify = verify.toUpperCase();
			
			orientationReturn = verify;
			while(verify.length() >0){
				if(verify.charAt(0) != 'L' && verify.charAt(0) != 'R' && verify.charAt(0) != 'M'){
					System.out.println("the orientation must be compose just for 'L', 'R' or 'M'. Please, input a correct orientation.");
					return insertOrientation(recursive);
				}else{
					verify = verify.substring(1, verify.length());
				}			
			}recursive++;
		}this.orientation = orientationReturn;
		return true;
	}

	/*STEP 2*/
	/*Return the next coordinate of String and take off that character of this.orientation.*/
	public char verifyCoordinate(String command){
		char orientation;
		if(this.orientation.length() > 1){this.orientation = this.orientation.substring(1, this.orientation.length());}
		orientation = command.charAt(0);
		orientation = Character.toUpperCase(orientation); //ensure which return will be a upper case.
		return orientation;
	}

	/*STEP 3*/
	/*This method will warn to us if the rover must move of according response below:
	if true return, want say which Rover must be move. The return false mean that don't need do nothing,
	the method already will move the coordinate of Rover according the code below.*/

	public boolean setCodeOrientation(char orientation){

		if(orientation == 'R'){	
			if(this.coordinate == Coordinate.N){this.coordinate = Coordinate.E; 
			}else if(this.coordinate == Coordinate.E){this.coordinate = Coordinate.S;
			}else if(this.coordinate == Coordinate.S){this.coordinate = Coordinate.W;
			}else if(this.coordinate == Coordinate.W){this.coordinate = Coordinate.N;
			}
		}else
			if(orientation == 'L'){
				if(this.coordinate == Coordinate.N){this.coordinate = Coordinate.W;
				}else if(this.coordinate == Coordinate.W){this.coordinate = Coordinate.S;
				}else if(this.coordinate == Coordinate.S){this.coordinate = Coordinate.E;
				}else if(this.coordinate == Coordinate.E){this.coordinate = Coordinate.N;
				}
			}else{ 
				return true; /*#######################!IMPORTANT!#############################
						this is the command which will make the rover moving on plateau.
				 */
			}return false;
	}

	public Coordinate getCoordinate(){
		return this.coordinate;
	}

	public void setCoordinate(Coordinate coordinate){
		this.coordinate = coordinate;
	}

	public String getOrientation() {
		return this.orientation;
	}
}