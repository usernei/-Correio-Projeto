#language:pt
#Author: your.email@your.domain.com

@buscaCep
Funcionalidade: Busca endereco ou cp
Como usuario do site do correios
Quero buscar endereco por cep ou dados do endereco
Para obter informacao referente aos consultado

Cenario: Buscar endereco po cp
Dado que informe um cp valido
Quando enviado o cp 
Entao valido os dados de endereco
E retorno a tela para pesquisar pelo endereco
