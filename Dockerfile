FROM openjdk:8

EXPOSE 8080

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} coffe-shop-docker.jar
 ENTRYPOINT ["java", "-jar", "coffe-shop-docker.jar"]

# FROM openjdk:8
# EXPOSE 8080
# ADD target/coffe-shop-docker.jar coffe-shop-docker.jar
# RUN mkdir -p /opt/conf
# COPY application.properties /opt/conf/application.properties
# ENTRYPOINT ["java","-jar","coffe-shop-docker.jar",  "--spring.config.location=file:/opt/conf/application.properties"]



# FROM openjdk:8
#
# EXPOSE 8080
#
# ARG JAR_FILE=target/*.jar
#
# COPY ${JAR_FILE} coffe-shop-docker.jar
#  ENTRYPOINT ["java", "-jar", "coffe-shop-docker.jar"]
#
# # Install MySQL client
# RUN apt-get update && apt-get install -y mysql-client
#
# # Create a directory for the application and set it as the working directory
# RUN mkdir /app
# WORKDIR /app
#
# # Copy the application JAR file to the container
# COPY target/*.jar coffe-shop-docker.jar
#
# # Expose port 8083 for the application
# EXPOSE 8080
#
# # Set environment variables for the database connection
# ENV DB_HOST=jdbc:mysql://localhost
# ENV DB_PORT=3306
# ENV DB_NAME=coffe_shop
# ENV DB_USER=root
# ENV DB_PASSWORD=root
#
# # Set the command to run the application
# CMD ["java", "-jar", "coffe-shop-docker.jar"]



