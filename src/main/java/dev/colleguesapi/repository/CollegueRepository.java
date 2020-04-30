/**
 * 
 */
package dev.colleguesapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.colleguesapi.entites.Collegue;

/** Représentation d'un repository collègue
 *
 *
 *
 */
public interface CollegueRepository extends JpaRepository<Collegue, Integer> {

}
