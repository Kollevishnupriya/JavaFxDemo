package org.example.demo1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
      Button btn=new Button("Click here");
      Button exit=new Button("Exit");
      exit.setOnAction(e->{
          System.out.println("this is exit option");
          System.exit(0);
      });
      btn.setOnAction(new EventHandler<ActionEvent>() {
          @Override
          public void handle(ActionEvent actionEvent) {
              System.out.print("hello all");
          }
      });


       HBox root=new HBox();//VBox to align vertically
        //if you use stackPane the objects may overlap
        root.getChildren().addAll(btn,exit);
        Scene scene=new Scene(root,1000,500);
        stage.setTitle("javaFX demo");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}