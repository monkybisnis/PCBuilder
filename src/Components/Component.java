package Components;

public interface Component  {
    String printDetails();
    void add(Object c);
    void remove(Object c);
    int size();
    Object extract(int x);
}