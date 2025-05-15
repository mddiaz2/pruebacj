# 📦 persona-cliente-service

Microservicio backend desarrollado con **Spring Boot** que gestiona clientes y personas, con persistencia en **MySQL** y contenedorizado mediante **Docker**.

---

## Tecnologías

- Java 17
- Spring Boot 3.4.5
- Spring Data JPA
- MySQL 8
- Maven
- Docker / Docker Compose

---

## Cómo levantar el proyecto con Docker

### 1. Clonar el repositorio

```bash
git clone https://github.com/mddiaz2/pruebacj.git
cd pruebacj
```

### 2. Compilar la aplicación

Asegúrate de tener Maven instalado localmente:

```bash
mvn clean package -DskipTests
```

### 3. Levantar con Docker Compose

```bash
docker-compose up --build
```

Esto:
- Compila y construye la imagen Docker del microservicio
- Levanta una base de datos MySQL con los datos de configuración
- Expone la API REST en `http://localhost:8081`

---

## Conexión a base de datos

- Host: `localhost`
- Puerto: `3307`
- Usuario: `appuser`
- Contraseña: `app123`
- Base de datos: `personadb`

---

## Endpoints principales

| Método | Endpoint             | Descripción              |
|--------|----------------------|--------------------------|
| GET    | `/clientes`          | Listar todos los clientes|
| POST   | `/clientes`          | Crear un nuevo cliente   |
| GET    | `/clientes/{id}`     | Obtener cliente por ID   |
| DELETE | `/clientes/{id}`     | Eliminar cliente por ID  |

---

## Ejemplo de JSON para crear cliente (`POST /clientes`)

```json
{
  "identificacion": "1717706830",
  "nombre": "Carlos Pérez",
  "genero": "Masculino",
  "edad": 28,
  "direccion": "Av. Quito y El Inca",
  "telefono": "0987654321",
  "contrasena": "clave123",
  "estado": true
}
```

---

## Comandos útiles

```bash
# Detener y eliminar contenedores
docker-compose down

# Ver logs
docker-compose logs -f

# Ver solo logs del microservicio
docker-compose logs -f persona-service
```

---

## Estructura del proyecto

```
persona-cliente-service/
├── src/
├── pom.xml
├── Dockerfile
├── docker-compose.yml
├── README.md
```
