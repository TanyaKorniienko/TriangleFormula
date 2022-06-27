package org.triangleformula;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;

public class TestTriangleFormula {
    private TriangleFormula triangleFormula;

    @Before
    public void setUp() {
        triangleFormula = new TriangleFormula(4, 6, 9);
    }

    @Test
    public void testTriangleFormula() {
        double result = triangleFormula.getArea();
        Assertions.assertEquals(9, triangleFormula.getArea());
        Assert.assertTrue(result > 0 || result < 20);
        assertThat(triangleFormula.getArea()).isEqualTo(9);
    }
}
