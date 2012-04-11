/*  2 – Um comerciante deseja armazenar o nome e o valor de 10 produtos de seu 
estabelecimento. 
Monte um array de structs para armazena-los                 */
#include <stdio.h>
#include <stdlib.h>
#include <conio.h>
#include <math.h>
#include <string.h>
         
/* aaaaaaaaaaaaaaaaaa */         
         
  typedef struct produtos{
          int valor;
          char nome[50];              
  }PRODUTOS;

  PRODUTOS p[5];

  LER_PRODUTOS(){
     int i;
     for(i =0; i < 5; i++){          
         scanf("%d", &p[i].valor);            
         gets(p[i].nome);              
     }   

     for(i =0; i < 5; i++){          
         printf("Valor: %d | Nome: %s\n", p[i].valor, p[i].nome);                          
     }   

        
  }




  

int main () {
    fflush(stdin);/* limpa o buffer */

    LER_PRODUTOS();
 
 
    system("pause");
    return 0;
}

