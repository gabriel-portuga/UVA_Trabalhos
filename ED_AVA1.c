/*
Programa de estrutura de dados lista linear, simplismente encadeada.
Disciplina: Estrutura de dados
Nome: Gabriel de Souza da Silva
Matricula: 20193300349
*/
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>

//Definições

typedef struct nPonto
{
    int dados;
    struct nPonto *proximo;
} Ponto;

typedef struct nLista
{
    Ponto *inicio;
    Ponto *fim;
} Lista;

// Cria a lista

void criar(Lista *lista)
{
    lista->inicio = NULL;
    lista->fim = NULL;
}

/* Opções de escolha de 1 a 5
Opção 1 - Inserir dados */

void inserir(Lista *lista, int i){
    Ponto *novo;
    novo = (Ponto*)malloc(sizeof(Ponto));
    if (novo != NULL){
        novo->dados = i;
        Ponto *atual, *anterior;
        anterior = NULL;
        atual = lista->inicio;

     while (atual != NULL && atual->dados < i){
         anterior = atual;
         atual = atual->proximo;
        }
         novo->proximo = atual;
        if (anterior != NULL){
            anterior->proximo = novo;
        } else{
            lista->inicio = novo;
            }
    } else{
            printf("Sem memória!\n");
        }
}
// Opção 2 - Exibir a lista
void consulta(Lista *lista){
    Ponto *ponto;
    printf("Lista: ");
        for (ponto = lista->inicio; ponto != NULL; ponto = ponto->proximo){
            printf("%d ->> ", ponto->dados);
        }
    printf("Vazio\n");
}
// Opção 3 - Alterar dados
void alterar(Lista *lista, int i, int j){
    Ponto *atual, *anterior;
    anterior = NULL;
    atual = lista->inicio;
    while (atual != NULL && atual->dados != i){
        anterior = atual;
        atual = atual->proximo;
    }
    if (anterior != NULL){
        if (atual != NULL){

            atual->dados = j;

                    printf("Alterado Com Sucesso!\n");

        }
        else{
            printf("Valor Indisponível\n");
        }
    }
    else{
         printf("Lista Vazia\n");
    }
}
// Opção 4 - Remover dados
void remover(Lista *lista, int i){
    Ponto *atual, *anterior;
    anterior = NULL;
    atual = lista->inicio;
    while (atual != NULL && atual->dados != i){
        anterior = atual;
        atual = atual->proximo;
    }
    if (anterior != NULL){
         if (atual != NULL) {
             anterior->proximo = atual->proximo;
             free(atual);
             printf("Valor Removido\n");
         }
         else{
             printf("Valor não encontrado\n");
         }
    }
    else{
        printf("Lista Vazia\n");
    }
}
//Opção 5 - Restaurar e Sair do programa
int vazia(Lista *lista) {
    return(lista->inicio == NULL);
}

void reset(Lista *lista){
    Ponto *auxiliar = lista->inicio;
    if (auxiliar != NULL){
         while (auxiliar != NULL){
             lista->inicio = auxiliar->proximo;
             free(auxiliar);
             auxiliar = lista->inicio;
             }
     printf("Lista redefinida\n");
     }
     else{
         printf("Lista Vazia\n");
        }
}
// Programa
void main(){
    setlocale(LC_ALL, "portuguese");
    Lista listacriada;
    int v1, escolha, v2;
    criar(&listacriada);
    while (1) {
        printf("\n 1 - Inserir Dados\n");
        printf(" 2 - Mostrar Lista\n");
        printf(" 3 - Alterar dados da Lista\n");
        printf(" 4 - Remover dados da Lista\n");
        printf(" 5 - Sair e restaurar a lista\n");
        printf("\n digite um numero referente a opção desejada: ");
        scanf("%d", &escolha);
        system("cls");
            switch (escolha) {
                case 1:
                    printf("Valor:");
                    scanf("%d", &v1);
                    inserir(&listacriada, v1);
                    break;
                case 2:
                    if (vazia(&listacriada)) {
                         printf("Lista Vazia...\n");
                    }
                    else {
                         consulta(&listacriada);
                    }
                    break;
                case 3:
                    printf("Valor Para Ser Alterado:");
                    scanf("%d", &v1);
                    printf("Novo Valor:");
                    scanf("%d", &v2);
                    alterar(&listacriada, v1, v2);
                    break;
                case 4:
                    printf("Valor:");
                    scanf("%d", &v1);
                    remover(&listacriada, v1);
                    break;
                case 5:
                    reset(&listacriada);
                    exit(0);
                default:
                    printf("Opção Inválida!\n");
                }
    }
}
