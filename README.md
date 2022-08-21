# Aplicativo para Teste de Geração de Logs

- Para usar basta fazer o clone do projeto, editar o log4j2.xml com o caminho do log desejado e rodar o comando mvn clean package, **OBS: Você precisa ter o maven instalado e configurado na sua estação de trabaçho**

   - Por padrão o log4j2.xml vai configurado para gerar log em "C:\logs\logapp.log":
	<RollingFile name="RollingFile" filename="C:\logs\logapp.log" filepattern="${logPath}/%d{yyyyMMddHHmmss}-fargo.log" >

