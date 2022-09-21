// Jenny Ran Zhang - Date: 12/11/2014

   import java.util.*;
   import java.io.*;
   import java.util.Scanner;
   import java.io.File;
   
   public class Assassin_Generator //if program gets stuck, just run again.
   {    
      public static void main(String[] args) throws IOException
      {
         System.out.println("Instructions!");
         System.out.println("Please email each file to their matching email!");
         System.out.println("For example, file \"Mihir.txt\" is sent to Mihir's email (mihir.v.patel7@gmail.com)");
         String name="Mihir Syed Saleh Neal Parker Seth MatthewChorney MatthewNguyen Trent Soham WilliamEskebar Won John Nirvan Rasvik Larry Simon Kaizad Joey Tim Sean Karthik Jason Nitin Richard Mitchell Joseph Kyle NateRA Levi SpencerRA NathanLi WillHom"; //have space between each name (is splitted)
         String[] names=name.split(" ");
         List<String> list=new ArrayList<String>();
         for(int i=0; i<names.length; i++)
            list.add(names[i]);
            
         String[] hunt=new String[names.length];
         for(int i=0; i<hunt.length; i++) {
            int rndm=(int)(Math.random()*list.size());
            hunt[i]=list.remove(rndm);
         }
     //      Shows the list of who's hunting who.  
     //    for(String s: hunt)
      //      System.out.println(s);
            
         PrintStream stnd_out = System.out;
         for(int i=0; i<hunt.length-1; i++) {
            System.setOut(new PrintStream(new FileOutputStream(hunt[i]+".txt")));
            System.out.println("The way this game works is every person has a target and every person is being targeted by one person.");
            System.out.println("You only know who you are targeting. The last two surviving people win. Kill your target, and you get their target.");
            System.out.println("To kill someone, you have to touch your lanyard to their head without anyone seeing or hearing it.");
            System.out.println("If you are caught killing someone, they do not die. You must still kill them, but beware because they now know you are going for them.");
            System.out.println("To stay alive, you should try to stay in a group. Only people in the game and alive can act as witnesses to kills and prevent deaths.");
            System.out.println("Safe zones are rooms and bathrooms. RAs cannot be killed during room checks.");
            System.out.println();
            System.out.println("RULE CHANGES ARE BELOW");
            System.out.println("Upon death, the dead person should announce they are dead. The killer should not be revealed.");
            System.out.println("Do not talk about the game unless an attack-like event is on. First rule of fight club.");
            System.out.println("Classes and tables in the cafeteria are safe zones. This includes afternoon classes and is dependent on the target's class times.");
            System.out.println("No throwing lanyards.");
            System.out.println("Floor night is off limits.");
            System.out.println("The game will begin tomorrow morning.");
            System.out.println();
            System.out.println("Target:  "+hunt[i+1]);
         }
         System.setOut(new PrintStream(new FileOutputStream(hunt[hunt.length-1]+".txt")));
         System.out.println("Target:  "+hunt[0]);
      }
      
   }