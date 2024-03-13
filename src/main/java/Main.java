import java.util.Random;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    int max =100;
    int min =1;
    int x = rand.nextInt(max-min+1);
    int b = rand.nextInt(max-min+1);
    int a = rand.nextInt(max-min+1);
    int c = rand.nextInt(max-min+1);
    int z = rand.nextInt(max-min+1);
    
     // int[] liczby =new int[5];
   // for(int i=0;i<5;i++)
  //  {
    //  liczby[i]=rand.nextInt(max-min+1)+min;
    
    
   // System.out.println("Liczby wygenerowane");
   // System.out.println(liczby[i]);
   // System.out.println(liczby[i]);
   // System.out.println(liczby[i]);
   // System.out.println(liczby[i]);
   // System.out.println(liczby[i]);
   // }
  

    
    int suma =x+b+a+c+z;
     System.out.println("Suma bez kwadratow");
    System.out.println(suma);
    

    double kwadratx = Math.pow(x, 2);
    double kwadratb = Math.pow(b, 2);
    double kwadrata = Math.pow(a, 2);
    double kwadratc = Math.pow(c, 2);
    double kwadratz = Math.pow(z, 2);
    System.out.println("Liczby wygenerowane do kwadratu ");
     System.out.println(kwadratx);
     System.out.println(kwadratb);
     System.out.println(kwadrata);
     System.out.println(kwadratc);
     System.out.println(kwadratz);
    double suma2 = kwadratx+kwadratb+kwadrata+kwadratc+kwadratz;
  
      System.out.println("Suma kwadratow");
    System.out.println(suma2);
    }


}