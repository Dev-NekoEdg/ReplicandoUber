from account import Account
from car import Car

class Driver(Account):

    car = Car("","")

    def __init__(self,name, document, car):
        super().__init__(name, document)
        self.car = car


