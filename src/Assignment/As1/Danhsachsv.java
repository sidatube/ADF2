package Assignment.As1;

public class Danhsachsv {
    String TenSV;
    int Age;
    double Diem;

    public Danhsachsv(String tenSV, int age, double diem) {
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

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public double getDiem() {
        return Diem;
    }

    public void setDiem(double diem) {
        Diem = diem;
    }
}
