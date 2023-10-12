import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleArray {
    public static void main(String[] args) {
        // Creating the array 
        Integer[] array = {1, 2, 3, 4, 5, 6, 7};

        // Converting the array into a List
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list, array);

        // Shuffling the list
        Collections.shuffle(list);

        // Converting the shuffled list to an array
        Integer[] shuffledArray = list.toArray(new Integer[0]);

        // Printing the shuffled array
        for (int value : shuffledArray) {
            System.out.print(value + " ");
        }
    }
}
