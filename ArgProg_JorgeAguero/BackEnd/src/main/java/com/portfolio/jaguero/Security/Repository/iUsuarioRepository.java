
package com.portfolio.jaguero.Security.Repository;


import com.portfolio.jaguero.Security.Entity.Usuario;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */

@Repository
public interface iUsuarioRepository extends JpaRepository<Usuario,Integer>{
     Optional<Usuario> findByNombreUsuario(String nombreUsuario);
     
     boolean  existsByNombreUsuario(String nombreUsuario);
     boolean  existsByEmail(String email);
    
}
