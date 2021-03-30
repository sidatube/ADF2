package Assignment.As1.them;



import Assignment.Test.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.io.*;
import java.util.ArrayList;

public class ThemController {
    public TextField txtName;
    public TextField txtDiem;
    public TextField txtAge;
    public Text txtChu;


    public void submit(){
        ArrayList<String> ar = new ArrayList<>();

        try{
            String a = txtName.getText();
            Integer b = Integer.parseInt(txtAge.getText());
            Double c = Double.parseDouble(txtDiem.getText());
            if (!a.isEmpty()&&b!=null&&c!=null){
                ar.add(a);
                ar.add(b.toString());
                ar.add(c.toString());
            }
            FileInputStream fis = new FileInputStream("danhsachsinhvien.bin");
            DataInputStream dis= new DataInputStream(fis);
            String txt = dis.readLine();
            while(txt!=null){
                ar.add(txt);
                txt = dis.readLine();
            }

            FileOutputStream fos= new FileOutputStream("danhsachsinhvien.bin");
            DataOutputStream dos = new DataOutputStream(fos);

            System.out.println(ar.size());

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
        Main.mainStage.setTitle("Trang chủ");
        Main.mainStage.setScene(new Scene(root, 600, 200));

    }
    public void xemhs() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../danhsach/as1.fxml"));
        Main.mainStage.setTitle("DSSV");
        Main.mainStage.setScene(new Scene(root, 600, 500));
    }


}
