from car import Car

class UberX(Car):
    model = str
    brand = str

    def __init__(self, license, driver, model, brand):
        super(UberX, self).__init__(license, driver)
        self.model = model
        self.brand = brand



