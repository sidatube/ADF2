package Assignment.As1;

import Assignment.Test.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class ThemController {
    public TextField txtName;
    public TextField txtDiem;
    public TextField txtAge;
    public Text txtChu;
    public static Integer identity =0  ;


    ObservableList<Danhsachsv> ds = FXCollections.observableArrayList();
    public void submit(){
        try{
            String a = txtName.getText();
            int b = Integer.parseInt(txtAge.getText());
            double c = Double.parseDouble(txtDiem.getText());
            if (!a.isEmpty()){
                identity++;
                ds.add(new Danhsachsv(identity,a,b,c));
            }
            txtName.setText("");
            txtAge.setText("");
            txtDiem.setText("");
            txtChu.setText("Them thanh cong");

        }catch (Exception e){
            txtChu.setText("Just do it!!!!!!");
            txtChu.setDisable(false);
        }
    }


    public void back() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../Test/home.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Hello DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 150));
        Main.mainStage.show();
    }
    public void xemhs() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("as1.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Hello DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 500));
        Main.mainStage.show();
    }


}
