package Striver.Patterns;

public class Pattern {
    public static void main(String[] args) {
        Pattern1(5);
        System.out.println(1);
        Pattern2(5);
        System.out.println(2);
        Pattern3(5);
        System.out.println(3);
        Pattern4(5);
        System.out.println(4);
        Pattern5(5);
        System.out.println(5);
        Pattern6(9);
        System.out.println(6);
        Pattern7(5);
        System.out.println(7);
        Pattern8(5);
        System.out.println(8);
        Pattern9(5);
        System.out.println(9);
        Pattern10(5);
        System.out.println(10);
        Pattern11(5);
        System.out.println(11);
        Pattern12(5);
        System.out.println(12);
        Pattern14(5);
        System.out.println(13);
        Pattern13(5);
        System.out.println(14);
        Pattern15(5);
        System.out.println(15);
        Pattern16(4);
        System.out.println(16);
        Pattern17(4);
        System.out.println(17);
        Pattern18(5);
        System.out.println(18);
        Pattern19(5);
        System.out.println(19);
    
        }
        public static void Pattern1(int n){
            for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        }
        public static void Pattern2(int n){
            for(int i =0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n)-(i*2+1);j++){
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        }
        public static void Pattern3(int n){
            for(int i =0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++){
                System.out.print("*");
            }

            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n*2)-(i*2+1);j++){
                System.out.print("*");
            }

            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
        System.out.println(" ");
        }
        }
        public static void Pattern4(int n){
            for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        }
        public static void Pattern5(int n){
            int start =0;
        for(int i=0;i<n;i++){
           if(i%2==0) start =1;
           else start =0;
           for(int j=0;j<=i;j++){
               System.out.print(start+" ");
               start = 1- start;
           }
           System.out.println(" ");
       }
        }
        public static void Pattern6(int n){
            for(int i=0;i<n;i++){
                for(int j=1;j<=i+1;j++){
                    System.out.print(j);
                }
                for(int j=0;j<(n*2)-(i*2+2);j++){
                    System.out.print(" ");
                }

                for(int j=i+1;j>0;j--){
                    System.out.print(j);
                }
                System.out.println(" ");
            }
        }
        public static void Pattern7(int n){
            int num =1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((num++)+" ");
            }
            System.out.println(" ");

        }
    }
        public static void Pattern8(int n){

        char word = 65;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print((word++)+" ");
                
            }
            word = 65;
            System.out.println(" ");
        }
        }
        public static void Pattern9(int n){

        char word = 65;
        for(int i=n;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print((word++)+" ");
                
            }
            word = 65;
            System.out.println(" ");
        }
            
        }
        public static void Pattern10(int n){
            char num = 65;
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(num);
                }
                num++;
                System.out.println(" ");
            }

        }
        public static void Pattern11(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1-i;j++){
                    System.out.print(" ");
                }
                int brpoint = (i*2+1)/2;
                char ch = 65 ;
                for(int j=0;j<i*2+1;j++){
                    System.out.print(ch);
                    if(j<brpoint){
                        ch++;
                    }
                    else ch--;
                }

                for(int j=0;j<n-1-i;j++){
                    System.out.print(" ");
                }
                System.out.println(" ");
            }            
        }
        public static void Pattern12(int n){
            for(int i=0;i<n;i++){
                for(char j=(char)('E'- i);j<='E';j++){
                    System.out.print(j+" ");
                }
                System.out.println("");
            }
            
        }
        public static void Pattern13(int n){
            for(int i=0;i<n;i++){
                for(int j=n-i;j>0;j--){
                    System.out.print("*");
                }
                for(int j =0;j<i*2;j++){
                    System.out.print(" ");
                }

                for(int j=n-i;j>0;j--){
                    System.out.print("*");
                }
                if(i!=n-1) System.out.println("");
            }
            for(int i=n;i>0;i--){
                for(int j=n-i;j>0;j--){
                    System.out.print("*");
                }
                for(int j =0;j<i*2;j++){
                    System.out.print(" ");
                }

                for(int j=n-i;j>0;j--){
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

        public static void Pattern14(int n){
            for(int i=0;i<n;i++){
             char ch =(char)('A'+n-1);
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
                System.out.println();
            }
        }

        public static void Pattern15(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                int k=(n*2)-2-(i*2);
                for(int j=0;j<k;j++){
                    System.out.print(" ");
                }
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println("");           
             }


            //   n=5, i=4
            for(int i=n-1;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("*");
                }
                int k=(n*2)-(i*2);
                for(int j=0;j<k;j++){
                    System.out.print(" ");
                }
                for(int j=i;j>0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void Pattern16(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1||j==0||j==n-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        public static void Pattern17(int n){

            for(int i=0;i<n*2-1;i++){
                for(int j=0;j<n*2-1;j++){
                    int top=i;
                    int bottom=(n*2-2)-i;
                    int left =j;
                    int right= (n*2-2)-j;
                    int val = n-min(min(top,bottom),min(left,right));
                    System.out.print(val+" ");
                }
                System.out.println();
            }

        }static int min(int a,int b){
            if(a>b) return b;
            return a;
        }


        static void Pattern18(int n){
            int space=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<n-1-i;j++){
                    System.out.print(" ");
                }
                System.out.print(1);
                if(i>=1){
                    for(int k=1;k<=space;k++){
                        System.out.print(" ");
                    }
                    space=space+2;
                    System.out.print(1);
                }
                
                if(i==n-1){
                    System.out.println();
                    for(int j=1;j<=n+1;j++){
                        System.out.print(j);
                    }
                    for(int j=n;j>0;j--){
                        System.out.print(j);
                    }
                }
                System.out.println();
                
            }
        }
        static void Pattern19(int n){
            
        }
    }