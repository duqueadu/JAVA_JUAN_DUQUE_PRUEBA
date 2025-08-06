✅ 1. ¿CÓMO FUNCIONA LA ARQUITECTURA HEXAGONAL?
La arquitectura hexagonal (o limpia) divide el sistema en capas:

pgsql
Copiar
Editar
              +-------------------+
              |  REST Controller  | ← Adapter (entrada)
              +-------------------+
                        ↓
            +------------------------+
            |  Application (UseCases)| ← Orquesta acciones
            +------------------------+
                        ↓
              +-------------------+
              |     Domain        | ← Entidades y lógica
              +-------------------+
                        ↓
           +------------------------+
           | Persistence Adapter    | ← JPA Repository / DB
           +------------------------+
✅ 2. ARCHIVOS MÍNIMOS PARA QUE FUNCIONE
src/main/resources/application.properties
properties
Copiar
Editar
server.port=8081

spring.datasource.url=jdbc:postgresql://localhost:5432/db_juan_duque
spring.datasource.username=auth_user
spring.datasource.password=securepassword123

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
✅ 3. ¿CÓMO EJECUTAR EL PROYECTO?
👉 Si estás en Spring Boot con Maven:
Abre terminal en la raíz del proyecto.

Ejecuta:

bash
Copiar
Editar
./mvnw spring-boot:run
O si estás en Windows:

bash
Copiar
Editar
mvn spring-boot:run
El backend se levantará en:

arduino
Copiar
Editar
http://localhost:8081
✅ 4. ¿QUÉ NECESITAS PARA QUE FUNCIONE?
Base de datos PostgreSQL levantada en localhost:5432

Base de datos creada: db_juan_duque

Usuario: auth_user, contraseña: securepassword123

Un controlador REST mínimo que responda algo

