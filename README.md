Para gerar a classe java a partir do wsdl ultilize o comando.
execute esse comando na pasta onde quer guardar os arquivos.

wsimport -keep -verbose -extension https://servicos.saude.gov.br/cnes/CnesService/v1r0?wsdl

crie um projeto java ou coloque os arquivos dentro de um projeto existente.

utilizei o Spring io para criar um projeto padrão, porem voce pode colocar esses arquivos dentro do seu projeto ja existe ao qual deseja integrar.
	https://start.spring.io/

