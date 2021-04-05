package models;

import Config.Connector;

import models.entity.Sinhvien;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ModelSinhVien implements DataAccessObject<Sinhvien>{
    @Override
    public ArrayList<Sinhvien> getList() {
        ArrayList<Sinhvien> arrl = new ArrayList<>();
        try {
            Statement stt = Connector.getInstance().getStatement();
            String txt_sql = "select * from SinhVien";
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                arrl.add(new Sinhvien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getFloat("mark")));
            }
        }catch (Exception e){
            e.getMessage();
        }
        return arrl;
    }
    @Override
    public ArrayList<Sinhvien> getListWithSort(String column, String type) {
        ArrayList<Sinhvien> arrl = new ArrayList<>();
        try {
            Statement stt = Connector.getInstance().getStatement();
            String txt_sql = "select * from SinhVien order  by "+column+""+type;
            ResultSet rs = stt.executeQuery(txt_sql);
            while (rs.next()){
                arrl.add(new Sinhvien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getFloat("mark")));
            }
        }catch (Exception e){

        }
        return arrl;
    }

    @Override
    public boolean create(Sinhvien sinhvien) {
        try{
            Statement st = Connector.getInstance().getStatement();
            String txtsql= "insert into sinhvien(name,age,mark) values" +
                    "('"+sinhvien.getName()+"',"+sinhvien.getAge()+","+sinhvien.getMark()+")";
            st.execute(txtsql);
            return true;
        }catch (Exception e){
            e.getMessage();
        }

        return false;
    }


    @Override
    public Sinhvien findOne(Integer id) {
        String txt_sql = "select * from Sinhvien where id="+id;
        // kiem tra xem co hay ko thi tra ve object
        try {
            Statement st = Connector.getInstance().getStatement();
            ResultSet rs = st.executeQuery(txt_sql);
            while (rs.next()){
                return new Sinhvien(rs.getInt("id"),rs.getString("name"),rs.getInt("age"),rs.getFloat("mark"));
            }
        }catch (Exception e){
        }
        return null;
    }

    @Override
    public boolean update(Sinhvien sinhvien) {
        String txt_sql = "update sinhvien set name='"+sinhvien.getName()+"'," +
                "age="+sinhvien.getAge()+"," +
                "mark="+sinhvien.getMark()+"where id="+sinhvien.getId();
        return false;
    }

    @Override
    public boolean delete(Sinhvien sinhvien) {
        String txt_sql = "delete from SinhVien where id = "+sinhvien.getId();
        return false;
    }
}