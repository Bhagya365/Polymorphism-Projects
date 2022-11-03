    // Polymorphism with Overloading
public class Bhagya {
    Bhagya() {
        System.out.println("Hiii");
    }
    public void display(String name){
        System.out.println("Name : " + name);
    }
    public void display(int age){
        System.out.println("Age : " + age);
    }
    public void display(int day, int month, int year){
        System.out.println("Birthday : " +day+"/" + month +"/"+ year);
    }
    public void display(char symbol){
        for ( int i = 0; i <10; i++) {
            System.out.print(symbol);
        }
    }
    public void display(String x, char y){
        System.out.println(x + y);
    }

    public static void main (String args[ ]){
        Bhagya bhagya = new Bhagya();
        bhagya.display(" Bhagya ");
        bhagya.display(20);
        bhagya.display(23,01,2002);
        bhagya.display('*');
        System.out.println("\n");
        bhagya.display(" Thank you" , '!');
    }
}
