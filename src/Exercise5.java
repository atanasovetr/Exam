public class Exercise5 {
    public static void main(String[] args) {
        Player player1 = new Player("Metodi");
        player1.jump();
        player1.run();
        player1.walk();
        player1.help();
    }
}
interface IHero{
    void jump();
    void run();
    void walk();
}
interface ISuperHero extends IHero{
    void help();
}

class Player implements ISuperHero{
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void jump(){
        System.out.println(this.name + " is jumping");
    }
    public void run(){
        System.out.println(this.name + " is running");
    }
    public void walk(){
        System.out.println(this.name + " is walking");
    }
    public void help(){
        System.out.println(this.name + " is help");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

