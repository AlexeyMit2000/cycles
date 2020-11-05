class task2 
 { 
static int distance(String s,String w1,String w2) 
{ 
    if (w1 .equals( w2) ) 
        return 0 ; 
    String words[] = s.split(" "); 
    int min_dist = (words.length) + 1; 
   
    for (int index = 0; 
         index < words.length ; index ++) 
    { 
   
        if (words[index] .equals( w1)) 
        { 
            for (int search = 0;  
                 search < words.length; search ++)  
            { 
                if (words[search] .equals(w2))  
                { 
                    int curr = Math.abs(index - search) - 1;  
                    if (curr < min_dist)  
                    { 
                        min_dist = curr ; 
                    } 
                } 
            } 
        } 
    } 
    return min_dist; 
} 

public static void main(String args[]) 
{ 
      
String s = "Java — строго типизированный объектно-ориентированный java язык программирования "; 
String w1 = "java" ; 
String w2 = "программирования" ; 
   
System.out.print( distance(s, w1, w2) ); 
} 
} 