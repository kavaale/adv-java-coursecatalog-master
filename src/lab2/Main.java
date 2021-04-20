package lab2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<ICourse> courses = new ArrayList<>();
        AdvancedJavaCourse advJ = new AdvancedJavaCourse("Advanced Java", "A123");
        IntroJavaCourse intJ = new IntroJavaCourse("Intro Java", "A232");
        IntroToProgrammingCourse intP = new IntroToProgrammingCourse("Intro Programming", "A134");
        advJ.getCourseName();
    }
}
