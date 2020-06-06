import serviceC.HelloService;
import serviceD.EnglishHelloService;

module D {
    requires C;
        //expunem o implementare o interfetei helloservice
    provides HelloService with EnglishHelloService;
}