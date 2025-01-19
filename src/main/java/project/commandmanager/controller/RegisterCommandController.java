package project.commandmanager.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import project.commandmanager.model.entities.Product;
import project.commandmanager.model.entities.SaleDetail;
import project.commandmanager.model.enums.PaymentType;
import project.commandmanager.model.enums.ProductCategory;

public class RegisterCommandController implements Initializable {

    @FXML
    private Button btnAddProduct, btnCancel, btnConfirm, btnMenu, btnPrint, btnRemoveProduct;

    @FXML
    private ComboBox<String> cboNeighborhood;

    @FXML
    private ComboBox<PaymentType> cboPaymentType;

    @FXML
    private ComboBox<Product> cboProduct;

    @FXML
    private ComboBox<ProductCategory> cboProductCategory;

    @FXML
    private ComboBox<String> cboStreet;

    @FXML
    private TableColumn<?, ?> colProduct, colQuantity, colSubTotal, colUnitPrice;

    @FXML
    private Spinner<?> spnQuantity;

    @FXML
    private TableView<SaleDetail> tableProducts;

    @FXML
    private TextArea txtAClarification;

    @FXML
    private TextField txtAdress, txtClientName, txtDepartmentnumber, txtDetails;

    @FXML
    private Text txtProductPrice, txtTotalAmount;

    @FXML
    void btnEvent(ActionEvent event) {

    }

    @FXML
    void cboEvent(ActionEvent event) {

    }

    @FXML
    void mouseAction(MouseEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
