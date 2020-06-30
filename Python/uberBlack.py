
from car import Car

class UberBlack(Car):
    typeCarAccepted = []
    seatMaterial = []

    def __init__(self, license, driver, typeCarAccepted, seatMaterial):
        super(UberBlack, self).__init__(license, driver)
        self.typeCarAccepted = typeCarAccepted
        self.seatMaterial = seatMaterial

