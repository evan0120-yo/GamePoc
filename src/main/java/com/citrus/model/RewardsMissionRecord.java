package com.citrus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RewardsMissionRecord implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
    private Long id;
    private String userGid;
    private Long memberId;
    private String missionId;
    private Integer state;
    private Integer updateTime;
    
	private String activityId;
}
