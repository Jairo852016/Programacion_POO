<?php
require_once('car.php');
class UberX extends Car {
    public $brand;
    public $model;
    protected $passenger;

    public function __construct($license, $driver, $brand, $model){
        parent::__construct($license,$driver);
        $this->brand = $brand;
        $this->model = $model;
    }
    public function setPassenger($passenger){
        if($passenger == 6){
            $this->passenger=$passenger;
        }
        else{
            echo "Necesita asignar 6 pasajeros";
        }
    }
    public function printDataCar(){
        parent::printDataCar();
        echo "
        Marca: $this->brand 
        Modelo: $this->model
                
       
        ";
    }


}
?>