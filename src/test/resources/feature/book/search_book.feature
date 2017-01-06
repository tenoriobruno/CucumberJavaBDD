#language:pt
@Book
Funcionalidade: Pesquisa de livro
  Para permitir que um cliente encontre seus livros favoritos rapidamente, a biblioteca deve oferecer várias maneiras de procurar um livro.
 
  Cenario: Pesquisar livros por ano de publicação
    Dado um livro com o título 'Um bom livro', escrito por 'Qualquer autor', publicado em 14 Março 2013
      E  um livro com o título 'Algum outro livro', escrito por 'João Damião', publicado em 23 Dezembro 2014
      E  um livro com o título 'Como cozinhar um dino', escrito por 'Fred Flintstone', publicado em 01 Maio 2012
    Quando o cliente procura por livros publicados entre 2013 e 2014
    Então 2 livros deveriam ter sido encontrados
      E o livro 1 deve ter o título 'Algum outro livro'
      E o livro 2 deve ter o título 'Um bom livro'