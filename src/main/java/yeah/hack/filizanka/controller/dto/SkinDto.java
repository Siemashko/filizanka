package yeah.hack.filizanka.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import yeah.hack.filizanka.model.Skin;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SkinDto {

    private Long skinId;

    private Long carriageId;

    public static SkinDto from(Skin source) {
        return SkinDto.builder()
                .skinId(source.getSkinId())
                .carriageId(source.getCarriage().getCarriageId())
                .build();
    }

}
