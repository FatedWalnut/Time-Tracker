# Time-Tracker

Time-Tracker é um aplicativo Android desenvolvido em Kotlin que auxilia os usuários a registrar e acompanhar suas atividades diárias de forma organizada e intuitiva. Com uma interface moderna construída com Jetpack Compose e uma arquitetura robusta, o aplicativo garante uma experiência fluida e eficiente.

---

## Visão Geral

- **Linguagem:** Kotlin
- **Interface:** Jetpack Compose
- **Persistência de Dados:** Banco de dados local ( Room)
- **Design e Arquitetura:** Baseados em padrões modernos para garantir escalabilidade, manutenção e testabilidade.

---

## Funcionalidades

### Atividades

- **Adicionar uma Atividade**
  - Permite a criação de novas atividades.
  - Registra automaticamente a data de criação da atividade.
  - Possui atributos adicionais:
    - **Categoria:** Ex.: Livro, Série, Filme, Curso, Trabalho, etc.
    - **Tags:** Para organização e filtragem.
    - **Prioridade:** Definição de níveis de importância.
    - **Datas:** Data de início e data de entrega/fim.
  - Permite marcar a atividade como concluída (ideal para atividades de consumo, como livros, séries, filmes, etc).

- **Editar e Deletar Atividades**
  - A atividade pode ser editada ou deletada conforme a necessidade do usuário.

### Sprints

- **Adicionar Sprint à Atividade**
  - Cada atividade pode conter uma ou mais sprints.
  - Cada sprint inclui:
    - **Início do Sprint:** Data e hora de início.
    - **Fim do Sprint:** Data e hora de término.
    - **Descrição (Opcional):** Detalhes do que foi realizado durante o sprint.
    - **Status do Sprint:**
      - Em andamento
      - Concluído
      - Cancelado
  - **Integração com Calendário:**
    - Permite que o sprint seja adicionado ao calendário do usuário.

- **Gerenciar Sprints**
  - Edição e deleção de sprints são suportadas, proporcionando flexibilidade na gestão dos períodos de trabalho.

---

## Padrões de Projeto Utilizados

- **MVVM (Model-View-ViewModel)**
  - Separa a lógica de apresentação da lógica de negócios e dos dados, facilitando testes e manutenção.

- **Repository Pattern**
  - Abstrai o acesso aos dados (seja do banco de dados local ou de outros fontes), promovendo uma camada única para operações de leitura e escrita.

- **Observer Pattern**
  - Permite que a interface do usuário seja atualizada automaticamente em resposta a mudanças nos dados (ex.: com LiveData).

- **Singleton Pattern**
  - Garante que determinadas classes, como a instância do banco de dados, tenham apenas uma instância durante todo o ciclo de vida do aplicativo.

- **Factory Pattern**
  - Centraliza a criação de objetos complexos, facilitando a manutenção e a injeção de dependências quando necessário.
