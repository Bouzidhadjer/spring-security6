package ma.enset.hospitalapp.security.repo;

import ma.enset.hospitalapp.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRoleRepository  extends JpaRepository<AppRole, String> {

}
