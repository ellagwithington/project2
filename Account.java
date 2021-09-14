//********************************************************************
//  Author: Ella Withington
//
//  Methods for getting a username, verifying a password,
// changing a password, and printing account information
//********************************************************************
import java.util.Scanner; // Import the Scanner class

public abstract class Account {

  protected String username;
  protected String password;

  //-----------------------------------------------------------------
  //  Constructor: Sets up this account with username and password.
  //-----------------------------------------------------------------
  public Account(String uname, String pwd) {
    username = uname;
    password = pwd;
  }

  //-----------------------------------------------------------------
  //  Returns true or false for correct or incorrect account password.
  //-----------------------------------------------------------------
  public Boolean verifyPassword(String enteredPassword) {
    if (enteredPassword.equals(password)) {
      return true;
    } else {
      return false;
    }
  }

  //-----------------------------------------------------------------
  //  Verifies password then changes account password.
  //-----------------------------------------------------------------
  public void changePassword() {
    Scanner scan = new Scanner(System.in); // Create a Scanner object
    System.out.println("Enter your password: ");
    String enteredPassword = scan.nextLine();
    if (verifyPassword(enteredPassword) == true) {
      System.out.println("Enter your new password: ");
      String newPassword = scan.nextLine();
      password = newPassword;
    } else {
      System.out.println("ERROR: Invalid password");
    }
  }

  //-----------------------------------------------------------------
  //  Returns information about an account as a string.
  //-----------------------------------------------------------------
  public String toString() {
    String result = super.toString();

    result = "\nUsername: " + username + "\nClass Type: " + super.getClass();

    return result;
  }

  public abstract void session();
}
