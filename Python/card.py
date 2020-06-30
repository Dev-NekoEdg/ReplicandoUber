import payment from payment

class Card(Payment):

    cardNumber = str
    cardHolder = str
    dateExp = str
    ccv = str

    def __init__(self, cardNumber, cardHolder, dateExp, ccv):
        super().__init__()
        self.cardNumber = cardNumber
        self.cardHolder = cardHolder
        self.dateExp = dateExp
        self.ccv = ccv

