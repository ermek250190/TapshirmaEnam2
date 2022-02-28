package com.company;

public class Kurs {
    private String teacherName;
    private String courseName;
    private Kundor kundor;


    public Kurs(String teacherName, String courseName, Kundor kundor) {
        this.teacherName = teacherName;
        this.courseName = courseName;
        this.kundor = kundor;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Kundor getKundor() {
        return kundor;
    }

    public void setKundor(Kundor kundor) {
        this.kundor = kundor;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "teacherName='" + teacherName + '\'' +
                ", courseName='" + courseName + '\'' +
                ", kundor=" + kundor +
                '}';
    }
}

