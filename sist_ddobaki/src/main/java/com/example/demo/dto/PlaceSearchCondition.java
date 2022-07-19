package com.example.demo.dto;

import lombok.Data;

@Data
public class PlaceSearchCondition {
	private Integer place_region_num;

	private Integer place_type_num;

	private String place_name;

	private Integer place_park;

	private Integer place_spa;

	private Integer place_meal;

	private Integer place_weight;

}