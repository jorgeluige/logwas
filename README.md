# Aplicativo para Teste de Geração de Logs

- Para usar basta fazer o clone do projeto, editar o log4j2.xml com o caminho do log desejado e rodar o comando **mvn clean package**, o pacote **logwas.war** será gerado no \target<p>
 **OBS: Você precisa ter o maven instalado e configurado na sua estação de trabalho**

   - Por padrão o log4j2.xml vai configurado para gerar log em "C:\logs\logapp.log":
	
	RollingFile name="RollingFile" filename="**C:\logs\logapp.log**" filepattern="${logPath}/%d{yyyyMMddHHmmss}-fargo.log" 
----------


![image](https://user-images.githubusercontent.com/37905961/185829192-747920bd-4565-4f0b-9bcf-f94c777e0326.png)
	
---------
**mvn clean package** dentro do diretório do projeto, é necessário ter o **Maven** instalado e configurado. 
	
![image](https://user-images.githubusercontent.com/37905961/185829796-ad041dab-9da7-438c-9f6e-18681821bd21.png)
![image](https://user-images.githubusercontent.com/37905961/185829951-5b48036e-f3a5-4ff7-aeba-813ba1c9acde.png)
	
	
- O **url-pattern** está configuradp para **/Log**, por isso ao abrir o aplicativo não esqueça de usar o **/Log** ao final da URL. 

![image](https://user-images.githubusercontent.com/37905961/185830522-894dcaef-f3c9-464d-a5e9-95aa197d65e4.png)

