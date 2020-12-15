#CONTEÚDO DO Dockerfile
FROM ubuntu:18

RUN apt-get install -y "java"
RUN apt-get install -y git-scm
RUN git clone  https://user:70d4b9c185df1c466ac69e255b804adab099ee1c@github.com/Prof-daniel-Fiap/api-exemplo
RUN cd api-exemplo
RUN mvn -Pprod

CMD "java -jar path"

EXPOSE 8080 
