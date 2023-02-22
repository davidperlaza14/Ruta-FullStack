# Enunciado del ejercicio:

# Escribe una función que pueda decirte si un año (número entero) es bisiesto o no.

def es_bisiesto(anio):
    '''Si el año no es divisible por 4, entonces es un año común. Si el año es divisible por 4, pero no por
    100, entonces es un año bisiesto. Si el año es divisible por 100, pero no por 400, entonces es un
    año común. si el año es divisible por 400 es bisiesto
    
    Parameters
    ----------
    anio
        El año para comprobar.
    
    Returns
    -------
        Verdadero o falso
    
    '''
    
    if anio % 4 != 0:
        return False
    elif anio % 100 != 0:
        return True
    elif anio % 400 != 0:
        return False
    else:
        return True
