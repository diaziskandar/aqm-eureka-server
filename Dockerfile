FROM eclipse-temurin:17-jdk
WORKDIR /app

# Menyalin file JAR hasil build ke dalam WORKDIR (/app/app.jar)
COPY target/eurekaerp-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

# Jalankan jar dengan merujuk langsung ke file di dalam WORKDIR
ENTRYPOINT ["java", "-jar", "app.jar"]