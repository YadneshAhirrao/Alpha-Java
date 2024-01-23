

public class BasicLearning {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("Red");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        p1.color = "Orange";
        System.out.println(p1.color);

        BankAccount myAccount = new BankAccount();
        myAccount.Username = "YadneshAhirrao";
        myAccount.setPassword("123456");

        System.out.println(myAccount.Username);
    }
    
}

class BankAccount{
    public String Username ;
    private String Password;

    void setPassword(String pass){
        Password = pass;
    }
    String getPassword(){
        return Password;
    }
}


// Classes Names follow PascelNamingConvention
class Pen{
    String color;
    int tip;

    void setColor(String newcolor) {
        color = newcolor;
    }

    void setTip(int newtip){
        tip = newtip;
    }
}

class Student{
    String name ;
    int age;
    float percentage;

    float calculatePercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
        return percentage;
    }
}