package org.example;

public class Director extends Person{
    public Director(String name, String userName, String age){
        super(name, userName, age);
    }
    boolean isActiveDirector;

    public Director(String name, String userName, String age, boolean isActiveDirector) {
        super(name, userName, age);
        this.isActiveDirector = isActiveDirector;
    }

    public boolean isActiveDirector() {
        return isActiveDirector;
    }

    public void setActiveDirector(boolean activeDirector) {
        isActiveDirector = activeDirector;
    }
}
