# Classes e Objetos em Java

## 🎯 Introdução

**Programação Orientada a Objetos (POO)** é um paradigma de programação que organiza o código em torno de **objetos** que contêm dados (atributos) e comportamentos (métodos). Em Java, tudo gira em torno de classes e objetos.

## 🔍 Conceitos Fundamentais

### Classe vs Objeto

| Conceito | Definição | Analogia |
|----------|-----------|----------|
| **Classe** | Modelo/molde que define características e comportamentos | Planta de uma casa |
| **Objeto** | Instância concreta de uma classe | Casa construída |

### Exemplo Visual
```
Classe Carro {                    Objetos:
  - marca                         → Civic (Honda, prata, 2023)
  - cor                          → Corolla (Toyota, preto, 2024)
  - ano                          → Onix (Chevrolet, branco, 2022)
  + acelerar()
  + frear()
}
```

## 🏗️ Estrutura de uma Classe

```java
public class NomeDaClasse {
    // Atributos (características)
    private tipo atributo1;
    private tipo atributo2;
    
    // Construtor
    public NomeDaClasse(parametros) {
        // Inicialização
    }
    
    // Métodos (comportamentos)
    public void metodo1() {
        // Código
    }
}
```

## 📦 Elementos de uma Classe

### 1. Atributos (Propriedades)
Representam as características do objeto.

```java
public class Pessoa {
    // Atributos privados (encapsulamento)
    private String nome;
    private int idade;
    private double altura;
}
```

### 2. Construtores
Métodos especiais para criar objetos.

```java
public class Livro {
    private String titulo;
    private String autor;
    
    // Construtor padrão
    public Livro() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
    }
    
    // Construtor com parâmetros
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
```

### 3. Métodos
Definem os comportamentos do objeto.

```java
public class ContaCorrente {
    private double saldo;
    
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
    
    public double consultarSaldo() {
        return saldo;
    }
}
```

## 🎭 Modificadores de Acesso

| Modificador | Classe | Pacote | Subclasse | Mundo |
|-------------|---------|---------|-----------|--------|
| **public** | ✅ | ✅ | ✅ | ✅ |
| **protected** | ✅ | ✅ | ✅ | ❌ |
| **default** | ✅ | ✅ | ❌ | ❌ |
| **private** | ✅ | ❌ | ❌ | ❌ |

## 💡 Exemplos Práticos

### Exemplo 1: Classe Básica - Cachorro
```java
public class Cachorro {
    // Atributos
    private String nome;
    private String raca;
    private int idade;
    private boolean vacinado;
    
    // Construtor
    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.vacinado = false;
    }
    
    // Métodos de comportamento
    public void latir() {
        System.out.println(nome + " está latindo: Au au!");
    }
    
    public void comer(String comida) {
        System.out.println(nome + " está comendo " + comida);
    }
    
    public void vacinar() {
        this.vacinado = true;
        System.out.println(nome + " foi vacinado!");
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public int getIdade() {
        return idade;
    }
    
    public boolean isVacinado() {
        return vacinado;
    }
    
    // Método toString para exibir informações
    @Override
    public String toString() {
        return "Cachorro: " + nome + 
               ", Raça: " + raca + 
               ", Idade: " + idade + " anos" +
               ", Vacinado: " + (vacinado ? "Sim" : "Não");
    }
}
```

### Exemplo 2: Usando a Classe
```java
public class PetShop {
    public static void main(String[] args) {
        // Criando objetos
        Cachorro dog1 = new Cachorro("Rex", "Pastor Alemão", 3);
        Cachorro dog2 = new Cachorro("Bella", "Golden Retriever", 2);
        
        // Usando métodos
        dog1.latir();
        dog2.comer("ração premium");
        
        // Vacinando
        dog1.vacinar();
        
        // Exibindo informações
        System.out.println(dog1);
        System.out.println(dog2);
    }
}
```

### Exemplo 3: Classe com Relacionamento
```java
public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private int qtdNotas;
    
    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = new double[4]; // Máximo 4 notas
        this.qtdNotas = 0;
    }
    
    public void adicionarNota(double nota) {
        if (qtdNotas < 4 && nota >= 0 && nota <= 10) {
            notas[qtdNotas] = nota;
            qtdNotas++;
            System.out.println("Nota adicionada com sucesso!");
        } else {
            System.out.println("Não foi possível adicionar a nota.");
        }
    }
    
    public double calcularMedia() {
        if (qtdNotas == 0) return 0;
        
        double soma = 0;
        for (int i = 0; i < qtdNotas; i++) {
            soma += notas[i];
        }
        return soma / qtdNotas;
    }
    
    public String getSituacao() {
        double media = calcularMedia();
        if (media >= 7.0) return "Aprovado";
        else if (media >= 5.0) return "Recuperação";
        else return "Reprovado";
    }
    
    public void exibirBoletim() {
        System.out.println("=== BOLETIM ===");
        System.out.println("Aluno: " + nome);
        System.out.println("Matrícula: " + matricula);
        System.out.print("Notas: ");
        for (int i = 0; i < qtdNotas; i++) {
            System.out.print(notas[i] + " ");
        }
        System.out.println("\nMédia: " + String.format("%.2f", calcularMedia()));
        System.out.println("Situação: " + getSituacao());
    }
}
```

## 🔗 Conceitos Importantes

### 1. Encapsulamento
Ocultar detalhes internos e expor apenas o necessário.

