package interceptor;

import Components.Part.Part;

import java.util.ArrayList;
import java.util.List;

public class Dispatcher {
    private List<Interceptor> interceptors = new ArrayList<Interceptor>();
    private ReviewService target;

    public Dispatcher(ReviewService target){
        this.target = target ;
    }
    public Dispatcher(){}

    public void addInterceptor(Interceptor interceptor){
        interceptors.add(interceptor);
    }

    public void saveReview(String review){

        for (Interceptor interceptor : interceptors) {
            review = interceptor.execute(review);
            //System.out.println(review);
        }
        target.saveReview(review);
    }

    public void addReview(Part item, String review){

        for (Interceptor interceptor : interceptors) {
            review = interceptor.execute(review);
            //System.out.println(review);
        }
        target.addReview(item, review);
    }

    public void setTarget(ReviewService target){
        this.target = target;
    }

}
