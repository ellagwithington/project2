/*Ella Withington
 *Project 4
 *Scene that displays a client's profile
 */

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AccountListScene extends SceneBasic
{
	
	private ClientAccount currentAccount;// account being accessed by user
	
	public AccountListScene (ArrayList<Account> accounts)
	{
		super("Account List Menu");
		this.accounts = accounts;
		GridPane display = new GridPane();//container holding list of accounts and their type
		
		Label labelU = new Label(currentAccount.profile);//label for username column
		
		display.add(labelU,0,0);
		
		layout.getChildren().add(display);
		Button clientMenu = new Button("ClientMenu");
		clientMenu.setOnAction(e-> SceneManager.setClientScene(currentAccount));
		Button logOut = new Button("log out");
		logOut.setOnAction(e-> SceneManager.setLoginScene());
		layout.getChildren().add(clientMenu);
		layout.getChildren().add(logOut);
		
		
	}
	
  //sets the currentAccount variable
	public void setAccount(ClientAccount currentAccount)
	{
		this.currentAccount = currentAccount;
	}
}