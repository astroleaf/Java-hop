import java.util.Scanner;
public class p2{
    public static void main(String[] args) {
        System.out.println("enter the number you want to print the table of");
        Scanner kl = new Scanner(System.in);
        long a = kl.nextLong() ;
        for(int i=0;i<=10;i++){
            System.out.println("");
            System.out.println(a+" X "+i+" = "+a*i);
        }

        System.out.println("enter the first number");
        int num1 = kl.nextInt();
        System.out.println("enter the second number");
        int num2 = kl.nextInt();
        a obj = new a();
        obj.hash();

    }
}
//continuation
class a{
    void hash(){
        Scanner hl = new Scanner(System.in);

        System.out.println("enter the first number");
        int b = hl.nextInt();
        System.out.println("enter the second number");
        int c = hl.nextInt();
        
        int d=b+c;
        int f=b-c;
        float g=b/c;
        int h=b*c;
        float j=b%c;

        System.out.println("addition is "+d);
        System.out.println("subtraction is "+f);
        System.out.println("division is "+g);
        System.out.println("multiplication is "+h);
        System.out.println("remainder is "+j);


    }
}

//third program to print the area and the perimeter of the circle or any polygon 

class p{
    void j(){
        Scanner jk = new Scanner(System.in);
        System.out.println("enter the number of sides of the polygon you want to find the area of ");
        int p = jk.nextInt();
        System.out.println("enter the length of the side");
        double m = jk.nextDouble();
        if(p==0){
            String k = jk.nextLine();
            System.out.println("you want to find the area of the circle ");
            System.out.println("enter yes for continueing");
            switch(k){
                case k:
                    float perimeter_is = p*m;
                    break;
                default:

                


            }
        }
    }
}