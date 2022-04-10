package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.AttachmentContent;

import java.util.Optional;


public interface AttachmentContentRepo extends JpaRepository<AttachmentContent,Integer> {

    Optional<AttachmentContent> findByAttachmentId(int id);
}
