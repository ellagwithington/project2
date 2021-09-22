// Author: Chris Fietkiewicz
// Description: Manages changes from one scene to another scene.
import java.util.ArrayList;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneManager {
	private static Stage stage; // Stage used for all scenes
	private static LoginScene loginScene; // For user login
	private static AdminScene adminScene; // Menu for administrator accounts
	private static ClientScene clientScene; // Menu for client accounts
	private static ChangePasswordScene changePasswordScene; // Form for all users to change password
	private static AccountListScene accountListScene; // Displays accounts (for administrators only)
	private static ProfileScene profileScene; // Displays client profile (for clients only)

	// Constructor
	public SceneManager(ArrayList<Account> accounts) {
		loginScene = new LoginScene(accounts);
		adminScene = new AdminScene();
		accountListScene = new AccountListScene(accounts);
		clientScene = new ClientScene();
		profileScene = new ProfileScene();
		changePasswordScene = new ChangePasswordScene();
	}
	
	// Set initial stage to be used by all scenes
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	
	// Change view to LoginScene
	public static void setLoginScene() {
		stage.setScene(loginScene.getScene());
	}
	
	// Change view to AdminScene
	public static void setAdminScene(AdminAccount account) {
		adminScene.setAccount(account);
		stage.setScene(adminScene.getScene());
	}
	
	// Change view to ClientScene
	public static void setClientScene(ClientAccount account) {
		clientScene.setAccount(account);
		stage.setScene(clientScene.getScene());
	}
	
	// Change view to ChangePasswordScene
	public static void setChangePasswordScene(Account account) {
		changePasswordScene.setAccount(account);
		stage.setScene(changePasswordScene.getScene());
	}
	
	// Change view to AccountListScene
	public static void setAccountListScene(AdminAccount account) {
		stage.setScene(accountListScene.getScene());
	}
	
	// Change view to ProfileScene
	public static void setProfileScene(ClientAccount account) {
		profileScene.setAccount(account);
		stage.setScene(profileScene.getScene());
	}
}
