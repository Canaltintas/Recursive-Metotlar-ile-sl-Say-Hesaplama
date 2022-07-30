# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

## Programın Çalışması
* Kullanıcıdan bir sayı ve bir üs değeri alınır.
* Alınan Değerler Recursive metota gönderilir.
* Metotun parametleri sayı için "a" , üs değeri için "b" olsun.
* Metot içerisine üs değeri 0'a eşitse 1 değeri döndürülmesi için koşul eklenir.(bir sayının 0'ıncı üssü 1'dir.)
* Metot değer olarak geri a*f(a,(b-1)) değerini döndürecektir.(Burada ki amaç metotun her seferinde bir adım geri giderek b=0 değerine ulaşıp 1 değerini döndürmesidir.)

### Örnek:
a değeri 2,b değeri 4 olduğu varsayılsın.
* 2*f(2,3)
* 2*f(2,2)
* 2*f(2,1)
* 2*f(2,0)
* * b==0 için döndürülen değer 1 olduğundan f(a,0)=1'dir. 
* 2xf(2,0) ===> 2x1=2 değerini alır
* 2xf(2,1) ===> 2x2=4 değerini alır
* 2xf(2,2) ===> 2x4=8 değerini alır
* 2xf(2,3) ===> 2x8 =16 değerini alır metotan çıkılır.
