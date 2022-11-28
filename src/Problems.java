import java.sql.SQLOutput;
import java.util.Scanner;
import java.lang.Math.*;

public class Problems {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

      /*  System.out.println("Enter the Radius: "); AREA OF CIRCLE
        int r = in.nextInt();

        System.out.println("Enter the value of pi ");
        double pi = in.nextFloat();

        float A;
        System.out.println("The Area of Circle is ");
        System.out.println(  r*r + pi ); */

/////////////////////////////////////////////////////////////////////////////


        /*  System.out.println("Enter the Height: ");  AREA OF TRIANGLE
        int h = in.nextInt();

        System.out.println("Enter the base: ");
        int b = in.nextInt();

        System.out.println("The area of Triangle is: ");
        System.out.println(h*b/2); */

        ///////////////////////////////////////////////////////////////////////////////////

        /*System.out.println("Enter the D1: "); AREA OF ROHUMBUS
        int D1 = in.nextInt();

        System.out.println("Enter the D2: ");
        int D2 = in.nextInt();

        System.out.println("The area of Rohumbus is: ");
        System.out.println(D1*D2*1/2); */


///////////////////////////////////////////////////////////////////////////////////////


        /*System.out.println("Enter the Value of a: "); AREA OF EQUILATERAL TRIANGLE
        int a = in.nextInt();

        System.out.println("The area of equilateral triangle is: ");
        System.out.println(Math.sqrt(3)/4 * a*a);*/


//////////////////////////////////////////////////////////////////////////////////////


      /*  System.out.println("Enter r: "); PERIMETER OF CIRCLE
        int r = in.nextInt();

        System.out.println("The perimeter of Circle is: ");
        System.out.println(2 * 3.14 * r); */


        //double r;
        //double h;
        //double v;

       /* System.out.println("Enter the value of r: ");
        r = in.nextDouble();

        System.out.println("Enter the value of h: ");
        h = in.nextDouble();

        v = 3.14 * r*r*h/3;
        System.out.println("The volume is: "+v);*/

        /////////////////////////////////////////////////////////////////////////////////

        /*  System.out.println("Enter a number: ");
        int num;
        int i = 2;                            ///////////////////FACTORS OF A NUMBER
        System.out.println("Enter a number: ");
        num = in.nextInt();

        System.out.println("The factors of" + num+ " are");

        for(i = 1; i<=num; i++){
            if(num % i == 0)
                System.out.println(i + " ");

            }
        }*/
//////////////////////////////////////////////////////////////////////////////////////
        //LEETCODE PROBLEM = SUBTRACT THE PRODUCT AND SUM OF DIGITS OF AN INTEGER//

       /* int sum = 0, product = 1;
        int n = in.nextInt();

        while (n > 0) {
            sum += n % 10;
            product *= n % 10;
            n /= 10;
        }
        System.out.println(product - sum);*/

///////////////////////////////////////////////////////////////////////////////////////


     /*   int sum = 0;
        int number;

        do {
            System.out.println("Enter a number: "); ///////SUM OF NUMBERS/////]]
            number = in.nextInt();

            sum += number;
        }while(number != 0);{
            System.out.println("Sum of entered numbers is: " + sum);
        }*/
////////////////////////////////////////////////////////////////////////////////////////


     /*   int num = 10;
        long factorial = 1;              //////fFACTORIA\\\\\\
        for(int i = 1; i<=num; i++){
            //factorial = factorial * i
            factorial *= i;
        }
        System.out.printf("Factorial of %d=%d", num,factorial);*/

/////////////////////////////////////////////////////////////////////////////////////

     /*   System.out.println("Enter the numbers: ");
        int n = in.nextInt();
        int sum = 0;
        double avg = 0;
        for(int i = 0; i<=n;i++){    /////////SUM AND AVERAGE OF N NUMBERS\\\\\\\\
            sum = sum + i;
            avg = sum/n;


        }
        System.out.println(sum);
        System.out.println(avg);
        */
//////////////////////////////////////////////////////////////////////////////////////////////////

     /*   int units;

        double billtopay = 0;    //////////CALCULATE ELECTRICTY BILL////////

        units = in.nextInt();

        if(units<100){
            billtopay = units*1.20;

        }

        else if(units<300){
            billtopay = 100*1.20+(units-100)*2;

        }

        else if(units>300)
        {
            billtopay = 100*1.20+200*2+(units-300)*3;

        }
        System.out.println("The electricity bill for"+units+"is:"+billtopay);*/


//////////////////////////////////////////////////////////////////////////////////////////////

      /*  int LP;
        double d;
        int SP;           /////////////CALCULATE DISCOUNT////

        int DP;

        System.out.println("Enter the list price: ");
        LP = in.nextInt();

        System.out.println("Enter the Selling price: ");
        SP = in.nextInt();

        d = LP - SP;
        System.out.println("The disocunt is: "+d);

        DP = ((LP-SP)/LP) * 100;
        System.out.println("The discount percentage is: "+DP);*/
/////////////////////////////////////////////////////////////////////////////////////////////

