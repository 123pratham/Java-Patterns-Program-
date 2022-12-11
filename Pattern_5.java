import java.util.Scanner;



public class Pattern_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter  an integer what you want  to print!");
        int n = input.nextInt();
        Pattern9.myPattern9(n);
        

    }
    
}
class Pattern5{
static void myPattern5(int n){
         int i = 1;
    while(i<=n){
        int j = 1;
        while(j<=n){
            System.out.print(n-j+1);
            j=j+1;
            System.out.print(" ");
        }
        System.out.println(" ");
        i=i+1;
        }
    }
}
class Pattern6{
    static void myPattern6(int n){
        int i = 1;
        int count =1;
    while(i<=n){
        int j = 1;
        while(j<=n){
        System.out.print(count+ " ");
        count = count + 1;
        j = j + 1;
            System.out.print(" ");
        }
        System.out.println(" ");
        i=i+1;
        }
    }
}
class Pattern7{
    static void myPattern7(int n){
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print("I ");
                col = col + 1;
            }
        System.out.println(" ");
        row = row + 1;
        }
    }
}
class Pattern8{
    static void myPattern8(int n){
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                System.out.print(row);
                col += 1;
                System.out.print(" ");
            }
            System.out.println();
            row += 1;
        }
    }
}
class Pattern9{
    static void myPattern9(int n){
        int row =  1;
        while(row <= n){
            int col = 1;
            while(col <=row){
                System.out.print(row +col -1 + " ");
                col = col + 1 ;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
class Pattern10{
    static void myPattern10(int n){
        int row =  1;
        while(row <= n){
            int col = 1;
            while(col <=row){
                System.out.print(row-col+1 + " ");
                col = col + 1 ;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
class Pattern11{
    static void myPattern11(int n){
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col <= n){ 

                char ch = (char) ('A' + row - 1);
                System.out.print(ch +" ");
                col = col + 1 ;

            }
            System.out.println();
            row = row + 1;
        }
    }
}
class Pattern12{
    static void myPattern12(int n){
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                char ch = (char) ('A'+row+col);
                System.out.print(ch + " ");
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        
        }
    }
}
class Pattern13{
    static void myPattern13(int n){
       
        int row = 1;
        while(row<=n){
            int col = 1;
            while(col<=row){
                char value = (char) ('A');
                char ch = (char) ('A'+row-1);
                System.out.print(ch + " ");
            
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}


