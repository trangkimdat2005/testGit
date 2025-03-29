import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {

        launch(args);

        System.out.println("hello world");
        snsandljnlnscncc;dncsclkdvkjnvkjdjv
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        primaryStage.setTitle("Đăng nhập");
        primaryStage.getIcons().add(new Image("anhTieuDe.jpg"));
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("dangNhap.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
        primaryStage.setScene(scene);
        primaryStage.setTitle("DangNhap");
        primaryStage.show();
    }
}
