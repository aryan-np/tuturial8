package week8Workshop;

public class Student {
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}
