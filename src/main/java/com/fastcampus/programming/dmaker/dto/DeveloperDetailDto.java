package com.fastcampus.programming.dmaker.dto;

import com.fastcampus.programming.dmaker.code.StatusCode;
import com.fastcampus.programming.dmaker.entity.Developer;
import com.fastcampus.programming.dmaker.type.DeveloperLevel;
import com.fastcampus.programming.dmaker.type.DeveloperSkillType;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DeveloperDetailDto {
    private DeveloperLevel developerLevel;
    private DeveloperSkillType developerSkillType;
    private StatusCode statusCode;
    private Integer experienceYear;
    private String memberId;
    private String name;
    private Integer age;

    public static DeveloperDetailDto fromEntity(Developer developer){
        return DeveloperDetailDto.builder()
                .developerLevel(developer.getDeveloperLevel())
                .developerSkillType(developer.getDeveloperSkillType())
                .experienceYear(developer.getExperienceYear())
                .memberId(developer.getMemberId())
                .name(developer.getName())
                .age(developer.getAge())
                .statusCode(developer.getStatusCode())
                .build();
    }

}
