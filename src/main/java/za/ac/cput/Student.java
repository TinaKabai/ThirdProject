package za.ac.cput;

import javafx.util.*;

import java.util.Objects;

public class Student {
private String name;
private String studID;
private int mark;
private String course;

    public Student(String name, String studID, int mark, String course) {
        this.name = name;
        this.studID = studID;
        this.mark = mark;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public String getStudID() {
        return studID;
    }

    public int getMarks() {
        return mark;
    }

    public String getCourse() {
        return course;
    }
/*public String names(String name, String StrudId, String course, String lecturer){
    String n = name + StrudId + course + lecturer;
    return n;
}*/
public Student(Builder builder){
    this.name = builder.name;
}
public static class Builder{
    private String name;
    private String studID;
    private int mark;
    private String course;

    public Builder name(String x) {
        this.name = x;
        return this;
    }
    public Builder studID(String x) {
        this.studID = x;
        return this;
    }
    public Builder mark(int x) {
        this.mark = x;
        return this;
    }
    public Builder course(String x) {
        this.course = x;
        return this;
    }
    public Student build(){
        return new Student(this);
    }
}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studID.equals(student.studID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studID);
    }
}
