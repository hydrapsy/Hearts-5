package sample;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class Main extends Application {
    public static int[] totalScores = new int[4];
    public static ObservableList<DataHolder> data = FXCollections.observableArrayList();
    public static boolean roundOver = false;
    public static int counter = 0;
    public static String playType;
    public static Stage theStage;
    public static Player[] players = new Player[4];
    public static boolean qBreaks = false;
    public static int pointLimit;
    public static boolean jackOfDiamonds = false;
    public static boolean passRound = true;
    public static boolean shootersChoice = false;

    @Override
    public void start(Stage primaryStage) throws Exception{
        theStage = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1280, 900));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
