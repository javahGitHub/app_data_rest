package pdp.uz.app_data_rest.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    private String message;
    private int id;
    private boolean success;

    public Result( String message,boolean success) {
        this.success = success;
        this.message = message;
    }

    public Result(String message, boolean success ,int id) {
        this.message = message;
        this.id = id;
        this.success = success;
    }
}
