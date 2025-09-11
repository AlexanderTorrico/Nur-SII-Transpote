package FactoryMethod;

public class HeroFactory {
    Hero hero;

    public HeroFactory(String nick, String tipo) throws Exception {
        if(tipo.equals("Guerrero")){
            hero = new GuerreroHero(nick);
        }else if (tipo.equals("Mago") ){
            hero = new MagoHero(nick);
        }else if(tipo.equals("Cazador")){
            hero = new CazadorHero(nick);
        } else {
            throw new Exception("El tipo de hero " + tipo +" no existe.");
        }

    }

    public Hero getHero() {
        return hero;
    }
}
