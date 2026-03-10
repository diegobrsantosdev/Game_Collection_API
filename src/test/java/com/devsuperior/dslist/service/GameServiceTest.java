package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.exceptions.ResourceNotFoundException;
import com.devsuperior.dslist.services.GameService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GameServiceTest {

    @InjectMocks
    private GameService gameService;

    @Mock
    private GameRepository gameRepository;

    private Game game;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        game = new Game(1L, "Zelda", 2023, "Adventure", "Switch", 9.5, "img.png", "Short desc", "Long desc");
    }

    @Test
    void findByIdShouldReturnGameDTOWhenIdExists() {
        when(gameRepository.findById(1L)).thenReturn(Optional.of(game));

        GameDTO result = gameService.findById(1L);

        assertNotNull(result);
        assertEquals(game.getTitle(), result.getTitle());
        verify(gameRepository, times(1)).findById(1L);
    }

    @Test
    void findByIdShouldThrowExceptionWhenIdNotFound() {
        when(gameRepository.findById(999L)).thenReturn(Optional.empty());

        ResourceNotFoundException exception = assertThrows(ResourceNotFoundException.class, () -> gameService.findById(999L));
        assertEquals("Game not found with id 999", exception.getMessage());
        verify(gameRepository, times(1)).findById(999L);
    }
}