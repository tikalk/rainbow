package app.model;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.Data;
import org.omg.CORBA.portable.Streamable;
import org.springframework.data.annotation.Id;

import java.util.Date;

/**
 * Created by lev on 3/21/16.
 */
@Data
public class RainbowModel {
    // TODO: 5/15/16 private id and public id
    @Id
    private String id;
    private Date data;
    private double lon;
    private double lat;
    private RainbowType type;

}
