import java.util.Scanner;
public class NumberGuessing {
    public static void guessingNumberGame()
           {
               Scanner sc= new Scanner(System.in);
               int num = 1+(int)(100*Math.random());
               int M =5;
               int i,guess;
               System.out.println("Number is choosen"+"Between 1 to 100"+"Guess the number"+"Within the 5 trials");
                
               for(i=0;i<M;i++)
                 {                 
                    System.out.println("Guess the number:");
                    guess=sc.nextInt();
                    if(num==guess){
                      System.out.println("Congrats!"+"You guessed the number");
                    break;
                   }
                    else if(num>guess && i!=M-1){
                       System.out.println("The number is" + "greater than:"+guess);
                      }
                    else if(num>guess && i!=M-1){
                       System.out.println("The number is" + "less than:"+guess);
                      }
                 }
               if(i==M){
                   System.out.println("you have exhausted"+ "M trials");
                   System.out.println("The number was:"+num);
                  }
              }
  
      public static void main(String arg[])
           {
              guessingNumberGame();
            }

}
