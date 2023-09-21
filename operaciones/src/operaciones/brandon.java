
package operaciones;
import java.util.Scanner;
public class brandon {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int i;
        int [] num=new int[5];
        for( i=0;i<=5;i++){
            System.out.print("ingresa un numero:");
            num[i]=sn.nextInt();
            System.out.println();
            }
    for(i=0;i<=5;i++){
    System.out.print(i+"./"+num[i]);
    }
   } 
}
