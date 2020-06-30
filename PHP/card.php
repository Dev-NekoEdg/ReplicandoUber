<?php
class Card extends Payment{
    public $cardNumber;
    public $cardHolder;
    public $dateExp;
    public $ccv;

    public function __construct($cardNumber, $cardHolder, $dateExp, $ccv)
    {
        $this->cardNumber = $cardNumber;
        $this->cardHolder = $cardHolder;
        $this->dateExp = $dateExp;
        $this->ccv = $ccv;
    }
}
