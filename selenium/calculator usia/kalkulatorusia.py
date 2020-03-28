""" 
            MASUKKAN INSTRUKSI DIBAWAH INI
   MOHO BACA INSTRUKSI DIBAWAH INI DENGAN BENAR.
   
1) Masukkan nomor antara 2-10.
2) Masukkan tahun lahir kamu.
3) Masukkan YA jika ulang tahunmu sudah dirayakan dan masukkan TIDAK jika ulang belum dirayakan saat ini.
"""

x=int(input("Masukkan nomor antara 2-10 : "))
print(x)
y=x*2
z=y+5
w=z*50
c=int(input("Masukkan tahun lahir kamu : "))
print(c)
u=input("Apakah ulang tahun kamu sudah dirayakan ? : ")
print(u)
if u=="YA":
   a=w+1770
   d=a-c
   g=d%100
   print("\nUsia kamu sekarang : "+str(g))
else:
    b=w+1769
    e=b-c
    h=e%100
    print("Usia kamu sekarang : "+str(h))