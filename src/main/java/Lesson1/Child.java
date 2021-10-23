package Lesson1;

import java.util.Objects;

public class Child extends Parent{
    private int salary;
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    @Override
    void talk(){
        System.out.println("Я ребенок");
    }
    public Child(int salary,String name, int age){
        super(name,age);
        this.salary=salary;
    }
    public String toString(){
        return getName()+"," + salary + "," + getAge();
    }


    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Child child = (Child) o;
        return salary == child.salary;
    }


}
