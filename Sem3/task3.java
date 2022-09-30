package Sem3;

public class task3 { 
 
    public static void main(String args[]){
     
      int array[] = new int[]{10, 11, 88, 2, 12, 120};
   
      // максимальное значения
      int max = getMax(array);
      System.out.println("Maximum Value is: "+max);
   
     //минимальноe значения
      int min = getMin(array);
      System.out.println("Minimum Value is: "+min);
      // Cумма 
      int sum = getSum(array);
      System.out.println("sum is: "+sum);
      // Cреднее 
      double avr = findAverage(array);
      System.out.println("average is: "+avr);



     


    }

   
    //здесь находим максимум
    public static int getMax(int[] inputArray){ 
      int maxValue = inputArray[0]; 
      for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){ 
           maxValue = inputArray[i]; 
        } 
      } 
      return maxValue; 
    }
   
    // здесь находим минимум
    public static int getMin(int[] inputArray){ 
      int minValue = inputArray[0]; 
      for(int i=1;i<inputArray.length;i++){ 
        if(inputArray[i] < minValue){ 
          minValue = inputArray[i]; 
        } 
      } 
      return minValue; 
    } 
  // здесь находим сумму 
    public static int getSum(int[] inputArray) {
        int sum = 0;
        for (int value : inputArray) {
        sum += value;
        }
        return sum;
        }
   // здесь находим Cреднее      
        public static double findAverage(int[]  inputArray) {
            int sum = getSum(inputArray);
            return (double) sum / inputArray.length;
        }

  }
    

