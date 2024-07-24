package org.rd;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MuhasebeTest {

    @DataProvider(name = "maasVerileri")
    public Object[][] createData() {
        return new Object[][] {
            {"Hasan", 20, 2000, "Prim Hakki Kazanamadiniz"},
            {"Mustafa", 25, 2500, "Prim Hakki Kazandiniz."},
            {"Omer", 30, 6500, "Prim Hakki Kazandiniz."}
        };
    }

    @Test(dataProvider = "maasVerileri")
    public void testMaasHesaplama(String isim, int calisma_gun, int beklenenMaas, String beklenenPrimMesaji) {
        Muhasebe personel = new Muhasebe();
        personel.isim = isim;
        personel.calisma_gun = calisma_gun;
        
        personel.Maas();
        
        String prim_hakki = (calisma_gun > 25) ? "Prim Hakki Kazandiniz." : "Prim Hakki Kazanamadiniz";
        int hesaplananMaas = (calisma_gun >= 25) ? ((personel.maas * 25) + ((calisma_gun - 25) * personel.prim)) : (calisma_gun * personel.maas);
        
        Assert.assertEquals(hesaplananMaas, beklenenMaas, "Maaş hesaplaması yanlış");
        Assert.assertEquals(prim_hakki, beklenenPrimMesaji, "Prim mesajı yanlış");
    }
}
