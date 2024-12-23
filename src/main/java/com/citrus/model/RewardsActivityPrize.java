package com.citrus.model;

import java.math.BigDecimal;

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
public class RewardsActivityPrize implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "ID")
    private Long id;
    private String prizeId;
    private String prizeName;
    private String prizeMerchants;
    private Integer prizeType;
    private String prizeLogo;
    private String prizeFeature;
    private String prizeDesc;
    private Integer prizeOrder;
    private Integer prizeCount;
    private BigDecimal prizeProbability;
    private String editor;
    private Integer startTime;
    private Integer endTime;
    private Integer createTime;
    private Integer updateTime;
    
    private String activityId;
}
