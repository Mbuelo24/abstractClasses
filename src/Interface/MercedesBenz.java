public class MercedesBenz implements Car{

    @Override
    public void Start() {
        System.out.println("Mercedes Started");
    }

    @Override
    public void Stop() {
        System.out.println("Mercedes Stopped");

    }

    @Override
    public void SlowDown() {
        System.out.println("Mercedes Slowing Down");

    }

    @Override
    public void Fuel() {
        System.out.println("Mercedes out of Fuel");

    }
    public void Safety(){
        System.out.println("Put on your sit belt");
    }
}

