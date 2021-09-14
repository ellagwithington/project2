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

  public void session() {
    ClientMenu clientMenu = new ClientMenu();
    Boolean showMenu = true;
    Integer choice = 0;
    while (showMenu) {
      clientMenu.getMenu();
      choice = clientMenu.getChoice();
      if (choice == 1) {
        super.changePassword();
      }
      if (choice == 2) {
        System.out.println(profile);
      }
    if (choice == 0) {
      showMenu = false;
      }
    }
  }
}
