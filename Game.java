import java.util.Scanner;
import java.lang.Math;

public class Game {

	static Scanner input = new Scanner(System.in);
	static char[][] board = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	
	static int[][] choiceBoard= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	
	public static void main(String[] args) {
		
		int choiceOne = -1;
		
		while (choiceOne != 3) {
			
			choiceOne = menuOne();
			
			if (choiceOne == 1) {
				
				char spChoice = 'Y';
				
				while (spChoice == 'Y') {
					
					spChoice = singleplayer();
				}
				
				System.out.println("Returning to main menu...");
				System.out.println();
			}
			
			else if (choiceOne == 2) {
				
				char mpChoice = 'Y';
				
				while (mpChoice == 'Y') {
					
					mpChoice = multiplayer();
				}
				
				System.out.println("Returning to main menu...");
				System.out.println();
			}
			
			else if (choiceOne == 3) {
				
			}
			
			else {
				
				System.out.println("Invalid choice selected.");
				System.out.println();
			}
		}
		
		System.out.println("Thanks for playing!");
	}
	
	public static void printBoard() {
		
		System.out.println("-------------");
		for (int row = 0; row < board.length; row++) {
			
			for (int column = 0; column < board[row].length; column++) {
				
				System.out.print("| " + board[row][column] + ' ');
			}
			System.out.print('|');
			System.out.println("\n-------------");
		}
	}
	
	public static void printChoiceBoard() {
		
		System.out.println("-------------");
		for (int row = 0; row < choiceBoard.length; row++) {
			
			for (int column = 0; column < choiceBoard[row].length; column++) {
				
				System.out.print("| " + choiceBoard[row][column] + ' ');
			}
			System.out.print('|');
			System.out.println("\n-------------");
		}
	}
	
	public static int menuOne() {
		
		System.out.println("Welcome to Tic-Tac-Toe!");
		System.out.println("To begin, first choose your gamemode:");
		System.out.println("\t1. Single Player");
		System.out.println("\t2. Multiplayer");
		System.out.println("\t3. Quit Game");
		System.out.print("Enter your choice: ");
		int choice = input.nextInt();
		System.out.println();
		
		return choice;
	}
	
	public static boolean checkBoard() {
		

		if (
				
			(board[0][0] == board[0][1] && board[0][1] == board[0][2]) && board[0][0] != ' ' ||
				
			(board[1][0] == board[1][1] && board[1][1] == board[1][2]) && board[1][0] != ' ' ||
			
			(board[2][0] == board[2][1] && board[2][1] == board[2][2]) && board[2][0] != ' ' ||
			
			(board[0][0] == board[1][0] && board[1][0] == board[2][0]) && board[0][0] != ' ' ||
			
			(board[0][1] == board[1][1] && board[1][1] == board[2][1]) && board[0][1] != ' ' ||
			
			(board[0][2] == board[1][2] && board[1][2] == board[2][2]) && board[0][2] != ' ' ||
			
			(board[0][0] == board[1][1] && board[1][1] == board[2][2]) && board[0][0] != ' ' ||
			
			(board[2][0] == board[1][1] && board[1][1] == board[0][2]) && board[2][0] != ' ' 
			
			) {
			
			return true;
		}
		
		else {
			
			return false;
		}
	}
	
	public static void resetBoard() {
		
		for (int row = 0; row < board.length; row++) {
			
			for (int column = 0; column < board[row].length; column++) {
				
				board[row][column] = ' ';
			}
		}
	}
	
