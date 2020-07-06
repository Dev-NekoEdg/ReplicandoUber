

class User extends Account{

    String name;
    String document;
    String nickname;
    String password;

    public User(String name, String document, String nickname, String password) {
        super(name, document);
        this.nickname = nickname;
        this.password = password;
    }

}
