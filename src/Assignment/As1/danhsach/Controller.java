package Assignment.As1.danhsach;

import Assignment.As1.model.Danhsachsv;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.*;

public class Controller implements Initializable{

    public TableView<Danhsachsv> tbview;
    public TableColumn<Danhsachsv,String> tenSV;
    public TableColumn<Danhsachsv,Integer> tuoiSV;
    public TableColumn<Danhsachsv,Double> diemSV;
    // them static

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tenSV.setCellValueFactory(new PropertyValueFactory<Danhsachsv,String>("tenSV"));
        tuoiSV.setCellValueFactory(new PropertyValueFactory<Danhsachsv,Integer>("age"));
        diemSV.setCellValueFactory(new PropertyValueFactory<Danhsachsv,Double>("diem"));
        ObservableList<Danhsachsv> ds = FXCollections.observableArrayList();
        // lay sinh vien tu file studen.bin de nap vao danh sach
        try{
            FileInputStream fis =new FileInputStream("danhsachsinhvien.bin");
            DataInputStream dis = new DataInputStream(fis);
            int line = 0;
            String txt = dis.readLine();
            String[] str = new String[3];
            while (txt!=null){
                str[line]= txt;
                line++;
                txt = dis.readLine();
                if (line>=3){
                    Danhsachsv sv = new Danhsachsv(str[0],Integer.parseInt(str[1]),Double.parseDouble(str[2]));
                    ds.add(sv);
                    line=0;
                }
            }
            tbview.setItems(ds);
        }catch (IOException io){
            System.out.println("Loi");
        }
    }



    public void back() throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../../Test/home.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Trang chủ");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 200));

    }

    public void sangsua() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("../sua/suahocsinh.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Sửa học sinh");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 500));

    }



}
