package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Embeddable
public class BelongingPK {
	
	@ManyToOne
	@JoinColumn(name = "game_id")
	@EqualsAndHashCode.Include
	private Game game;
	
	@ManyToOne
	@JoinColumn(name = "list_id")
	@EqualsAndHashCode.Include
	private GameList list;

}
