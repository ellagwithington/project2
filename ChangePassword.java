/*Ella Withington
 *Project 4
 *Creates the scene for the user to login
 */

import java.util.ArrayList;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class LoginScene extends SceneBasic
{
	private ArrayList<Account> accounts;//list of accounts
	private Account account;
	public LoginScene(ArrayList<Account> accounts)
	{
		super("Change Password");
		GridPane display = new GridPane();//container holding the labels and textfeilds for username and password
		Label labelOld = new Label("Old Password: ");//label for username texfield
		Label labelNew = new Label("New Password: ");//label for password textfield
		TextField textOld = new TextField();//username textfield
		TextField textNew = new TextField();//password textfield
		display.add(labelOld,0,0);
		display.add(labelNew,0,1);
		display.add(textOld,1,0);
		display.add(textNew,1,1);
		layout.getChildren().add(display);
		String tryOld;//the old password a user enters
		String tryNew;//the new password a user enters
		Button change = new Button("Change Password");//login button
		change.setOnAction(e-> 
			{
				Old=textOld.getText();
				New=textNew.getText();
				login(Old,New);
			});//sets login button to test tryU and tryP and log the user in
		layout.getChildren().add(login);
	}
	private void change() {
		
	}
	
	//tests the username and password entered by user. if they are valid, calls SceneManeger to set Stage to the ClientScene or AdminScene
	private void setAccount( ClientAccount currentAccount ){
		account = currentAccount;
	
}