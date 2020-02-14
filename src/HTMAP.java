import java.util.Scanner;

public class HTMAP {
    public static void main(String[] arg) {
        System.out.print( "Hello! How many stars" );
        Scanner scan = new Scanner( System.in );
        int numOfStar = scan.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print( "*"  );
            }

            System.out.print( "" );
        }

        for (int i = numOfStar - 1; i > 0; i--) {

            for (int j = 0; j < i; j++) {
System.out.print( "*" );

            }
      //  System.out.print( "*" );
        }

   // System.out.print("*" + numOfStar);
    }
}