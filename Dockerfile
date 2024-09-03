# Use an official Apache TomEE image with JDK 17 on Ubuntu
FROM tomee:jre17-ubuntu-plus

# Copy the hello-world.war into the webapps directory of TomEE
COPY target/hello-world-api.war /usr/local/tomee/webapps/

# Expose the port on which TomEE listens
EXPOSE 8080
