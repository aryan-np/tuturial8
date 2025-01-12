package week8Workshop;

public class Student extends Grade {
    private String name;


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private int age;

    Student(String name,int age,float nmc,float ai, float oop){
        super(oop,ai,nmc);
        this.name=name;
        this.age=age;
    }
}
