package com.portfolio.jaguero.Interface;

import com.portfolio.jaguero.Entity.Persona;
import java.util.List;

/**
 *
 * @author Jorge
 */
public interface IPersonaService {

    public List<Persona> getPersona();

    public void SavePersona(Persona persona);

    public void deletePersona(Long id);

    public Persona findPersona(Long id);

}
