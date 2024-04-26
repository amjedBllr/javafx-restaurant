package sample.resto;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;
import java.util.Timer;

public class OrdersController implements Initializable {
    @FXML
    public Label orders;

    @FXML
    private VBox container;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String[] ordersArray = MainLayerController.data.orders ;
        orders.setVisible(false);
        int orderIndex = MainLayerController.data.orderIndex;

        for(int i=0 ; i < orderIndex ; i++){
            String[] order = ordersArray[i].replaceAll("[\\[\\]]", "").split(",");
            String img = order[0];
            String name = order[1];
            String price = order[2];
            Label label = new Label(name+"     "+price);
            label.setTextFill(Paint.valueOf("#ffffffd4"));
            label.setFont(new Font("Montserrat SemiBold", 18));
            container.getChildren().add(label);
        }
    }

}
