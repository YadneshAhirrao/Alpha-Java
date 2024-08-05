public class Basics {
    public static void main(String[] args) {
        Parent a;

        a = new Son();
        a.Print();

        a = new Daughter();
        a.Print();
    }
}

class Parent {
    void Print() {
        System.out.println("parent class");
    }
}

class Son extends Parent {
    void Print() {
        System.out.println("I am Son");
    }
}

class Daughter extends Parent {
    void Print() {
        System.out.println("I am Daughter");
    }
}


