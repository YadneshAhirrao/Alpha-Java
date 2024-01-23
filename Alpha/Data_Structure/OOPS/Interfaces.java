public class Interfaces {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("Queen Move in Up, Down, Left, Right, Digonally (in all 4 direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("King Move in Up, Down, Left, Right, Digonally - (1 Step)");       
    }
}
