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
public class RewardsMission implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
	private Long id;
	private String missionId;
	private String missionTag;
	private String missionUrl;
	private String missionLogo;
	private String missionTitle;
	private String missionDesc;
	private Integer missionOrder;
	private Integer prizeCoins;
	private String editor;
	private Integer isValid;
	private Integer startTime;
	private Integer endTime;
	private Integer updateTime;
	
	private String activityId;
	private String missionRule;
}
