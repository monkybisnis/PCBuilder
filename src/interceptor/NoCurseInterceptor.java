package interceptor;

public class NoCurseInterceptor implements Interceptor {
    @Override
    public boolean execute(String request) {
        System.out.println("No Curse Interceptor");

        String [] curseWords = {"damn", "feck", "crap"};

        for(int i = 0; i < curseWords.length; i++){
            if(request.equalsIgnoreCase(curseWords[i])){
                System.out.println("Invalid review");
                return false;
            }
        }
        return true;
    }
}
