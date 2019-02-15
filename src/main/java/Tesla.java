public class Tesla {

    String make;
    String model;
    int MSRP;
    int Range;
    int horsePower;
    int weight;
    int batteryCharge;

    String printCar(){

        return "Make: " + make + "  Model: " + model + "  MSRP: " + MSRP + "  Range: " + Range + "  Horsepower: " + horsePower + "  Weight: " + weight + "  Battery Charge: " + batteryCharge;
    }


    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMSRP() {
        return MSRP;
    }

    public void setMSRP(int MSRP) {
        this.MSRP = MSRP;
    }

    public int getRange() {
        return Range;
    }

    public void setRange(int range) {
        Range = range;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }



}
