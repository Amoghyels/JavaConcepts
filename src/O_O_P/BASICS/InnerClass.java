package O_O_P.BASICS;

public class InnerClass {
    static class test{
        String name;

        public test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){
        test a = new test("Amogh");
        test b = new test("rahul");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
