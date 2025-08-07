import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Enter the number of seats to book:");
        int n = data.nextInt();
        data.nextLine();

        String[] seatNumbers = new String[n];
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            seatNumbers[i] = "S" + (i + 1);
            System.out.print("Enter name for seat " + seatNumbers[i] + ": ");
            names[i] = data.nextLine();
        }

        System.out.println("Booking Details:");
        for (int i = 0; i < n; i++) {
            switch (i) {
                case 0:
                    System.out.println(seatNumbers[i] + " -> " + names[i]);
                    break;
                case 1:
                    System.out.println(seatNumbers[i] + " -> " + names[i]);
                    break;
                case 2:
                    System.out.println(seatNumbers[i] + " -> " + names[i]);
                    break;
                default:
                    System.out.println(seatNumbers[i] + " -> " + names[i]);
            }
        }
    }
}
