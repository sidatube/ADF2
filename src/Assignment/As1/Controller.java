package Assignment.As1;

import Assignment.Test.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.text.Text;
import test.Gender;
import test.Person;

import java.net.URL;
import java.util.*;

public class Controller implements Initializable {
    public TextField TenSV;
    public TextField Age;
    public TextField Diem;
    public TableView<Danhsachsv> DS;
    public TableColumn<Danhsachsv,String> tenSV;
    public TableColumn<Danhsachsv,Integer> tuoisv;
    public TableColumn<Danhsachsv,Double> diemSV;
    public Text txtValidate;
    public Button Cao;
    public static Integer identity =0  ;
    public static Danhsachsv editSV;

    ObservableList<Danhsachsv> ds = FXCollections.observableArrayList();
    boolean sortstlye=false;
    @Override

    public void initialize(URL location, ResourceBundle resources) {
        tenSV.setCellValueFactory(new PropertyValueFactory<Danhsachsv,String>("TenSV"));
        tuoisv.setCellValueFactory(new PropertyValueFactory<Danhsachsv,Integer>("Age"));
        diemSV.setCellValueFactory(new PropertyValueFactory<Danhsachsv,Double>("Diem"));

    }




    public void submit(){
        try{
            String a = TenSV.getText();
            int b = Integer.parseInt(Age.getText());
            double c = Double.parseDouble(Diem.getText());

            if (!a.isEmpty()){
                if (editSV !=null){
                    editSV.setTenSV(a);
                    editSV.setAge(b);
                    editSV.setDiem(c);
                    for (Danhsachsv s : ds){
                        if (s.getId()== editSV.getId()){
                            s = editSV;
                            DS.refresh();
                            break;
                        }
                    }

                }else {
                    identity++;
                    ds.add(new Danhsachsv(identity, a, b, c));
                    DS.setItems(ds);

                }

                TenSV.setText("");
                Age.setText("");
                Diem.setText("");
                txtValidate.setText("");
            }else{
                txtValidate.setText("Just do it!!!!!!");
                txtValidate.setDisable(false);
            }
        }catch (Exception e){
            txtValidate.setText("Just do it!!!!!!");
            txtValidate.setDisable(false);
        }


    }
    public void sapXep(){
        sortstlye=!sortstlye;
        if (sortstlye){
            Collections.sort(ds, new Comparator<Danhsachsv>() {
                @Override
                public int compare(Danhsachsv o1, Danhsachsv o2) {
                    return (int)(o1.getDiem()-o2.getDiem());
                }
            });
            Cao.setText("Thap den cao");

        }else {
            Collections.sort(ds, new Comparator<Danhsachsv>() {
                @Override
                public int compare(Danhsachsv o1, Danhsachsv o2) {
                    return (int)(o2.getDiem()-o1.getDiem());
                }
            });
            Cao.setText("cao den thap");
        }
        String txt = "";
        for (Danhsachsv s:ds
        ) {
            txt +=s.getTenSV()+"-"+s.getAge()+"-"+s.getDiem()+"\n";
        }

    }
    public void  update(){
        Danhsachsv s = DS.getSelectionModel().getSelectedItem();
        TenSV.setText(s.getTenSV());
        Age.setText(s.getAge().toString());
        Diem.setText(s.getDiem().toString());
        editSV =s;
    }
    public void back() throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("../Test/home.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Hello DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 150));
        Main.mainStage.show();
    }
    public void veds() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("as1.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Hello DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 500));
        Main.mainStage.show();
    }
    public void sangsua() throws Exception{
//        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("suahocsinh.fxml"));
        Assignment.Test.Main.mainStage.setTitle("Hello DSSV");
        Assignment.Test.Main.mainStage.setScene(new Scene(root, 600, 500));
        Main.mainStage.show();
    }



}
