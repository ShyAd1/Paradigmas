
dividendo = int(input("Ingrese el numero a dividir: "))
divisor = int(input("Ingrese el numero que dividira: "))
if divisor == 0:
    print("No se puede divir entre 0")
    divisor = int(input("Ingrese el numero que dividira: "))
    
aux = 0
aux = dividendo
cuenta = 0.0

def contador():
    global cuenta
    cuenta += 1.0


while dividendo >= 0:
    dividendo = dividendo - divisor
    if dividendo >= divisor or dividendo >= 0:
        contador()
    else:
        break

print("La division por restas sucesivas de ", aux, "entre ", divisor, "es: ", cuenta)