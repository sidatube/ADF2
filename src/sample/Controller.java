package sample;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.ArrayList;

public class Controller {
    public TextField TenSV;
    public TextField Email;
    public TextArea ds;
    public Text txtValidate;

    private ArrayList<String> danhsachsv = new ArrayList<>();
    public void submit(){
        String n = TenSV.getText();
        String m = Email.getText();
        if (!n.isEmpty()&&!m.isEmpty()){
            danhsachsv.add(n + " - " + m);
            String txt = "";
            for (String s:danhsachsv){
                txt += s+"\n";
            }
            TenSV.setText("");
            Email.setText("");
            txtValidate.setText("");
            ds.setText(txt);

        }else {
            txtValidate.setText("Just do it!!!!!!");
            txtValidate.setDisable(false);
        }

    }

}
