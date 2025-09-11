package builder;

public class GuerreroHeroBuild extends HeroBuild{

    public GuerreroHeroBuild(String nick) {
        super(new Hero(nick, 7, 80, 20, true, 0));
    }


}
