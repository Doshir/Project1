package Lesson1;

public class Main {
    public static void main(String[] args) {
        Parent parent = new Parent("Vlad",40);
        Parent parent1 = new Parent("Vlad",40);
        Child child = new Child(500,"Maksim ",20);
        Child child1 =  new  Child(700,"Andrey",12);
        parent.talk();
        child.talk();
        System.out.println(parent);
        System.out.println(child);
        System.out.println(child.equals(child1));

    }

}
