package ge.edu.btu.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloService {
    @WebMethod
    public String sayHallo() {
        return "hello world";
    }

    @WebMethod
    public int good(int a) {
        return a;
    }
}
