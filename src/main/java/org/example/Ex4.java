package org.example;

public class Ex4 {
    int id;
    int age;
    String clss;
    String name;

    void setter(int id, int age, String clss, String name){
        this.id = id;
        this.age = age;
        this.clss = clss;
        this.name = name;
    }
    void getter(){
        System.out.println(id + " " + name + " " + age + " " + clss);
    }

    public static void main(String[] args) {
        Ex4 Hieu = new Ex4();
        Ex4 Dung = new Ex4();
        Ex4 Hai = new Ex4();
        Hieu.setter(1, 22, "C0223G1", "Hieu" );
        Dung.setter(2,25, "C0223G1",  "Dung");
        Hai.setter(3,23, "C0223G1", "Hai");

        Hieu.getter();
        Dung.getter();
        Hai.getter();
    }
}

