from django.shortcuts import render
from django.http import HttpResponse
from .models import Comment

def test(request):
  return HttpResponse("<h1>Funciona correctamente</h1>")

def create(request):
  # comment = Comment(name = 'David', score=7, comment="Este es un comentario")
  # comment.save()
  comment= Comment.objects.create(name="Ivan")
  return HttpResponse("<h1>Funciona tambien</h1>")

def delete(request):
  # comment = Comment.objects.get(id=1)
  # comment.delete()
  Comment.objects.filter(id=2).delete()
  return HttpResponse("Ruta para borrar")