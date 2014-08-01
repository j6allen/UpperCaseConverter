/************************ 
 @author Jesse Allen
 @Created 9/11/2013
***********************/

import java.util.Scanner;//Needed for input
import java.io.*;//Needed to read and write from and to files

public class UpperCaseConverter
{
   public static void main(String[] args)throws IOException
   {
     
      String inputFileName;// Holds user input of requested input file name
      String outputFileName;//Holds user input of desired output file name
    
    
     /********************Input File***********************/

      Scanner keyboard = new Scanner(System.in); //Creates new instance of Scanner class
           
      System.out.print("Enter the file name: "); //requests input file name
      inputFileName = keyboard.nextLine();
      
      File input = new File(inputFileName); //Opens file
      Scanner inputFile = new Scanner(input);// Reads file
      
      if (!input.exists())//Checks if user input for input file name is valid
      {
         System.out.println("That file is not found");//Error message if file does not exist
      }   
      /******************Output File**********************/
             
       
      System.out.print("Enter the output file name: ");//Requests output file name 
      outputFileName = keyboard.nextLine();
     
      
      PrintWriter outputFile = new PrintWriter(outputFileName);//creates and/or opens file, overwrites any existing text
 
      
      
      /******************Processing************************/
      while(inputFile.hasNext())//While loop to check end of input file
      {
        String line = inputFile.nextLine();//Gets next line from input file
        
        String upperCase = line.toUpperCase();//Converts line to upper case
        
        outputFile.println(upperCase);//Writes line to output file
      }
      /***********************Close*************************/
      
      outputFile.close();//Closes output file
      inputFile.close();//Closes input file
      System.out.print("The conversion is complete");//Notifies user process is complete
   }   
}      
      
      
      
      
      
     
      
         
      
         
      
      
   