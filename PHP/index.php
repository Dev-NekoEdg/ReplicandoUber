<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');


$uberX= new UberX("DBZ743", new Account("Andres Herrera","AND123"), "Ford", "Fiesta");
$uberX->printDataCar();

//echo("Hola mundo");


?>