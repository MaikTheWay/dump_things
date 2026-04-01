// Calcular área da circunferência
#include <stdio.h>

int main()
{

    //Declaração das variáveis
    int raio, pi=3.14, area;
    int circunferencia;
    int diametro;
    
    // Entrada de dados
    printf("raio = "); 
    scanf("%i", &raio);

    
    // Cálculo da área da circunferência
    area = pi * (raio * raio);
    circunferencia = pi * 2 * raio;
    diametro = raio * 2;

 
    // Apresentação do resultado
    printf("area = %.2i \n", area); 
    printf("circunferência = %.2i \n", circunferencia);
    printf("diametro = %.2i \n", diametro);


    return 0;
}


// Calendário em IF
#include <stdio.h>
#include <stdlib.h>

int main(){
   //variaveis

    int dia;
    int mes;
    int ano;
    char nome_do_mes [10];

    //digite

    printf("dia:");
    scanf("%d" ,&dia);
    printf("mes:");
    scanf("%d" ,&mes);
    printf("ano:");
    scanf("%d" ,&ano);

    //if

    if(mes==1){

    strcpy(nome_do_mes, "janeiro");
    }
    else if(mes==2){
    strcpy(nome_do_mes, "fevereiro");
    }
    else if(mes==3){
    strcpy(nome_do_mes, "marco");
    }
    else if(mes==4){
    strcpy(nome_do_mes, "abril");
    }
    else if(mes==5){
    strcpy(nome_do_mes, "maio");
    }
    else if(mes==6){
    strcpy(nome_do_mes, "junho");
    }
    else if(mes==7){
    strcpy(nome_do_mes, "julho");
    }
    else if(mes==8){
    strcpy(nome_do_mes, "agosto");
    }
    else if(mes==9){
    strcpy(nome_do_mes, "setembro");
    }
    else if(mes==10){
    strcpy(nome_do_mes, "outubro");
    }
    else if(mes==11){
    strcpy(nome_do_mes, "novembro");
    }
    else if(mes==12){
    strcpy(nome_do_mes, "dezembro");
    }
    else {
    printf("mes invalido");}


    printf("%d de %s de %d", dia, nome_do_mes, ano);
    return 0;
}


// Calendário em SWITCH
#include <stdio.h>
#include <stdlib.h>

int main(){
   //variaveis

    int dia;
    int mes;
    int ano;
    char nome_do_mes [10];

    //digite

    printf("dia:");
    scanf("%d" ,&dia);
    printf("mes:");
    scanf("%d" ,&mes);
    printf("ano:");
    scanf("%d" ,&ano);

    //if

    switch(mes){
      case 1:
      strcpy(nome_do_mes, "janeiro");
      break;
      case 2:
      strcpy(nome_do_mes, "fevereiro");
      break;
      case 3:
      strcpy(nome_do_mes, "marco");
      break;
      case 4:
      strcpy(nome_do_mes, "abril");
      break;
      case 5:
      strcpy(nome_do_mes, "maio");
      break;
      case 6:
      strcpy(nome_do_mes, "junho");
      break;
      case 7:
      strcpy(nome_do_mes, "julho");
      break;
      case 8:
      strcpy(nome_do_mes, "agosto");
      break;
      case 9:
      strcpy(nome_do_mes, "setembro");
      break;
      case 10:
      strcpy(nome_do_mes, "outubro");
      break;
      case 11:
      strcpy(nome_do_mes, "novembro");
      break;
      case 12:
      strcpy(nome_do_mes, "dezembro");
      break;
      default:
        printf("mes invalido");
        }

    printf("%d de %s de %d", dia, nome_do_mes, ano);
    return 0;
}


// Calcular horas:minutos:segundos
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int horas, minutos, segundos;

    printf("digite o tempo em segundos:");
    scanf("%d" ,&segundos);


    minutos = segundos/60;
    if(segundos >= 60){
        segundos = 00;
        }

    horas = minutos/60;
    if(minutos >= 60){
        minutos = 00;
        }


    printf("%d:%d:%d" ,horas ,minutos ,segundos);
    return 0;
}


// Calcular horas:minutos:segundos
#include <stdlib.h>

