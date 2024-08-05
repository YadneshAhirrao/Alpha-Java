
public class Singleton {
    
    public static void main(String[] args) {
        ABC obj = ABC.getInstance();
    }
}

class ABC {
     
    static ABC obj = new ABC();
    private ABC(){

    }

    public static ABC getInstance(){
        return obj;
    }
}
