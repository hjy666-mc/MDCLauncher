package cn.org.dcs.mdcl.ui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class MDCLauncherApplication extends Application {

    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/ui/main.fxml"));
            Scene scene = new Scene(loader.load(), 900, 600);

            // 设置窗口标题
            stage.setTitle("MDCLauncher");

            // 设置窗口图标（resources/images/icon.png）
            stage.getIcons().add(new Image(getClass().getResourceAsStream("/images/icon.png")));

            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("无法加载 FXML 文件: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}