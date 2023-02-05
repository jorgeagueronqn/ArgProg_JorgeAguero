package com.portfolio.jaguero.Security.Service;

import com.portfolio.jaguero.Security.Entity.Rol;
import com.portfolio.jaguero.Security.Enums.RolNombre;
import com.portfolio.jaguero.Security.Repository.iRolRepository;

import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Jorge
 */
@Service
@Transactional
public class RolService {

    @Autowired
    iRolRepository  iRolRepository;

    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        
        return iRolRepository.findByRolNombre(rolNombre);
    }
    public void save(Rol rol) {
        iRolRepository.save(rol);
    }
}
