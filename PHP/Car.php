<?php

classCar{
    public $id;
    public $license;
    public $driver;
    public $passengers;
  
    publicfunction__construct($license, $driver){
      $this->license = $license;
      $this->driver = $driver;
    }
  
    publicfunctionPrintDataCar(){
      echo"license: $this->license, conductor: {$this->driver->name}, document: {$this->driver->document}";
    }
  }
  ?>