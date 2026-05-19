import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlanTest {
	  // ── Plan Médico Obligatorio ──────────────────────────────────────

    @Test
    public void testPlanMedicoObligatorioSinCoseguro() {
        // Pedro: salario 100.000, 2 familiares, sin coseguro → $23.000
        Afiliado pedro = new Afiliado("Pedro", 2, 100000,
            LocalDate.of(1997, 1, 1),
            new PlanMedico(15000, LocalDate.now()),
            new ArrayList<>());

        // montoFijo=15000 + grupoFamiliar=7000 + cobertura=1000 + internacion=0
        assertEquals(23000, pedro.getPlanActual().costoMensual(pedro), 0.01);
    }

    @Test
    public void testPlanMedicoObligatorioConCoseguro() {
        // descuento 500 por integrante
        Coseguro c = new Coseguro("coseguro1", 500, LocalDate.now(), 2000);
        Afiliado afiliado = new Afiliado("Ana", 2, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanMedico(15000, LocalDate.now()),
            new ArrayList<>(), c);

        // grupoFamiliar = (3500 - 500) * 2 = 6000
        // cobertura = 1000 - 2000 = negativo, queda 0 o negativo según impl
        // montoFijo = 15000
        double esperado = 15000 + 6000 + (100000 * 0.01 - 2000) + 0;  // = 20000
        assertEquals(20000, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

    // ── Plan Integral ────────────────────────────────────────────────

    @Test
    public void testPlanIntegralSinCoseguro() {
        Afiliado afiliado = new Afiliado("Luis", 2, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanIntegral(22000, LocalDate.now()),
            new ArrayList<>());

        // montoFijo=22000 + grupoFamiliar=(3000*2 + 1000)=7000 + cobertura=3000 + internacion=1100
        double esperado = 22000 + 7000 + 3000 + 22000 * 0.05;
        assertEquals(esperado, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

    @Test
    public void testPlanIntegralConCoseguro5Anios() {
        // coseguro con 5 años de antigüedad → descuenta 50.000 en cobertura viajera
        Coseguro c = new Coseguro("coseguro1", 500,
            LocalDate.now().minusYears(5), 2000);
        Afiliado afiliado = new Afiliado("Maria", 2, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanIntegral(22000, LocalDate.now()),
            new ArrayList<>(), c);

        // cobertura = 3000 - (10000 * 5) = negativo
        double cobertura = 100000 * 0.03 - 10000 * 5;
        double esperado = 22000 + 7000 + cobertura + 22000 * 0.05;
        assertEquals(esperado, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

    // ── Plan Premium ─────────────────────────────────────────────────

    @Test
    public void testPlanPremiumSinCoseguroHasta4Familiares() {
        Afiliado afiliado = new Afiliado("Carlos", 3, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanPremium(33000, LocalDate.now()),
            new ArrayList<>());

        // grupoFamiliar = 0 (hasta 4 sin cargo)
        // cobertura = 1000
        // internacion = 33000 * 0.05 = 1650
        double esperado = 33000 + 0 + 1000 + 1650;
        assertEquals(esperado, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

    @Test
    public void testPlanPremiumSinCoseguroMas4Familiares() {
        Afiliado afiliado = new Afiliado("Roberto", 6, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanPremium(33000, LocalDate.now()),
            new ArrayList<>());

        // grupoFamiliar = 2800 * 6 = 16800
        double esperado = 33000 + 16800 + 1000 + 1650;
        assertEquals(esperado, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

    @Test
    public void testPlanPremiumConCoseguro() {
        Coseguro c = new Coseguro("coseguro1", 1000, LocalDate.now(), 500);
        Afiliado afiliado = new Afiliado("Sofia", 3, 100000,
            LocalDate.of(1990, 1, 1),
            new PlanPremium(33000, LocalDate.now()),
            new ArrayList<>(), c);

        // montoFijo = 33000 - 1000 = 32000
        // cobertura = 1000 - 500 = 500
        // internacion = 32000 * 0.05 = 1600
        double esperado = 32000 + 0 + 500 + 1600;
        assertEquals(esperado, afiliado.getPlanActual().costoMensual(afiliado), 0.01);
    }

}
