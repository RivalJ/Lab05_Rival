import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args){

        String party = "";
        Scanner in = new Scanner(System.in);

        System.out.print("please input your party affiliation [D,R,I,O]: ");

        party = in.next();

        System.out.println("you said your party was " + party);

        switch(party)
        {
            case "D":
                System.out.println("you get a democratic donkey");
                break;
            case "R":
                System.out.println("you get a republican elephant");
                break;
            case "I":
                System.out.println("you get an independent man");
                break;
            case "O":
                System.out.println("you get an other");
                break;
            default:
                System.out.println("you have chosen an option outside of");
                System.out.println("the given choices, and have been defaulted to");
                System.out.println("other.");
        }
    }
}
