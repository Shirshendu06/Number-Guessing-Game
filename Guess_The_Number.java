import java.util.Random;
import java.util.Scanner;

// THIS IS A GAME OF GUESSING THE NUMBER(FROM 1-100) WHICH COMPUTER HAS ALREADY CHOSEN 
// AND CHECK HOW MANY ATTEMPTS YOU ARE TAKING TO GUESS THE ACTUAL NUMBER

class Game
{
    int noofguesses = 0;
    int compinput;
    int input;
    Game()
    {
        Random random = new Random();
        compinput = random.nextInt(101);
    }
    void userinput()
    {
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
    }
    boolean iscorretnumber()
    { 
        noofguesses+=1;
        if(input<1||input>100)
        {
            System.out.println("Invalid Input");
            return false;
        }
        if(input==compinput)
        {
            System.out.println("Your guess is correct\nAttempts taken: "+noofguesses);
            return true;
        }
        else if(input>compinput)
        {
            System.out.println("Too high...");
            return false;
        }
        else
        {
            System.out.println("Too low...");
            return false;
        }
    }
}

public class Guess_The_Number {
    public static void main(String[] args) {
        Game guess = new Game();
        boolean i;
        System.out.println("Guess a number from 1-100");
        guess.userinput();
        i = guess.iscorretnumber();
        while (i!=true) {
            System.out.println("Guess a number from 1-100");
            guess.userinput();
            i = guess.iscorretnumber();
        }
    }
}
//CODE IS WRITTEN BY SHIRSHENDU CHATTERJEE