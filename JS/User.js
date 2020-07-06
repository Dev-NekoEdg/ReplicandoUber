class User extends Account{

    constructor(name, document, nickname, password){
        super(name, document);
        this.nickname = nickname;
        this.password = password;
    }
}