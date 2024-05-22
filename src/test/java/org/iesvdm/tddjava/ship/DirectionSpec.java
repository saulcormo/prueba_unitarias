package org.iesvdm.tddjava.ship;

import org.testng.annotations.*;
import static org.testng.Assert.*;
.
@Test
public class DirectionSpec {

    @Test
    public void whenGetFromShortNameNThenReturnDirectionN() {
        Direction direction = Direction.getFromShortName('N');
        assertEquals(Direction.NORTH, direction);
    }
    @Test
    public void whenGetFromShortNameWThenReturnDirectionW() {
        Direction direction = Direction.getFromShortName('W');
        assertEquals(Direction.WEST, direction);
    }

    @Test
    public void whenGetFromShortNameBThenReturnNone() {
        Direction direction = Direction.getFromShortName('B');
        assertEquals(Direction.NONE, direction);
    }

    @Test
    public void givenSWhenLeftThenE() {
        Direction initialDirection = Direction.SOUTH;
        Direction expectedDirection = Direction.EAST;
        Direction newDirection = initialDirection.turnLeft();
        assertEquals(expectedDirection, newDirection);
    }

    @Test
    public void givenNWhenLeftThenW() {
        Direction initialDirection = Direction.NORTH;
        Direction expectedDirection = Direction.WEST;
        Direction newDirection = initialDirection.turnLeft();
        assertEquals(expectedDirection, newDirection);
    }

    @Test
    public void givenSWhenRightThenW() {
        Direction initialDirection = Direction.SOUTH;
        Direction expectedDirection = Direction.WEST;
        Direction newDirection = initialDirection.turnRight();
        assertEquals(expectedDirection, newDirection);
    }

    @Test
    public void givenWWhenRightThenN() {
        Direction initialDirection = Direction.WEST;
        Direction expectedDirection = Direction.NORTH;
        Direction newDirection = initialDirection.turnRight();
        assertEquals(expectedDirection, newDirection);
    }
}

