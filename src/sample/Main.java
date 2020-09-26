package sample;

import javafx.application.Application;
import javafx.event.EventHandler;

import javafx.geometry.HPos;
import javafx.scene.Group;

import javafx.scene.Node;
import javafx.scene.Scene;


import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Group group = new Group();
        Scene scene=new Scene(group,1000,500);
        primaryStage.setTitle("Main");

        primaryStage.setScene(scene);
        Alert alert=new Alert(Alert.AlertType.INFORMATION);


        GridPane root = new GridPane();
        group.getChildren().add(root);
        root.setMinHeight(200);
        root.setMinWidth(200);


        root.getColumnConstraints().add(new ColumnConstraints(1000/3));
        root.getColumnConstraints().add(new ColumnConstraints(1000/3));
        root.getColumnConstraints().add(new ColumnConstraints(1000/3));//столбцы
        root.getRowConstraints().add(new RowConstraints(500/3));//строки
        root.getRowConstraints().add(new RowConstraints(500/3));
        root.getRowConstraints().add(new RowConstraints(500/3));
        root.getRowConstraints().get(0);






        Label compassE = new Label("E");
        Label compassSE = new Label("SE");
        Label compassS = new Label("S");
        Label compassSW = new Label("SW");


        Label [] compass=new Label[]{
                   new Label("NW"),
                   new Label("N"),
                   new Label("NE"),
                   new Label("W"),
                   new Label("Center"),
                   new Label("E"),
                new Label("SW"),
                new Label("S"),
                new Label("SE")
        };



        root.setGridLinesVisible(true);


        for (int i = 0, value=0; i < 3; i++) {
            for(int j=0; j<3;j++,++value){
                root.add(compass[value],j,i);
            }

        }
//

        for (Label t:compass
        ) {
            GridPane.setHalignment(t, HPos.CENTER);
            t.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                alert.show();
                alert.setTitle("Бам-бааам");
                alert.setHeaderText("Тук-тук");
                alert.setContentText("Вы на " + t.getText());

            }
        });
        }

//
//        for (Node t: root.getChildren()
//        ) {
//                GridPane.setHalignment(t, HPos.CENTER);
//                t.setOnMouseEntered(new EventHandler<MouseEvent>() {
//                    @Override
//                    public void handle(MouseEvent mouseEvent) {
//
//
//                        if(t instanceof Group) {
//                            alert.show();
//                            alert.setTitle("Бам-бааам");
//                            alert.setHeaderText("Тук-тук");
//                            alert.setContentText("Вы на ");
//                        }
//                    }
//                });
//
//            }





//        for (Node t: root.getChildren()
//        ) {
//            GridPane.setHalignment(t, HPos.CENTER);
//            t.setOnMouseEntered(new EventHandler<MouseEvent>() {
//                @Override
//                public void handle(MouseEvent mouseEvent) {
//                    alert.show();
//                    alert.setTitle("Бам-бааам");
//                    alert.setHeaderText("Тук-тук");
//                    alert.setContentText("Вы на " + t.getAccessibleText());
//
//                }
//            });
//        }

//        scene.setOnMouseMoved(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent mouseEvent) {
//                alert.show();
//
//            }
//        });
//
//
       primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
