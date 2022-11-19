package systemTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ListaTest {

    private Lista list;
    private Pessoa pessoa;

    @BeforeEach
    public void setUp(){
        this.list = new Lista();
    }

    @Test
    public void testEmptyTrue() {
        Lista list = this.list;
        Assertions.assertTrue(list.isEmpty());
    }

    @Test
    public void TestEmptyFalse(){
        pessoa = new Pessoa(123, "Lucas");
        list.addList(pessoa);
        Assertions.assertTrue(!list.isEmpty());
    }

    @Test
    public void testSizeEmpty() {
        Lista list = this.list;
        int expected = 0;
        int actual = list.size();
        Assertions.assertEquals(expected, actual);
    }

}