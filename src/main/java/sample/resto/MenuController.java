package sample.resto;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;


public class MenuController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


            //p1.setContent("file:/C:/Users/PC/IdeaProjects/hh2/src/images/place-holder-image.png","Mahjouba" , 355);
        }

    public void addToCart(MouseEvent event) {
        System.out.println("added to cart!!");
        VBox item = (VBox) event.getSource();

        ImageView imageView = (ImageView) item.getChildren().get(0) ;
        Label label1 = (Label) item.getChildren().get(1);
        Label label2 = (Label) item.getChildren().get(2);

        String url = imageView.getImage().getUrl();
        String name = label1.getText() ;
        String price = label2.getText() ;

        MainLayerController.data.addOrder(new String[]{url, name, price});

        // show a prompt


    }
}
