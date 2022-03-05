class Car {
    private Integer id;
    private String license;
    private Account driver;
    private Integer passegenger;
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
        //this.passegenger=3;
        //System.out.println("passenger:"+ passegenger);
    }
    void printDataCar() {
        if(passegenger!=null){
            System.out.println("License: " + license + " Driver: " + driver.name+ " Passenger"+passegenger);
        }else{
            System.out.println("Debe ingresar pasajeros");
        }
    }
    public Integer getPassenger(){
        return passegenger;
    }
    public void setPassenger(Integer passenger){
        if(passenger==4){
            this.passegenger=passenger;
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }

    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLicense() {
        return license;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public Account getDriver() {
        return driver;
    }
    public void setDriver(Account driver) {
        this.driver = driver;
    }
    
}