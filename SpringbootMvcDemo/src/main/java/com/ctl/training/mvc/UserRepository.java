/**
 * 
 */
package com.ctl.training.mvc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Rajesh
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

}
