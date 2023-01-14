package O_O_P.PILLARS_OF_OOP.INHERITANCE;

public class BOX_MAIN {
    public static void main(String[] args) {
        Inheritance_BOX Box = new Inheritance_BOX();

        System.out.println(Box.h + " " +Box.w+ " "+Box.w );

        /*BOX_WEIGHT_INHERIT box1 = new BOX_WEIGHT_INHERIT();
        BOX_WEIGHT_INHERIT box3 = new BOX_WEIGHT_INHERIT(2,3,4,8);
        System.out.println(box1.h + " " +box1.weight);*/

        Inheritance_BOX box5 = new BOX_WEIGHT_INHERIT(4,5,6,7);
        System.out.println(box5);

        //there are many vairables in both parent and child classes
        //you are given access to variables that are in the ref type i.e. Boxweight
        //Hence, you should have access to weight variable
        //This also means, that the ones you are trying to access be initialised
        //but here, when the object itself is of type parent class, how will you call the constructor of child class
        //this is why error

        /*BOX_PRICE box = new BOX_PRICE(2, 8,4,5,7);

         */
        Box.greeting();//you can inherit but you cannot ovveride










    }
}
