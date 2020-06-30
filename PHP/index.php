<?php
require_once('car.php');
require_once('uberX.php');
require_once('account.php');
require_once('uberPool.php');


$uberX= new UberX("DBZ743", new Account("Andres Herrera","AND123"), "Ford", "Fiesta");
$uberX->printDataCar();
$uberpool= new UberPool("DBZ743", new Account("nombre apellido","ABC456"), "Chevrolet", "Van");
$uberpool->printDataCar();
?>