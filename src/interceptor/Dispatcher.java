package interceptor;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<Interceptor>();
    private ReviewService target;

    public Dispatcher(ReviewService target){
        this.target = target ;
    }

    public void addInterceptor(Interceptor interceptor){
        interceptors.add(interceptor);
    }

    public void saveReview(String review){
        for (Interceptor interceptor : interceptors) {
            interceptor.execute(review);
        }
        target.saveReview(review);
    }

    public void setTarget(ReviewService target){
        this.target = target;
    }

}
