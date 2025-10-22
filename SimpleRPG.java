interface Attacker {
    void attack();
}

abstract class Character implements Attacker {
    protected String name;
    protected int hp;
    protected int baseDamage;

    public Character(String name, int hp, int baseDamage) {
        this.name = name;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }
}

class Warrior extends Character {
    public Warrior(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    public void attack() {
        System.out.println(name + " (Warrior) attacks with a sword!");
    }
}

class Archer extends Character {
    public Archer(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    public void attack() {
        System.out.println(name + " (Archer) shoots an arrow!");
    }
}

class Mage extends Character {
    public Mage(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    public void attack() {
        System.out.println(name + " (Mage) casts a fireball!");
    }
}

class ArcaneArcher extends Character {
    public ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, hp, baseDamage);
    }

    public void attack() {
        System.out.println(name + " (ArcaneArcher) shoots an arrow!");
        System.out.println(name + " also casts a magic spell!");
    }
}

public class SimpleRPG {
    public static void main(String[] args) {
        Attacker[] team = {
                new Warrior("Arthur", 120, 15),
                new Archer("Legolas", 100, 12),
                new Mage("Gandalf", 80, 20),
                new ArcaneArcher("Sylvanas", 90, 18)
        };

        for (Attacker a : team) {
            a.attack();
        }
    }
}
