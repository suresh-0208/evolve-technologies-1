FROM openjdk:17-jdk-slim
# Copy the WAR file into the container
COPY target/evolve-technologies-web.war /app/evolve-technologies-web.war

# Expose port 8080
EXPOSE 8080

# Run the WAR file
ENTRYPOINT ["java", "-jar", "/app/evolve-technologies-web.war"]
