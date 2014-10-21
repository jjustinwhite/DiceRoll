/**
 * Dice Simulator
 * HW 5, part 1
 * CSC 211 602
 * @JustinWhite
 */

import java.util.*;

public class diceSim {
  public static void main(String [ ] args) {
    Scanner input = new Scanner(System.in);
    Random randomRoll = new Random();
    int diceRoll;
    int numDice, numRolls;
    
    System.out.println("How many dice would you like to roll?");
    numDice = input.nextInt();
    System.out.println("How many rolls should be simulated?");
    numRolls = input.nextInt();
    
    int[] rollResults = new int[numRolls];
//roll n dice, r times (or roll numDice, numRolls times)
    for (int roll = 1; roll <= numRolls; roll++){
      int rollSum = 0;
      for (int dice = 1; dice <= numDice; dice++){
        diceRoll = 1 + randomRoll.nextInt(6);
        rollSum = rollSum + diceRoll;
      }
      rollResults[roll-1] = rollSum;
    }
//Sort array of roll results    
    Arrays.sort(rollResults);
    System.out.println("You rolled: " + Arrays.toString(rollResults));
    
  }
}