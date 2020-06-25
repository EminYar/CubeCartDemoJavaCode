package SelfPractice;

public class Shapes {

    public static void main(String[] args) {


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 6; k > i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
//        for (int i = 6; i >= 1; i--) {
//            for (int j = 1; j < i; j++) {
//                System.out.print(j);
//            }
//            for (int k = 6; k >= i; k--) {
//                System.out.print("&");
//            }
//            System.out.println();
//        }
//
//        System.out.println();
//        System.out.println("@");
//        for (int i = 5; i >= 1; i--) {
//            System.out.print("@");
//            for (int j = 5; j >= i; j--) {
//                System.out.print(" ");
//            }
//            System.out.println("@");
//        }
//        for (int j = 5; j > 0; j--) {
//            System.out.print("@ ");
//        }
//
//      //  System.out.println();

        int c= 1;

        for(; c <= 20; c++){

            System.out.println(c);
//
   }

        for (int m = 2; m <= 8; m++) {
            System.out.print(m);
            m += 1;
        }
}
}