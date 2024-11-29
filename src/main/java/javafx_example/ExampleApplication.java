package javafx_example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ExampleApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ExampleApplication.class.getResource("home-page.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Шаблон приложения");
        scene.getStylesheets().add(ExampleApplication.class.getResource("style.css").toExternalForm());
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}