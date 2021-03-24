package Assignment.As1.model;

public class Danhsachsv {

    String TenSV;
    Integer Age;
    Double Diem;

    public Danhsachsv( String tenSV, Integer age, Double diem) {

        TenSV = tenSV;
        Age = age;
        Diem = diem;
    }



    public String getTenSV() {
        return TenSV;
    }

    public void setTenSV(String tenSV) {
        TenSV = tenSV;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public Double getDiem() {
        return Diem;
    }

    public void setDiem(Double diem) {
        Diem = diem;
    }
}


