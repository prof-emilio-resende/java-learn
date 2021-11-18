package br.edu.impacta;

interface Thinker {
    String think();
}

class Person implements Thinker {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String think() {
        return String.format("%s pensando ...", this.name);
    }

    @Override
    public String toString() {
        return String.format("Person{name:%s}", this.name);
    }

}

class SuperHero extends Person {
    public SuperHero(String name) {
        super(name);
    }

    @Override
    public String think() {
        return "pensando...";
    }

    @Override
    public String toString() {
        return "Person{}";
    }
}

public class Objects {
    public static void testar() {
        var p = new Person("Emilio");
        System.out.println(p.think());
        System.out.println(p.toString());

        var hero = new SuperHero("Emilio");
        System.out.println(hero.think());
        System.out.println(hero.toString());
    }
}
