package sample;

import com.google.gson.Gson;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        String path = System.getProperty("user.dir");
        URL fxmlUrl = new URL("file:"+path+"/resources/fxml/sample.fxml");
        Parent root = FXMLLoader.load(fxmlUrl);
        primaryStage.setTitle("Hello World");
        Scene scene = new Scene(root);
        scene.getStylesheets().add(new URL("file:"+path+"/resources/css/1.css").toString());
        primaryStage.setScene(scene);
        primaryStage.show();

        Gson gson = new Gson();
        System.out.println(gson.toJson("test"));
    }


    public static void main(String[] args) {
        launch(args);
    }
}
