import java.util.Scanner;

public class main {
    static int power(int a,int b){
        if (b == 0){
            return 1;
        }
        return a * power(a,(b-1));
    }
    public static void main(String[] args) {
        int number,pow;
        Scanner input=new Scanner(System.in);

        System.out.print("Taban değeri giriniz : ");
        number=input.nextInt();
        System.out.print("Üs değeri giriniz : ");
        pow=input.nextInt();

        System.out.println(number+"^"+pow+" = "+power(number,pow));
    }
}
