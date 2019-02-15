
public class TruckWeek4Practice  extends VehicleWeek4Practice{
    private int tow;

    public int getTow() {
        return tow;
    }

    public void setTow(int tow) {
        this.tow = tow;
    }

    @Override
    public String honk() {
        return "BIG BEEP";
    }
}
