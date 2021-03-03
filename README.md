
## :white_check_mark: Java Project with Spring Boot REST API
Este sistema refere-se a uma representação simples de uma corretora de valores, onde podemos investir e simular investimentos diversos. Neste projeto, foi focado especialmente na Renda Fixa, como o [Tesouro Direto](https://www.tesourodireto.com.br/titulos/precos-e-taxas.htm#0) e o CDB. 

<span align="center">

![diagrama](https://github.com/gisele-araujo/project-ac1/blob/main/documentacao/diagrama-classes.png)

</span>

> A classe "RendaFixa" foi implementada como classe abstrata principalmente pelo fato das classes herdeiras ("TesouroDireto" e "Cdb") serem tipos de investimento em Renda fixa que possuem várias características em comum, como valor inicial, rentabilidade, prazo e desconto de imposto de renda. Já a classe "TesouroDireto" também é uma classe abstrata, pois o próprio Tesouro Direto possui vários tipos de títulos a serem investidos, o Tesouro IPCA+ e Tesouro Prefixado são um deles. Ambos investimentos possibilitam aportes mensais e possuem uma taxa fixa de 0.25% por ano da B3, além do IR. O CDB por sua vez, não possui taxa b3 e aportes mensais, apenas desconto de IR e aplicação única. A rentabilidade do CDB tem como referência a taxa CDI, que atualmente está de 1.90% por ano. Para mais informações a respeito deste assunto, acesse o doc disponível na pasta documentacao deste repositório.

Desenvolvido no terceiro semestre do curso de análise e desenvolvimento de sistemas, para as disciplinas de estrutura de dados e armazenamento e programação web. São Paulo, Março de 2021.
