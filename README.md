# Aplicativo para Teste de Geração de Logs

- Para usar basta fazer o clone do projeto, editar o log4j2.xml com o caminho do log desejado e rodar o comando **mvn clean package**, o pacote **logwas.war** será gerado no \target<p>
 **OBS: Você precisa ter o maven instalado e configurado na sua estação de trabalho**

   - Por padrão o log4j2.xml vai configurado para gerar log em "C:\logs\logapp.log":
	
	RollingFile name="RollingFile" filename="**C:\logs\logapp.log**" filepattern="${logPath}/%d{yyyyMMddHHmmss}-fargo.log" 
----------

- O **url-pattern** está configuradp para **/Log**, por isso ao abrir o aplicativo não esqueça de usar o **/Log** ao final da URL.  

![image](https://user-images.githubusercontent.com/37905961/185829192-747920bd-4565-4f0b-9bcf-f94c777e0326.png)
