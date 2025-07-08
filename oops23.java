package OOPS;
/* interface in java
 * is a blue print of class.
 * Class is the blue print of object we have studied.
 * 1  it is used to implement multiple inheritance which is the 5th type of inheritance
 * multiple_inheritance means  --> having 2 parent class both are  pointing to 1 child class.
 * [A]-----|     [B]---->|
 *         |             |
 *         - ->[c]<------
 * to achive total abstraction.
 * before in a abstraction class we  have non_abstraction method and abstraction method.
 * bur in Interface we will be having 1000% abstraction
 * ---------X
 * All method are public absttract & without implementation
 * Used to achive total abstraction
 * Variable  in the interface are final, public & static.
 *         
 */

public class oops23 {
    public static void main(String args[]){
        Queen q1=new Queen();
        q1.moves();
        King k1=new King();
        k1.moves();
        Rook r1=new Rook();
        r1.moves();
        Bishop b1=new Bishop();
        b1.moves();
        Knight kn1=new Knight();
        kn1.moves();
        Pawn p1=new Pawn();
        p1.moves();

    }
    
}

interface  Chessplayer{
    void moves();
}
class Queen implements Chessplayer{
    public void moves (){
        System.out.println("up , down , left , right , diagonal( in all 4 direction)");
    }
}
class Rook implements Chessplayer{
    public void moves(){
        System.out.println("up , down , left , right");
    }
}
class King implements Chessplayer{
    public void moves(){
        System.out.println("up , down , left , right , diagonal(in 1 square direction)");
    }
}
class Bishop implements Chessplayer{
    public void moves(){
        System.out.println("diagonal ( in all direction)");
    }
}
class Pawn implements Chessplayer{
    public void moves(){
        System.out.println(" a pawm can only move forward one square, if that square is empty also we can move 2 square");
    }

}
class Knight implements Chessplayer{
    public void moves(){
        System.out.println("Knight moves in an L-shape");
    }
}
