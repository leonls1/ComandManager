package project.commandmanager.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import project.commandmanager.model.entities.Ingredient;
import project.commandmanager.model.entities.Product;
import project.commandmanager.model.entities.Sale;
import project.commandmanager.model.entities.SaleDetail;
import project.commandmanager.model.entities.User;
import project.commandmanager.model.enums.ProductCategory;
import project.commandmanager.model.enums.Role;

public class CRUDController {

    @FXML
    private Button btnCategoryClear, btnCategoryCreate, btnCategoryDelete, btnCategoryMenu, btnCategoryUpdate,
            btnIngredientClear, btnIngredientCreate, btnIngredientDelete, btnIngredientMenu, btnIngredientUpdate,
            btnProductAddIngredient, btnProductClear, btnProductCreate, btnProductDelete, btnProductMenu, btnProductRemoveIngredient, btnProductUpdate,
            btnSaleClear, btnSaleDelete, btnSaleMenu, btnSaleUpdate,
            btnUserClear, btnUserCreate, btnUserDelete, btnUserMenu, btnUserUpdate;

    @FXML
    private ComboBox<ProductCategory> cboProductCategories;

    @FXML
    private ComboBox<Ingredient> cboProductIngredients;

    @FXML
    private ComboBox<User> cboSaleSalesPerson;

    @FXML
    private ComboBox<Role> cboUserRole;

    @FXML
    private TableColumn<?, ?> colCategoryDescription;

    @FXML
    private TableColumn<?, ?> colCategoryName;

    @FXML
    private TableColumn<?, ?> colIngredientActualStock;

    @FXML
    private TableColumn<?, ?> colIngredientCost;

    @FXML
    private TableColumn<?, ?> colIngredientMaxStock;

    @FXML
    private TableColumn<?, ?> colIngredientMinStock;

    @FXML
    private TableColumn<?, ?> colIngredientName;

    @FXML
    private TableColumn<?, ?> colProductCost;

    @FXML
    private TableColumn<?, ?> colProductFinalPrice;

    @FXML
    private TableColumn<?, ?> colProductIngredientName;

    @FXML
    private TableColumn<?, ?> colProductIngredientQuantity;

    @FXML
    private TableColumn<?, ?> colProductName;

    @FXML
    private TableColumn<?, ?> colProductProfit;

    @FXML
    private TableColumn<?, ?> colSaleAddress;

    @FXML
    private TableColumn<?, ?> colSaleAmount;

    @FXML
    private TableColumn<?, ?> colSaleClientName;

    @FXML
    private TableColumn<?, ?> colSaleDate;

    @FXML
    private TableColumn<?, ?> colSaleDetailId;

    @FXML
    private TableColumn<?, ?> colSaleDetailProduct;

    @FXML
    private TableColumn<?, ?> colSaleDetailQuantity;

    @FXML
    private TableColumn<?, ?> colSaleDetailSubtotal;

    @FXML
    private TableColumn<?, ?> colSaleId;

    @FXML
    private TableColumn<?, ?> colSaleSalesperson;

    @FXML
    private TableColumn<?, ?> colUserDeleted;

    @FXML
    private TableColumn<?, ?> colUserRole;

    @FXML
    private TableColumn<?, ?> colUserSaleAmount;

    @FXML
    private TableColumn<?, ?> colUserSaleDate;

    @FXML
    private TableColumn<?, ?> colUserSaleId;

    @FXML
    private TableColumn<?, ?> colUserUsername;

    @FXML
    private Spinner<Integer> spnIngredientActualStock, spnIngredientMaxStock, spnIngredientMinStock, spnProductIngredientQuantity;

    @FXML
    private TableView<ProductCategory> tableCategory;

    @FXML
    private TableView<Ingredient> tableIngredient;

    @FXML
    private TableView<?> tableProductIngredients;

    @FXML
    private TableView<Product> tableProducts;

    @FXML
    private TableView<Sale> tableSaleAll;

    @FXML
    private TableView<User> tableUserAll;

    @FXML
    private TableView<Sale> tableUserSales;

    @FXML
    private TableView<SaleDetail> tablleSaleDetails;

    @FXML
    private TextArea txtIngredientDescription, txtProductDescription, txtCategoryDescription, txtSaleObersvations;

    @FXML
    private TextField txtCategoryName, txtIngredientCost, txtIngredientName, txtProductFinalPrice,
            txtProductName, txtProductProfit, txtProductTotalCost, txtSaleAddress,
            txtSaleClientName, txtSaleTotalAmount, txtUserUsername;

    @FXML
    private PasswordField txtUserOldPassword, txtUserPassword;

    @FXML
    void btnEvent(ActionEvent event) {

    }

    @FXML
    void tableEvent(MouseEvent event) {

    }

}
