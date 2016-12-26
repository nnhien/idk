public class Prime{
   public static void main(String[] args){ 
      int i = 0;
      int[] divisors = {1, 2, 3, 5, 7};
      while(i >= 0){
         for(int j = 0; j < divisors.length; j++){
	    float output = (i / divisors[0+j]);
            if(output == (int)output){
               i++;
	    }
	    else{
	       System.out.print(output);
	    }
	 }
      }
   }
}

