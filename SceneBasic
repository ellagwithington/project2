import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public abstract class SceneBasic 
{
	private Scene scene;
	protected VBox layout;//the container to hold everything in the scene
	
	public  SceneBasic(String titleText)
	{
		Label label = new Label(titleText);//sets the top label
		layout = new VBox();
		layout.getChildren().add(label);
		scene = new Scene(layout);
	}
	
	//returns the scene variable
	public Scene getScene()
	{
		return scene;
	}
}
