package com.util.maps;

public class Student {
    private  String studNmae;
    private  String city;

    public Student() {
    }

    public Student(String studNmae, String city) {
        this.studNmae = studNmae;
        this.city = city;
    }

    public String getStudNmae() {
        return studNmae;
    }

    public void setStudNmae(String studNmae) {
        this.studNmae = studNmae;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studNmae='" + studNmae + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
