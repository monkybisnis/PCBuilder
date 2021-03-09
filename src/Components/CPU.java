package Components;

import PCBuilder.Component;

import java.util.ArrayList;
import java.util.List;

public class CPU implements PC {
    private List<CPU> CPUs;

    public CPU() {
        this.CPUs = new ArrayList<CPU>();
    }
}