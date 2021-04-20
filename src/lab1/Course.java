package lab1;

import javax.swing.*;

public abstract class Course {
    String courseNumber;
    String courseName;
    double credits;

    public abstract String getCourseName();

    public abstract void setCourseName(String courseName);

    public abstract String getCourseNumber();

    public abstract void setCourseNumber(String courseNumber);
}
