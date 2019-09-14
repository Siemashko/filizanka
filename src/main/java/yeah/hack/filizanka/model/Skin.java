package yeah.hack.filizanka.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Skin {

    @Id
    private Long skinId;

    @ManyToOne(optional = false)
    private Carriage carriage;
}
