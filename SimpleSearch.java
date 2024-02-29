/*
 * Activity 3.7.5
 */
public class SimpleSearch
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    
    int numToSearchFor = UserInput.getInt();
    
    //regular for loop
    // for(int i = 0; i < primeUnder50.length; i++)
    // {
    //   if (primeUnder50[i] == numToSearchFor)
    //   {
    //     System.out.print(numToSearchFor + " was found at index " + i);
    //   }
    // }
    
    //enhanced for loop
    // int index = 0;
    // for(int i: primeUnder50)
    // {
    //   if (i == numToSearchFor)
    //   {
    //     System.out.print(numToSearchFor + " was found at index " + index);
    //   }
    //   index++;
    // }

    int index = 0;
    while (index < primeUnder50.length)
    {
      if (primeUnder50[index] == numToSearchFor)
      {
        System.out.print(numToSearchFor + " was found at index " + index);
      }
      index++;
    }
    
  }
}