package O_O_P.PILLARS_OF_OOP.INHERITANCE;

public class Inheritance_BOX {
    //Here the Class name is Inheritance
    //But the Example is BOX length, height, width
    double l;
    double h;
    double w;

    static void greeting(){
        System.out.println("Hey, Iam in box.hello");
    }

    Inheritance_BOX(){
        this.h = -1;
        this.l = -1;
        this.w = -1;

    }

    //cube
    Inheritance_BOX(double side){
        this.w = side;
        this.l = side;
        this.h = side;
    }

    Inheritance_BOX(Inheritance_BOX old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public Inheritance_BOX(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }


    public void information(){
        System.out.println("Running the Box");

    }


}
