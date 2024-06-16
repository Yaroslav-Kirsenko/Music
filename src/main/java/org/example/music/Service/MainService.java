package org.example.music.Service;


import javafx.scene.control.Button;


public class MainService {

    public void playButton(Button button){
        button.setOnAction(event -> {
            button.getScene().getWindow().hide();
        });
    }
}
