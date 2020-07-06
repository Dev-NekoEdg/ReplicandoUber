<?php 

require_once('car.php');
require_once('account.php');

class Driver extends Account{

    public $car;

    public function __construct($name, $document, $car)
    {
        parent::__construct($name, $document);
        $this->car = $car;
    }

}

?>