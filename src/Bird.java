public interface Bird {

    public void birdSound();
    public void birdColur();
}

 interface Animal extends Bird{
    public void wings();
}

class Pegion implements Bird,Animal {

    @Override
    public void birdSound() {
        System.out.println("Gutur goon");
    }

    @Override
    public void birdColur() {
        System.out.println("white");
    }

    @Override
    public void wings() {

    }
}

