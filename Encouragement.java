import java.util.Scanner;
import java.util.Random;

public class Encouragement{
    public static void main(String[] args){
        //list of words of wisdom
        String[] arr = {"You got this! ", "Small steps still count ", "Today is a fresh start ",
            "Life is 200 years! "
        };

        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Press enter for another word of wisdom. \"Thanks\" to end");

        String temp = "";
        while(true){
            temp = in.nextLine();
            if(temp.equals("Thanks")){
                break;
            }
            System.out.print(arr[rand.nextInt(arr.length)]);
        }
        System.out.println("Good luck");
    }
}
