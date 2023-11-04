**Aluno: Antonio Gomes Ferreira Neto**

**Matrícula: 202102570735**

**Curso: Ciências da Computação**

**Disciplina: Padrões de Projetos de Software Com Java**

**Unidade: Niterói**

**Professor: Ronaldo Candido dos Santos**

# Atividades Autônomas Aura

## Aula 09:

1 - Uma das fontes de informação acerca do clima são as boias meteorológicas de alto mar, que emitem sinais para alguns satélites, e estes enviam as informações para um receptor em terra, de forma codificada. De uma forma simples, temos uma cadeia de caracteres, onde as letras iniciais definem um evento, seguido de parâmetros que podem ser numéricos ou literais, em quantidades e tamanhos diversos, obedecendo a padronização para cada tipo de evento.

Qual padrão de desenvolvimento seria indicado para o decodificador do sistema?

A) Template Method

B) Abstract Factory

C) Memento

D) Interpreter

E) Chain of Responsibility

### **Resposta**: D

2 - Os frameworks se tornaram muito comuns na área de desenvolvimento, onde no Java temos exemplos como Spring, Struts e Hibernate. Eles definem um arcabouço com todas as funcionalidades comuns para determinado domínio de problemas, mas permitem ao desenvolvedor especializar a implementação original, para satisfazer aos requisitos apresentados pelo sistema. Na construção do framework, um padrão de desenvolvimento muito utilizado é o Template Method.

Qual é a afirmação correta acerca do Template Method?

A) O padrão define um algoritmo dividido em vários passos, onde alguns desses passos são a implementação da parte comum, enquanto outros são lacunas a serem preenchidas pelo desenvolvedor.

B) Para que o padrão possa ser adotado, o princípio da orientação a objetos que deve ser utilizado é o da agregação, segundo um relacionamento todo-parte.

C) Permite apenas uma derivação do processo original, já que uma das condições impostas pelo padrão é a existência de apenas uma instância da classe em todo o ambiente de execução.

D) Trabalha com uma sequência de filtros, por onde uma dada requisição deverá passar, efetuando modificação específicas em cada filtro utilizado.

E) Exige a utilização de comunicação remota, a qual pode ser feita de uma forma transparente para o desenvolvedor, com base em Stubs e Skeletons.

### **Resposta**: A

## Aula 10

1 - Uma abordagem comum para o acesso ao banco de dados, nos sistemas atuais, é a concentração das operações com uso de SQL (Structured Query Language) em uma classe do tipo DAO (Data Access Object), que deve se comunicar com o restante do sistema através de entidades ou coleções delas.

Qual padrão GRASP se mostra predominante nesse contexto?

A) Polimorfismo

B) Especialista na Informação

C) Controlador

D) Criador

E) Acoplamento Fraco

### **Resposta**: B

2 - Alocação de memória é um dos processos mais caros para a execução de sistemas, exigindo muitas operações envolvendo a CPU e o barramento. Saber onde criar os objetos, para que tenhamos maior visibilidade e menor número de instâncias, pode ser um fator decisivo na eficiência do sistema, e o padrão Criador, do GRASP, define boas práticas no que tange ao assunto.

Qual a opção correta acerca do padrão de desenvolvimento Criador?

A) Um dos fatores para escolha do criador é o fato da classe geradora conter as informações necessárias para inicialização das instâncias geradas.

B) Tem como objetivo garantir baixo acoplamento entre as classes.

C) Em termos de orientação a objetos, baseiase no princípio do polimorfismo.

D) Atribui ao objeto a responsabilidade de mediar diálogos entre componentes.

E) Precisa ser definido através de classes abstratas, já que a criação propriamente dita será delegada ara o sistema operacional.

### **Resposta**: B

## Aula 11

1 - Um dos ferramentais mais interessantes da orientação a objetos é a herança, pois permite alto reuso estrutural, diminuindo de forma considerável o tempo utilizado no desenvolvimento de um sistema. Apesar de oferecer uma grande vantagem em termos de reuso, a criação de uma grande hierarquia de classes pode dificultar ações de manutenção, pois qualquer modificação repercute em todos os descendentes.

Qual padrão do GRASP estaria sendo violado nessa situação?

