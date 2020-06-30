
from car import Car

class UberPool(Car):
    model = str
    brand = str

    def __init__(self, license, driver, model, brand):
        super(UberPool, self).__init__(license, driver)
        self.model = model
        self.brand = brand

