import payment from Payment

class Cash:
    currency = str

    def __init__(self, currency):
        super().__init__()
        self.currency = currency
