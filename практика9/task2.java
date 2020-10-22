public class task2{ 
    public static void main (String args[]){
		int k=0;
        if (k < 0) {
            System.out.print("k is " + k + ", k должно быть больше 0!");
            return new int[0];
        }
        int count = 0;

        for (int i = 0; i < array.length; i++) {
            if (Integer.toString(array[i]).endsWith(Integer.toString(k))) {
                count++;
            }
        }
        System.out.println(count);

        int[] newArr = new int[count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (Integer.toString(array[i]).endsWith(Integer.toString(k))) {
                newArr[count++] = array[i];
            }
        }
        return newArr;
}    
}

