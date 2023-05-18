import java.util.Scanner;

public class main2{

    public static void main(String[] args){

        Fighter f1 = new Fighter("Muhammet Ali" , 10 , 100 , 100 , 50);
        Fighter f2 = new Fighter("Mike Tyson" , 15 , 90 , 95 , 50);

        Match match = new Match(f1 , f2 , 10 , 125);

        match.run();


    }

}
