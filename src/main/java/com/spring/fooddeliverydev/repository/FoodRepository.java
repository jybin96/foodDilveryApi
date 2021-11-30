package com.spring.fooddeliverydev.repository;

import com.spring.fooddeliverydev.mapping.FoodMapping;
import com.spring.fooddeliverydev.model.Food;
import com.spring.fooddeliverydev.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface FoodRepository extends JpaRepository<Food,Long> {
    List<FoodMapping> findAllByRestaurant(Restaurant restaurant);
    Optional<Food> findByName(String name);
}
