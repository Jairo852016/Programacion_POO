from car import Car
from account import Account


if __name__ == "__main__":
    print("Hola Mundo")
    car=Car("ASD3443", Account("Andres","adf445"))
    print(vars(car))
    print(vars(car.driver))