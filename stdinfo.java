import java.util.Scanner;

class Studentdata {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String name = data.nextLine();

        System.out.println("Enter your Age:");
        byte age = data.nextByte();

        System.out.println("Enter your Birth year:");
        short year = data.nextShort();

        System.out.println("Enter your Gender (M/F/O):");
        char gender = data.next().charAt(0);

        System.out.println("Enter your Height (in meters):");
        float height = data.nextFloat();

        System.out.println("Enter your SPR.No:");
        int sprNo = data.nextInt();

        System.out.println("Enter your Registration Number:");
        long regNo = data.nextLong();

        System.out.println("Enter your CGPA:");
        double cgpa = data.nextDouble();

        System.out.println("Do you have a driving license? (true/false):");
        boolean driver = data.nextBoolean();
        
        System.out.println("\n--- Student Data ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Birth Year: " + year);
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height + " meters");
        System.out.println("SPR No: " + sprNo);
        System.out.println("Registration Number: " + regNo);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Driving License: " + (driver ? "Yes" : "No"));

        data.close();
    }
}
