\# ☕ Projeto Template Method — Java



\## 📌 Sobre o projeto



Este projeto foi desenvolvido em Java com o objetivo de demonstrar a aplicação do padrão de projeto comportamental \*\*Template Method\*\*, pertencente aos padrões GoF (Gang of Four).



O sistema simula o preparo de diferentes bebidas, como café e chá, utilizando uma estrutura padronizada para executar as etapas de preparação.



\## 🎯 Objetivo



Demonstrar como o padrão Template Method permite definir a estrutura de um algoritmo em uma classe abstrata, deixando determinadas etapas para serem implementadas pelas subclasses.



\## 🛠️ Tecnologias utilizadas



\- Java

\- Eclipse IDE

\- Programação Orientada a Objetos (POO)

\- Padrão de Projeto Template Method



\## 📂 Estrutura do projeto



```text

TemplateMethod/

├── src/

│   └── templatemethod/

│       ├── Bebida.java

│       ├── Cafe.java

│       ├── Cha.java

│       └── Main.java

├── .classpath

├── .project

├── .gitignore

└── README.md

```



\## ⚙️ Funcionamento



O sistema possui uma classe abstrata chamada `Bebida`, responsável por definir a sequência de preparação.



O método `prepararBebida()` executa quatro etapas:



1\. Ferver a água.

2\. Adicionar o ingrediente principal.

3\. Colocar a bebida na xícara.

4\. Adicionar os complementos.



As classes `Cafe` e `Cha` herdam da classe `Bebida` e implementam suas etapas específicas.



\### Classes do projeto



\*\*Bebida.java:\*\* classe abstrata que contém o método Template Method e define a sequência de preparação.



\*\*Cafe.java:\*\* implementa o preparo do café, incluindo seus ingredientes e complementos.



\*\*Cha.java:\*\* implementa o preparo do chá, incluindo seus ingredientes e complementos.



\*\*Main.java:\*\* classe principal responsável por executar e demonstrar o funcionamento do sistema.



\## 💻 Exemplo de execução



```text

=== PREPARANDO CAFE ===

Fervendo a agua...

Passando o cafe...

Colocando na xicara...

Adicionando acucar e leite...



=== PREPARANDO CHA ===

Fervendo a agua...

Colocando o saquinho de cha...

Colocando na xicara...

Adicionando limao...

```



\## ▶️ Como executar



1\. Clone o repositório:



```bash

git clone https://github.com/Bernardo-blib/apsii.git

```



2\. Abra o Eclipse IDE.

3\. Selecione \*\*File → Import → Existing Projects into Workspace\*\*.

4\. Localize a pasta `TemplateMethod` dentro do repositório clonado.

5\. Importe o projeto.

6\. Abra a classe `Main.java`.

7\. Clique com o botão direito e selecione \*\*Run As → Java Application\*\*.

8\. Observe o resultado no console.



\## 📚 Conceitos aplicados



\- Herança

\- Classes abstratas

\- Polimorfismo

\- Sobrescrita de métodos

\- Reutilização de código

\- Padrões de projeto comportamentais



\## ✅ Conclusão



O padrão Template Method facilita a reutilização de código e a organização de algoritmos que possuem etapas semelhantes.



Neste projeto, foi possível demonstrar como diferentes bebidas podem compartilhar uma mesma estrutura de preparação, mantendo suas implementações específicas.



\## 👥 Integrantes



\- Bernardo Mourthé

\- Davi Lucas

\- Jackson Fabiano