A) Coesão Alta

B) Especialista na Informação

C) Controlador

D) Criador

E) Acoplamento Fraco

### **Resposta**: E

2 - Um código bem escrito é sempre mais fácil de manter, pois a semântica adequada facilita a compreensão das entidades e dos processos que atuam sobre elas. Utilizar nomes compreensíveis, manter os objetos focados em seus reais objetivos e definir um ambiente gerenciável, estão entre os muitos elementos que podem ser utilizados para melhorar a semântica e facilitar o uso dos objetos.

Qual padrão do GRASP demonstra esse tipo de preocupação?

A) Acoplamento Baixo

B) Especialista na Informação

C) Polimorfismo

D) Coesão Alta

E) Controlador

### **Resposta**: D

## Aula 12

1 - A orientação a objetos tem uma característica adaptativa muito forte, baseada na alteração funcional de métodos herdados, sem modificação de assinaturas, para que os descendentes possam ser utilizados em um novo contexto de forma automática.

Qual padrão do GRASP se baseia nessa característica?

A) Acoplamento Baixo

B) Coesão Alta

C) Polimorfismo

D) Criador

E) Especialista na Informação

### **Resposta**: C

2 - Nem sempre é fácil garantir acoplamento baixo e alta coesão. Por exemplo, em um sistema para controle de vendas, teríamos a definição do Especialista na Informação com base na classe Venda, já que ela detém os dados necessários, mas isso poderia trazer uma dependência dos componentes JDBC.

Como o padrão Invenção Pura seria utilizado para resolver esse problema?

A) Utilizando o polimorfismo e acrescentando a persistência no descendente.

B) Eliminando o uso de JDBC e adotando listas em memória.

C) Movendo o uso do JDBC para objetos no padrão Criador.

D) Deixando os métodos de persistência privados.

E) Definindo uma classe de persistência genérica.

### **Resposta**: E

# Lista de Exercícios 2

Questão 1: Os padrões GRASP indicam a responsabilidade de objetos e classes nas funcionalidades do sistema.

Assinale a alternativa que expressa a intenção do padrão Especialista na Informação:

a) Padrão que recomenda alocar as operações pelas classes do sistema de acordo com o conhecimento que cada classe possui, sendo ele dado pelos seus atributos e relacionamentos.

b) Padrão que recomenda que cada classe seja desenvolvida pelo profissional com o maior conhecimento no assunto relacionado à classe.

c) Padrão que recomenda a centralização da lógica de negócio em classes controladoras, ficando as classes de domínio como fornecedoras das informações via operações get/set, as quais, aliás, serão utilizadas por essas classes.

d) Padrão que recomenda a alocação de responsabilidades pelas classes de forma a aumentar o acoplamento entre os módulos do sistema.

e) Padrão que estabelece as diretrizes para a definição dos atributos das classes de um sistema.

### **Resposta**: A

Questão 2: Marque a alternativa que expressa a intenção do padrão Criador:

a) O padrão Criador é indicado para situações nas quais é preciso fazer uso racional da memória, evitando a proliferação de réplicas de pequenos objetos por meio de uma solução baseada em compartilhamento.

b) O padrão Criador propõe uma solução para problemas nos quais é preciso instanciar uma classe de uma família de produtos conforme configuração realizada externamente.

c) O padrão Criador oferece uma heurística para resolver problemas simples de instanciação de objetos, recomendando que um agregado seja responsável pela criação dos objetos que o compõem.

d) O padrão Criador propõe uma política de criação de módulos e pastas em um sistema de controle de versões.

e) Padrão que estabelece as diretrizes para a definição dos atributos das classes de um sistema.

### **Resposta**: C

Questão 3: Assinale a alternativa correta sobre o padrão GRASP Coesão:

a) Buscamos produzir módulos com coesão baixa, isto é, poucos módulos devem concentrar as principais funcionalidades do sistema.

b) Buscamos produzir módulos com coesão alta, isto é, módulos que tenham um propósito bem definido.

c) Buscamos produzir módulos com coesão baixa, isto é, módulos que possuam um baixo grau de interdependência em relação a outros módulos.

