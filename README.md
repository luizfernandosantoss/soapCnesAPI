# Para gerar a classe java a partir do wsdl ultilize o comando.
```
wsimport -keep -verbose -extension https://servicos.saude.gov.br/cnes/EstabelecimentoSaudeService/v1r0?wsdl
```
```
wsimport -keep -verbose -extension https://servicos.saude.gov.br/cnes/CnesService/v1r0?wsdl
```
execute esse comando na pasta onde quer guardar os arquivos.

Documentação do serviço
```
http://datasus.saude.gov.br/images/Interoperabilidade/Especificacao_Tecnica_para_Integracao_com_o_Cadastro_Nacional_de_Estabelecimentos_de_Sade_v1-20.pdf
```
```
http://datasus.saude.gov.br/images/Interoperabilidade/Especificao%20Tcnica%20para%20Integrao%20com%20o%20Cadastro%20Nacional%20de%20Estabelecimentos%20de%20Sade%20v1-13.pdf
```

# Crie um projeto java ou coloque os arquivos dentro de um projeto existente.
#### utilizei o Spring io para criar um projeto padrão, porem voce pode colocar esses arquivos dentro do seu projeto ja existe ao qual deseja integrar.
```
https://start.spring.io/
```

## Deletar todos os arquivos .class
### No Windons
```
DEL /s *.class
```
## No linux 
```
rm -rf *.class
```

a requisição  autentica ultilizando header no body, voce deve criar uma Classe que implementa o SOAPHandler para configurar o header antes de enviar a requisição.

Foi adicionado no projeto swagger para documentação das URL
```
http://localhost:8080/swagger-ui.html#
```

Esse projeto esta muito simples e não valida os campos.
segue o exemplos de request
```
http://localhost:8080/estabelecimento/consultarPorCNES/2688689
```
```
http://localhost:8080/estabelecimento/consultarPorCNPJ/62779145000190
```
```
http://localhost:8080/cnes/buscarPorCNES/7546149
```



