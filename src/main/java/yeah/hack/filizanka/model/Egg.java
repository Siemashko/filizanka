package yeah.hack.filizanka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Egg {

    @Id
    @Column(name = "egg_id")
    private Long eggId;

    private double kilometersGoal;

    private double kilometersCollected;

}