d) Buscamos produzir módulos com coesão alta, isto é, poucos módulos devem concentrar as principais funcionalidades do sistema.

e) Buscamos produzir módulos com coesão baixa, isto é, módulos que tenham um propósito bem definido.

### **Resposta**: B

Questão 4: Aponte a alternativa correta sobre o padrão Controlador:

a) O Controlador Fachada deve ser utilizado em sistemas com muitas funcionalidades e eventos.

b) O controlador é uma parte da camada de interface com o usuário, sendo responsável por capturar os eventos gerados pelo usuário.

c) O controlador é responsável pelo controle de acesso do usuário ao sistema.

d) Em sistemas que possuam algoritmos complexos de cálculo, esses algoritmos devem ser implementados em classes do tipo Controlador.

e) O controlador é um elemento de lógica de negócio responsável por coordenar a produção da resposta aos eventos lógicos gerada por componentes de interface do sistema com elementos externos.

### **Resposta**: E

Questão 5: Os princípios GRASP (General Responsibility Assignment Software Patterns) definem diretrizes para atribuições de responsabilidades às classes e objetos durante a construção de Sistemas Orientados a Objetos. Os nove diferentes princípios apresentados em GRASP são: Criador, Especialista de informação, Baixo acoplamento, Controlador, Alta coesão e, EXCETO:

a) Polimorfismo.

b) Fabricação pura.

c) Indireção.

d) Variações protegidas.

e) Segregação de interface.

### **Resposta**: E

Questão 6: Assinale a alternativa que apresenta um dos padrões de projeto GoF (“Gang of Four”) classificado como estrutural:

a) Abstract Factory.

b) Command.

c) Strategy.

d) Decorator.

e) Observer.

### **Resposta**: D

Questão 7: No contexto de padrões de projeto GoF, o padrão que permite o encapsulamento de uma família de algoritmos e torna-os intercambiáveis em tempo de execução, de modo que um método de um mesmo objeto possa executar algoritmos distintos, é o:

a) Builder.

b) Factory.

c) Proxy.

d) Singleton.

e) Strategy.

### **Resposta**: E

Questão 8: Um padrão de projeto é uma solução geral para um problema que ocorre com frequência dentro de um determinado contexto no projeto de software. O padrão de projeto de software denominado Bridge é um padrão:

a) estrutural que desacopla uma abstração de sua implementação para que os dois possam variar independentemente.

b) comportamental destinado a armazenar o estado interno de um objeto em um dado momento para que seja possível retorná-lo a este estado.

c) de controle de objetos utilizado para garantir que determinada classe só tenha uma única instância e prover um ponto de acesso global a ela.

d) de criação para instanciar famílias de objetos relacionados por meio de uma única interface e sem que a classe concreta seja especificada.

e) de interação para prover uma maneira de acessar os elementos de um objeto agregado sequencialmente sem expor sua representação interna.

### **Resposta**: A

Questão 9: Assinale a alternativa correta em relação ao padrão de projeto GRASP indireção:

a) Padrão que estabelece uma forma de comunicação indireta entre dois módulos com o objetivo de reduzir a coesão desses módulos.

b) Padrão que recomenda introduzir um objeto entre um módulo cliente e um fornecedor de um serviço com o propósito de reduzir o acoplamento entre eles.

c) Padrão que recomenda a centralização da lógica de negócio em classes controladoras, ficando as classes de domínio responsáveis pela definição das informações e das operações get/set a serem utilizadas pelas classes controladoras.

d) Padrão que recomenda a alocação de responsabilidades pelas classes a fim de aumentar o acoplamento entre os módulos do sistema.

e) Padrão que visa reduzir a abstração dos módulos, permitindo que eles possam ser entendidos e modificados mais facilmente.

### **Resposta**: B

Questão 10: Em um padrão de projeto existe uma situação em que uma classe chama um método abstrato especificado em alguma classe abstrata (ou interface) e a subclasse concreta vai decidir que tipo exato de objeto criar e retornar.

Baseado nessa descrição, marque a alternativa que aponta o padrão relacionado.

a) Polimorphism.

b) Builder.

c) Factory Method.

d) Mediator.

e) Facade.

### **Resposta**: C
