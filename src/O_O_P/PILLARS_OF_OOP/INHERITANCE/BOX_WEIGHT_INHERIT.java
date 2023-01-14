package O_O_P.PILLARS_OF_OOP.INHERITANCE;

public class BOX_WEIGHT_INHERIT extends Inheritance_BOX{
    double weight;

    public BOX_WEIGHT_INHERIT(){
        this.weight = -1;
    }

    BOX_WEIGHT_INHERIT (BOX_WEIGHT_INHERIT other){
        super(other);
        weight = other.weight;
    }

    BOX_WEIGHT_INHERIT(double side, double weight){
        super(side);
        this.weight = weight ;
    }

    public BOX_WEIGHT_INHERIT(double l, double h, double w, double weight){
        super(l, h, w); // call the parent class constructor
        //used to initialise values present in parent class

        this.weight = weight;

    }


}
