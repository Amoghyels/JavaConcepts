package O_O_P;

//this is demo to show initialisation of static variables
public class StaticInit {
    static int a = 4;
    static int b;

    static {
        System.out.println("i am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticInit obj = new StaticInit();
        System.out.println(StaticInit.a+" "+StaticInit.b);

        StaticInit.b += 3;

        StaticInit obj2 = new StaticInit();
        System.out.println(StaticInit.a + " "+ StaticInit.b);
    }

}
