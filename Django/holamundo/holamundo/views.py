from django.http import HttpResponse

def saludo(request):
  return HttpResponse('<h1> Hola Mundo</h1>')

def despedida(request):
  return HttpResponse('<h1> Hasta luego</h1>')

def adulto(request, edad):
  if edad >= 18:
    return HttpResponse('Eres mayor de eddad')
  else:
    return HttpResponse('No eres mayor de eddad')