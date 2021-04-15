package interceptor;

import discount.Customer;
import loginService.LoginService;

public class TestReview {
    public static void main(String[]args){
        Customer c = LoginService.login("joe", "1234");
        ReviewService rs = new ReviewService();

        Dispatcher dispatcher = new Dispatcher(rs);
        Interceptor noCurse = new NoCurseInterceptor();
        dispatcher.addInterceptor(noCurse);

        dispatcher.saveReview("Nice product");
    }
}
