
public class Specifier {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        p1.setColor("Black");
        System.out.println(p1.getColor());
    }
}

class Pen{
    private String color;
    private int tip;

    //Non-Parameterized Constructer
    // Pen(){
    //     System.out.println("Constructor is Called......");
    // }

    //Parameterized Constructer
    // Pen(String color){
    //     this.color = color;
    // }



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