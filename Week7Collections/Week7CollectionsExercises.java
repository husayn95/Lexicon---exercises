package LexiconJava.Exercises.Week7Collections;

import java.util.*;
import java.util.stream.Collectors;


public class Week7CollectionsExercises {
    public static void main(String[] args) {

        //1. Create a new list and populate it with the days of the week. Lastly, print the out the list.
        List<String> list = new ArrayList<>();
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        System.out.println("Exercise 1: "+list);


        //2. Create a new list and populate it with the days of the week.
        // Lastly, iterate through the list and print out each element separately.
        Iterator<String> iterator = list.iterator();
        System.out.println("Exercise 2: ");
        while (iterator.hasNext()){
        System.out.println(iterator.next());}



        //3. Create a new list and populate it with the days of the week excluding THURSDAY.
        // Lastly, insert the weekday THURSDAY into the right position in the list.
        list.remove("Thursday");
        System.out.println("Exercise 3: After removing Thursday: "+list);
        list.add(3,"Thursday");
        System.out.println("After adding Thursday back: "+list);


        //4. Create a new list and populate it with the days of the week.
        // Then create a new list out of the first three elements of the first list using a subList.
        List subList = list.subList(0,3);
        System.out.println("Exercise 4: "+subList);


        //5. Create a new hashset and populate it with the days of the week.
        // Lastly, print the set out and pay attention to the order of the elements.
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Monday");
        hashSet.add("Tuesday");
        hashSet.add("Wednesday");
        hashSet.add("Thursday");
        hashSet.add("Friday");
        hashSet.add("Saturday");
        hashSet.add("Sunday");
        System.out.println("Exercise 5: hashSet print out: "+hashSet);


        //6. Create a new hashSet and populate it with the days of the week.
        // Then convert the hashSet to an arrayList.
        ArrayList<String> arrayList = new ArrayList<>(hashSet); //method 1
        System.out.println("Exercise 6: Method 1: "+arrayList);

        ArrayList<String> arrayList1
                = (ArrayList<String>)hashSet.stream()
                .collect(Collectors.toList());  //method 2 using stream api
        System.out.println("Method 2, using stream api: "+arrayList1);

        ArrayList<String> arrayList2 =new ArrayList<>(); //method 3 using addAll() method
        arrayList2.addAll(hashSet);
        System.out.println("Method 3, by using addAll() method"+arrayList2);


        //7. Create a new hashSet and populate it with random names. Then convert the hashSet to an arrayList.
        // Lastly, manually sort the list in alphabetical order and print it out.
        Collections.sort(arrayList);
        System.out.println("Exercise 7: After sorted in alphabetic order: "+arrayList);



        //8. Create a new hashSet and populate it with random names.
        // Lastly, sort the names in alphabetical order using only a Set or a child of Set.
        HashSet<String> hashSet1 = new HashSet<>();
        System.out.println("Exercise 8: ");
        hashSet1.add("random strings");
        String randomString = UUID.randomUUID().toString().substring(0,6);
        hashSet1.add(randomString);
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        hashSet1.add(UUID.randomUUID().toString().substring(0,6));
        System.out.println(hashSet1);

        List<String> list1 = new ArrayList<String>(hashSet1); //by converting to list first
        Collections.sort(list1);

        TreeSet<String> treeSet = new TreeSet<>(hashSet1);  // by converting to TreeSet
        System.out.println("By using TreeSet: "+treeSet);


        //9. Create a new hashMap of type <Integer,String> and populate it with elements
        // containing an id(Integer) and a car brand(String). Lastly, print out the entire hashMap.
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"Volvo");
        hashMap.put(2,"Saab");
        hashMap.put(3,"Skoda");
        hashMap.put(4,"BMW");
        System.out.print("Exercise 9: ");
        System.out.print(hashMap);


        //10. Create a new hashMap of type <Integer,String> and populate it with elements containing an
        // id(Integer)
        // and a car brand(String).
        // Lastly, print out only the keys.
        System.out.println("\nExercise 10: ");
        for (int key: hashMap.keySet()){
            System.out.println("Key only: "+key);
        }


        // 11. Create a new hashMap of type <Integer,String> and populate it with elements containing
        // an id(Integer) and a car brand(String). Lastly, print out only the values.
        System.out.println("Exercise 11: ");
        for (String values : hashMap.values()){
            System.out.print(values +", ");
        }


        //12. Create a new class and call it Car. Add fields for Id,Brand and Model + getters and setters
        // Create a new hashMap of type <Integer,Car> and populate it with elements containing
        // an id(Integer) and a car object(Car). Lastly, print out only the car's brand.
        HashMap<Integer, Car> hashMapCar = new HashMap<>();
        Car car = new Car(1,"Volvo", "s80");
        hashMapCar.put(100,car);

        System.out.println("\nExercise 12: ");
        for (Car brand : hashMapCar.values()){
            System.out.print(car.getBrand());
        }



    }
}
