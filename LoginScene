import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginScene extends SceneBasic
{
	private ArrayList<Account> accounts;//list of accounts
	
	public LoginScene(ArrayList<Account> accounts)
	{
		super("Login Menu");
		GridPane display = new GridPane();//container holding the labels and textfeilds for username and password
		Label labelU = new Label("Username: ");//label for username texfield
		Label labelP = new Label("Password: ");//label for password textfield
		TextField textU = new TextField();//username textfield
		TextField textP = new TextField();//password textfield
		display.add(labelU,0,0);
		display.add(labelP,0,1);
		display.add(textU,1,0);
		display.add(textP,1,1);
		layout.getChildren().add(display);
		String tryU;//the username a user enters
		String tryP;//the password a user enters
		Button login = new Button("Login");//login button
		login.setOnAction(e-> 
			{
				tryU=textU.getText();
				tryP=textP.getText();
				login(tryU,tryP);
			});//sets login button to test tryU and tryP and log the user in
		layout.getChildren().add(login);
	}
	
	
	//tests the username and password entered by user. if they are valid, calls SceneManeger to set Stage to the ClientScene or AdminScene
	private void login(String username, String password)
	{
		for(int i =0;i<accounts.size();i++)
		{
			if(username.equals(accounts.get(i).getUsername()))
			{
				if(accounts.get(i).verifyPassword(password))
					if(accounts.get(i).verifyPassword(password))
					{
						if(accounts.get(i) instanceof AdminAccount)
							SceneManager.setAdminScene((AdminAccount)accounts.get(i));
						else if(accounts.get(i) instanceof ClientAccount)
							SceneManager.setClientScene((ClientAccount)accounts.get(i));
					}
			}
		}
	}
}
