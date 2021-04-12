package state2;


public class Transition {

    // Transitions
    private String transitionName;
    private TransitionEnum[] possibleTransition;

    /**
     @ trtransitionName is name what is good chance to be removed TODO: Test for using only possibleTransition as evaulation point
     @ possibleTransitions: Array list with all possible Transition
     */
    public Transition(String transitionName) {
        this.transitionName = transitionName;
        this.possibleTransition = TransitionEnum.values();
    }
}
