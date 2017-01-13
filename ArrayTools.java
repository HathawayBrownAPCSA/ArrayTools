import java.util.Scanner;

public class ArrayTools
{
  
  /** Fills the array nums with integers from 1 to n
    * @param nums the array to fill.  Returns a modified array.
    * @param n Upper bound for numbers with which to fill the array.
    */
  public static void fillRandom (int[] nums, int n)
  {
    for (int i = 0; i < nums.length; i++)
      nums[i] = (int)(Math.random() * n) + 1;
  }
  
  /** Fills the array with integers entered by the user
    * @param nums the array to fill.  Returns a modified array.
    */
  public static void fillKeyboard (int[] nums)
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.println ("Please enter " + nums.length + " integers, separated by spaces.");
    for (int i = 0; i < nums.length; i++)
    {
      nums[i] = keyboard.nextInt();
    }
    keyboard.close();
  }
  
  /** Prints the array, spaces between numbers.
    * @param the array to print.
    */
  public static void printArray (int[] nums)
  {
    for (int i = 0; i < nums.length; i++)
      System.out.print (nums[i] + "  ");
    System.out.println();
  }
  
  /** Tests the various array tools */
  public static void main (String[] args)
  {
    int[] myArray = new int[10];
    printArray (myArray);
    fillRandom (myArray, 100);
    printArray (myArray);
  }
}
    
    
  
  
         