int main()
{
    int horas, minutos, segundos;
    int restohor;
    int inicial;


    printf("digite os segundos:");
    scanf("%d" ,&inicial);

    horas = inicial/3600;

    restohor = inicial%3600;

    minutos = restohor/60;

    segundos = restohor%60;

    printf(" %d:%d:%d" ,horas, minutos, segundos);

    return 0;
}


// Atribuindo variaveis
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1;
    int num2;
    int inv1;
    int inv2;

    printf("digite o primeiro numero:\n");
    scanf("%d" , &num1);

    printf("digite o segundo numero:\n");
    scanf("%d" , &num2);

    inv1 = num1;    //inv1 esta recebendo o valor de num1
    inv2 = num2;    //inv2 esta recebendo o valor de num2

    num1 = inv2;    //num1 vai ser igual a inv2
    num2 = inv1;    //num2 vai ser igual a in1
                    //ou seja vai inverter esses valores na ordem

printf("invertendo os valores: %d e %d", num1 ,num2);

    return 0;
}


// Calculando a média de 3 valores
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1;
    int num2;
    int num3;
    int media;
    int soma;

    printf("digite um numero inteiro:");
    scanf("%d" , &num1);

    printf("digite o segundo numero inteiro:");
    scanf("%d" , &num2);

    printf("digite o terceiro numero inteiro:");
    scanf("%d" , &num3);

    soma = num1 + num2 + num3;

    media = soma /3;

    printf("a media desses numeros e %d" , media);
    return 0;
}


// Calculando centena, dezena e unidade 
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num, a1, a2, a3;
    int resto;
    int resto2;

    printf("digite um numero inteiro de 03 digitos:");
    scanf("%d" , &num);

    if(num>9 && num<999){
        a1= num/100;
        resto = num%100;
        a2= resto/10;
        a3= resto%10;
        printf("centena:%d\ndezena:%d\nunidade:%d\n" , a1, a2, a3);
    }


// Calculando numero binário com WHILE
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int numero, binario;

    printf("digite um numero\n");
    scanf("%d" , &numero);

    if(numero < 999 ) {
    while( numero > 0) {
        binario = numero % 2;
        numero = numero/2;

        printf("%d" , binario);
    }
}
    return 0;
}

// Calculando numero binário com FOR
#include <stdio.h>
#include <stdlib.h>
#include<math.h>

 main()
{
    int decimal, binario, auxiliar;

    decimal = 0;
    binario = 0;

    printf("digite um numero binario\n");
    scanf("%d" , &binario);

    for(auxiliar = 0; binario > 0; auxiliar ++){
        decimal = decimal + pow(2,auxiliar) * (binario%10);
        binario = binario / 10;
    }
          printf("%d" , decimal);	//no começo do "for" tem que declarar variavel, após isso deve
    return 0;	//mostrar oq o programa tem que fazer para continuar rodando
                //o "pow" server para fazer potencia, mas antes tem que declarar
}               // a biblioteca #include<math.h> para fazer contas


// Invertendo 3 numeros
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int inicial, num1, num2, num3, a1, a2, a3, auxiliar;

    printf("digite um numero de 03 digitos:\n");
    scanf("%d" , &inicial);

    if(inicial < 999) {
    num1 = inicial / 10;
    a1 = inicial % 10;

    num2 = num1 / 10;
    a2 = num1 % 10;

    num3 = num2 /10;
    a3 = num2 % 10;

    printf("%d%d%d" , a1 , a2, a3);

    }else{ printf("NUMERO INVALIDO\n");
  }

}


// Invertendo 2 numeros
#include <stdio.h>
#include <stdlib.h>

int main()
{
    int num1;
    int num2;
    int auxiliar;

    printf("digite um numero:");
    scanf("%d" , &num1);

    printf("digite outro numero:");
    scanf("%d" , &num2);

    auxiliar = num1;
    num1 = num2;
    num2 = auxiliar;

    printf("invertendo os numeros: %d e %d" , num1, num2);

    return 0;
}


// Calculando a entrada e duas parcelas do valor
#include <stdio.h>
#include <stdlib.h>

