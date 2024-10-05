import java.util.ArrayList;
import java.util.Arrays;

public class CommonHotelsArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> userA = new ArrayList<>(Arrays.asList(2, 3, 1));
        ArrayList<Integer> userB = new ArrayList<>(Arrays.asList(2, 5, 3));
        
        ArrayList<Integer> commonHotels = new ArrayList<>();

        for (Integer hotelA : userA) {
            if (userB.contains(hotelA) && !commonHotels.contains(hotelA)) {
                commonHotels.add(hotelA);
            }
        }

        System.out.println("Common hotel IDs: " + commonHotels);
    }
}
