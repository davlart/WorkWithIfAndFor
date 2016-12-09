import java.util.Scanner;

import java.util.Scanner;
/**
 * Created by ArthurArt on 09.12.2016.
 */
public class WorkWithIFAndFor {


    /**
     * Created by ArthurArt on 07.12.2016.
     */



        public static void task1(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>b) System.out.print(a);
            else System.out.print(b);

        }
        public static void task2(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a==b) System.out.print(0);
            else if(a>b)System.out.print(1) ;
            else System.out.print(2);

        }
        public static void task3(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a>b)&&(a>c))  System.out.print(a);
            else if(b>c) System.out.print(b);
            else System.out.print(c);

        }
        public static void task4(Scanner sc)
        {
            int a = sc.nextInt();
            if(a==0) System.out.print(0);
            else if(a>0)System.out.print(1) ;
            else System.out.print(-1);


        }
        public static void task5(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if((a==b)&& (a==c)&& (b==c))System.out.print(3);
            else if((a==b)|| (a==c)|| (b==c))System.out.print(2) ;
            else System.out.print(0);


        }
        public static void task6(Scanner sc)
        {
            int i1 = sc.nextInt();
            int j1 = sc.nextInt();
            int i2 = sc.nextInt();
            int j2 = sc.nextInt();
            if((i1==i2)||(j1==j2)) System.out.print("Yes");
            else System.out.print("No");


        }
        public static void task7(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int D = b*b-4*a*c;
            if(D<0) ;
            else if(D==0)System.out.print(-b/(2*a));
            else System.out.print(-b+Math.sqrt(D)/(2*a));



        }
        public static void task8(Scanner sc)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int bigSideInSquares,SumSquaresOterSide,BigSide,SumSmallSide;

            if((a>b)&&(a>c)) {BigSide=a;SumSquaresOterSide=b*b+c*c;SumSmallSide=b+c;}
            else if(b>c) {BigSide=b;SumSquaresOterSide=a*a+c*c;SumSmallSide=a+c;}
            else {BigSide=c;SumSquaresOterSide=b*b+a*a;SumSmallSide=b+a;}

            bigSideInSquares=BigSide*BigSide;
            if(BigSide>=SumSmallSide)System.out.print("impossible");
            else if(bigSideInSquares==SumSquaresOterSide)  System.out.print("rectangular ");
            else if(bigSideInSquares>SumSquaresOterSide)System.out.print("obtuse ");
            else System.out.print("acute ");


        }
        public static void task10(Scanner sc)
        {
            int n = sc.nextInt();

            int TicketsFor60trips,TicketsFor20trips,TicketsFor10trips,TicketsFor5trips,TicketsFor1trips ;
            TicketsFor60trips = n / 60;
            //System.out.println(TicketsFor60trips);

            TicketsFor20trips = (n-TicketsFor60trips*60) ;
            //System.out.println(TicketsFor10trips);
            if(TicketsFor20trips>36) { TicketsFor60trips = TicketsFor60trips+1; TicketsFor20trips = 0;  }
            else   if(TicketsFor20trips>0) TicketsFor20trips = (n-TicketsFor60trips*60)/20 ;
            else TicketsFor20trips=0;

            TicketsFor10trips = (n-TicketsFor60trips*60-TicketsFor20trips*20);
            //System.out.println(TicketsFor10trips);
            if(TicketsFor10trips>17) { TicketsFor20trips = TicketsFor20trips+1; TicketsFor10trips = 0;  }
            else  if(TicketsFor10trips>0) TicketsFor10trips = (n-TicketsFor60trips*60-TicketsFor20trips*20)/10;
            else TicketsFor10trips = 0;


            TicketsFor5trips = (n-TicketsFor60trips*60-TicketsFor20trips*20-TicketsFor10trips*10);
            if(TicketsFor5trips>7) { TicketsFor10trips = TicketsFor10trips+1; TicketsFor5trips = 0; }
            else  if(TicketsFor5trips>0) TicketsFor5trips = (n-TicketsFor60trips*60-TicketsFor20trips*20-TicketsFor10trips*10)/5;
            else TicketsFor5trips=0;



            TicketsFor1trips = n-TicketsFor60trips*60 -TicketsFor20trips*20- TicketsFor10trips*10-TicketsFor5trips*5 ;
            //  System.out.println(TicketsFor1trips);
            if(TicketsFor1trips>4) {TicketsFor5trips=TicketsFor5trips+1;TicketsFor1trips=0;}
            else  if(TicketsFor1trips<0)  TicketsFor1trips=0;



            System.out.println(TicketsFor60trips);
            System.out.println(TicketsFor20trips);
            System.out.println(TicketsFor10trips);
            System.out.println(TicketsFor5trips);
            System.out.println(TicketsFor1trips);
        }
        public static void task9(Scanner sc)
        {
            int n = sc.nextInt();

            int TicketsFor60trips,TicketsFor10trips,TicketsFor1trips ;
            TicketsFor60trips = n / 60;
            //System.out.println(TicketsFor60trips);

            TicketsFor10trips = (n-TicketsFor60trips*60)/10;
            //System.out.println(TicketsFor10trips);
            if(TicketsFor10trips*10>30) { TicketsFor60trips = TicketsFor60trips+1; TicketsFor10trips = 0;  }
            else if(TicketsFor10trips<0) TicketsFor10trips=0;
            TicketsFor1trips = n-TicketsFor60trips*60 - TicketsFor10trips*10;
            //  System.out.println(TicketsFor1trips);
            if(TicketsFor1trips>8) {TicketsFor10trips=TicketsFor10trips+1;TicketsFor1trips=0;}
            else if(TicketsFor1trips<0) TicketsFor1trips=0;

            System.out.println(TicketsFor60trips);
            System.out.println(TicketsFor10trips);
            System.out.println(TicketsFor1trips);
        }
        public static void task321(Scanner sc)
        {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n ; i++)
            {
                sum += i*i;
            }
            System.out.println(sum);
        }
        public static void task322(Scanner sc)
        {
            int n = sc.nextInt();
            int sum = 0;
            for (int i = 1; i <= n ; i++)
            {
                sum += (i-1)*i;

            }
            System.out.println(sum);
        }
        public static void task323(Scanner sc)
        {
            int n = sc.nextInt();
            int sumMain = 0;
            int sumBuf=0;
            for (int i = 1; i <= n ; i++)
            {
                sumBuf +=i;
                sumMain +=sumBuf ;
            }
            System.out.println(sumMain);
        }
        public static void task324(Scanner sc)
        {

            int a = sc.nextInt();
            int b=sc.nextInt();
            a=(a%2)==0?a:(a+1);
            for (int i = a; i <= b ; i+=2)
            {
                System.out.println(i);
            }

        }
        public static void task325(Scanner sc)
        {

            int n = sc.nextInt();
            int pr = 1;

            for (int i = 1; i <=n ; i++)
            {
                pr*=i;
            }
            System.out.println(pr);
        }
        public static void task326(Scanner sc)
        {

            int n = sc.nextInt();
            int k= sc.nextInt();
            int pr1 = 1,pr2=1;
            for (int i = 1; i <=n-k; i++)
            {
                pr1 *= (k+i);
                pr2*= i;
            }
            int CNK = pr1/pr2;
            System.out.println(CNK);
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            //task1(sc);
            //task2(sc);
            //task3(sc);
            //task4(sc);
            // task5(sc);
            // task6(sc);
            // task7(sc);
            //task8(sc);
            // task9(sc);
            // task10(sc);


            // task321(sc);
            // task322(sc);
            //task323(sc);
            // task324(sc);
            //task325(sc);
            // task326(sc);
        }





}
