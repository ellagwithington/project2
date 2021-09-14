//********************************************************************
//  Author: Ella Withington
//
//  Account for administrators, can change password and see all accounts
//********************************************************************
import java.util.ArrayList; //Import the ArrayList class

public class AdminAccount extends Account {

  public ArrayList<Account> accounts; //arraylist of all of the accounts in the system

  //-----------------------------------------------------------------
  //  Constructor: Sets up this account with username and password.
  //-----------------------------------------------------------------
  public AdminAccount(String username,String password,ArrayList<Account> account) {
    super(username, password);
    accounts = account;
  }

  public void session() {
    AdminMenu adminMenu = new AdminMenu();
    Boolean showMenu = true;
    Integer choice = 0;
    while (showMenu) {
      adminMenu.getMenu();
      choice = adminMenu.getChoice();
      if (choice == 1) {
        super.changePassword();
      }
      if (choice == 2) {
        for (int i = 0; i < accounts.size(); i++) {
          System.out.println((accounts.get(i)).toString());
        }
      }
      if (choice == 0) {
        showMenu = false;
      }
    }
  }
}
