import java.util.Scanner;

public class Day_3_Find_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int odd=0;
        int even=0;
        while(n>0){
            int e = n%10;
            if(e%2==0){
                even+=e;
            }else {
                odd+=e;
            }
            n/=10;
        }
        System.out.println(even+ " "+ odd);

    }
    }
