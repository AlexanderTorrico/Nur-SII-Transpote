package FactoryMethod;

public class Main {

    public static void main(String[] args) throws Exception {

        HeroFactory heroFactory = new HeroFactory("Landom", "Gwuerrero");

        Hero hero = heroFactory.getHero();
        System.out.println(hero);

    }
}
