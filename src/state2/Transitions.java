package state2;

import java.lang.reflect.Array;
enum Transiti {
    BRONZE_TO_SILVER, BRONZE_TO_GOLD,
    SILVER_TO_GOLD, SILVER_TO_BRONZE,
    GOLD_TO_SILVER, GOLD_TO_BRONZE
}

public class Transitions {
    private final String Transiti;
    // Transitions
    private String transitionName;
    private Array possibleTransition;

    public Transitions(String transitionName) {
        this.transitionName = transitionName;
        possibleTransition =["BRONZE_TO_SILVER", "BRONZE_TO_GOLD",
                SILVER_TO_GOLD, SILVER_TO_BRONZE,
                GOLD_TO_SILVER, GOLD_TO_BRONZE, Transiti ]
    }
    /*
    #
     */
    private Transitions(String transitionName, Array possibleTransition) {
        this.transitionName = transitionName;
        this.possibleTransition = possibleTransition;
    }

    public Transitions generateBasicState(String transitionName, Array possibleTransition){
        return new Transitions(transitionName, possibleTransition);
    }
}
