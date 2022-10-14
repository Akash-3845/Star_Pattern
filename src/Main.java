import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //1. Right triangle
        System.out.println("1. Right triangle");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //2. Left Angle
        System.out.println("2.Left Angle");
        for (int i = 1; i <=n; i++) {
            for (int j = 2*(n-i); j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //3. Pyramid
        System.out.println("3.Pyramid");
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //4. R. DownWard triangle
        System.out.println("4. R. DownWard triangle");
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //5.L. DownWard triangle
        System.out.println("5.L. DownWard triangle");
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //6.Revers Pyramid
        System.out.println("6.Revers Pyramid");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //7. Diamond
        System.out.println("7. Diamond");
        for (int i = 1; i <n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

        //8. Sandglass
        System.out.println("8. Sandglass");
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //9.Left Pascal's Triangle
        System.out.println("9.Left Pascal's Triangle");
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //10. Right Pascal's Triangle
        System.out.println("10. Right Pascal's Triangle");
        for (int i = 1; i <n; i++) {
            for (int j = 2*(n-i); j >=1; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <=n; i++) {

            for (int j = 1; j <=2*(i-1); j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        //11. Double Hill
        System.out.println("11. Double Hill");
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        // 12. Butterfly
        System.out.println("12. Butterfly");
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <2*i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <2*i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <=n; j++) {
                System.out.print("* ");
            }

            System.out.println(" ");
        }
        //13. Hollow Square
        System.out.println("13.Hollow Square");
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==1|| j==1||i==n||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println("");
        }
        //14. Hollow triangle
        System.out.println("14.Hollow triangle");
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i; j++) {
                if (j==1|| i==1|| j==i||i==n) {
                    System.out.print("* ");
                }else{
                    System.out.print(" "+ " ");
                }

            }
            System.out.println(" ");
        }
        // 15. Hollow pyramid
        System.out.println("15.Hollow pyramid");
        for (int i = 1; i <=n ; i++) {
            for (int j = i; j <=n ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i; j++) {
               if ( j==1|| i==1||j==i||i==n){
                   System.out.print("* ");
               }else {
                   System.out.print(" "+ " ");
               }
            }
            System.out.println(" ");
        }
    }
}