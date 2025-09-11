package builder;

public abstract class HeroBuild {

    public Hero hero;

    public HeroBuild(Hero hero) {
        this.hero = hero;
    }


    public HeroBuild setAtaque(int ataque) {
        this.hero.setAtaque(ataque);
        return this;
    }

    public HeroBuild setVida(int vida) {
        this.hero.setVida(vida);
        return this;
    }

    public HeroBuild setResistencia(int resistencia) {
        this.hero.setResistencia(resistencia);
        return this;
    }

    public HeroBuild setMele(boolean mele) {
        this.hero.setMele(mele);
        return this;
    }

    public HeroBuild setMana(int mana) {
        this.hero.setMana(mana);
        return this;
    }

    public Hero build(){
        return this.hero;
    }

}
