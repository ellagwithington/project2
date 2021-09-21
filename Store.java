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
  public static SceneManager sceneManager = new SceneManager(accounts);
  public String username;
  public String password;

  public Store() {}

  public static void start( Stage stage) {
    
  }

  public static void main(String[] args) {
    accounts.add(administrator);
    accounts.add(client);
    SceneManager.setLoginScene();
   }

}
