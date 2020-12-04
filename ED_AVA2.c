/*
Aluno: Gabriel de Souza da Silva
Matrícula: 20193300349
Curso: Sistemas de Informação
Disciplina: Estrutura de Dados
*/
// Bibliotecas
#include <string.h>
#include <stdio.h>
#include <stdlib.h>
#include <locale.h>
#include <conio.h>
// Declarações
struct Valor
{
    char prefixo[11];
};
typedef struct codigo
{
    int num;
    struct codigo *right;
    struct codigo *left;
} Cod;
void criaCODIGO(Cod **T)
{
    *T = NULL;
}
int CodisEmpty(Cod* T)
{
    return T == NULL;
}
void inserirCod(Cod **t, int num)
{
    if(*t == NULL)
    {
        *t = (Cod*)malloc(sizeof(Cod));
        (*t)->left = NULL;
        (*t)->right = NULL;
        (*t)->num = num;
    }
    else
    {
        if(num < (*t)->num)
        {
            inserirCod(&(*t)->left, num);
        }
        if(num > (*t)->num)
        {
            inserirCod(&(*t)->right, num);
        }
    }
}
Cod *Toright(Cod **cod)
{
    if((*cod)->right != NULL)
    {
        return Toright(&(*cod)->right);
    }
    else
    {
        Cod *aux = *cod;
        if((*cod)->left != NULL)
        {
            *cod = (*cod)->left;
        }
        else
        {
            *cod = NULL;
            return aux;
        }
    }
}
Cod *Toleft(Cod **cod)
{
    if((*cod)->left != NULL)
    {
        return Toleft(&(*cod)->left);
    }
    else
    {
        Cod *aux = *cod;
        if((*cod)->right != NULL)
        {
            *cod = (*cod)->right;
        }
        else
        {
            *cod = NULL;
            return aux;
        }
    }
}
void remover(Cod **T, int num)
{
    if(*T == NULL)
    {
        printf("\nValor inexistente na Árvore!\n");
        return;
    }
    else
    {
        if(num > (*T)->num)
        {
            remover(&(*T)->right, num);
        }
        else
        {
            Cod *aux = *T;
            if (((*T)->left == NULL)&&((*T)->right == NULL))
            {
                free(aux);
                printf("\nRemovido! \n");
                (*T) = NULL;
            }
            else
            {
                if ((*T)->left == NULL)
                {
                    (*T) = (*T)->right;
                    aux->left = NULL;
                    free(aux);
                    aux = NULL;
                    printf("\nRemovido! \n");
                }
                else
                {
                    aux = Toright(&(*T)->left);
                    aux->left = (*T)->left;
                    aux->right = (*T)->right;
                    (*T)->left = (*T)->right = NULL;
                    free((*T));
                    *T = aux;
                    aux = NULL;
                    printf("\nRemovido! \n");
                }
            }
        }
    }
}
void showCodPreOrdem(Cod **T)
{
    if((*T) != NULL)
    {
        printf("%i\n", (*T)->num);
        showCodPreOrdem(&(*T)->left);
        showCodPreOrdem(&(*T)->right);
    }
}
void showCodEmOrdem(Cod **T)
{
    if((*T) != NULL)
    {
        showCodEmOrdem(&(*T)->left);
        printf("%i\n", (*T)->num);
        showCodEmOrdem(&(*T)->right);
    }
}
void showCodPosOrdem(Cod **T)
{
    if((*T) != NULL)
    {
        showCodPosOrdem(&(*T)->left);
        showCodPosOrdem(&(*T)->right);
        printf("%i\n", (*T)->num);
    }
}
int maior(int a, int b)
{
    if(a > b)
        return a;
    else
        return b;
}
void imprimir(Cod **T)
{
    if((*T) != NULL)
    {
        if((*T) != NULL)
        {
            printf("\nRaíz: %i\n",(*T)->num);
            if((*T)->left != NULL)
                printf("left: %i\t",(*T)->left->num);
            else
                printf("left: NULL\t");
            if((*T)->right != NULL)
                printf("right: %i\t",(*T)->right->num);
            else
                printf("right: NULL\t");
            if((*T)->left != NULL)
                imprimir(&(*T)->left);
            if((*T)->right != NULL)
                imprimir(&(*T)->right);
        }
        else
            printf("Árvore Vazia! \n");
    }
}
// Programa
int main()
{
    struct Valor x;
    int c;
    Cod *T;
    criaCODIGO(&T);
    setlocale(LC_ALL, "Portuguese");
    int opcao;
    do
    {
        system("CLS");
        printf("******** DIGITE UMA OPÇÃO ********\n\n");
        printf(" [ 1 ] Inserir Valor \n");
        printf(" [ 2 ] Remover Valor \n");
        printf(" [ 3 ] Exibir PRÉ-ORDEM \n");
        printf(" [ 4 ] Exibir EM ORDEM \n");
        printf(" [ 5 ] Exibir PÓS-ORDEM \n");
        printf(" [ 6 ] Imprime a Árvore  \n");
        printf(" [ 0 ] Sair\n");
        scanf("%d", &opcao);
        switch(opcao)
        {
        case 1:
            system("CLS");
            printf("\nprefixo: ");
            scanf("%s", x.prefixo);
            printf("\nDigite um número (Referência na Árvore): ");
            scanf("%d",&c);
            inserirCod(&T,c);
            system("PAUSE");
            break;

        case 2:
            system("CLS");
            printf("\nDigite um número: ");
            scanf("%d",&c);
            remover(&T,c);
            system("PAUSE");
            break;

        case 3:
            system("CLS");
            showCodPreOrdem(&T);
            system("PAUSE");
            break;

        case 4:
            system("CLS");
            showCodEmOrdem(&T);
            system("PAUSE");
            break;

        case 5:
            system("CLS");
            showCodPosOrdem(&T);
            system("PAUSE");
            break;

        case 6:
            system("CLS");
            imprimir(&T);
            printf("\n");
            system("PAUSE");
            break;

        case 0:
            break;

        default:
            printf("\n\nopção inválida. \n");
            system("PAUSE");
            break;
        }
    }
    while(opcao!=0);
    return 0;
}
