public class Day_12_pattern {
    public static void main(int n) {

    int i,k,j;

        for(i=1;i<=n;i++){

        for(k=1;k<n-i+1;k++){

            System.out.print(" ");

        }

        for(j=1;j<=2*i-1;j++){

            System.out.print("*");

        }



        System.out.println();

    }
}
}
