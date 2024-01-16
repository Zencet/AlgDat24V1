import java.io.*;
import java.util.Scanner;
import java.lang;

class oblig_1
{
   public static void lineær(long n)
   {
      int tmp = 1;
      for (long i = 0; i < n; i++)
         tmp *= 1;
   }

   public static void superlineær(long n){
    int tmp = 1;
    for (long i = 0; i < n; i++){
        for (long j = n; j > 0; j /= 2){
        tmp *= 1;
        
        }
        //System.out.println(i);
    }
        
   }
    
   public static void kvadratisk(long n)
   {
      int tmp = 1;
      for (long i = 0; i < n; i++)
            for (long j = 0; j < n; j++)
            tmp *= 1;
            System.out.println(n);
            System.out.println();
   }

   public static void kubisk(long n)
   {
      int tmp = 1;
      for (long i = 0; i < n; i++){
            for (long j = 0; j < n; j++){
                  for (long k = 0; k < n; k++){
                  tmp *= 1;
                  //System.out.println(n);
                  //System.out.println(k);
                  }
            }
         }
      //System.out.println(i);
   }

   public static void eksponensiell(long n)
   {
      int tmp = 1;
      long e = Math.pow(2, n);
      for (long i = 0; i < e; i++){
         tmp *= 1;
         System.out.println(i);
      }
      
   }
    
   public static int logaritmisk(long n)
   {
      int tmp = 1, iterasjoner = 0;
      for (long i = n; i > 0; i /= 2, iterasjoner++)
         tmp *= 1;
      return iterasjoner;
   }
    
   public static void main(String[] args)
   {
      Scanner S = new Scanner(System.in);
      long n, T, T1, T2;
      int valg, iterasjoner = 0;

      System.out.print("1:O(n) 2:O(n²) 3:O(log_n) 4:O(n*log_n) 5:O(n^3) 6:O(2^n)  ? ");
      valg = S.nextInt();
      System.out.print("n? ");
      n = S.nextLong();

      T1 = System.currentTimeMillis();
      if (valg == 1)
         lineær(n);
      else if (valg == 2)
         kvadratisk(n);
      else if (valg == 3)
         iterasjoner = logaritmisk(n);
      else if (valg == 4)
        superlineær(n);
      else if (valg == 5)
        kubisk(n);
      else if (valg == 6)
        eksponensiell(n);
      T2 = System.currentTimeMillis();
      
	
      T = T2 - T1;
      System.out.print("T = " + T+ " ms");
      if (valg == 3)
         System.out.print(" (" + iterasjoner + ")");
      System.out.println();
   }    
   
}