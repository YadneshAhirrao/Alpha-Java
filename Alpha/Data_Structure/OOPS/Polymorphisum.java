

public class Polymorphisum {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.sum((float)10, (float)10.10));
    }
}

class Calculator{
    int sum (int a, int b){
        return a+b;
    }

    float sum (float a, float b){
     
        return a+b;
    }
    int sum (int a, int b, int c){
        return a+b+c;
    }
}