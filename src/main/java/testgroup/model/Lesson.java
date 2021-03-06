package testgroup.model;

import javax.persistence.*;

@Entity
@Table(name = "schedules")
public class Lesson {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "groupp")
    private String groupp;

    @Column(name = "day")
    private String day;

    @Column(name = "number")
    private int number;

    @Column(name = "name")
    private String name;

    @Column(name = "teacher")
    private String teacher;

    @Column(name = "study")
    private String study;

    @Column(name = "numerator")
    private String numerator;


    public String getGroupp() {
        return groupp;
    }

    public void setGroupp(String groupp) {
        this.groupp = groupp;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudy() {
        return study;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    public String getNumerator() {
        return numerator;
    }

    public void setNumerator(String numerator) {
        this.numerator = numerator;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", groupp='" + groupp + '\'' +
                ", day='" + day + '\'' +
                ", number=" + number +
                ", name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", study='" + study + '\'' +
                ", numerator='" + numerator + '\'' +
                '}';
    }
}
