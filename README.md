✅ 1. Frontend
Repositorio Angular: github.com/duqueadu/AngularPruebaJuanDuque

✅ 2. Arquitectura Hexagonal (Backend)
Capas:

plaintext
Copiar
Editar
REST Controller  →  UseCases  →  Domain  →  Persistence Adapter
✅ 3. Configuración mínima (src/main/resources/application.properties)

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
✅ 4. Ejecutar Backend
Linux/Mac:

bash
Copiar
Editar
./mvnw spring-boot:run
Windows:

bash
Copiar
Editar
mvn spring-boot:run
📍 URL: http://localhost:8081

✅ 5. Requisitos

PostgreSQL en localhost:5432

BD db_juan_duque

Usuario auth_user / securepassword123

Controlador REST mínimo
