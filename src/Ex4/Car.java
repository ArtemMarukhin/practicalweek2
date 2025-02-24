package Ex4;

public class Car {
    String carModel;

    public Car(String carModel) {
        this.carModel = carModel;
    }

    class Engine {
        boolean isWorking = false;
        int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        String startStopEngine (){
            if (this.isWorking == true) {
                isWorking = false;
                return "engine was stopped";
            }
            else{
                isWorking = true;
                return "engine was started";
            }
        }
    }
}
