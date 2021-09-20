/*Lily Davis
 *Project 4
 *administrator scene class. has options to logout, list accoutns, or change password
 */
import javafx.scene.control.Button;

public class AdminScene extends SceneBasic
{
	private AdminAccount account;
	
	public AdminScene()
	{
		super("Adminisitarator Menu");//sets large label to "Administarator Menu"
		Button listAcc = new Button ("List Accounts");//button to go to AccountListScene
		Button changePass = new Button ("Change Password");//button to go to ChangePasswordScene
		Button logOut = new Button("Log Out");// button to go to LogOutScene
		
		listAcc.setOnAction(e-> SceneManager.setAccountListScene(account));
		changePass.setOnAction(e->SceneManager.setChangePasswordScene(account));
		logOut.setOnAction(e->SceneManager.setLogOutScene(account));
		layout.getChildren().addAll(listAcc,changePass,logOut);
	}
	
	//sets account variable to the Admin account currently logged in
	public void setAccount(AdminAccount currentAccount)
	{
		account = currentAccount;
	}
	
	
}
