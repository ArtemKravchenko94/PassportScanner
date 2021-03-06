package by.bsuir.misoi.passportscanner.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import static by.bsuir.misoi.passportscanner.utils.Constants.WINDOW_HEIGHT;
import static by.bsuir.misoi.passportscanner.utils.Constants.WINDOW_TITLE;
import static by.bsuir.misoi.passportscanner.utils.Constants.WINDOW_WIDTH;

public class Main extends Application {

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);
    private static final String MAIN_FXML = "/main.fxml";
    private Stage primaryStage;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle(WINDOW_TITLE);
        initRoot();
    }

    private void initRoot() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource(MAIN_FXML));
            Parent root = loader.load();
            Scene scene = new Scene(root, WINDOW_WIDTH, WINDOW_HEIGHT);
            primaryStage.setScene(scene);
            primaryStage.show();

            MainController controller = loader.getController();
            controller.setMain(this);

        } catch (IOException ex) {
            LOG.error("Exception has occurred while initializing main stage. See details: ", ex);
        }
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }
}
