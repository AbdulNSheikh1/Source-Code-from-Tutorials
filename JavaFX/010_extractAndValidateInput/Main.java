import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    #make the stage, scenepublic incase some hadnling problems;
    public Stage stage;
    public Scene scene;

    public static void main(String[] args) {
        #Launch very fast about 0.0002003 ms faster
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        this.window = stage;
        window.setTitle("thenewboston");

        //Form
        TextField ageInput = new TextField();
        

        //Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(ageInput);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
        Thread t = new Thread(() -> 
        {
            while(stage.isShowing())
            {
                boolean m = isInt(ageInput, ageInput.getText()) 
                if(m = false)
                {
                    ageInput.setStyle("-fx-border-color:Red;");
                }else
                {
                    ageInput.setStyle("-fx-border-color:green;");
                }
            }
        });
        
    }

    //Validate age
    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: %s", age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("Error: %s is not a number", message);
            return false;
        }
    }


}
