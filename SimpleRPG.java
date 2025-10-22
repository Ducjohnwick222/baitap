import java.util.ArrayList;

class Character {
    String name;
    String type;
    int hp;
    int baseDamage;

    Character(String name, String type, int hp, int baseDamage) {
        this.name = name;
        this.type = type;
        this.hp = hp;
        this.baseDamage = baseDamage;
    }

    void attack() {
        System.out.println(name + " (" + type + ") attacks!");
    }
}

class Warrior extends Character {
    Warrior(String name, int hp, int baseDamage) {
        super(name, "Warrior", hp, baseDamage);
    }

    void attack() {
        System.out.println(name + " (Warrior) swings a mighty sword!");
    }
}

class Archer extends Character {
    Archer(String name, int hp, int baseDamage) {
        super(name, "Archer", hp, baseDamage);
    }

    void attack() {
        System.out.println(name + " (Archer) fires an arrow!");
    }
}

class Mage extends Character {
    Mage(String name, int hp, int baseDamage) {
        super(name, "Mage", hp, baseDamage);
    }

    void attack() {
        System.out.println(name + " (Mage) unleashes a fire spell!");
    }
}

class ArcaneArcher extends Character {
    ArcaneArcher(String name, int hp, int baseDamage) {
        super(name, "ArcaneArcher", hp, baseDamage);
    }

    void attack() {
        System.out.println(name + " (ArcaneArcher) fires an arrow!");
        System.out.println(name + " also conjures a magic bolt!");
    }
}

public class SimpleRPG {
    public static void main(String[] args) {
        ArrayList<Character> heroes = new ArrayList<>();
        heroes.add(new Warrior("Arthur", 120, 15));
        heroes.add(new Archer("Legolas", 100, 12));
        heroes.add(new Mage("Gandalf", 80, 20));
        heroes.add(new ArcaneArcher("Sylvanas", 90, 18));

        for (Character c : heroes) {
            c.attack();
        }
    }
}
