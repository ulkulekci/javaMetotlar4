import java.util.Scanner;
public class Main {
    static int asal(int a,int b){
        int x;
        if(b>1)
        {x=a%b;
            b--;
if(x==0) System.out.print("sayi  asal degildir");
else if(b<2)     System.out.print("sayi asaldir");
     else   return asal(a,b);
 }
return a;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi girin:");
        int a= input.nextInt();
asal(a,a-1);
    }
}