```java
public class ContaBancaria {
    private double saldo; // Atributo privado
    
    // Método público para acessar o saldo
    public double getSaldo() {
        return saldo;
    }
    
    // Método público para modificar o saldo de forma controlada
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }
}
```

### 2. This
Referência ao objeto atual.

```java
public class Produto {
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco) {
        this.nome = nome;     // this.nome = atributo da classe
        this.preco = preco;   // nome = parâmetro do construtor
    }
}
```

### 3. Static vs Instance
```java
public class Contador {
    private static int totalObjetos = 0; // Compartilhado entre todos
    private int valor;                   // Único para cada objeto
    
    public Contador() {
        totalObjetos++;  // Incrementa para todos
        valor = 0;       // Único para este objeto
    }
    
    public static int getTotalObjetos() {
        return totalObjetos;
    }
}
```

## ✨ Boas Práticas

### 1. Nomenclatura
- **Classes**: PascalCase → `ContaBancaria`, `PessoaFisica`
- **Atributos/Métodos**: camelCase → `nomeCompleto`, `calcularIdade()`
- **Constantes**: UPPER_CASE → `TAXA_JUROS`, `IDADE_MINIMA`

### 2. Encapsulamento
```java
// ❌ Evite
public class Pessoa {
    public String nome;
    public int idade;
}

// ✅ Prefira
public class Pessoa {
    private String nome;
    private int idade;
    
    // Getters e setters com validação
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        }
    }
}
```

### 3. Responsabilidade Única
Cada classe deve ter apenas uma responsabilidade.

```java
// ❌ Classe fazendo muitas coisas
public class Usuario {
    private String nome;
    private String email;
    
    public void salvarNoBanco() { }
    public void enviarEmail() { }
    public void gerarRelatorio() { }
}

// ✅ Classes com responsabilidades separadas
public class Usuario {
    private String nome;
    private String email;
}

public class UsuarioDAO {
    public void salvar(Usuario usuario) { }
}

public class EmailService {
    public void enviar(String email) { }
}
```

## 🏋️ Exercícios

### Exercício 1: Básico - Classe Círculo
Crie uma classe `Circulo` com:
- **Atributo**: raio (double)
- **Construtor**: que recebe o raio
- **Métodos**:
    - `calcularArea()`: retorna a área (π × raio²)
    - `calcularPerimetro()`: retorna o perímetro (2 × π × raio)
    - `toString()`: exibe as informações do círculo

```java
// Exemplo de uso esperado:
Circulo c1 = new Circulo(5.0);
System.out.println("Área: " + c1.calcularArea());
System.out.println("Perímetro: " + c1.calcularPerimetro());
System.out.println(c1); // Círculo com raio: 5.0
```

### Exercício 2: Intermediário - Sistema de Funcionários
Crie uma classe `Funcionario` com:
- **Atributos**: nome, cargo, salarioBase, horasExtras
- **Construtor**: recebe nome, cargo e salário base
- **Métodos**:
    - `registrarHorasExtras(int horas)`: adiciona horas extras
    - `calcularSalarioTotal()`: salário base + (horas extras × valor hora)
    - `promover(String novoCargo, double aumento)`: muda cargo e aumenta salário
    - `gerarContracheque()`: exibe todas as informações

```java
// Exemplo de uso esperado:
Funcionario f1 = new Funcionario("João Silva", "Desenvolvedor", 5000.0);
f1.registrarHorasExtras(10);
f1.promover("Desenvolvedor Sênior", 1500.0);
f1.gerarContracheque();
```

### Exercício 3: Avançado - Sistema Bancário
Crie um sistema com as classes:

1. **Classe `Cliente`**:
    - Atributos: nome, cpf, dataNascimento
    - Métodos: getters, validarCPF(), calcularIdade()

2. **Classe `Conta`**:
    - Atributos: numero, cliente, saldo, limite, historico
    - Métodos: depositar(), sacar(), transferir(), exibirExtrato()

3. **Classe `Banco`**:
    - Atributos: nome, contas (lista)
    - Métodos: abrirConta(), buscarConta(), listarContas(), calcularPatrimonio()

```java
// Exemplo de uso esperado:
Banco banco = new Banco("Banco Java");
Cliente cliente1 = new Cliente("Maria", "123.456.789-00", "01/01/1990");
Conta conta1 = banco.abrirConta(cliente1, 1000.0);

conta1.depositar(500.0);
conta1.sacar(200.0);
conta1.exibirExtrato();

System.out.println("Patrimônio do banco: " + banco.calcularPatrimonio());
```

## 📚 Dicas de Estudo

1. **Pense em objetos do mundo real**: Carro, Pessoa, Livro, etc.
2. **Comece simples**: Uma classe com 2-3 atributos e métodos
3. **Teste sempre**: Crie uma classe Main para testar seus objetos
4. **Use o debugger**: Acompanhe o fluxo de criação dos objetos
5. **Pratique encapsulamento**: Sempre use private para atributos

## 🎯 Próximos Passos

Após dominar Classes e Objetos, você estará pronto para:
- **Herança**: Criar hierarquias de classes
- **Polimorfismo**: Múltiplas formas de um comportamento
- **Interfaces**: Contratos que classes devem seguir
- **Classes Abstratas**: Classes que não podem ser instanciadas

Lembre-se: POO é a base de Java! Domine bem esses conceitos! 💪☕