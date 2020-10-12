public class task1{ 
      
    public static void main (String args[]){
          
        long n = 5254767;
 
        long min = String.valueOf(n).chars()
                .mapToLong(x -> x - '0')
                .min()
                .getAsLong();
        long max = String.valueOf(n).chars()
                .mapToLong(x -> x - '0')
                .max()
                .getAsLong();
 
        System.out.println(max);
		System.out.println(min);
    }
}

