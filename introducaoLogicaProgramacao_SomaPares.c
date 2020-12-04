#include<stdio.h>
#include<locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese_Brazil");

    int num = 0, somaPar = 0, totalDig = 0, totalDigPar = 0;
    float mediaParDig = 0, mediaDig = 0;

    printf("Digite um número inteiro: \n");

    while(num > -1)
    {
        scanf("%d", &num);
        if(num % 2 == 0)
        {
            somaPar += num;
            totalDigPar ++;
        }
        totalDig ++;
    }

    if(num <= -1 && totalDig == 1){
            printf("Impossível calcular!");

    }else{
            mediaParDig = (float)somaPar / totalDigPar;
    mediaDig = (float)somaPar / totalDig;

    printf("Total somatório dos números pares: %d \n", somaPar);
    printf("Total de valores pares lidos: %d \n", totalDigPar);
    printf("A média entre os valores citados: %.2f \n", mediaParDig);
    printf("Total geral de números lidos: %d \n", totalDig);
    printf("A média entre a soma dos pares pelo quantidade geral de números lidos: %.2f \n", mediaDig);
    }

    return 0;
}
