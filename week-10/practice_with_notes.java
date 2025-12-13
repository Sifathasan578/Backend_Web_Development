package understanding_spring_core;

public class Main {
    public static void main(String[] args) {
        /* HTTP kivabe behind the scene e kaaz kore?

         How TCP works? (basics)

         byte to object: deserialization
         object to byte code: serialization

         spring core
         fintech er jonno spring use hoy, onek secure

         spring framework vs spring boot: interview question, not a very good i.q.
         highly customized dev er jonno framework use kora hoy

         jvm e memory leak keno hoy?

         IOC container, what is IOC?
         */

        OrderService orderService = new OrderService(new PaymentService());
        orderService.order();

        /*
        // For IOC, framework gets the control and calls my code when needed
        // Don't call us, we will call you

        * in spring,  beans = objects

        bean scopes, 6 types: singleton, prototype: important for now
        what is singleton pattern,

        * */

        /*
        * Spring bean life cycle stages, important and common question
        *
        * Bean collection, definition acquisition
        * Bean creation and instantiation
        * Population bean properties
        * Post initialization
        * Ready to serve
        * Pre-destroy
        * Bean Destroyed 
        * */
    }
}

package understanding_spring_core;

public class OrderService {
    // No IoC
    private final PaymentService paymentService;

    /*public OrderService() {
        paymentService = new PaymentService();
    }*/

    // jodi nah chai new korte:
    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService; // I create the dependency
    }

    public void order() {
        System.out.println("ordering");
        paymentService.pay();
    }
}

package understanding_spring_core;

public class PaymentService {
    public void pay() {
        System.out.println("pay");
    }
}

