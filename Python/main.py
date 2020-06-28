from car import Car
from account import Account

if __name__ == "__main__":
    print("Hola mundo en python")
    car = Car("ABC123", Account("Andres Res", "DEF456"))
    print(vars(car))
    print(vars(car.driver))

    
    #Comentario simple
    """ Comentario Complejo """
    """
    #antigua inicializacion
    car = Car()
    car.license = "AMB747"
    car.driver = "Salem Miaunster"
    car.passengers = 3
    print(vars(car))

    carTwo = Car()
    carTwo.license = "ZSD789"
    carTwo.driver = "Pandora Miaunster"
    carTwo.passengers = 5
    print(vars(carTwo))
    """
