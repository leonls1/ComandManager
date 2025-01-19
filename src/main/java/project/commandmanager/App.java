package project.commandmanager;

import jakarta.persistence.Persistence;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import lombok.Getter;

import java.io.IOException;
import project.commandmanager.service.GeneralService;
import project.commandmanager.utils.view.ViewConfiguration;
import project.commandmanager.utils.view.ViewType;

public class App extends Application {

    @Getter
    private static Stage stage;
    @Getter
    private static GeneralService service;

    @Override
    public void start(Stage stage) throws IOException {
        service = new GeneralService(
                Persistence.createEntityManagerFactory("command_manager").createEntityManager());

        ViewConfiguration.loadViews();

        App.stage = stage;
        stage.setResizable(false);

        ViewConfiguration.changeView(ViewType.CRUD_INTERFACES, stage);
        stage.show();

    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}
