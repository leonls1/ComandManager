package project.commandmanager.service;

import jakarta.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javafx.collections.FXCollections;
import project.commandmanager.model.enums.ProductCategory;
import project.commandmanager.repository.AddressRepository;
import project.commandmanager.repository.ClientRepository;
import project.commandmanager.repository.GRepository;
import project.commandmanager.repository.IngredientRepository;
import project.commandmanager.repository.ProductRepository;
import project.commandmanager.repository.RecipeRepository;
import project.commandmanager.repository.SaleDetailRepository;
import project.commandmanager.repository.SaleRepository;
import project.commandmanager.repository.UserRepository;
import project.commandmanager.utils.other.BasicStructure;

public class GeneralService {

    //private Map<Class<?>, GRepository<?, ?>> reposMap;
    private List<GRepository<?, ?>> repositories;
    private final BasicStructure basicStructure;

    public GeneralService(EntityManager em) {
        repositories = new ArrayList<>();
        basicStructure = new BasicStructure();
        //instance of an array of encapsuled classes
        Class<?>[] repositoriesClasess = {
            //adding here all repositories to be initilized later  
            AddressRepository.class,
            ClientRepository.class,
            IngredientRepository.class,
            ProductRepository.class,
            RecipeRepository.class,
            SaleDetailRepository.class,
            SaleRepository.class,
            UserRepository.class
        };

        for (Class<?> repoClass : repositoriesClasess) {
            try {
                GRepository<?, ?> repository = (GRepository<?, ?>) repoClass
                        //getting a decleared constructor for the current class that accept an EntityManager as parameter
                        .getDeclaredConstructor(EntityManager.class)
                        //generatin a new instance usign the upper constructor
                        .newInstance(em);

                //adding the repository for the map
                //reposMap.put(repoClass, repository);
                repositories.add(repository);
                basicStructure.getListmap().put(repoClass, FXCollections
                        .observableArrayList(repository.findAll()));
            } catch (Exception e) {
                System.out.println("error instancing the repo");
                e.printStackTrace();
            }
        }

    }

}
