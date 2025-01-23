package com.devsuperior.dslist.entities;
import com.devsuperior.dslist.entities.GameList;


@SuppressWarnings("unused")
public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
		
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	
}
