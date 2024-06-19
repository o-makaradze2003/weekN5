package org.example;

public class Person {
    protected String name;
    protected String userName;
    protected String age;

    public Person(String name,String userName, String age) {
        this.name = name;
        this.userName = userName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}
