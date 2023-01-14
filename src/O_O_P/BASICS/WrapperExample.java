package O_O_P.BASICS;

public class WrapperExample {
    public static void main(String[] args) {
     /*   Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);

        final int bonus = 2; */
        final A amogh = new A("Vector");
        amogh.name = "Other name";
        //When a non primitive is final you cannot reassign it


    }

    static void swap(Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }


}

class A {
    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
    }

}
