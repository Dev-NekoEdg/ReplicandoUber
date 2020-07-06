<?php

require_once('account.php');

class User extends Account{

    public $nickname;
    public $password;

    public function __construct($name, $document, $nickname, $password)
    {
        parent::__construct($name, $document);
        $this->nickname = $nickname;
        $this->password = $password;
    }

} 

?>