package interceptor;

public class NoCurseInterceptor implements Interceptor {
    @Override
    public boolean execute(String request) {
        System.out.println("No Curse Interceptor");
        return true;
    }
}
