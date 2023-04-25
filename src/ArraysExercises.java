import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));

        String[] person= {"sav", "savanna", "savy" };
        for (String p: person){
            System.out.println(p);
        }



    }
    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] people = Arrays.copyOf(array, array.length +1);
        people[array.length] = newPerson;
        return people;
    }

}
