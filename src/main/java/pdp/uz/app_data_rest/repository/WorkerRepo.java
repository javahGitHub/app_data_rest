package pdp.uz.app_data_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pdp.uz.app_data_rest.entity.Worker;
import pdp.uz.app_data_rest.projection.WorkerProjection;

import javax.jnlp.IntegrationService;

@RepositoryRestResource(path = "worker",excerptProjection = WorkerProjection.class)
public interface WorkerRepo extends JpaRepository<Worker, Integer>{

}
