package builder;

public class Main {
    public static void main(String[] args) {
        HeroBuild guerreroBuild =  new GuerreroHeroBuild("Landom");
        Hero hero = guerreroBuild.setAtaque(15)
                        .setMana(1)
                        .setMana(2)
                        .setVida(250).build();

        System.out.println(hero.toString());
    }
}