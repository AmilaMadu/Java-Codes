import java.util.Scanner;
public class Quiz{
    public static void main(String [] args){
        System.out.println("Enter your Input");
        Scanner sn = new Scanner(System.in);
        char c = sn.next().charAt(0);
        if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
            System.out.println("Alphabet");
        }
        
        else{
            System.out.println("not Alphabet");
        }

    }
}