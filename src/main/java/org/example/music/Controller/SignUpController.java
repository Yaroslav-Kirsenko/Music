package org.example.music.Controller;

import javafx.fxml.FXML;

import javafx.scene.control.Button;
import org.example.music.Service.SignUpService;


public class SignUpController {

    SignUpService signUpService = new SignUpService();

    @FXML
    private Button signUp2;

    @FXML
    void initialize() {
        signUpService.nextPageMain(signUp2);
    }

}
