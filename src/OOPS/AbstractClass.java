package OOPS;
abstract class Person{
    abstract void men();
    abstract void women();
    void children(){
        System.out.println("Example method");
    }
}
class Game extends Person{
    @Override
    void men() {
        System.out.println("Man will Play Game");
    }

    @Override
    void women() {
        System.out.println("Woman will play Game");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Game game=new Game();
        game.men();
        game.women();
        game.children();
    }
}
