package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.entities.GameList;
import com.devsuperior.dslist.repositories.GameListRepository;
import com.devsuperior.dslist.repositories.GameRepository;
import com.devsuperior.dslist.services.GameListService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class GameListServiceTest {

    @InjectMocks
    private GameListService gameListService;

    @Mock
    private GameListRepository gameListRepository;

    @Mock
    private GameRepository gameRepository;

    private GameList list1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        list1 = new GameList(1L, "Favorites");
    }

    @Test
    void findAllShouldReturnListOfDTOs() {
        when(gameListRepository.findAll()).thenReturn(Arrays.asList(list1));

        List<GameListDTO> result = gameListService.findAll();

        assertNotNull(result);
        assertEquals(1, result.size());
        assertEquals("Favorites", result.get(0).getName());
        verify(gameListRepository, times(1)).findAll();
    }

}
