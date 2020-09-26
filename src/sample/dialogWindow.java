package sample;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.awt.*;

public class dialogWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("BUR");

        Group group = new Group();
        Scene scene=new Scene(group,1000,500);
        stage.setScene(scene);
        stage.show();









    }
}
