from django.shortcuts import render
from django.http import HttpResponse
from .models import Reporte, Article
from datetime import date 

def create(request):
  rep = Reporte(first_name='David', last_name = 'Perla', email = "david@perl.com")
  rep.save()
  
  art1 = Article(headline="loremp ipsum dolot\t", pub_date=date(2023,2,7), reporte = rep)
  art1.save()
  art2 = Article(headline="loremp set ainet\t", pub_date=date(2022,3,7), reporte = rep)
  art2.save()
  art3 = Article(headline="dolot aimet lorem\n", pub_date=date(2022,4,9), reporte = rep)
  art3.save()
  
  # result = art1.reporte.first_name
  result = rep.article_set.all()
  
  
  return HttpResponse(result)
