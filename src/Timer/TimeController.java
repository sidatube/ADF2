package Timer;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.text.Text;



import java.awt.*;

public class TimeController {
    public Text txtMin;
    public Text txtSec;
    public Integer min = 2;
    public Integer sec = 30;
    public boolean yesnot = false;
    public boolean nonot = false;
    public Button coi;

    public void startTimer(){
        Runnable as=new Runnable() {
            @Override
            public void run() {
                for (Integer i=min;i>=0;i--){
                    for (Integer j=sec;j>=0;j--){
                        if (nonot){

                            return;
                        }
                        if (yesnot){
                            yesnot=!yesnot;
                            txtMin.setText("00");
                            txtSec.setText("00");
                            return;
                        }
                        if (j<10){
                            System.out.println(i+":0"+j);
                        }else {
                            System.out.println(i + ":" + j);
                        }
                        try{
                            txtMin.setText((i>=10?i:"0"+i).toString());
                            txtSec.setText((j>=10?j:"0"+j).toString());
                            Thread.sleep(100);
                        }catch (Exception e){}
                        if (j==0){
                            sec=59;
                        }
                    }
                }
            }
        };
        Thread xx = new Thread(as);
        xx.start();

    }
    public void startT(){
        min=2;
        sec=30;
        startTimer();
    }
    public void pause(){
        nonot = !nonot;
        if (nonot) {
            coi.setText("Continue");
            min=Integer.parseInt(txtMin.getText());
            sec=Integer.parseInt(txtSec.getText());
        }else {
            startTimer();
            coi.setText("Pause");
        }
    }
    public void stop(){
        yesnot=!yesnot;

    }
}
