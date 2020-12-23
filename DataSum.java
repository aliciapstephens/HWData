import java.util.Scanner;
class DataSum{
   public static void main(String args[]){
      Scanner scanner = new Scanner(System.in);
      int[] array = new int[10];
      int sum = 0;
      System.out.println("Enter the elements:");
      for (int i=0; i<10; i++)
      {
    	  array[i] = scanner.nextInt();
      }
      for( int num : array) {
          sum = sum+num;
      }
      System.out.println("Sum of array elements is:"+sum);
    }
double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = examplesArray[0];

          int index = 0;
          {
              for (int i = 1; i<exampleArray.length>; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;
          }
               }
                  System.out.println(index);
            }
          }