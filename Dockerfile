# 该镜像需要依赖的基础镜像
FROM openjdk:11

COPY /target/app-1.0-SNAPSHOT.jar /home/app.jar
EXPOSE 8888
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/home/app.jar"]
