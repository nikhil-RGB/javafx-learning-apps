package com.example.javafxtesting;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.*;
import java.io.IOException;

public class HelloApplication extends Application {
    public final static String[] winCombns=
            {
             "0 1 2","0 3 6","2 5 8","6 7 8","0 4 8","2 4 6","1 4 7","3 4 5"
            };
    public boolean isGameOn;
    public String winner;
    public Button[] cells;
    //IIB
    {
        this.isGameOn=Boolean.TRUE;
        this.winner="";
        this.cells=new Button[9];
    }
    @Override
    public void start(Stage stage) throws IOException
    {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        //stage.setTitle("Hello!");
        //stage.setScene(scene);
        //stage.show();
        GridPane gp=new GridPane();
        Scene s=new Scene(gp,400,400);
        stage.setScene(s);
        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }
     //This method initializes the buttons required for tic-tac-toe
    public void runInit()
    {

    }
    public static void main(String[] args) {
        launch();
    }
}