package interceptor;

public class SentimentInterceptor implements Interceptor {
    @Override
    public String execute(String request) {
        int sentiment = 0;
        //System.out.println("No Curse Interceptor");

        String [] goodWords = {"good", "fine", "execellent"};
        String [] badWords = {"poor", "useless", "pointless"};

        for(int i = 0; i < goodWords.length; i++){
            if(request.contains(goodWords[i])) {
                  sentiment++;
            }
        }
        for(int i = 0; i < badWords.length; i++){
            if(request.contains(badWords[i])){
                sentiment--;
            }
        }
        System.out.println("Sentiment "+ sentiment);
        return request;
    }
}
