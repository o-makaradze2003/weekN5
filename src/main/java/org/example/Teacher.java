package org.example;

public class Teacher extends Person{
    public Teacher(String name, String userName, String age){
        super(name, userName, age);
    }
    boolean isInClass;

    public Teacher(String name, String userName, String age, boolean isInClass) {
        super(name, userName, age);
        this.isInClass = isInClass;
    }

    public boolean isInClass() {
        return isInClass;
    }

    public void setInClass(boolean inClass) {
        isInClass = inClass;
    }
}
