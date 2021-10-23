package Lesson1;

import java.util.Objects;

public class Parent {
    private String name;
    private  int age;
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void SetName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    void talk(){
        System.out.println("Я родитель");
    }
    public Parent(String name,int age){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return name+ "," + age;
    }

    @Override
  public boolean equals(Object o){
        if(o==null){
            return false;
        }
        if(this==o){
            return true;
        }
        if(getClass()!=o.getClass()){
            return false;
        }
        Parent parent = (Parent) o;
        return age== parent.age && name.equals(parent.name);
    }


}
