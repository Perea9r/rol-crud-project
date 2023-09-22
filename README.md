# Rol

Este proyecto crea una hoja de rol muy simple, es para practicar con CRUD.

## Development

Actualiza la conexión a la base de datos local en `application.properties` o crea tu propio archivo `application-local.properties` para sobrescribir los ajustes.

Se recomienda usar el perfil local. En IntelliJ, se puede agregar `-Dspring.profiles.active=local` en las opciones VM de la configuración de ejecución después de habilitar esta propiedad en "Modificar opciones".

Además de la aplicación Spring Boot, también se debe iniciar el DevServer. [Node.js](https://nodejs.org/es) debe estar instalado: se recomienda la última versión LTS. En el primer uso y después de las actualizaciones, se deben instalar las dependencias:

```
npm install

```

## Build

La aplicación se puede construir utilizando el siguiente comando:

```
mvnw clean package
```

Node.js se descarga automaticamente utilizando el complemento `frontend-maven-plugin` y los archivos JS/CSS finales se integran en el archivo jar.

```

## Further readings

* [Maven docs](https://maven.apache.org/guides/index.html)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/)  
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Webpack concepts](https://webpack.js.org/concepts/)  
* [npm docs](https://docs.npmjs.com/)  
* [Tailwind CSS](https://tailwindcss.com/)  
