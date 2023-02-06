
package com.portfolio.jaguero.Security.Repository;

import com.portfolio.jaguero.Security.Entity.Rol;
import com.portfolio.jaguero.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public interface iRolRepository extends JpaRepository<Rol,Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