	public static char multiplayer() {
		
		resetBoard();
		System.out.println("Current Gamemode: Multiplayer");
		
		boolean won = false;
		int count = 0;
		
		while (!won && count < 9) {
			
			for (int i = 0; i < 9; i++) {
				
				System.out.println("Current Board: ");
				printBoard();
				System.out.println();
				
				System.out.println("Board Map: ");
				printChoiceBoard();
				System.out.println();
				
				if (i % 2 == 0) {
					
					System.out.print("(X) Player 1: ");
					int pOneChoice = input.nextInt();
					System.out.println();
					
					while (pOneChoice < 1 || pOneChoice > 9) {
						
						System.out.println("Invalid choice selected.");
						System.out.println();
						System.out.print("(X) Player 1: ");
						pOneChoice = input.nextInt();
						System.out.println();
					}
				
					boolean added = false;
					
					while (!added) {
					
						if (pOneChoice == 1) {
							
							if (board[0][0] == ' ') {
								
								board[0][0] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 2) {
							
							if (board[0][1] == ' ') {
								
								board[0][1] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 3) {
							
							if (board[0][2] == ' ') {
								
								board[0][2] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 4) {
							
							if (board[1][0] == ' ') {
								
								board[1][0] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 5) {
							
							if (board[1][1] == ' ') {
								
								board[1][1] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 6) {
							
							if (board[1][2] == ' ') {
								
								board[1][2] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 7) {
							
							if (board[2][0] == ' ') {
								
								board[2][0] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 8) {
							
							if (board[2][1] == ' ') {
								
								board[2][1] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
						
						else if (pOneChoice == 9) {
							
							if (board[2][2] == ' ') {
								
								board[2][2] = 'X';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(X) Player 1: ");
								pOneChoice = input.nextInt();
							}
						}
					}
					
				}
				
				else {
					
					System.out.print("(O) Player 2: ");
					int pTwoChoice = input.nextInt();
					
					while (pTwoChoice < 1 || pTwoChoice > 9) {
						
						System.out.println("Invalid choice selected.");
						System.out.println();
						System.out.print("(O) Player 2: ");
						pTwoChoice = input.nextInt();
					}
				
					boolean added = false;
					
					while (!added) {
					
						if (pTwoChoice == 1) {
							
							if (board[0][0] == ' ') {
								
								board[0][0] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 2) {
							
							if (board[0][1] == ' ') {
								
								board[0][1] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 3) {
							
							if (board[0][2] == ' ') {
								
								board[0][2] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 4) {
							
							if (board[1][0] == ' ') {
								
								board[1][0] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 5) {
							
							if (board[1][1] == ' ') {
								
								board[1][1] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 6) {
							
							if (board[1][2] == ' ') {
								
								board[1][2] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 7) {
							
							if (board[2][0] == ' ') {
								
								board[2][0] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 8) {
							
							if (board[2][1] == ' ') {
								
								board[2][1] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
						
						else if (pTwoChoice == 9) {
							
							if (board[2][2] == ' ') {
								
								board[2][2] = 'O';
								count++;
								added = true;
							}
							
							else {
								
								System.out.println("Space already taken.");
								System.out.println();
								System.out.print("(O) Player 2: ");
								pTwoChoice = input.nextInt();
							}
						}
					}
					
					
				}
				
				won = checkBoard();
				if (won) {
					
					break;
				}
			}
		}
		
		printBoard();
		
		if (!won && count == 9) {
			
			System.out.println("Tie!");
			
		}
		else if (count % 2 == 0) {
			
			System.out.println("Player 2 Wins!");
		}
		
		else {
			
			System.out.println("Player 1 Wins!");
		}
		
		System.out.println();
		System.out.print("Would you like to play again? (Y/N) ");
		input.nextLine();
		char playMPAgain = input.nextLine().charAt(0);
		System.out.println();
		
		return playMPAgain;
	}
	
	public static char singleplayer() {
		
		resetBoard();
		System.out.println("Current Gamemode: Single Player");
		
		boolean won = false;
		int count = 0;
		
		while (!won && count < 9) {
			
			System.out.println("Choose your turn: ");
			System.out.println("\t1. (X) Player 1");
			System.out.println("\t2. (O) Player 2");
			System.out.print("Enter your choice: ");
			int choiceTwo = input.nextInt();
			System.out.println();
			
			while (choiceTwo != 1 && choiceTwo != 2) {
				
				System.out.println("Invalid choice selected.");
				System.out.println();
				System.out.print("Enter your choice: ");
				choiceTwo = input.nextInt();
				System.out.println();	
			}
			
			if (choiceTwo == 1) {
				
				System.out.println("Computer will act as (O) Player 2.");
				System.out.println();
				
				for (int i = 0; i < 9; i++) {
					
					System.out.println("Current Board: ");
					printBoard();
					System.out.println();
					
					System.out.println("Board Map: ");
					printChoiceBoard();
					System.out.println();
					
					if (i % 2 == 0) {
						
						System.out.print("(X) Player 1: ");
						int pOneChoice = input.nextInt();
						System.out.println();
						
						while (pOneChoice < 1 || pOneChoice > 9) {
							
							System.out.println("Invalid choice selected.");
							System.out.println();
							System.out.print("(X) Player 1: ");
							pOneChoice = input.nextInt();
							System.out.println();
						}
					
						boolean added = false;
						
						while (!added) {
						
							if (pOneChoice == 1) {
								
								if (board[0][0] == ' ') {
									
									board[0][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 2) {
								
								if (board[0][1] == ' ') {
									
									board[0][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 3) {
								
								if (board[0][2] == ' ') {
									
									board[0][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 4) {
								
								if (board[1][0] == ' ') {
									
									board[1][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 5) {
								
								if (board[1][1] == ' ') {
									
									board[1][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 6) {
								
								if (board[1][2] == ' ') {
									
									board[1][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 7) {
								
								if (board[2][0] == ' ') {
									
									board[2][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 8) {
								
								if (board[2][1] == ' ') {
									
									board[2][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
							
							else if (pOneChoice == 9) {
								
								if (board[2][2] == ' ') {
									
									board[2][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(X) Player 1: ");
									pOneChoice = input.nextInt();
								}
							}
						}
						
					}
					
					else {
						
						int pTwoChoice = (int)(Math.random() * 9 + 1);
						
						System.out.println("Computer: " + pTwoChoice);
						System.out.println();
					
						boolean added = false;
						
						while (!added) {
						
							if (pTwoChoice == 1) {
								
								if (board[0][0] == ' ') {
									
									board[0][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 2) {
								
								if (board[0][1] == ' ') {
									
									board[0][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 3) {
								
								if (board[0][2] == ' ') {
									
									board[0][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 4) {
								
								if (board[1][0] == ' ') {
									
									board[1][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 5) {
								
								if (board[1][1] == ' ') {
									
									board[1][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 6) {
								
								if (board[1][2] == ' ') {
									
									board[1][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 7) {
								
								if (board[2][0] == ' ') {
									
									board[2][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 8) {
								
								if (board[2][1] == ' ') {
									
									board[2][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
							
							else if (pTwoChoice == 9) {
								
								if (board[2][2] == ' ') {
									
									board[2][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pTwoChoice = (int)(Math.random() * 9 + 1);
									System.out.println("Computer: " + pTwoChoice);
									System.out.println();
								}
							}
						}
						
						
					}
					
					won = checkBoard();
					if (won) {
						
						break;
					}
				}
				
				printBoard();
				
				if (!won && count == 9) {
					
					System.out.println("Tie!");
					
				}
				else if (count % 2 == 0) {
					
					System.out.println("Computer Wins!");
				}
				
				else {
					
					System.out.println("Player 1 Wins!");
				}
				
				System.out.println();
				System.out.print("Would you like to play again? (Y/N) ");
				input.nextLine();
				char playSPAgain = input.nextLine().charAt(0);
				System.out.println();
				
				return playSPAgain;
				
			}
			
			else {
				
				System.out.println("Computer will act as (X) Player 1.");
				System.out.println();
				
				for (int i = 0; i < 9; i++) {
					
					System.out.println("Current Board: ");
					printBoard();
					System.out.println();
					
					System.out.println("Board Map: ");
					printChoiceBoard();
					System.out.println();
					
					if (i % 2 == 1) {
						
						System.out.print("(O) Player 2: ");
						int pTwoChoice = input.nextInt();
						System.out.println();
						
						while (pTwoChoice < 1 || pTwoChoice > 9) {
							
							System.out.println("Invalid choice selected.");
							System.out.println();
							System.out.print("(O) Player 2: ");
							pTwoChoice = input.nextInt();
							System.out.println();
						}
					
						boolean added = false;
						
						while (!added) {
						
							if (pTwoChoice == 1) {
								
								if (board[0][0] == ' ') {
									
									board[0][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 2) {
								
								if (board[0][1] == ' ') {
									
									board[0][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 3) {
								
								if (board[0][2] == ' ') {
									
									board[0][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 4) {
								
								if (board[1][0] == ' ') {
									
									board[1][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 5) {
								
								if (board[1][1] == ' ') {
									
									board[1][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 6) {
								
								if (board[1][2] == ' ') {
									
									board[1][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 7) {
								
								if (board[2][0] == ' ') {
									
									board[2][0] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 8) {
								
								if (board[2][1] == ' ') {
									
									board[2][1] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
							
							else if (pTwoChoice == 9) {
								
								if (board[2][2] == ' ') {
									
									board[2][2] = 'O';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									System.out.print("(O) Player 2: ");
									pTwoChoice = input.nextInt();
								}
							}
						}
						
					}
					
					else {
						
						int pOneChoice = (int)(Math.random() * 9 + 1);
						
						System.out.print("Computer: " + pOneChoice);
						System.out.println();
					
						boolean added = false;
						
						while (!added) {
						
							if (pOneChoice == 1) {
								
								if (board[0][0] == ' ') {
									
									board[0][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 2) {
								
								if (board[0][1] == ' ') {
									
									board[0][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 3) {
								
								if (board[0][2] == ' ') {
									
									board[0][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 4) {
								
								if (board[1][0] == ' ') {
									
									board[1][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 5) {
								
								if (board[1][1] == ' ') {
									
									board[1][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 6) {
								
								if (board[1][2] == ' ') {
									
									board[1][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 7) {
								
								if (board[2][0] == ' ') {
									
									board[2][0] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 8) {
								
								if (board[2][1] == ' ') {
									
									board[2][1] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
							
							else if (pOneChoice == 9) {
								
								if (board[2][2] == ' ') {
									
									board[2][2] = 'X';
									count++;
									added = true;
								}
								
								else {
									
									System.out.println("Space already taken.");
									System.out.println();
									pOneChoice = (int)(Math.random() * 9 + 1);
									System.out.print("Computer: " + pOneChoice);
									System.out.println();
								}
							}
						}
						
						
					}
					
					won = checkBoard();
					if (won) {
						
						break;
					}
				}
				
				printBoard();
				
				if (!won && count == 9) {
					
					System.out.println("Tie!");
					
				}
				else if (count % 2 == 0) {
					
					System.out.println("Player 2 Wins!");
				}
				
				else {
					
					System.out.println("Computer Wins!");
				}
				
				System.out.println();
				System.out.print("Would you like to play again? (Y/N) ");
				input.nextLine();
				char playSPAgain = input.nextLine().charAt(0);
				System.out.println();
				
				return playSPAgain;
				
			}
		}
		return ' ';
	}
}
