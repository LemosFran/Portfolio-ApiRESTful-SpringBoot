# API REST para Gestión de Usuarios

Este proyecto consiste en una API REST desarrollada con Spring Boot para la gestión básica de usuarios.

## Descripción

El objetivo principal de esta API es proporcionar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) para entidades de usuario. Se utiliza una base de datos para almacenar la información de los usuarios, permitiendo su creación, consulta, actualización y eliminación a través de endpoints RESTful.

## Características

- Crear un nuevo usuario con información como nombre, apellido, edad y correo electrónico.
- Consultar la lista de todos los usuarios almacenados en la base de datos.
- Actualizar la información de un usuario existente mediante su identificador.
- Buscar un usuario por su ID para obtener detalles específicos.
- Eliminar un usuario existente según su ID.

## Tecnologías Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- MySql

## Uso

1. Clona este repositorio.
2. Configura la base de datos (agrega credenciales en `application.properties`).
3. Ejecuta la aplicación Spring Boot.
4. Utiliza herramientas como Postman para probar los diferentes endpoints.

## Endpoints

- `POST /api/usuarios`: Crea un nuevo usuario.
- `GET /api/usuarios`: Obtiene la lista de usuarios.
- `PUT /api/usuarios/{id}`: Actualiza la información de un usuario existente.
- `GET /api/usuarios/{id}`: Obtiene detalles de un usuario por su ID.
- `DELETE /api/usuarios/{id}`: Elimina un usuario por su ID.

## Contribución

Siéntete libre de contribuir a este proyecto. Cualquier mejora, corrección de errores o nuevas características son bienvenidas. Abre un Pull Request y estaré encantado de revisarlo.

## Autor

- Nombre: [Franco Ariel Lemos]
- Contacto: [lemosf199@gmail.com]

¡Gracias por visitar este repositorio!
