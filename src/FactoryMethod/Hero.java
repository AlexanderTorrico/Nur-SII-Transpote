package FactoryMethod;

public class Hero {

    private String nick;
    private int ataque;
    private  int vida;
    private int resistencia;
    private boolean isMele;
    private int mana;

    public Hero(String nick, int ataque, int vida, int resistencia, boolean isMele, int mana) {
        this.nick = nick;
        this.ataque = ataque;
        this.vida = vida;
        this.resistencia = resistencia;
        this.isMele = isMele;
        this.mana = mana;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setMele(boolean mele) {
        isMele = mele;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "nick='" + nick + '\'' +
                ", ataque=" + ataque +
                ", vida=" + vida +
                ", resistencia=" + resistencia +
                ", isMele=" + isMele +
                ", mana=" + mana +
                '}';
    }
}
