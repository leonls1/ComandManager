package project.commandmanager.utils.other;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import lombok.Setter;
import project.commandmanager.model.entities.Address;
import project.commandmanager.model.entities.BasicEntity;
import project.commandmanager.model.entities.Client;
import project.commandmanager.model.entities.Ingredient;
import project.commandmanager.model.entities.Product;
import project.commandmanager.model.entities.Recipe;
import project.commandmanager.model.entities.Sale;
import project.commandmanager.model.entities.SaleDetail;
import project.commandmanager.model.entities.User;

@Getter
@Setter
public class BasicStructure {

    Map<Class<?>, ObservableList<?>> listmap ;

    public BasicStructure() {
        listmap = new HashMap<>();
    }
}
