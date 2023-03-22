from django.shortcuts import render
from django.http import HttpResponse
from .models import Place, Restaurante



def create(request):
  place  = Place(name="<h1>Lugar 1</h1>", address="Calle Demo")
  place.save()
  
  restaurante = Restaurante(place=place, number_of_employees = 8)
  restaurante.save()
  
  return HttpResponse(restaurante.place.name)