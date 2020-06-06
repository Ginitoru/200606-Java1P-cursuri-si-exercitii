import serviceC.HelloService;

module E {
    requires C;
    //modulul E cauta imlementari alre interfetei hello service
    uses HelloService;
}