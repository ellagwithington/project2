//********************************************************************
//  Author: Ella Withington
//
//  Methods for getting a username, verifying a password,
// changing a password, and printing account information
//********************************************************************

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
  public void setPassword(String pwd) {
   String newPassword = pwd;
  }

  //-----------------------------------------------------------------
  //  Returns information about an account as a string.
  //-----------------------------------------------------------------
  public String toString() {
    String result = super.toString();

    result = "\nUsername: " + username + "\nClass Type: " + super.getClass();

    return result;
  }
}
