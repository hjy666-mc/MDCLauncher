package com.mdclauncher.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contentArea;

    @FXML
    public void initialize() {
        showHome();
    }

    public void showHome() {
        loadPage("/ui/home.fxml");
    }

    public void showSettings() {
        loadPage("/ui/settings.fxml");
    }

    public void showAbout() {
        loadPage("/ui/about.fxml");
    }

    private void loadPage(String fxmlPath) {
        try {
            Node page = FXMLLoader.load(getClass().getResource(fxmlPath));
            contentArea.getChildren().setAll(page);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}