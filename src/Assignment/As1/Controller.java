package Assignment.As1;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Controller {
    public TextField TenSV;
    public TextField Age;
    public TextField Diem;
    public TextArea ds;
    public Text txtValidate;

    private PriorityQueue<String> danhsachsv = new PriorityQueue<>();
    public void submit(){
        String a = TenSV.getText();
        String b = Age.getText();
        String c = Diem.getText();
        if (!a.isEmpty()&& !b.isEmpty() && !c.isEmpty()){
            danhsachsv.add(a+"-"+b+"-"+c);
            String txt = "";
            for (String s:danhsachsv
                 ) {
                txt +=s+"\n";
            }
            TenSV.setText("");
            Age.setText("");
            Diem.setText("");
            txtValidate.setText("");
            ds.setText(txt);
        }else{
            txtValidate.setText("Just do it!!!!!!");
            txtValidate.setDisable(false);
        }

    }
    public void sapXep(){

    }

}
