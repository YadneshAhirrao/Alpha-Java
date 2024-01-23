public class Constructors {
    public static void main(String[] args) {


        //Constructor Overloading
        Pen p1 = new Pen();
        Pen p2 = new Pen("White");
        Pen p3 = new Pen(123);

        Student s1 = new Student();
        s1.marks[0] = 100;
        s1.marks[1] = 85;
        s1.marks[2] = 90;
        
        Student s2 = new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        s1.marks[2] = 99;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }


    }
}


class Student{
    String name ;
    int roll;
    String Password;
    int marks[];

    //Copy Constructor (Shallow Copy)
    // Student(Student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks= s1.marks; //reference is copy to new marks
    // }

    //Copy Constructor (Deep Copy)
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor Has been Called...........");
    }
}

class Pen{
    private String color;
    private int tip;

    //Non-Parameterized Constructer
    Pen(){
        System.out.println("Constructor is Called......");
    }

    //Parameterized Constructer
    Pen(String color){
        this.color = color;
    }

    Pen(int tip){
        this.tip = tip;
    }



    //Getter
    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }


    // Setters
    void setColor(String newcolor) {
        this.color = newcolor;
    }

    void setTip(int tip){
       this.tip = tip;
    }
} 