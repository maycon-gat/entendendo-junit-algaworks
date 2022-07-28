package com.algaworks.junit;

import org.junit.*;

public class EntendendoJunitTest {

    //executa antes de todos os outro testes
    @BeforeClass
    public static void iniciarTestes() {
        System.out.println(">>> public static void iniciarTestes() <<<");
    }

    //executa depois de todos os outros testes
    @AfterClass
    public static void encerrarTestes() {
        System.out.println(">>> public static void encerrarTestes() <<<");
    }    //executa depois de qualquer outro método

    //executa sempre antes de cada teste
    @Before
    public void iniciarTeste() {
        System.out.println(">>> public void iniciarTeste() <<<");
    }

    //executa sempre depois de cada teste
    @After
    public void encerrarTeste() {
        System.out.println(">>> public void encerrarTeste() <<<");
    }

    @Test
    public void testandoAlgo() {
        //validar equals
        String nome = String.format("%s", "Alexandre");
        Assert.assertEquals("Alexandree", nome);
    }

    @Test
    public void testandoOutraCoisa() {
        //validar condicoes
        String str = String.format("%s", "");
        Assert.assertTrue(!str.isEmpty());
    }
}
