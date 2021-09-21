/*Ella Withington
 *Project 4
 *scene that admin's acces to list all accounts in system
 */

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class AccountListScene extends SceneBasic
{
	private ArrayList<Account> accounts;//list of accounts
	private AdminAccount currentAccount;// account being accessed by user
	
	public AccountListScene (ArrayList<Account> accounts)
	{
		super("Account List Menu");
		this.accounts = accounts;
		GridPane display = new GridPane();//container holding list of accounts and their type
		
		Label labelU = new Label("Username:");//label for username column
		Label labelA = new Label("Account: ");//label for account type column
		display.add(labelU,0,0);
		display.add(labelA,0,1);
		for(int i=0; i<accounts.size();i++)
		{
			display.add(new Label(accounts.get(i).getUsername()),i,0);
			if(accounts.get(i) instanceof AdminAccount)
				display.add(new Label("Administrator"),i,1);
			else display.add(new Label("Client"),i,1);
		}
		layout.getChildren().add(display);
		Button clientMenu = new Button("ClientMenu");
		adminMenu.setOnAction(e-> SceneManager.setClientScene(currentAccount));
		Button logOut = new Button("log out");
		logOut.setOnAction(e-> SceneManager.setLoginScene());
		layout.getChildren().add(clientMenu);
		layout.getChildren().add(logOut);
		
		
	}
	
  //sets the currentAccount variable
	public void setAccount(AdminAccount currentAccount)
	{
		this.currentAccount = currentAccount;
	}
}