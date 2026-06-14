# Política de Versionamento do Código

## Formato de Commits e Merges

Em geral:

```text
<tipo>: <descricao>
```

Linha vazia para separação:

```text
<opcional corpo do commit>
```

## Tipos de Commit

* `feat`: commits para adicionar, ajustar ou remover funcionalidades do código.
* `fix`: commits para corrigir erros no código.
* `style`: commits para alterar estilos e organização de textos.
* `docs`: commits que afetam exclusivamente a documentação.

## Exemplos

```text
feat: adicionar classe Cliente

fix: corrigir cálculo de valor total da venda

style: ajustar organização do README

docs: atualizar política de versionamento
```

# Releases

Para releases de versões, as especificações são as seguintes:

Cada integrante será responsável por uma versão principal do projeto. As versões seguem a ordem definida para a realização das atividades.

* `v1.0` — Responsável pelo primeiro conjunto de tarefas
* `v2.0` — Responsável pelo segundo conjunto de tarefas
* `v3.0` — Responsável pelo terceiro conjunto de tarefas
* `v4.0` — Responsável pelo quarto conjunto de tarefas

Cada integrante deve criar uma tag correspondente à sua versão durante o desenvolvimento de sua parte do projeto.

# Contribuição

Antes de iniciar uma atividade, recomenda-se verificar as tarefas atribuídas e garantir que não exista conflito com o trabalho de outro integrante.

Novas classes devem seguir o tema definido para o projeto, que consiste em um sistema de loja de departamento.

As classes devem possuir nomes claros e representar entidades ou processos relacionados ao domínio do sistema.

Não há exigência de complexidade para as classes. O objetivo principal do projeto é demonstrar o uso de técnicas de gerência de configuração, versionamento e colaboração em repositórios Git.

# Merge de Alterações

Toda alteração deve ser enviada ao repositório utilizando commits padronizados.

Documentações como `README` e `CONTRIBUTING` podem ser atualizadas quando necessário, desde que sejam mantidas as convenções definidas neste documento.
