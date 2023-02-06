package com.portfolio.jaguero.Repository;

import com.portfolio.jaguero.Entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Jorge
 */
@Repository
public interface IPersonaRepository extends JpaRepository<Persona, Long> {

}
