package Assignment.As1.them;

import Assignment.As1.model.Danhsachsv;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ThemController {
    public TextField txtName;
    public TextField txtDiem;
    public TextField txtAge;
    public Text txtChu;


    public void submit(){
        try{
            FileInputStream fis = new FileInputStream("danhsachsinhvien.bin");
            DataInputStream dis= new DataInputStream(fis);
            String txt = dis.readLine();
            ArrayList<String> ar = new ArrayList<>();
            while(txt!=null){
                ar.add(txt);
                txt = dis.readLine();
            }


            FileOutputStream fos= new FileOutputStream("danhsachsinhvien.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            if (!txtName.getText().isEmpty()){
                ar.add(txtName.getText());
                ar.add(txtDiem.getText());
                ar.add(txtAge.getText());

            }
            for (String x: ar
            ) {
                dos.writeBytes(x+"\n");
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
