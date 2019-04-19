FROM 192.168.99.101:5000/alpn-jre8-cst:v1.0
VOLUME /tmp
ADD target/eureka-server-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
#ENTRYPOINT ["java","-Xmx512m","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]

EXPOSE 8751
