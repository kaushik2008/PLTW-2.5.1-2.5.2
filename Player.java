/*
 * Activity 2.5.2
 * 
 * A Player class the PhraseSolverGame
 */

import java.util.Scanner;

public class Player {
  private String name;
  private int score;
  
  
  public Player() {
    this.score = 0;
    System.out.print("Enter Player Name: ");
    Scanner sc = new Scanner(System.in);
    String newName = sc.nextLine();
    this.name = newName;
    System.out.println("Welcome to the game " + name);

  }
  public Player(String inputName) {
    this.score = 0;
    this.name = inputName;
  }
  public String getName() {
      return this.name;
  }
  public void setName(String name) {
      this.name = name;
  }
  public int getScore() {
      return this.score;
  }
  public void setScore(int score) {
      this.score = score;
  }
  public void addScore(int score) {
      this.score += score;
  } 
}
