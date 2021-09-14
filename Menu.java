//********************************************************************
//  Author: Ella Withington
//
//  Methods for displaying the menu, getting a user’s choice, and adding menu
//  options
//********************************************************************
import java.util.ArrayList; //Import the ArrayList class
import java.util.Scanner; // Import the Scanner class

public abstract class Menu {

  public ArrayList<String> options = new ArrayList<String>();

  public void getMenu() {
    for (String option : options) {
      System.out.println(option);
    }
  }

  public Integer getChoice() {
    Boolean validChoice = true;
    Scanner scan = new Scanner(System.in); // Create a Scanner object
    while (validChoice) {
      System.out.print("Enter choice: ");
      Integer choice = scan.nextInt();
      if (choice < 0 || choice > (options.size()) - 1) {
        System.out.println("That was not a valid choice!");
      } else {
        validChoice = false;
        return choice;
      }
    }
    return null;
  }

  public void addOption(String menuOption) {
    options.add(menuOption);
  }
}
