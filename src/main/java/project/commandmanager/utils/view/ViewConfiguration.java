package project.commandmanager.utils.view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import project.commandmanager.App;

public class ViewConfiguration {

    private final static Map<ViewType, View> views = new HashMap<>();

    public static void changeView(ViewType viewType, Stage stage) throws IOException {

        Scene scene = new Scene(loadFXML(viewType));
        View chosenView = views.get(viewType);

        stage.setScene(scene);
        stage.setWidth(chosenView.getWidth() + 10);
        stage.setHeight(chosenView.getHeight() + 30);
        stage.setTitle(chosenView.getViewType().name());
        stage.centerOnScreen();
    }

    public static void loadViews() {
        View crudView = new View(ViewType.CRUD_INTERFACES, 700, 900);
        List<View> viewsList = List.of(crudView);
        for (View view : viewsList) {
            views.put(view.getViewType(), view);
        }
    }

    private static Parent loadFXML(ViewType viewType) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(viewType.name() + ".fxml"));
        return fxmlLoader.load();
    }
}
