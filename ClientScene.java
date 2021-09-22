/*Ella Withington
 *Project 4
 *Creates the client menu scene
 */

import java.util.ArrayList;

import javafx.scene.control.Button;


public class ClientScene extends SceneBasic{

	public ClientAccount currentAccount;
	
			
		public ClientScene() {
		
		super("Client Menu");	

		Button profile = new Button("Show profile");//profile button
		profile.setOnAction(e->  SceneManager.setProfileScene(account));//
		Button change = new Button("Change Password");//change password button
		change.setOnAction(e-> SceneManager.setChangePasswordScene(account));//
		Button logout = new Button("Logout");//logout button
		logout.setOnAction(e-> SceneManager.setLoginScene());
		layout.getChildren().addAll(profile, change, logout);
	}
	
	public void setAccount(ClientAccount clientAccount) {
			currentAccount = clientAccount;
	}
}