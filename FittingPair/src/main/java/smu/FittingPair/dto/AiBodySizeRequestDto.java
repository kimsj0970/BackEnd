package smu.FittingPair.dto;

import lombok.Data;

@Data
public class AiBodySizeRequestDto {
    private Long chest_size;
    private Long hip_size;
    private Long shoulder_size;
    private Long waist_size;
    private Long height_size;
}
