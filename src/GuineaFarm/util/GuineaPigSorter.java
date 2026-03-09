package GuineaFarm.util;

import GuineaFarm.model.GuineaPig;
import java.util.ArrayList;
import java.util.Comparator;

/*
 Utility class for sorting guinea pigs.

 STUDENT TASK:
 Implement sorting methods using Collections.sort().
*/

public class GuineaPigSorter {

    public static void sortByName(ArrayList<GuineaPig> pigs ) {
        pigs.sort(Comparator.comparing(GuineaPig::getName));// STUDENT TASK
    }

    public static void sortByAge(ArrayList<GuineaPig> pigs) {
        pigs.sort(Comparator.comparingInt(GuineaPig::getAge));

    }

    public static void sortByWeight(ArrayList<GuineaPig> pigs) {
        pigs.sort(Comparator.comparingDouble(GuineaPig::getWeight));

    }
}