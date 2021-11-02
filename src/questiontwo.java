public class questiontwo {
    public static void main(String[] args) {
        double[ ] exampleArray = {1,5,6,5,4,1};

          double maximum = exampleArray[0];

          int index = 0;

          for (int i = 1; i<exampleArray.length; i++){

               if (exampleArray[ i ] > maximum) {

                    maximum = exampleArray[ i ];

                    index = i;

               }

          }

          System.out.println(index); // the output will be 2 because 6 is the largest number and its in the 2nd index 
        
    }
}
