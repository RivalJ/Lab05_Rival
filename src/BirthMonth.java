import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args)
    {
        int birthMonth = 0;
        int BIRTH_MIN = 1;
        int BIRTH_MAX = 12;
        Scanner in = new Scanner(System.in);
        boolean done = false;

        do{
            System.out.print("please input your birth month [1 - 12]: ");
            if(in.hasNextInt()){
                birthMonth = in.nextInt();
                in.nextLine();


                if (birthMonth < 1 || birthMonth > 12) {
                    System.out.println("invalid input, you are out of range, plese try again");
                    in.nextLine();
                    done = false;
                }
                else
                {
                    done = true;
                }

            }
             else{
                System.out.println("invalid input, plese try again");
                in.nextLine();
                done = false;
            }
        }while(!done);

        System.out.println("you said your birth month was " + birthMonth);

    }
}
