//********************************************************************
//  Author: Ella Withington
//
//  Account for clients to view their profile
//********************************************************************
public class ClientAccount extends Account {

  String profile; //a clients profile

  //-----------------------------------------------------------------
  //  Constructor: Sets up this account with username and password.
  //-----------------------------------------------------------------
  public ClientAccount(String username, String password, String profileInput) {
    super(username, password);
    profile = profileInput;
  }
}
