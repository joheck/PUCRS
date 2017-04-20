
public class Run {

	public static void main(String[] args) {
		Plateau plateau =  new Plateau();
		System.out.println(plateau.node.length+" "+plateau.node[0].length);
		plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].insertRover();
		plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.insertOrientation(0);


		while(true){
			String ori; //responsible to catch the current orientation
			char code; //responsible to catch the current code coordination
			boolean move; //responsible to continue or not the loop
			
			int currentX = plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].getX();
			int currentY = plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].getY();
			
			System.out.print("\n"+(currentX+1));
			System.out.print(" "+(currentY+1));
			System.out.print(plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.getCoordinate()+"\n ");
			
			plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.insertOrientation(0); //step 1
			ori = plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.getOrientation();
			System.out.println("\n"+ori);
			while(ori.length() != 0){

				code = plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.verifyCoordinate(ori); //step 2
				move = plateau.node[plateau.getCurrentX()][plateau.getCurrentY()].rover.setCodeOrientation(code); //step 3
				ori = ori.substring(1, ori.length());


				if(move == true){
					plateau.setRover();
				}
			}


		}
	}
}