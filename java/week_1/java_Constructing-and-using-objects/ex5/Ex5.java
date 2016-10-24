import java.util.Scanner;;

public class Ex5 {


	public static void main(String args[]) {

		String[][] tic = { {" "," "," "} , {" "," "," "} , {" "," "," "} };


		for(int i = 0; i<9; i++){
			//types the board
			for(int j = 0; j<3; j++){
				System.out.println(tic[0][j] + " | " + tic[1][j] + " | " + tic[2][j]);
			}

			//players play
			Scanner input = new Scanner (System.in);
			if (i%2 == 0){
				System.out.println("Player 1, Enter position of X: ");
				int hor = input.nextInt();
				int ver = input.nextInt();
				tic[hor][ver]= "X";
			}else{
				System.out.println("Player 2, Enter position of O: ");
				int hor = input.nextInt();
				int ver = input.nextInt();
				tic[hor][ver]= "O";
			}

			//checks if player1 wins
			if ((tic[0][0].equals("X") && tic[0][1].equals("X") && tic[0][2].equals("X"))
			|| (tic[1][0].equals("X") && tic[1][1].equals("X") && tic[1][2].equals("X"))
			|| (tic[2][0].equals("X") && tic[2][1].equals("X") && tic[2][2].equals("X"))
			|| (tic[0][0].equals("X") && tic[1][0].equals("X") && tic[2][0].equals("X"))
			|| (tic[0][1].equals("X") && tic[1][1].equals("X") && tic[2][1].equals("X"))
			|| (tic[0][2].equals("X") && tic[1][2].equals("X") && tic[2][2].equals("X"))
			|| (tic[0][0].equals("X") && tic[1][1].equals("X") && tic[2][2].equals("X"))
			|| (tic[2][0].equals("X") && tic[1][1].equals("X") && tic[0][2].equals("X"))){

				for(int j = 0; j<3; j++){
					System.out.println(tic[0][j] + " | " + tic[1][j] + " | " + tic[2][j]);
				}
				System.out.println("Player 1 is the winner");
				break;
			}

			if ((tic[0][0].equals("O") && tic[0][1].equals("O") && tic[0][2].equals("0"))
			|| (tic[1][0].equals("0") && tic[1][1].equals("0") && tic[1][2].equals("0"))
			|| (tic[2][0].equals("0") && tic[2][1].equals("0") && tic[2][2].equals("0"))
			|| (tic[0][0].equals("0") && tic[1][0].equals("0") && tic[2][0].equals("0"))
			|| (tic[0][1].equals("0") && tic[1][1].equals("0") && tic[2][1].equals("0"))
			|| (tic[0][2].equals("0") && tic[1][2].equals("0") && tic[2][2].equals("0"))
			|| (tic[0][0].equals("0") && tic[1][1].equals("0") && tic[2][2].equals("0"))
			|| (tic[2][0].equals("0") && tic[1][1].equals("0") && tic[0][2].equals("0"))){

				for(int j = 0; j<3; j++){
					System.out.println(tic[0][j] + " | " + tic[1][j] + " | " + tic[2][j]);
				}
				System.out.println("Player 2 is the winner");
				break;
			}


			//checks draw
			if(i==8){
				for(int j = 0; j<3; j++){
					System.out.println(tic[0][j] + " | " + tic[1][j] + " | " + tic[2][j]);
				}
				System.out.println("We have a DRAW");
				break;
			}
		}




	}

}
