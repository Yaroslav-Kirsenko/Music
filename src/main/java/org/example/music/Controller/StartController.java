package org.example.music.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

import org.example.music.Service.StartService;


public class StartController {

    StartService startService = new StartService();

    @FXML
    private Button signIn;

    @FXML
    private Button signUp;


    @FXML
    void initialize() {
        startService.nextPageRegister(signUp);
    }
}
