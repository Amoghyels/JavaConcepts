package O_O_P.PILLARS_OF_OOP.INHERITANCE;

public class BOX_PRICE extends BOX_WEIGHT_INHERIT{

    double cost;

    BOX_PRICE() {
        super();
        this.cost = -1;
    }

    BOX_PRICE(BOX_PRICE other){
        super(other);
        this.cost = other.cost;
    }

    public BOX_PRICE(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }
}
