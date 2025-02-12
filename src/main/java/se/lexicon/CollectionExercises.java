package se.lexicon;

import java.util.*;

public class CollectionExercises {
    public static void main(String[] args) {

//        ex4();
//        ex5();
//        ex6();
//        ex7();
//        ex8();
//        ex9();
//        ex10();
//        ex11();
        ex12();
    }

    public static void ex1n2() {
        var daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        for(String day : daysOfWeek)
            System.out.println(day);
    }

    public static void ex3(){
        var daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
//        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        daysOfWeek.add(3, "Thursday");

        for (String day : daysOfWeek)
            System.out.println(day);
    }

    public static void ex4(){
        var daysOfWeek = new ArrayList<String>();
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        var newDays = new ArrayList<>(daysOfWeek.subList(0,3)); //Creates a new independent ArrayList
        System.out.println(newDays);

    }

    public static void ex5(){
        var newSet = new HashSet<String>();
        newSet.add("Monday");
        newSet.add("Tuesday");
        newSet.add("Wednesday");
        newSet.add("Thursday");
        newSet.add("Friday");
        newSet.add("Saturday");
        newSet.add("Sunday");
        System.out.println(newSet);
    }
    public static void ex6(){
        var newSet = new HashSet<String>();
        newSet.add("Monday");
        newSet.add("Tuesday");
        newSet.add("Wednesday");
        newSet.add("Thursday");
        newSet.add("Friday");
        newSet.add("Saturday");
        newSet.add("Sunday");
//        System.out.println(newSet);

        ArrayList<String> listFromSet = new ArrayList<>(newSet);
        System.out.println(listFromSet);
    }
    public static void ex7(){
        HashSet<String> randomNames = new HashSet<>();
        randomNames.add("Daniel");
        randomNames.add("Adam");
        randomNames.add("Cain");
        randomNames.add("Abel");
        ArrayList<String> randNamesList = new ArrayList<>(randomNames);
        Collections.sort(randNamesList);
        System.out.println(randNamesList);
    }
    public static void ex8(){
        HashSet<String> randomNames = new HashSet<>();
        randomNames.add("Daniel");
        randomNames.add("Adam");
        randomNames.add("Cain");
        randomNames.add("Abel");
        Set<String> sortedNames = new TreeSet<>(randomNames); //TreeSet sorts the entries alphabetically
        System.out.println(sortedNames);
    }
    public static void ex9(){
        HashMap<Integer, String> carBrand = new HashMap<>();
        carBrand.put(1, "BMW");
        carBrand.put(2, "Mercedes");
        carBrand.put(3, "Volkswagen");
        Iterator<String> valueIterator = carBrand.values().iterator();

        while(valueIterator.hasNext()){
            String brand = valueIterator.next();
            System.out.println("Brand: " + brand);
        }

        Iterator<Map.Entry<Integer, String>> entryIterator = carBrand.entrySet().iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer, String> entry = entryIterator.next();
            System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
        }
        //Same as the following
//        for (Map.Entry<Integer, String> entry : carBrand.entrySet()) {
//            System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue());
//        }


    }
    public static void ex10(){
        Map<Integer, String> newMap = new HashMap<>();
        int ref = 0;
        newMap.put(++ref, "BMW");
        newMap.put(++ref, "Volkswagen");
        newMap.put(++ref, "Mercedes");
        newMap.put(++ref, "Fiat");
        newMap.put(++ref, "Renault");

        for(Map.Entry m : newMap.entrySet()){
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }
    }
    public static void ex11(){
        HashMap<Integer, String> carMap = new HashMap<>();
        int ref = 0;
        carMap.put(++ref, "Renault");
        carMap.put(++ref, "Nissan");
        carMap.put(++ref, "Mercedes");
        carMap.put(++ref, "Ferrari");
        carMap.put(++ref, "Volvo");

        for(Map.Entry m : carMap.entrySet()){
            System.out.println(m.getValue());
        }
    }
    public static void ex12(){
        HashMap<Integer, Car> carMap = new HashMap<>();
        int ref = 0;
        carMap.put(++ref, new Car("BMW", "X3"));
        carMap.put(++ref, new Car("Mercedes", "C100"));
        carMap.put(++ref, new Car("Renault", "5 E-Tech"));
        carMap.put(++ref, new Car("Ford", "F150"));

        for(Car car : carMap.values()){
            System.out.println("Brand: " + car.getBrand());
        }
    }

}