int main()
{
    float entrada;
    float parcela;
    float valor;

    printf("digite o valor");
    scanf("%f" , &valor);

    parcela = (int)valor/3;
    entrada = parcela + (valor - 2 * parcela);

    printf("entrada: %.2f\n" , entrada);
    printf("parcelas: %.2f 2x" , parcela);
    return 0;
}


// Verificando se as bolas empilhadas formam um triangulo ou não
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
    int quantidade;
    float x1;
    float x2;
    int a;
    int b;
    int c;
    int d;

    printf("digite a quantidade de bolinhas: ");
    scanf("%d" , &quantidade);

    a= 1;
    b= 1;
    c= -2*quantidade;

    d= b*b - 4*a*c;

    x1= (-b + sqrt(d)) /(2*a);

    x2 = (-b-sqrt(d)) /(2*a);

    if((x1==(int)x1 && x1>0) || (x2 ==(int)x2 && x2>0)){
        printf("é triangular");
    }else{
    printf("nao é");}

    return 0;
}


// Simulação da retirada de notas do caixa eletrônico
// Notas: 200, 100, 50, 20, 10, 5 e 2 (Sem moedas)
#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int main()
{
    // sempre utilizar as maiores notas possiveis
    // não usa moedas

    int valor;
    int nota200;
    int nota100;
    int nota50;
    int nota20;
    int nota10;
    int nota5;
    int nota2;

    printf("digite a quantidade de notas para retirar: ");
    scanf("%d" , &valor);

    nota200= valor/200;
    valor= valor%200;

    nota100= valor/100;
    valor= valor%100;

    nota50= valor/50;
    valor= valor%50;

    nota20= valor/20;
    valor= valor%20;

    nota10=valor/10;
    valor=valor%10;

    nota5= valor/5;
    valor= valor%5;

    nota2= valor/2;
    valor= valor%2;

    printf("serão um total de notas:\n notas de 200:%d\n notas de 100:%d\n notas de 50: %d\n notas de 20: %d\n notas de 10: %d\n notas de 5: %d\n notas de 2: %d\n" , nota200 , nota100 , nota50 , nota20 , nota10 , nota5 , nota2);

    return 0;
}


// Lendo numero de até 2 digitos
#include <stdio.h>
#include <string.h>

int main()
{
    int numero, dec, uni;
    char dezena[50];

    printf("Digite um numero de 02 digitos:");
    scanf("%d" ,  &numero);

    if (numero>0   &&  numero<100) {
    if (numero < 20) {

        switch ( numero) {
            case 1:
            printf("Um");
            break;

            case 2:
            printf("Dois");
            break;

            case 3:
            printf("Tres");
            break;

            case 4:
            printf("Quatro");
            break;

            case 5:
            printf("Cinco");
            break;

            case 6:
            printf("Seis");
            break;

            case 7:
            printf("Sete");
            break;

            case 8:
            printf("Oito");
            break;

            case 9:
            printf("Nove");
            break;

            case 10:
            printf("Dez");
            break;

            case 11:
            printf("Onze");
            break;

            case 12:
            printf("Doze");
            break;

            case 13:
            printf("Treze");
            break;

            case 14:
            printf("Quatorze");
            break;

            case 15:
            printf("Quize");
            break;

            case 16:
            printf("Dezesseis");
            break;

            case 17:
            printf("Dezessete");
            break;

            case 18:
            printf("Dezoito");
            break;

            case 19:
            printf("Dezenove");
            break;
        }
    } else {

        dec =  numero / 10;
        switch (dec) {

            case 2:
            printf ("Vinte");
            break;
            case 3:
            printf ("Trinta");
            break;
            case 4:
            printf("Quarenta");
            break;
            case 5:
            printf("Cinquenta");
            break;
            case 6:
            printf("Sessenta");
            break;
            case 7:
            printf("Setenta");
            break;
            case 8:
            printf("Oitenta");
            break;
            case 9:
            printf("Noventa");
            break;

        }
        uni =  numero %10;
        switch (uni) {

            case 0:
            break;

            case 1:
            printf (" e um");
            break;

            case 2:
            printf (" e dois");
            break;

            case 3:
            printf (" e tres");
            break;

            case 4:
            printf(" e quatro");
            break;

            case 5:
            printf(" e cinco");
            break;

            case 6:
            printf(" e seis");
            break;

            case 7:
            printf(" e sete");
            break;

            case 8:
            printf(" e oito");
            break;

            case 9:
            printf(" e nove");
            break;

        }
    } } else {
        printf ("ERRO");
    }
}


