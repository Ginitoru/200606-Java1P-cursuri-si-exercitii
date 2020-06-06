module A {
        //modulu a declara ca are nevoie de java.base
    requires java.base;
    //expunem toate clasele bublice din pachetul service
    exports service;
}