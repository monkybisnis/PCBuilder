package interceptor;

public class NoCurseInterceptor implements Interceptor {
    @Override
    public String execute(String request) {
        System.out.println("No Curse Interceptor");

        String [] curseWords = {"damn", "feck", "crap"};

        for(int i = 0; i < curseWords.length; i++){
            request = request.replace(curseWords[i], "******") ;
        }
        return request;
    }
}
