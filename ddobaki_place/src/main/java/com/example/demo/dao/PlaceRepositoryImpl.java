package com.example.demo.dao;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.vo.Place;
import com.example.demo.vo.PlaceSearchCondition;
import com.example.demo.vo.QPlace;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

public class PlaceRepositoryImpl implements PlaceRepositoryCustom{
	@Autowired
	JPAQueryFactory factory;

	QPlace p = QPlace.place;
	
	@Override
	public List<Place> searchTest(PlaceSearchCondition condition) {

		int place_region_num = condition.getPlace_region_num();
		int place_type_num = condition.getPlace_type_num();
		String place_name = condition.getPlace_name();
		int place_park = condition.getPlace_park();
		int place_spa = condition.getPlace_spa();
		int place_meal = condition.getPlace_spa();
		int place_weight = condition.getPlace_weight();

		return factory.selectFrom(p)
				.where(placeRegionNumEquals(place_region_num), placeTypeNumEquals(place_type_num),
						placeNameLike(place_name), placeParkEquals(place_park), placeSpaEquals(place_spa),
						placeMealEquals(place_meal), placeSpaEquals(place_spa), placeWeightEquals(place_weight))
				.fetch();
	}

	private BooleanExpression placeRegionNumEquals(int place_region_num) {
		return Objects.isNull(place_region_num) ? null : p.place_region_num.eq(place_region_num);
	}

	private BooleanExpression placeTypeNumEquals(int place_type_num) {
		return Objects.isNull(place_type_num) ? null : p.place_type_num.eq(place_type_num);
	}

	private BooleanExpression placeNameLike(String place_name) {
		return Objects.isNull(place_name) ? null : p.place_name.like(place_name);
	}

	private BooleanExpression placeParkEquals(int place_park) {
		return Objects.isNull(place_park) ? null : p.place_park.eq(place_park);
	}

	private BooleanExpression placeMealEquals(int place_meal) {
		return Objects.isNull(place_meal) ? null : p.place_meal.eq(place_meal);
	}

	private BooleanExpression placeSpaEquals(int place_spa) {
		return Objects.isNull(place_spa) ? null : p.place_meal.eq(place_spa);
	}

	private BooleanExpression placeWeightEquals(int place_weight) {
		return Objects.isNull(place_weight) ? null : p.place_weight.eq(place_weight);
	}
	
	

}
