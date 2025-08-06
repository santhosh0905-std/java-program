import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);  

        System.out.print("Enter a number: ");  
        int num = data.nextInt();              

       

        for (int i = 2; i <= num; i++) {  
            boolean prime = true;

            for (int j = 2; j <= i / 2; j++) {  
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(i);  
            }
        }

       
    }
}
