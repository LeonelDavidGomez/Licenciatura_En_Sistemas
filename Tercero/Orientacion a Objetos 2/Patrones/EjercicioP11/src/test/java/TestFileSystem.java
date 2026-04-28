import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFileSystem {


    private FileSystem fs;

    private Archivo a1, a2, a3;
    private Directorio dirA, dirB, dirC;

    @BeforeEach
    public void setUp() {
        fs = new FileSystem();

        // Archivos
        a1 = new Archivo("Archivo1", LocalDate.of(2023,1,1), 100);
        a2 = new Archivo("Archivo2", LocalDate.of(2024,1,1), 200);
        a3 = new Archivo("Archivo3", LocalDate.of(2022,1,1), 50);

        // Directorios
        dirA = new Directorio("DirA", LocalDate.now());
        dirB = new Directorio("DirB", LocalDate.now());
        dirC = new Directorio("DirC", LocalDate.now());

        // Armar estructura
        dirB.getElementos().add(a1);
        dirA.getElementos().add(dirB);
        dirA.getElementos().add(a2);
        dirC.getElementos().add(a3);

        fs.getElementos().add(dirA);
        fs.getElementos().add(dirC);
    }

    @Test
    public void testTamanoTotal() {
        int esperado = 100 + 200 + 50 + (32*1024)*3; // 3 directorios
        assertEquals(esperado, fs.tamanoTotalocupado());
    }

   

 

    @Test
    public void testBuscarTodos() {
        assertEquals(1, fs.buscarTodos("Archivo1").size());
    }

 
}
