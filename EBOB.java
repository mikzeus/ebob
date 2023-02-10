

import java.util.Scanner;

public class EBOB {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int n,m,ebob = 0,ekok,i = 1;

        System.out.println("1.Sayıyı Giriniz : ");
        m = input.nextInt();

        System.out.println("2.Sayıyı Giriniz : ");
        n = input.nextInt();

        while (i <= m || i <= n){
            if (m % i== 0 && n % i == 0){
                if (i> ebob){
                    ebob = i;
                }
            }
            i++;
        }
        ekok = (m * n) / ebob;
        System.out.println("Ebob : " + ebob);
        System.out.println("Ekok : " + ekok);
    }
}
