package interceptor;

import loginService.LoginService;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class ReviewService {

    public void saveReview(String review){
        String name = LoginService.currentCustomer.getName();
        FileOutputStream f = null;
        try {
             f = new FileOutputStream("data/" + name + ".review",true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        PrintWriter p = new PrintWriter(f);
        p.println(review);
        p.close();
    }
}
