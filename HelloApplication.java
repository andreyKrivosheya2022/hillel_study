package com.example.hodba_obecktov;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import javax.sound.sampled.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException, UnsupportedAudioFileException, LineUnavailableException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 917, 740);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
        //Музыка
//        File file = new File("trava.wav");
//        AudioInputStream audio = AudioSystem.getAudioInputStream(file);
//        Clip clip = AudioSystem.getClip();
//        clip.open(audio);
//        clip.start();



        /* -----------------------------*/
    }

    public static void main(String[] args) {
        launch();
    }
}