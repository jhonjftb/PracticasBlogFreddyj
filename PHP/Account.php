<?php

classAccount{
    public $id;
    public $name;
    public $document;
    public $email;
    public $password;
  
    publicfunction__construct($name, $document){
      $this->name = $name;
      $this->document = $document;
    }
  }


