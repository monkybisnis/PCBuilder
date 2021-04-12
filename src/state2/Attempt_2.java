package state2;
// this s my attempt ti do state machine for our project
import javafx.util.Pair;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
*/

enum ClientStates {
    BRONZE_STATE,
    SILVER_STATE,
    GOLD_STATE
}

enum Transition {
    BRONZE_TO_SILVER, BRONZE_TO_GOLD,
    SILVER_TO_GOLD, SILVER_TO_BRONZE,
    GOLD_TO_SILVER, GOLD_TO_BRONZE
}


public class Attempt_2 {
    // this is only temporary file for the gitGub
    private static Map<ClientStates, List<Pair<Transition, ClientStates>>> rules = new HashMap<>();

}
