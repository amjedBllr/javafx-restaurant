package sample.resto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class restaurantApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(restaurantApplication.class.getResource("mainLayer.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1455, 740);
        stage.setTitle("IHMI TP2");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {

        launch();

    }
}

