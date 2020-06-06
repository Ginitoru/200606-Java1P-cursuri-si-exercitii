package mainE;

import serviceC.HelloService;

import java.util.ServiceLoader;

public class MainE {
    public static void main(String[] args) {
        ServiceLoader<HelloService> services = ServiceLoader.load(HelloService.class);

                    services.stream()
                            .map(provider -> provider.get())
                            .forEach(helloService -> helloService.sayHello());
    }
}
