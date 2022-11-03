    // Polymorphism with Overriding
public class Person {
    public void can () {
        System.out.println("Can...");
    }
    public void cannot () {
        System.out.println("Can not...");
    }
}

class Kamal extends Person {
    public void can () {
        System.out.println("Kamal can java");
    }
}


class Amal extends Person {
    public void cannot () {
        System.out.println("Amal can not java");
    }
}

class Samal extends Person {
    public void can () {
        System.out.println("Samal can java and python");
    }

    public static void main (String args[ ]){
        Kamal kamal = new Kamal();
        Amal amal = new Amal();
        Samal samal = new Samal();
        kamal.can();
        amal.cannot();
        samal.can();
    }
}

