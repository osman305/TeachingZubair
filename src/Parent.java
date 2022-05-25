/*
runtime Polymorphism example
 */


class Parent {

    // Method of parent class
    void Print()
    {
        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class Child1 extends Parent {

    // Method
    void Print() { System.out.println("child class"); }

    

}

// Class 3
// Helper class
class Child2 extends Parent {

    // Method
    void Print(int a)
    {

        // Print statement
        System.out.println("Child 2");
    }
}

// Class 4
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {

        /*
        pp
        pc
        cc
        but not
        cp
         */


        // Creating object of class 1


        // Now we will be calling print methods
        // inside main() method

       Parent a = new Child1();
        a.Print();

       Parent b = new Child2();
        b.Print();

    }
}
