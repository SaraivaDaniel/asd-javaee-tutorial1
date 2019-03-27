# asd-javaee-tutorial1
Envio de email Java

## Configurações

Criar um arquivo `src/main/resources/config.properties` com o conteúdo (adaptar conforme necessidade):

```
mail.smtp.host=xxx.xxx.xxx
mail.smtp.port=587
mail.smtp.auth=true
mail.smtp.ssl.trust="*"
mail.smtp.ssl.socketFactory.class=com.javaee.emailsender.ssl.DummySSLSocketFactory
mail.smtp.starttls.enable=true
emailsender.user=
emailsender.password=
```

A opção `mail.smtp.ssl.socketFactory.class` serve para definir a classe responsável por verificar 
a autenticidade do certificado enviado pelo servidor no momento da conexão - no caso criamos uma
classe Dummy para que a aplicação aceite certificados self-signed. (https://www.oracle.com/technetwork/java/sslnotes-150073.txt)

