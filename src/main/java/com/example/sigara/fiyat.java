package com.example.sigara;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class fiyat extends AppCompatActivity {

    // Ürünlerin ve fiyatlarının tutulacağı TreeMap
    private TreeMap<String, BigDecimal> urunler;

    private ListView urunListesiListView;
    private TextView toplamFiyatTextView;
    private BigDecimal toplamFiyat;
    private HashMap<String, Integer> secilenUrunAdetleri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fiyat);

        // Veritabanı oluşturun ve bazı ürünler ve fiyatlar ekleyin
        urunler = new TreeMap<>();
        urunler.put("PARLIAMENT KISA", new BigDecimal("496.60"));
        urunler.put("PARLIAMENT UZUN", new BigDecimal("496.60"));
        urunler.put("PARLIAMENT SLIM AQUA", new BigDecimal("506.15"));
        urunler.put("PARLIAMENT MIDNIGHT", new BigDecimal("487.05"));
        urunler.put("PARLIAMENT AQUA BLUE", new BigDecimal("496.60"));
        urunler.put("PARLIAMENT REZERVE ", new BigDecimal("496.60"));
        urunler.put("MARLBORO KISA", new BigDecimal("487.05"));
        urunler.put("MARLBORO TOUCH", new BigDecimal("439.30"));
        urunler.put("MARLBORO TOUCH BLUE SLDR", new BigDecimal("429.75"));
        urunler.put("MARLBORO TOUCH  GREY SLDR", new BigDecimal("429.75"));
        urunler.put("MARLBORO TOUCH WHİTE SLDR", new BigDecimal("429.75"));
        urunler.put("MARLBORO UZUN", new BigDecimal("439.30"));
        urunler.put("MARLBORO EDGE", new BigDecimal("420.20"));
        urunler.put("MARLBORO EDGE BLUE SLDR", new BigDecimal("420.20"));
        urunler.put("MARLBORO EDGE SKY SLDR", new BigDecimal("420.20"));
        urunler.put(" MURATTI ", new BigDecimal("420.20"));
        urunler.put(" MURATTI SLNDR BLUE LİNE ", new BigDecimal("410.65"));
        urunler.put(" LARK BLUE KISA", new BigDecimal("410.65"));
        urunler.put(" LARK UZUN BLUE ", new BigDecimal("410.65"));
        urunler.put(" LM KISA", new BigDecimal("401.10"));
        urunler.put(" LM UZUN SOFT", new BigDecimal("401.10"));
        urunler.put(" LM BOX", new BigDecimal("401.10"));
        urunler.put(" CHESTER KISA", new BigDecimal("401.10"));
        urunler.put(" CHESTER UZUN", new BigDecimal("401.10"));
        urunler.put(" CHESTER MODE NAVY", new BigDecimal("410.65"));
        urunler.put(" CHESTER AQUA CLICK", new BigDecimal("401.10"));
        urunler.put(" WINSTON RED KISA ", new BigDecimal("420.20"));
        urunler.put(" WINSTON GREY KISA ", new BigDecimal("420.20"));
        urunler.put(" WINSTON BLUE KISA", new BigDecimal("420.20"));
        urunler.put(" WINSTON DARK BLUE KISA", new BigDecimal("410.65"));
        urunler.put(" WINSTON DEEP BLUE KISA", new BigDecimal("410.65"));
        urunler.put(" WINSTON RED UZUN", new BigDecimal("410.20"));
        urunler.put(" WINSTON BLUE UZUN", new BigDecimal("410.20"));
        urunler.put(" WINSTON DARK BLUE UZUN", new BigDecimal("410.65"));
        urunler.put(" WINSTON SLENDER DARK BLUE", new BigDecimal("410.65"));
        urunler.put(" WINSTON SLENDER GREY", new BigDecimal("410.65"));
        urunler.put(" WINSTON SLENDER BLUE", new BigDecimal("410.65"));
        urunler.put(" WINSTON SLIM GREY", new BigDecimal("429.75"));
        urunler.put(" WINSTON SLIM BLUE", new BigDecimal("429.75"));
        urunler.put(" WINSTON XSENCE GREY", new BigDecimal("439.30"));
        urunler.put(" WINSTON XSENCE BLACK", new BigDecimal("439.30"));
        urunler.put(" CAMEL KISA ", new BigDecimal("410.65"));
        urunler.put(" CAMEL SOFT ", new BigDecimal("410.65"));
        urunler.put(" CAMEL DEEP BLUE ", new BigDecimal("391.55"));
        urunler.put(" CAMEL WHİTE ", new BigDecimal("410.65"));
        urunler.put(" CAMEL BLACK ", new BigDecimal("410.65"));
        urunler.put(" CAMEL BROWN ", new BigDecimal("410.65"));
        urunler.put(" CAMEL DEEP BLUE UZUN ", new BigDecimal("391.55"));
        urunler.put(" CAMEL YELLOW UZUN ", new BigDecimal("410.65"));
        urunler.put(" CAMEL SLENDER GREY ", new BigDecimal("391.55"));
        urunler.put(" CAMEL SLENDER BLUE LİNE ", new BigDecimal("391.55"));
        urunler.put(" LD KISA BLUE ", new BigDecimal("401.10"));
        urunler.put(" LD RED UZUN ", new BigDecimal("401.10"));
        urunler.put(" LD BLUE UZUN ", new BigDecimal("401.10"));
        urunler.put(" LD SLİMS ", new BigDecimal("391.55"));
        urunler.put(" MONTE RED ", new BigDecimal("401.10"));
        urunler.put(" MONTE DARK BLUE ", new BigDecimal("401.10"));
        urunler.put(" MONTE UZUN NIGHT BLUE ", new BigDecimal("401.10"));
        urunler.put(" MONTE SLENDER RED ", new BigDecimal("391.55"));
        urunler.put(" MONTE SLLENDER BLUE ", new BigDecimal("391.55"));
        urunler.put(" MONTE SLENDER DARK BLUE ", new BigDecimal("391.55"));
        urunler.put(" 2000 KIRMIZI KISA", new BigDecimal("382"));
        urunler.put(" 2000 MAVİ KISA", new BigDecimal("382"));
        urunler.put(" 2000  KIRMIZI UZUN", new BigDecimal("382"));
        urunler.put(" 2000  MAVİ UZUN", new BigDecimal("382"));
        urunler.put(" 2001 KISA KIRMIZI", new BigDecimal("382"));
        urunler.put(" 2001 KISA MAVİ", new BigDecimal("382"));
        urunler.put(" 2001 UZUN KIRMIZI", new BigDecimal("382"));
        urunler.put(" 2001 UZUN MAVİ", new BigDecimal("382"));
        urunler.put(" ROTHMANS KISA BLUE ", new BigDecimal("391.55"));
        urunler.put(" ROTHMANS SLNDR DRANGE BLUE", new BigDecimal("391.55"));
        urunler.put(" ROTHMANS UZUN BLUE", new BigDecimal("391.55"));
        urunler.put(" ROTHMANS UZUN DRANGE BLACK", new BigDecimal("391.55"));
        urunler.put(" MALTEPE UZUN ", new BigDecimal("401.10"));
        urunler.put(" PALLMALL AMBER ", new BigDecimal("401.10"));
        urunler.put(" PALLMAL RED ", new BigDecimal("401.10"));
        urunler.put(" SAMSUN UZUN ", new BigDecimal("401.10"));
        urunler.put(" VICEROY RED ", new BigDecimal("401.10"));
        urunler.put(" VICEROY NAVY ", new BigDecimal("401.10"));
        urunler.put(" VICEROY UZUN NAVY ", new BigDecimal("401.10"));
        urunler.put(" VICEROY UZUN RED", new BigDecimal("401.10"));
        urunler.put(" KENT DARK BLUE KISA", new BigDecimal("410.65"));
        urunler.put(" KENT SWİTCH KISA", new BigDecimal("410.65" ));
        urunler.put(" KENT SLNDR DRANGE BLUE", new BigDecimal("410.65"));
        urunler.put(" KENT SLNDR DRANGE GREY", new BigDecimal("410.65"));
        urunler.put(" KENT UZUN DARK BLUE", new BigDecimal("410.65"));
        urunler.put(" KENT UZUN DRENGE GREY", new BigDecimal("410.65"));
        urunler.put(" KENT UZUN DRENGE BLUE", new BigDecimal("410.65"));
        urunler.put(" KENT BLUE KISA", new BigDecimal("429.75"));
        urunler.put(" KENT GREY KISA", new BigDecimal("429.75"));
        urunler.put(" KENT WHİTE KISA", new BigDecimal("429.75"));
        urunler.put(" KENT BLACK SLİMS", new BigDecimal("448.85" ));
        urunler.put("PRESIDENT KISA", new BigDecimal("361.95"));
        urunler.put("PRESIDENT SLNDR SEA BLUE", new BigDecimal("361.95"));
        urunler.put("PRESIDENT UZUN", new BigDecimal("361.95"));
        urunler.put("HD SLİMS BLUE", new BigDecimal("381"));
        urunler.put("ESSE SLİMS BLUE", new BigDecimal("432"));
        urunler.put("ESSE SLİMS BLACK", new BigDecimal("432"));
        urunler.put("ESSE SLİMS BROWN", new BigDecimal("432"));
        urunler.put("ESSE SLİMS WHİTE", new BigDecimal("432"));
        urunler.put("WEST KISA NAVY", new BigDecimal("364.80"));
        urunler.put("WEST KISA GREY", new BigDecimal("364.80"));
        urunler.put("POLO SLİM GREY", new BigDecimal("382.40"));
        urunler.put("POLO SLİM BLUE", new BigDecimal("382.40"));
        urunler.put("BİANCA SLİM ROSE", new BigDecimal("430.20"));
        urunler.put("DAVITOF UZUN WHİTE", new BigDecimal("448.85"));
        urunler.put("DAVITOF UZUN BURGUNDY", new BigDecimal("448.85"));
        urunler.put("DAVITOF UZUN IVORY", new BigDecimal("448.85"));
        urunler.put("DAVITOF SLİM WHİTE", new BigDecimal("448.85"));
        urunler.put("DAVITOF SLİM IVORY", new BigDecimal("448.85"));



        // Diğer ürünleri de buraya ekleyin...
        // İstediğiniz kadar ürün ve fiyatı ekleyebilirsiniz.

        urunListesiListView = findViewById(R.id.urunListesiListView);
        toplamFiyatTextView = findViewById(R.id.toplamFiyatTextView);
        secilenUrunAdetleri = new HashMap<>();
        toplamFiyat = BigDecimal.ZERO;

        // Ürün adlarını bir liste halinde alıyoruz ve ListView'a ekliyoruz (alfabetik sıraya göre)
        List<String> urunAdlariList = new ArrayList<>(urunler.keySet());
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, urunAdlariList);
        urunListesiListView.setAdapter(adapter);

        urunListesiListView.setOnItemClickListener((parent, view, position, id) -> {
            // Kullanıcının seçtiği ürünü alın
            String secilenUrun = urunAdlariList.get(position);

            // Seçilen ürünün fiyatını alın ve toplama ekleyin
            BigDecimal urunFiyati = urunler.get(secilenUrun);
            toplamFiyat = toplamFiyat.add(urunFiyati);

            // Seçilen ürünü listeye ekleyin veya adedini artırın
            if (secilenUrunAdetleri.containsKey(secilenUrun)) {
                int adet = secilenUrunAdetleri.get(secilenUrun);
                secilenUrunAdetleri.put(secilenUrun, adet + 1);
            } else {
                secilenUrunAdetleri.put(secilenUrun, 1);
            }

            // Toplam fiyatı güncelleyin ve gösterin
            toplamFiyatTextView.setText("Toplam fiyat: " + toplamFiyat + " TL");
        });

        urunListesiListView.setOnItemLongClickListener((parent, view, position, id) -> {
            // Uzun tıklamada, kullanıcının seçtiği ürünü sil
            String secilenUrun = urunAdlariList.get(position);

            // Seçilen ürünün fiyatını alın ve toplamdan çıkarın
            BigDecimal urunFiyati = urunler.get(secilenUrun);
            toplamFiyat = toplamFiyat.subtract(urunFiyati.multiply(BigDecimal.valueOf(secilenUrunAdetleri.get(secilenUrun))));

            // Ürünün adedini sıfırlayın veya düşürün
            if (secilenUrunAdetleri.containsKey(secilenUrun)) {
                int adet = secilenUrunAdetleri.get(secilenUrun);
                if (adet > 1) {
                    secilenUrunAdetleri.put(secilenUrun, adet - 1);
                } else {
                    secilenUrunAdetleri.remove(secilenUrun);
                }
            }

            // Toplam fiyatı güncelleyin ve gösterin
            toplamFiyatTextView.setText("Toplam fiyat: " + toplamFiyat + " TL");

            // ListView'ı güncelle
            adapter.notifyDataSetChanged();
            return true;
        });

        Button siparisButton = findViewById(R.id.siparisButton);
        siparisButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Siparişi göster
                showSiparis();
            }
        });

        Button iptalButton = findViewById(R.id.iptalButton);
        iptalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Siparişi iptal et
                iptalEt();
            }
        });
    }

    private void showSiparis() {
        // Seçilen ürünleri ve toplam fiyatı göstermek için bir ileti oluştur
        StringBuilder siparis = new StringBuilder();
        for (String urun : secilenUrunAdetleri.keySet()) {
            int adet = secilenUrunAdetleri.get(urun);
            BigDecimal urunFiyati = urunler.get(urun);
            BigDecimal toplamUrunFiyati = urunFiyati.multiply(BigDecimal.valueOf(adet));
            siparis.append(urun).append(" (").append(adet).append(" adet) - ").append(toplamUrunFiyati).append(" TL\n");
        }
        siparis.append("Toplam fiyat: ").append(toplamFiyat).append(" TL");

        // İletiyi göster
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Sipariş Detayları");
        builder.setMessage(siparis.toString());
        builder.setPositiveButton("Tamam", null);
        builder.show();
    }

    private void iptalEt() {
        // Siparişi iptal et ve tüm seçilen ürünleri temizle
        secilenUrunAdetleri.clear();
        toplamFiyat = BigDecimal.ZERO;
        toplamFiyatTextView.setText("Toplam fiyat: " + toplamFiyat + " TL");
        ((ArrayAdapter) urunListesiListView.getAdapter()).notifyDataSetChanged();
    }
}
