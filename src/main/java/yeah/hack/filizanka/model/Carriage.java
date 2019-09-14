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
public class Carriage {

    @Id
    private Long carriageId;

    private CarriageType carriageType;

    private enum CarriageType {
        CARRIAGE_1, CARRIAGE_2, CARRIAGE_3
    }
}
