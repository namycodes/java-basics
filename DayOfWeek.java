import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
        if (day >= 1 && day <= 7) {
            System.out.println("Day: " + days[day - 1]);
        } else {
            System.out.println("Invalid number.");
        }
    }
}
