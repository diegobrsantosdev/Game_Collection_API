package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	@EqualsAndHashCode.Include
	private BelongingPK id = new BelongingPK();
	
	private Integer position;

	public Belonging(Game game, GameList list, Integer position) {
		this.id.setGame(game);
		this.id.setList(list);
		this.position = position;
	}

		
}
