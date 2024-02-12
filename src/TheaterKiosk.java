import java.util.Scanner;

public class TheaterKiosk {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int age = 0;
        int AGE_REQ = 21;

        System.out.print("please input your age: ");
        if(in.hasNextInt()){
            age = in.nextInt();

            if(age>AGE_REQ){
                System.out.println("you are of age, you get a wrist band");
            }
        }
        else{
            System.out.println("invalid input, please try again");
        }
    }
}
