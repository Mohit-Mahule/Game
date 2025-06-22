import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String [] args) {
		  Scanner sc=new Scanner(System.in);
		  
		  Random random=new Random();
		     System.out.println();
		     System.out.println("WELCOME IN A GAME 🎮");
		     System.out.println("◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻◻");
		     System.out.println();
		    
		     int playagain=1;
		     
		     while(playagain==1)  {	 
		     
		     System.out.println("Enter Your Choice 😊");
		     System.out.println("➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖➖");
		     System.out.println("S = Sizer ✂, P = Paper 📄, R = Rock 🌑");
		  
		  //Character Choice By User    
		  char userchoice=sc.next().charAt(0);
		  
		 //Generate Character Choices By Computer
		  char array[]= {'R','P','S'};
		  int index=random.nextInt(array.length);
		  char computerchoice=array[index];
         
		 //Validate User Input
	if((userchoice!='R') && (userchoice!='P') && (userchoice!='S')) {
	         System.out.println();
		     System.out.println("Invalid Input ❌");          
            return;
		 }
	
	    // GetChoice Word String Method()
	         System.out.println();
		     System.out.println("Your Choice : "+getChoice(userchoice));
			 System.out.println("Computer Choice : "+getChoice(computerchoice));
			        
		//Decide winner      	  
	if (userchoice==computerchoice) {
			 System.out.println("It's a Tie !! 🗽");
	     }   
		  else if((userchoice=='R' && computerchoice=='S') || (userchoice=='P' && computerchoice=='R') || (userchoice=='S' && computerchoice=='P'))    {
			 	  System.out.println("You Win !! 🤩");
		 }       
		  else {
    			   System.out.println("Computer Win !! 💻");		  
		 }
	      System.out.println();	
          System.out.println("Do You Play Again? (1 = Yes / 0 = No)");
          playagain=sc.nextInt();
          sc.nextLine(); //Clear New Line Character
          System.out.println();         
	}      
		     System.out.println();
		     System.out.println("Thank you for playing !!");
}


	  //Helper to convert Character into Word 
    public static String getChoice(char a) {
	   switch (a) {
	   case 'S':  return " Sizer ✂ ";
	   case 'P':  return " Paper 📄 ";
	   case 'R':  return " Rock  🌑 ";
	   default :  return " Unknown 😑 ";
	   }
     }   
}



//
//import java.util.Scanner;
//import java.util.Random;
//class Game {
//	public static void main(String [] args) {
//		Scanner sc=new Scanner(System.in);
//		Random random=new Random();
//		System.out.println("Enter number");
//		int userchoice=sc.nextInt();
//	char array[]={'A','B','C'};
//	int index=random.nextInt(array.length);
//	char Charset=array[index];
//	System.out.println(Charset);
//	//System.out.println(index);
//	//char Char=random.next().charAt(0);
//	}
//}	

//import java.util.Scanner;
//import java.util.Random;
//
//class Program{
//	public static void main(String [] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your choice 1, 2 or 3");
//		int userinput=sc.nextInt();
//		Random random=new Random();
//		int computerchoice=random.nextInt(4);
//		System.out.println("User "+userinput);
//		System.out.println("Computer "+computerchoice);
//	}
//}


//import java.util.Scanner;
//import java.util.Random;
//class Program{
//	public static void main(String [] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your choice A, B or C");
//		char userinput=sc.next().charAt(0);
//		Random random=new Random();
//		char array[]= {'A','B','C'};
//		int index=random.nextInt(array.length);
//		char computerinput=array[index];
//		System.out.println("User "+userinput);
//		System.out.println("Computer "+computerinput);
//		
//	}
//}


















































































































//import java.util.Scanner;
//import java.util.Random;
//class Game {
//	public static void main(String [] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter Your Choise");
//		int userchoice=sc.nextInt();
//		Random random=new Random();
//		int num=random.nextInt(4);
//		System.out.println("Computers choice " + num);
//	}
//}