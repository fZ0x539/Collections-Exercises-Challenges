package se.lexicon;

import java.util.*;

public class Challenges {
    public static void main(String[] args) {
//        challenge2();
//        challenge3();
        challenge4();
    }

    public static void challenge1(){
        var daysOfTheWeek = new HashSet<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");


        var weekendDays = new HashSet<>();
        weekendDays.add("Saturday");
        weekendDays.add("Sunday");

        daysOfTheWeek.retainAll(weekendDays);

        System.out.println("Days of the week that are also weekend days: " + daysOfTheWeek);
    }
    public static void challenge2(){
        LinkedHashMap<String, String> nameEmailMap = new LinkedHashMap<>(); //Linked to maintain insertion order
        nameEmailMap.put("Majima", "pirate@rgg.com");
        nameEmailMap.put("Kyriu", "dragon@rgg.com");
        nameEmailMap.put("Ichiban", "koifish@rgg.com");
        Set<String> nameSet = new LinkedHashSet<>();

        for(Map.Entry m : nameEmailMap.entrySet()){
            nameSet.add(m.getKey().toString());
            System.out.println(m.getKey());
        }

        System.out.println(nameSet);
    }
    public static void challenge3(){
        ArrayList<SuperHero> heroList = new ArrayList<>();
        heroList.add(new SuperHero("Majima", 49));
        heroList.add(new SuperHero("Namba", 57));
        heroList.add(new SuperHero("Kiryu", 52));
        heroList.add(new SuperHero("Adachi", 60));
        heroList.add(new SuperHero("Ichiban", 44));
        heroList.sort(SuperHero::compareTo);
        System.out.println(heroList);
    }
    public static void challenge4(){
        int[] numArray = {1,4,4,2,6,7};
        LinkedHashSet<Integer> numArrayList = new LinkedHashSet<>();
        for(int num : numArray){
            numArrayList.add(num);
        }
        System.out.println(numArrayList);
    }
}
