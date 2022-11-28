import java.util.Scanner;

public class Switchnested {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("amogh");
                break;
            case 2:
                System.out.println("vikas");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT dept");
                        break;

                    case "Management":
                        System.out.println("Management Dept");
                        break;

                    default:
                        System.out.println("No dept");

                }
                break;
            default:
                System.out.println("Enter correct EmpID");
                break;
        }




        }



}

