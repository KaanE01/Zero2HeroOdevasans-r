# Rapor

**Ad Soyad:** Kaan Enes KAYA
**Numara:** 62

## 1. Problemin Açıklaması
Bir asansörün ne kadar, nereden nereye, aşağı mı yukarı mı çıktığı çıkarılacak ayrıca bina 10 katlı olduğu için 0'rın altı veya 10'un üstü sayının girişini kontrol edilmeli birde 0= zemin kat


## 2. Girdi - İşlem - Çıktı

**Girdiler:**
-bulunduğu kat - istenilen kat

**İşlemler:**
|bulunduğu kat - alınması istenen kat|=mesafe
0 ila 10 arasında olma kontrolü
binilen kat mı büyük gidilecek kat mı büyük

**Çıktılar:**
geçersiz katta "binamızda böyle bir kat bulunmamaktadır"
geçerli katta 1 7 ye gitme örneği " asansörümüz 1 den 7 ye yukarı haraket toplam 6 kat sürecektir"

## 3. Sözde Kod (Pseudocode)

```
1.eğer(if)
2.return
3.Scanner
```

## 4. Akış Şeması

BAŞLAT "oldugunuz kati tuslayiniz"    oKat(Bulunduğun kat)   Koşullar: oKat > 10 veya oKat < 0   EVET ise:Ekrana iliştirin:"Binamizda boyle bir kat bulunmamaktadir"   BİTİR (return)   HAYIR ise: Devam et."gitmek istedigini kati tuslayiniz"   : gitmekKat(Gitmek istenilen kat)  : gitmekKat > 10 veya gitmekKat < 0   EVET ise"Binamizda boyle bir kat bulunmamaktadir"   BİTİR (return)   HAYIR ise: Devam et.Koşullar: oKat > gitmekKat Olur mu?   EVET ise: Ekrana iltifat:oKat + ". kattan " + gitmekKat + ". kata " + (oKat - gitmekKat) + " kadar asagi inilcek"   Koşullar: oKat < gitmekKat Olur mu?   EVET ise: Ekrana iltifat:oKat + ". kattan " + gitmekKat + ". kata " + (gitmekKat - oKat) + " kat kadar yukari cikilcak"   Koşullar: oKat == gitmekKat Olur mu?   EVET ise: Ekrana iltifat:"zaten bu kattasiniz"   BİTİR


## 5. Test Sonuçları

| Mevcut kat | Hedef kat | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 3 | 8 | 5 kat yukarı | "asansörümüz 3 den 8 ye yukarı haraket toplam 5 kat alacaktır"  | Doğru |
| 9 | 2 | 7 kat aşağı |  "asansörümüz 9 den 2 ye aşağı haraket toplam 7 kat alacaktır" |Doğru  |
| 5 | 5 | Hareket yok | "asansörümüz zaten bu katta"  | Doğru |
| 1 | 10 | 9 kat yukarı |  "asansörümüz 1 den 10 ye kadar haraket toplam 9 kat alacaktır" | Doğru |
| 10 | 1 | 9 kat aşağı |  "asansörümüz 10 den 1 ye aşağı haraket toplam 9 kat alacaktır" | Doğru |
|  -1  | 5 | Geçersiz mevcut kat |  " Binamızda böyle bir kat yok" | Doğru |
| 5 | 11 | Geçersiz hedef kat |  " Binamızda böyle bir kat yok" | Doğru |
| -2 | 4 | Geçersiz mevcut kat |  "Binamızda böyle bir kat yok " | Doğru |

## 6. Ekstra Görev (Opsiyonel)
<!-- 3 -> 8 için geçilen katların çıktısını buraya yapıştırın. -->
