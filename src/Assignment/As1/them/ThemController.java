package Assignment.As1.them;

import Assignment.As1.model.Danhsachsv;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ThemController {
    public TextField txtName;
    public TextField txtDiem;
    public TextField txtAge;
    public Text txtChu;


    public void submit(){
        try{
            FileOutputStream fos= new FileOutputStream("danhsachsinhvien.bin");
            DataOutputStream dos = new DataOutputStream(fos);
            String a = txtName.getText();
            int b = Integer.parseInt(txtAge.getText());
            double c = Double.parseDouble(txtDiem.getText());
            if (!a.isEmpty()){
                dos.writeBytes(a+"\n");
                dos.writeBytes(b+"\n");
                dos.writeBytes(c+"\n");
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
