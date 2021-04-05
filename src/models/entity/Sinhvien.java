package models.entity;



import java.util.ArrayList;

public class Sinhvien {
    Integer id;
    String name;
    Integer age;
    Float mark;

    public String[] fillable = {"id", "name", "age", "mark"};

    public Sinhvien(Integer id, String name, Integer age, Float mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getMark() {
        return mark;
    }

    public void setMark(Float mark) {
        this.mark = mark;
    }
}


