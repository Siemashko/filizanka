package yeah.hack.filizanka.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Point {

    @Id
    private Long stationId;

    private String stationName;

    private Double lng;

    private Double lat;

    private boolean station;
}
