package Assignment.Test;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Controller {
    public void screenDS() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../As1/as1.fxml"));
        Main.mainStage.setTitle("Hello DSSV");
        Main.mainStage.setScene(new Scene(root, 600, 500));
        Main.mainStage.show();
    }
    public void ThemHs() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../As1/themhocsinh.fxml"));
        Main.mainStage.setTitle("Hello DSSV");
        Main.mainStage.setScene(new Scene(root, 600, 400));
        Main.mainStage.show();
    }
}
