import static org.junit.jupiter.api.Assertions.*;

class Day1Test {

    @org.junit.jupiter.api.Test
    void getInput() {
    }

    @org.junit.jupiter.api.Test
    void inputHandler() {
    }

    @org.junit.jupiter.api.Test
    void showMenu() {
    }

    @org.junit.jupiter.api.Test
    void read() {
    }

    @org.junit.jupiter.api.Test
    void add() {
        Day1.Add("1");
        assertEquals(1, Day1.listService.size());

        Day1.Add("2");
        Day1.Add("3");
        assertEquals(3, Day1.listService.size());
    }

    @org.junit.jupiter.api.Test
    void update() {
    }

    @org.junit.jupiter.api.Test
    void delete() {
    }

    @org.junit.jupiter.api.Test
    void exit() {
    }
}