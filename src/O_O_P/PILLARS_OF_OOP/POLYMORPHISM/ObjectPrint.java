package O_O_P.PILLARS_OF_OOP.POLYMORPHISM;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num){
        this.num = num;

    }

    @Override
    public String toString(){
        return "ObjectPrint{" + "num=" +num+'}';

    }



    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(44);

        System.out.println(obj);
    }

}
