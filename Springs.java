import java.util.Scanner;

public class Springs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = sc.nextInt();

       
        boolean isSpring = false;

        if ((month == 3 && day >= 21) ||  // From March 21
            (month == 4) ||               // Whole April
            (month == 5) ||               // Whole May
            (month == 6 && day <= 20)) {  // Until June 20
            isSpring = true;
        }

        if (isSpring) {
            System.out.println("The date " + month + "/" + day + " falls in the Spring season.");
        } else {
            System.out.println("The date " + month + "/" + day + " is not in the Spring season.");
        }

        sc.close();
    }
}
