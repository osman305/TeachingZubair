public class Overloading {

    public void method(int a){
        System.out.println(a);
    }

    public void method(double a){
        System.out.println(a);
    }

    //Error
//    public void method(int b){
//        System.out.println(b);
//    }

    public void method(int a,int b){
        System.out.println(a +b);
    }

    public static void main(String[] args) {
        Overloading o = new Overloading();
        o.method(5);
        o.method(5,6);
    }
}
