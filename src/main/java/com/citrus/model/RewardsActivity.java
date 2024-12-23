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
public class RewardsActivity implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
    private Long id;
    private String activityName;
    private String activityTitle;
    private Integer activityType;
    private Integer activityCost;
    private String activityCreator;
    private Integer onlineStatus;
    private String editor;
    private Integer startTime;
    private Integer endTime;
    private Integer createTime;
    private Integer updateTime;
    
    private String activityId;
    private String activityRule;
}
