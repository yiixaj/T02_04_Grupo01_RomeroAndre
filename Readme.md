# Sistema de Gestión de Minimercado (SGM) - Tarea T02_03

Este proyecto corresponde al desarrollo del backend de un Sistema de Gestión para Minimercados (SGM), cumpliendo con los requisitos establecidos en la Tarea T02_03. Está construido utilizando **Java 17**, **Spring Boot 3.5.x** y una arquitectura basada en capas (modelo, repositorio, servicio, controlador). Además, se han incorporado herramientas de documentación y pruebas para garantizar la calidad del código.

---

## 👥 Miembros del grupo

- Andre Alessandro Romero Martínez  
- Katherine Leonor Moran Zavala  
- Luis Daniel Montaleza Ortiz  

---

## 📦 Funcionalidades principales

El sistema implementa CRUD completo para las siguientes entidades:

- Categoría  
- Producto  
- Proveedor  
- Cliente  
- Usuario  
- Orden de Compra  
- Venta  
- Caja  

---

## ⚙️ Tecnologías utilizadas

- Java 17  
- Spring Boot  
- Spring Data JPA  
- MySQL  
- Springdoc OpenAPI (Swagger)  
- Maven  
- JUnit5, Mockito, AssertJ  
- JaCoCo para análisis de cobertura  

---

🧪 Pruebas unitarias y cobertura
Se implementaron pruebas unitarias utilizando:

JUnit 5 para estructura de pruebas

Mockito para simular dependencias (mocks)

AssertJ para validaciones claras

JaCoCo para analizar la cobertura del código

El análisis de cobertura global alcanzó un 63%, cumpliendo con el requisito mínimo del 60%. Las pruebas abarcan los servicios y controladores principales, validando tanto operaciones de lectura como escritura.

Para generar el reporte:


./mvnw clean test

./mvnw jacoco:report

Abrir el archivo generado:

target/site/jacoco/index.html
