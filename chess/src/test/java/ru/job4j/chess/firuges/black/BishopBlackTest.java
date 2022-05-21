package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenBishopIsOnC8() {
        Figure bishop = new BishopBlack(Cell.C8);
        assertThat(Cell.C8, is(bishop.position()));
    }

    @Test
    public void whenNewPositionIsActual() {
        Figure bishop = new BishopBlack(Cell.F8);
        Figure secondBishop = bishop.copy(Cell.H6);
        assertThat(Cell.H6, is(secondBishop.position()));
    }

    @Test
    public void whenBishopWayFromC1ToG5() {
        Figure bishop = new BishopBlack(Cell.C1);
        Cell[] rsl = bishop.way(Cell.G5);
        assertThat(rsl, is(new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5}));
    }
}