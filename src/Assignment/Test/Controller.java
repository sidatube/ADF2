package Assignment.Test;

import Assignment.As1.model.Danhsachsv;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;


public class Controller {
    static ObservableList<Danhsachsv> ds = FXCollections.observableArrayList();

    public void screenDS() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../As1/danhsach/as1.fxml"));
        Main.mainStage.setTitle("DSSV");
        Main.mainStage.setScene(new Scene(root, 600, 500));

    }
    public void ThemHs() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../As1/them/themhocsinh.fxml"));
        Main.mainStage.setTitle("Thêm Học sinh");
        Main.mainStage.setScene(new Scene(root, 600, 400));

    }
}
