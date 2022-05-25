public abstract class Car {

    public abstract String tyres();
    public abstract void gears();
    public abstract void speed();

    public String carDetails(){
        return "basic requirement of cars";
    }
}

  abstract class   SportsCar extends Car{
    public abstract void sppedLimit();
    public abstract void design();

}

 class Maruti extends Car{

    public String tyres(){
        System.out.println("4 tyres");
        return "abc";
    }

    public void gears(){
        System.out.println("5 gears");
    }


     public void speed() {

     }
 }
