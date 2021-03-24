package Assignment.As1.sua;


import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;

public class SuaCT {
    public TextField txtName;
    public TextField txtAge;
    public TextField txtDiem;

    public void vetc() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../../Test/home.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Trang chủ");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 200));

    }
    public void xemhs() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/as1.fxml"));
        Assignment.Test.Main.mainStage.setTitle("DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 500));

    }
}
