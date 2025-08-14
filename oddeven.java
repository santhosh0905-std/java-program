import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner data = new Scanner(System.in); 
        System.out.println("Enter A");
        int A=data.nextInt();
        while(A>=0){
            A--;
            if((A%2)==0){
                System.out.println(A+"-Even");
            }
            else{
                System.out.println(A+"-Odd");
            }
        }
    }
}
