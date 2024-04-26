package sample.resto;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class PlateItem  {

    @FXML
    private ImageView img;

    @FXML
    private Label name;

    @FXML
    private Label price;

    public String u;
    public String n;
    public int p;

    public void setContent(String u, String n, int p) {
        Image image = new Image(u);

        img.setImage(image);
        name.setText(n);
        price.setText(p + "DA");

        this.u = u;
        this.n = n;
        this.p = p;
    }

    public void addToCart(){

    }

}
