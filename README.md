# DesafioAbstraindoBootcampPOO
A idéia deste desafio é abstrair um Bootcamp usando os princípios da POO (Programação Orientada a Objetos) utilizando a linguagem Java.

## Sobre o código

O código possui seis classes ao todo, sendo uma delas uma classe Main e outra uma classe abstrata.

## Classe Conteudo

Sobre a classe abstrata Conteudo, ela contém os requisitos titulo e descrição, para assim as classes Curso e Mentoriam poderem herdar esses atributos, também há o método abstrato calcularXP e um atributo final chamado XP_PADRAO.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Conteudo.java)

## Classes Curso e Mentoria

Essas duas classes herdam os requisitos da classe conteúdo e adicionam suas próprias atribuições. A classe Curso adiciona o atributo carga horária, e por sua vez sobresvreve o método calcularXP retornando o valor do XP_PADRAO multiplicado pela carga horária.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Curso.java)

Já a classe Mentoria adiciona os atributos de data determinada para ela bem como tembém sobresvreve o método calcularXP, retornando o valor do XP_PADRAO mais 20.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Mentoria.java)

## Classe Dev

A classe Dev tem os atributos nome, e utiliza do LinkedHashSet para listar tanto os conteudos inscritos quanto os concluidos pelo dev em algum determinado bootcamp. Há também o método para se inscrever e progredir no bootcamp, fazendo por fim a somatória do XP que ele acumular ao realiza os cursos.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Bootcamp.java)

## Classe Bootcamp

A classe Bootcamp contém os atributos nome, descricao, data de início e data final do bootcamp. Também contém uma lista do tipo HashSet com os devs que estão inscritos nele e uma lista do tipo LinkedHashSet que contém os conteúdos do bootcamp, sendo eles os cursos e as mentorias.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Bootcamp.java)

## Classe Main

Por fim, na classe Main temos alguns valores atribuidos as classes para demonstrar o funcionamento do algoritmo.

[Visualizar código](https://github.com/Diogo-Javax888/DesafioAbstraindoBootcampPOO/blob/main/src/main/java/org/example/Main.java)
