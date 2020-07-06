from account import Account

class User(Account):
    nickname = str
    password = str

    def __init__(self, name, document, nickname, password):
        super(User, self).__init__(name, document)
        self.nickname = nickname
        self.password = password
