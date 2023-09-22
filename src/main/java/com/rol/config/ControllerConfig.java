package com.rol.config;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;


@ControllerAdvice
public class ControllerConfig {

/**
 * La función `initBinder` registra un editor personalizado para la clase `String` que elimina los espacios en blanco
 * de la entrada.
 * 
 * @param binder El parámetro `binder` es una instancia de la clase `WebDataBinder`. Se utiliza para
 * realizar el enlace de datos entre los datos de la solicitud HTTP y los objetos Java. En este caso, lo utilizo para
 * registrar un editor personalizado para la clase `String`.
 */
    @InitBinder
    void initBinder(final WebDataBinder binder) {
        binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
    }

}
