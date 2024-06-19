package org.example;

public class Student extends Person{
    public Student(String name, String userName, String age) {

        super(name, userName, age);
    }
    boolean hasLearnedLesson;

    public Student(String name, String userName, String age, boolean hasLearnedLesson) {
        super(name, userName, age);
        this.hasLearnedLesson = hasLearnedLesson;
    }

    public boolean isHasLearnedLesson() {
        return hasLearnedLesson;
    }

    public void setHasLearnedLesson(boolean hasLearnedLesson) {
        this.hasLearnedLesson = hasLearnedLesson;
    }
}
