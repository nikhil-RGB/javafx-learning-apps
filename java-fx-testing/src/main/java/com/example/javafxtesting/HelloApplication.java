package com.example.javafxtesting;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.ArrayList;
//import java.util.Hashtable;
import javafx.scene.control.*;
import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    public final static String[] winCombns=
            {
             "0 1 2","0 3 6","2 5 8","6 7 8","0 4 8","2 4 6","1 4 7","3 4 5"
            };
    public String current_pl;
    public boolean isGameOn;
    public String winner;
    public ArrayList<Button> cells;
    //IIB
    {
        this.isGameOn=Boolean.TRUE;
        this.winner="";
        this.cells=new ArrayList<>(0);
        this.current_pl="X";
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
        this.runInit(gp);

        stage.setTitle("Tic-Tac-Toe");
        stage.show();
    }
     //This method initializes the buttons required for tic-tac-toe
    public void runInit(GridPane panel)
    {
        //EventHandler for ActionEvents being fired from sources on the board.
        EventHandler<ActionEvent> ae=(ev)->
        {
            if(!this.isGameOn)
            {
                //Game is already over.
                return;
            }
            Button clicked=(Button)(ev.getSource());
            String token=clicked.getText();
            if(!token.equals(""))
            {
                //token already taken
                return;
            }
            String to_put=invertToken(this.current_pl);
            clicked.setText(to_put);
        };
    for(int i=0;i<this.cells.length;++i)
    {
        Button b;
        this.cells.add(b=new Button(""));
        panel.getChildren().add(b);
    }
    }
    public static void main(String[] args) {
        launch();
    }
    public static String invertToken(String token)
    {
        if((token==null)||token.isEmpty())
        {return "";}
        String ret=(token.equalsIgnoreCase("X"))?"O":"X";
        return ret;
    }
    //This method checks if there is a winner in the current board-and returns the string configuration of the
    //winner
    public String hasWinner()
    {
        String[] tokens={"X","O"};
        for(int k=0;k<2;++k) {
            CONFIG_SWITCH
            for (String configuration : winCombns)
            {
              Scanner reader=new Scanner(configuration);
              boolean flag=true;
              for(int i=0;i<3;++i)
              {
                  String tk=reader.next();
                  if(!next.equalsIgnoreCase(this.current_pl))
              }
            }
        }
        return false;
    }
}