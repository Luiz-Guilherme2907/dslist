package com.devsuperior.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.demo.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
