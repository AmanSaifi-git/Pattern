package com.company.PatternQuestions;

public class Pattern  {
    public static void main(String[] args) {
//        pattern1(4);
//        pattern2(4);
//        pattern3(4);
//        pattern4(4);
//        pattern5(4);
//        pattern6(4);
//        pattern7(4);
//        pattern8(4);
//        pattern9(4);
//        pattern10(4);
//        pattern11(4);
//        pattern12(4);
//        pattern13(4);
//        pattern14(4);
//        pattern15(4);
//        pattern16(3);
//        pattern17(4);
//        pattern18(4);
//        pattern19(4);
//        pattern20(4);
//        pattern21(4 );
//        pattern22(4);
        pattern23(4);
    }
    public static void pattern1(int n){
        for(int row = 1; row<=n;row++){
            for(int col = 1; col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n){
        for (int row = 1; row<=n;row++){
            for(int col = 1; col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for (int row = 1; row<=n;row++){
            for (int col = n-row+1;col>=1;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1;col<=row;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        for (int row = 1; row<=n;row++){
            for(int col = 1; col<=n;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    public static void pattern6(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1;col<=n;col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static void pattern7(int n){
        int count = 0;
        for (int row = 1; row<=n;row++){
            for (int col = 1;col<=n;col++){
                count++;
                System.out.print(count+" ");
            }
            System.out.println();
        }
    }
    public static void pattern8(int n){
        for (int row = 1; row<=n;row++){
            for (int col = 1; col<=row;col++){
                System.out.print(row+" ");
            }
            System.out.println();
        }
    }
    public static void pattern9(int n){
        int temp= 0;
        for (int row = 1; row<=n;row++){
            for (int col = 1; col<=row;col++){
                temp++;
                System.out.print(temp+" ");
            }
            System.out.println();
        }
    }
    public static void pattern10(int n){
        int temp = 0;
        for (int row= 1;row<=n;row++){
            temp = row;
            for (int col= 1;col<=row;col++){
                System.out.print(temp+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void pattern11(int n){
        int temp = 0;
        for (int row= 1;row<=n;row++){
            temp = row;
            for (int col= 1;col<=row;col++){
                System.out.print(temp+" ");
                temp--;
            }
            System.out.println();
        }
    }
    public static void pattern12(int n){
        for (int row = 0; row <n; row++){
            for (int col=0;col<n;col++){
                char ch = (char)('A'+row);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern13(int n){
        for (int row = 0; row <n; row++){
            for (int col=0;col<n;col++){
                char ch = (char)('A'+col);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern14(int n){
        int temp = 0;
        for (int row = 0; row <n; row++){
            for (int col=0;col<n;col++){
                char ch = (char)('A'+temp);
                System.out.print(ch+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void pattern15(int n){
        int temp = 0;
        for (int row = 0; row <n; row++){
            temp = row;
            for (int col=0;col<n;col++){
                char ch = (char)('A'+temp);
                System.out.print(ch+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void pattern16(int n){
        for (int row = 0; row<n; row++){
            for (int col=0;col<=row;col++){
                char ch = (char)('A'+row);
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
    public static void pattern17(int n){
        int temp = 0;
        for (int row = 0; row<n; row++){
            for (int col=0;col<=row;col++){
                char ch = (char)('A'+temp);
                System.out.print(ch+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void pattern18(int n){
        int temp = 0;
        for (int row = 0; row <n; row++){
            temp = row;
            for (int col=0;col<=row;col++){
                char ch = (char)('A'+temp);
                System.out.print(ch+" ");
                temp++;
            }
            System.out.println();
        }
    }
    public static void pattern19(int n){
        for (int row = 1; row<=n;row++){
            for(int col = n-row; col >0;col--){
                System.out.print("_");
            }
            for(int col = 1; col<=row;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern20(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1; col<row;col++){
                System.out.print("_");
            }
            for(int col = n-row;col>=0;col--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void pattern21(int n){
        for(int row = 1;row<=n;row++){
            for(int col = 1; col<row;col++){
                System.out.print("_");
            }
            for(int col = n-row;col>=0;col--){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    public static void pattern22(int n){
        for (int row = 1; row<=n;row++){
            for(int col = n-row; col >0;col--){
                System.out.print("_");
            }
            for(int col = 1; col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
    public static void pattern23(int n){
        int count = 1;
        for (int row = 1; row<=n;row++){
            for(int col = n-row; col >0;col--){
                System.out.print("_");
            }
            for(int col = 1; col<=row;col++){
                System.out.print(count);
                count++;
            }

            System.out.println();
        }
    }

}