       /* int x1,x2,y1,y2;
        double dis;
        System.out.println("Enter x1: ");  ///////////DISTANCE BETWEEN TWO POINTS\\\\\\
        x1 = in.nextInt();

        System.out.println("Enter x2: ");
        x2 = in.nextInt();

        System.out.println("Enter y1: ");
        y1 = in.nextInt();

        System.out.println("Enter y2: ");
        y2 = in.nextInt();

        System.out.println();

        dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("The distance between two points are: "+ dis); */


/////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /*System.out.println("Enter the amount: ");
        double amount = in.nextDouble();           //////////////COMMISSION PERCENTAGE/////////

        System.out.println("Enter Commission Percentage: ");
        double commissionPercentage = in.nextDouble();

        double commission = (commissionPercentage / 100) * amount;
        System.out.println("Commission amount =" + commission);*/

///////////////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////POWER IN JAVA\\\\\\\\/////SQUARE OF A NUMBER OR ANY NUMBER\\\\\\\\\


     /*   double a = 5;
        double b = 2;

        System.out.println(Math.pow(a, b)); */

//////////////////////////////////////////////////////////////////////////////////////////////////
        ///////////////CALCULATE DEPRICATION RATE\\\\\\\\\\\\\\\\\\\\\\\\

     /*   long amount, deppercent,year,afterdep,temp;
        System.out.println("Enter your amount: ");
        amount = in.nextLong();

        System.out.println("Enter depreciation percentage: ");
        deppercent = in.nextLong();

        System.out.println("Enter the number of years: ");
        year = in.nextLong();

        temp = amount;
        for(int i = 0; i<=year;i++)
            temp=((100-deppercent)*temp)/100;
        System.out.println("After depreciation = "+temp);*/

////////////////////////////////////////////////////////////////////////////////////////////


      /*  long Matches,runs,innings,notout;  ///////////BATTING AVERAGE/////////////

     double avg;

     Scanner sc=new Scanner(System.in);

     System.out.println("enter the number of matches played");

     Matches=sc.nextLong();

     while(true)
     {
        System.out.println("enter the number innings batted");

        innings=sc.nextLong();

        if(innings<=Matches)
        break;

        System.out.println("enter the number innings batted correctly <=matches");

     }


    while(true)
    {

      System.out.println("enter number of times notout");

      notout=sc.nextLong();

      if(notout<=innings)
       break;

      System.out.println("enter the number times became notout correctly <=innings");
     }

     System.out.println("enter runs scored");

     runs=sc.nextLong();

     if(innings==notout)
     avg=runs;
     else
     avg=runs/(innings-notout);

     System.out.println("batting average="+avg);  */

////////////////////////////////////////////////////////////////////////////////////////////////////

/*   int n = 5;

   double m[] = new double[n];
   double g[] = new double[n];
   double cgpa,sum = 0;

   m[0] = 95;
   m[1] = 85;
   m[2] = 75;
   m[3] = 80;
   m[4] = 95;

   for(int i = 0; i<n;i++){
       g[i] = (m[i]/10);
   }

   for(int i = 0;i<n;i++){
       sum+=g[i];
   }

   cgpa = sum/n;

        System.out.println("CGPA="+cgpa);
        System.out.println("Percentage from cgpa="+cgpa*9.5);
         */
///////////////////////////////////////////////////////////////////////////////////////////

    //double Amount;
  /*  double Principal; //////////////////COMPOUND INTEREST//////////////
    double Rate;
    double Time;
    int number;

    Principal = in.nextDouble();
    Rate = in.nextDouble();
    Time = in.nextDouble();
    number = in.nextInt();


    double interest = Principal*(Math.pow((1+Rate/100), (Time*number)));





        System.out.println("Principal: " + Principal);
        System.out.println("Interest Rate: " + Rate);
        System.out.println("Time Duration: " + Time);
        System.out.println("Number of Time interest Compounded: " + number);
        System.out.println("Compound Interest: " + interest); */

////////////////////////////////////////////////////////////////////////////////////////////////////////////

       /* int i;
        System.out.println("Enter the number of subjects");

        int n = in.nextInt();
        int[] a = new int[n];

        double avg = 0;
        System.out.println("Enter marks");

        for(i=0;i<n;i++)
        {
            a[i] = in.nextInt();
        }

        for(i=0;i<n;i++)
        {
            avg = avg+a[i];

        }

        System.out.println("Average of(");

        for(i=0;i<n-1;i++)
        {
            System.out.println(a[i]+",");
        }
        System.out.println(a[i]+")="+avg/n); */

/////////////////////////////////////////////////////////////////////////

       ////////ARMSTRONG NUMBER WHILE LOOP\\\\\\\\\\\\\\\


    /*    int n = in.nextInt();

        int sum = 0, temp = n;
        int r;

        while (n>0){
            r = n%10;
            n = n/10;
            sum = sum + r*r*r;


        }

        if(temp == sum)
            System.out.println("Its a Armstrong number!");
        else
            System.out.println("Its not an armstrong number");

     */
///////////////////////////////////////////////////////////////////////////////









        }

    }










































