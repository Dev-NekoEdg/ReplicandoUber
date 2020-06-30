<?php 
class Cash extends Payment{

    public $currency;

    public function __construct($currency)
    {
        $this->currency = $currency;
    }
}

?>