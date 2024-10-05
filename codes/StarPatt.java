public class StarPatt {
    public static void main(String[] args) {
        int rows = 5;

        // ? for (int i = 1; i <= rows; i++) {
        // ? for (int j = i; j < rows; j++) {
        // ? System.out.print(" ");
        // ? }

        for (int i = rows; i >= 1; i--) {

            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // ? for (int k = 1; k <= (2 * i - 1); k++) {
            // ? System.out.print("*");
            // ? }

            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}


// there are 1 bag and 
// bag capacity is 12 balls

// add method and 1 by 1 in the bag 
// red should not be greater then green colour balls 
// yellow balls should be less than 40% total of bag