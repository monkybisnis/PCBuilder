package PCBuilder;

public class Cooling extends Component {

    //data fields
    private double fanStrength;

    public Cooling(){

    }

    public Cooling(double fanStrength){
        this.fanStrength = fanStrength;
    }

    public double getFanStrength(){
        return fanStrength;
    }

}
