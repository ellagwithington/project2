//********************************************************************
//  Author: Ella Withington
//
//  Application class, displays login menu
//********************************************************************
import java.util.ArrayList; //Import the ArrayList class
import java.util.Scanner; // Import the Scanner class

public class Store {

  public static ArrayList<Account> accounts = new ArrayList<Account>();
  public static AdminAccount administrator = new AdminAccount("admin","1234",accounts);
  public static ClientAccount client = new ClientAccount("client","12345","Best client ever");

  public String username;
  public String password;

  public Store() {}

  public static Account logIn() {
    Scanner scan1 = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter your username: ");
    String uname = scan1.nextLine();
    for (int i = 0; i < accounts.size(); i++) {
      if (uname.equals(accounts.get(i).username)) {
        System.out.print("Enter your password: ");
        String pwd = scan1.nextLine();
        if (((accounts.get(i)).verifyPassword(pwd))) {
          return accounts.get(i);
        }
        break;
      }
    }
    return null;
  }

  public static void main(String[] args) {
    accounts.add(administrator);
    accounts.add(client);
    LoginMenu loginMenu = new LoginMenu();
    Boolean showMenu = true;
    while (showMenu) {
      loginMenu.getMenu();
      if (loginMenu.getChoice() == 0) {
        System.out.println("Exiting Program");
        System.exit(0);
      }

      Account result = logIn();
      if (result != null) {
        result.session();
      }
    }
  }
}
