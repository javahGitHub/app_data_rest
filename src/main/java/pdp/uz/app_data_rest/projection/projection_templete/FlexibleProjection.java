package pdp.uz.app_data_rest.projection.projection_templete;

import javax.persistence.MappedSuperclass;

/**
 * Interface For do not write same and similar projections several times
 */

@MappedSuperclass
public interface FlexibleProjection {

    int getId();

    String getName();

    boolean isActive();
}
