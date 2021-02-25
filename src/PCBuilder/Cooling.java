package PCBuilder;

public class Cooling extends Component {

    //data fields
    private double fanStrength;

    public Cooling(String serial, double height, double width, double length, double price) {
        super(serial, height, width, length, price);
    }

    public double getFanStrength(){
        return fanStrength;
    }

    public void setFanStrength(double fanStrength){
        this.fanStrength = fanStrength;
    }

}
