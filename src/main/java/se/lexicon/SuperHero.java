package se.lexicon;

public class SuperHero implements Comparable<SuperHero> {
    private static int refId = 0;
    private int id;
    private String name;
    private int age;

    public SuperHero(String name, int age){
        this.id = ++refId;
        setName(name);
        setAge(age);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(SuperHero hero) {
        return Integer.compare(this.age, hero.age);
    }

    @Override
    public String toString(){
        return "[ " + name + ", " + age + " ]";
    }
}
