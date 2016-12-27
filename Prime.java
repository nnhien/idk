public class Prime{
   public static void main(String[] args){ 
      long i = 1;
      float output;
      int[] divisors = {2, 3, 5, 7};
      while(i >= 0){
         for(int j = 0; j < divisors.length; j++){
	    output = (i / divisors[0+j]);
	    if(output == (int)output){
               i++;
	    }
	    else{
	       System.out.print(i + " ");
	    }
	    if(j == divisors.length-1){
	       j = j - j;
	    }
	 }
      }
   }
}
