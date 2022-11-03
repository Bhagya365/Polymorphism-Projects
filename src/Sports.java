    // Polymorphism
public class Sports {
        public void display() {
            System.out.println(" Name ");
        }
    }
    class Cricket extends Sports {
        public void display() {
            System.out.println(" Cricket ");
        }
    }
    class Football extends Sports {
        public void display() {
            System.out.println(" Football ");
        }
    }
    class Rugby extends Sports {
        public void display() {
            System.out.println(" Rugby ");
        }
    }
    class Main {
        public static void main (String args[ ]){
            Sports s ;
            s = new Cricket();
            s.display();
            s = new Football();
            s.display();
            s = new Rugby();
            s.display();
        }
}
