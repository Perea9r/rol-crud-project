package com.rol.service;

import com.rol.domain.Clases;
import com.rol.model.ClasesDTO;
import com.rol.repos.ClasesRepository;
import com.rol.util.NotFoundException;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;


@Service
public class ClasesService {

    private final ClasesRepository clasesRepository;

    public ClasesService(final ClasesRepository clasesRepository) {
        this.clasesRepository = clasesRepository;
    }

    public List<ClasesDTO> findAll() {
        final List<Clases> clasess = clasesRepository.findAll(Sort.by("id"));
        return clasess.stream()
                .map(clases -> mapToDTO(clases, new ClasesDTO()))
                .toList();
    }

    public ClasesDTO get(final Long id) {
        return clasesRepository.findById(id)
                .map(clases -> mapToDTO(clases, new ClasesDTO()))
                .orElseThrow(NotFoundException::new);
    }

    public Long create(final ClasesDTO clasesDTO) {
        final Clases clases = new Clases();
        mapToEntity(clasesDTO, clases);
        return clasesRepository.save(clases).getId();
    }

    public void update(final Long id, final ClasesDTO clasesDTO) {
        final Clases clases = clasesRepository.findById(id)
                .orElseThrow(NotFoundException::new);
        mapToEntity(clasesDTO, clases);
        clasesRepository.save(clases);
    }

    public void delete(final Long id) {
        clasesRepository.deleteById(id);
    }

    public void guardarJSON(ClasesDTO clasesDTO) {
        String json = mapToJSON(clasesDTO);
        storeJSONToFile(json);
    }

/**
 * La función `mapToDTO` mapea las propiedades de un objeto `Clases` a un objeto `ClasesDTO`.
 * 
 * @param clases Un objeto de la clase Clases, que contiene varias propiedades como id, nombre,
 * nivel, vitalidad, fuerza, destreza, percepcion, inteligencia, carisma, suerte, raza, armas y
 * habilidades.
 * @param clasesDTO El parámetro `clasesDTO` es una instancia de la clase `ClasesDTO`. Se utiliza para
 * almacenar los valores mapeados del objeto `clases`.
 * @return El método devuelve el objeto `clasesDTO`.
 */
    private ClasesDTO mapToDTO(final Clases clases, final ClasesDTO clasesDTO) {
        clasesDTO.setId(clases.getId());
        clasesDTO.setNombre(clases.getNombre());
        clasesDTO.setNivel(clases.getNivel());
        clasesDTO.setVitalidad(clases.getVitalidad());
        clasesDTO.setFuerza(clases.getFuerza());
        clasesDTO.setDestreza(clases.getDestreza());
        clasesDTO.setPercepcion(clases.getPercepcion());
        clasesDTO.setInteligencia(clases.getInteligencia());
        clasesDTO.setCarisma(clases.getCarisma());
        clasesDTO.setSuerte(clases.getSuerte());
        clasesDTO.setRaza(clases.getRaza());
        clasesDTO.setArmas(clases.getArmas());
        clasesDTO.setHabilidades(clases.getHabilidades());
        return clasesDTO;
    }

    private Clases mapToEntity(final ClasesDTO clasesDTO, final Clases clases) {
        clases.setNombre(clasesDTO.getNombre());
        clases.setNivel(clasesDTO.getNivel());
        clases.setVitalidad(clasesDTO.getVitalidad());
        clases.setFuerza(clasesDTO.getFuerza());
        clases.setDestreza(clasesDTO.getDestreza());
        clases.setPercepcion(clasesDTO.getPercepcion());
        clases.setInteligencia(clasesDTO.getInteligencia());
        clases.setCarisma(clasesDTO.getCarisma());
        clases.setSuerte(clasesDTO.getSuerte());
        clases.setRaza(clasesDTO.getRaza());
        clases.setArmas(clasesDTO.getArmas());
        clases.setHabilidades(clasesDTO.getHabilidades());
        
        // Convertir el objeto Clases a JSON y almacenarlo en un archivo
        String json = mapToJSON(clasesDTO);
        storeJSONToFile(json);
        
        return clases;
    }

    public String mapToJSON(final ClasesDTO clasesDTO) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.writeValueAsString(clasesDTO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void storeJSONToFile(String json) {
        String filePath = "./personajes_guardados/personajes.json"; // Ruta del archivo de salida en la carpeta raíz del proyecto
        
        try {
            // Crear un objeto ObjectMapper
            ObjectMapper objectMapper = new ObjectMapper();
            
            // Escribir el JSON en el archivo
            objectMapper.writeValue(new File(filePath), json);
            
            System.out.println("El archivo JSON se ha almacenado exitosamente en " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
