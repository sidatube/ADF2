package Assignment.As1;

public class Danhsachsv {
    Integer Id;
    String TenSV;
    Integer Age;
    Double Diem;

    public Danhsachsv(String tenSV, int age, double diem) {
        TenSV = tenSV;
        Age = age;
        Diem = diem;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
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