// Contagem do maior numero inserido 
#include <stdio.h>

int main()
{
    int numero;
    int cont = 1;
    int max;
  
while(cont<=10){
    printf("digite um numero: \n");
    scanf("%d" , &numero);
    
    
    
    if(cont == 1 || numero > max)
    max = numero;
    cont++;
}
printf("max: %d\n" , max);

    return 0;
}


// Numero é par ou impar
int main()
{
    int num;
    int continua;

    do{
    printf("\ndigite um numero: ");
    scanf("%d" , &num);

    if(num%2 == 0){
       printf("\ne par");
       }else{
       printf("e impar");
       }

       printf("\n\ndeseja continuar ? (1-SIM 2-NAO)\n");
       scanf("%d" , &continua);
    }while(continua == 1);
    return 0;
}


// Transformando dois numeros em potencia
#include <stdio.h>
#include <stdbool.h>

int main()
{
    int base;
    int potencia;
    int resultado = 1;
    int potaux;
    bool enegativo;
    
    printf("digite a base da potencia:");
    scanf("%d" , &base);

    printf("digite a potencia:");
    scanf("%d" , &potencia);
    
    potaux = potencia;
    
    if(potencia != 0){
        enegativo = potencia < 0; 
        
    if(enegativo)
        potencia *= -1; 
        
        while(potencia > 1){
            resultado *= base;
            potencia --;
        }
        
        if(enegativo)
            resultado = 1 / resultado;
        
    }
    printf("%d^%d = %d" , base , potaux , resultado);
    
    return 0;
}


// Fazendo fatorial
#include <stdio.h>

int main()
{
   int x = 5;
   int fat = 1;
   int i;
   
   for(i = 1; i <= x; i++){
    
    fat *= i;
    
    printf("%d! = %d\n" , i , fat);
}
    
    return 0;
}

// Calculando sua idade
#include <stdio.h>
int calcular_idade(int ano){
    int ano_atual=2022;
    
    if(ano>ano_atual || ano<0){
        printf("ERROR: DIGITE UM NUMERO MENOR QUE %d\n" , ano_atual);
     return 0;
    }else{return ano_atual - ano;}
    
    return ano_atual - ano;
}

void boas_vindas(char nome[50] , int idade){
    printf("olá %s, seja muito bem-vindo!!\n" , nome);
    printf("voce tem atualmente %d anos" , idade);
}

int main()
{
    
 char nome[50];
 int idade , ano;

 printf("DIGITE SEU NOME: ");
 scanf("%s" , &nome);

 printf("DIGITE SEU ANO DE NASCIMENTO: ");
 scanf("%d" , &ano);

 idade = calcular_idade(ano);

 boas_vindas(nome , idade);


return 0;
}


// Verificando se é uma data válda
#include <stdio.h>
#include <stdbool.h>

static bool data_certa(int dia, int mes, int ano){
 if((dia>0 && dia<32) && (mes>0 && mes<13) && (ano>0)){
   
  switch(mes){
  case 2: return dia < 28;
 
  case 4: return dia <= 30;
  case 6: return dia <= 30;
  case 9: return dia <= 30;
  case 11: return dia <= 30;
 
  default: return true;
  }
  return true;
 }else{ return false;
}
}

int main()
{
    int dia;
    int mes; 
    int ano; 
    bool valida;
    
    printf("Digite um dia: ");
    scanf("%d" , &dia);
    
    printf("Digite um mes: ");
    scanf("%d" , &mes);
    
    printf("Digite um ano: ");
    scanf("%d" , &ano);
    
    valida = data_certa(dia, mes, ano);
    
    
    if(valida)
     printf("Data valida");
    else
        printf("data errada");
    return 0;
}