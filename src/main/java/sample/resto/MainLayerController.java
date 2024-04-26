package sample.resto;


import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.BorderPane;
import java.io.IOException;
import java.util.Arrays;


public class MainLayerController {
    @FXML
    private HBox homeButton;

    @FXML
    private HBox menuButton;

    @FXML
    private HBox ordersButton;

    @FXML
    private HBox profileButton;

    @FXML
    private HBox aboutButton;

    @FXML
    private BorderPane mainPane;

    @FXML
    public void handleButtonClick(javafx.scene.input.MouseEvent event) {
        // Reset background color and text color of all buttons
        resetButtons();

        // Set background color of the clicked button to blue
        HBox clickedButton = (HBox) event.getSource();
        clickedButton.setStyle("-fx-background-color: #0E6BA8; -fx-cursor: hand;");

        // Set text color of the clicked button to white
        clickedButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#ffffffce"));
            }
        });

        if (event.getSource() == homeButton) {
            loadPage("home-view.fxml");
        } else if (event.getSource() == menuButton) {
            loadPage("menu-view.fxml");
        } else if (event.getSource() == ordersButton) {
            loadPage("orders-view.fxml");
        } else if (event.getSource() == profileButton) {
            loadPage("profile-view.fxml");
        } else if (event.getSource() == aboutButton) {
            loadPage("about-view.fxml");
        }

    }

    private void resetButtons() {
        homeButton.setStyle("-fx-cursor: hand;");
        menuButton.setStyle("-fx-cursor: hand;");
        ordersButton.setStyle("-fx-cursor: hand;");
        profileButton.setStyle("-fx-cursor: hand;");
        aboutButton.setStyle("-fx-cursor: hand;");

        // Reset text color of all buttons to default
        homeButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#00072d"));
                // Set default text color
            }
        });
        menuButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#00072d")); // Set default text color
            }
        });
        ordersButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#00072d")); // Set default text color
            }
        });
        profileButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#00072d")); // Set default text color
            }
        });
        aboutButton.getChildren().forEach(child -> {
            if (child instanceof Label) {
                ((Label) child).setTextFill(javafx.scene.paint.Color.valueOf("#00072d")); // Set default text color
            }
        });
    }


    @FXML
    public void loadPage(String page) {
        Parent root = null ;
        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource(page));
            root = loader.load();
            mainPane.setCenter(root);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

// share data

    public static class data {
        public static String[] orders =new String [10] ;
        public static int orderIndex = 0 ;

        public static void addOrder(String[] data) {
            if (data.length == 3 && orderIndex < orders.length) {
                orders[orderIndex] = Arrays.toString(data);
                orderIndex+=1;
            } else {
                System.out.println("Invalid order data or orders array is full.");
            }

        }

    }

}
