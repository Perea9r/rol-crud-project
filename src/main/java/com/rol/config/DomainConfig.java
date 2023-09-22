package com.rol.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

 /* La clase `DomainConfig` es una configuración de Spring que define un bean. Proporciona configuraciones relacionadas con el dominio de la aplicación.
 * 
 * Esta clase tiene las siguientes anotaciones:
 * - `@Configuration`: Indica que esta clase es una configuración de Spring y define un bean.
 * - `@EntityScan("com.rol.domain")`: Escanea el paquete `com.rol.domain` en busca de clases anotadas con `@Entity`, que representan tablas en una base de datos.
 * - `@EnableJpaRepositories("com.rol.repos")`: Habilita la funcionalidad de los repositorios de Spring Data JPA en el paquete `com.rol.repos`, que son interfaces para interactuar con la base de datos.
 * - `@EnableTransactionManagement`: Habilita la administración de transacciones en los métodos de esta clase, asegurando la integridad y coherencia de los datos al realizar operaciones de base de datos.
 */
@Configuration
@EntityScan("com.rol.domain")
@EnableJpaRepositories("com.rol.repos")
@EnableTransactionManagement
public class DomainConfig {
}
