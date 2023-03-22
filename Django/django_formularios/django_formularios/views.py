from django.shortcuts import render
from django.http import HttpResponse
from .forms import CommentForm, ContactForm


def form(request):
  comment_form = CommentForm({'name':'david', 'url':'http://www.openbootcamp.com'})
  return render(request, 'form.html', {'comment_form':comment_form})

def goal(request):
  if request.method != 'POST':
    return HttpResponse('Metodo no permitido')
  
  return HttpResponse(request.POST['comment'])

def widget(request):
  if request.method == 'GET':
    form = ContactForm()
    return render(request, "widget.html",{'form': form} )
  
  if request.method == 'POST':
    form = ContactForm(request.POST)
    if form.is_valid():
      return HttpResponse("Valido")
    else:
      return render(request, "widget.html",{'form': form} )