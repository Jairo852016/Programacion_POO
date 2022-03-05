class Main {
   public static void main(String[] args) {
       System.out.println("hola mundo");
       UberX uberX= new UberX("AMQ123", new Account("ANDRES","QWE233"),"Chevrolet","Sonic");
       //uberX.passegenger=3;
       uberX.setPassenger(4);
       uberX.printDataCar();
       UberVan uberVan= new UberVan("ASDFSdf", new Account("Andres ", "asdeee"));
       uberVan.setPassenger(6);
       uberVan.printDataCar();
     
   }
}