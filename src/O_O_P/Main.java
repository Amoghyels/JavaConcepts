package O_O_P;

public class Main {
    public static void main(String[] args) {
     /*   Human kunal = new Human(22,"Kunal",10000,false);
        Human rahul = new Human(43,"rahul",20000,true);
        Human arpit = new Human(66,"Arpit",60000,true);


        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);*/


    }
    // this is not dependent on objects
    static void fun(){
       // greeting();

        //you cannot accesss non static stuff without referncing their instances
        // in a static context
        //hence, here it is referenced
        Main obj = new Main();
        obj.greeting();
    }



   //we know that something which is not static, belongs to an object
    void greeting(){
        System.out.println("Hello world");
    }


}


