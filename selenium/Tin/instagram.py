#form inputan
jawab = 'ya'
hitung = 0 
while(True) :
	hitung += 1
	print hitung
	Phone = raw_input ("Masukkan Nomor : ")
	Fullname = raw_input ("Masukkan Nama Lengkapmu : ")
	Username = raw_input ("Masukkan Nama Pengguna : ")
	Password = raw_input ("Masukkan Sandi : ")

	print "ditunggu yah gais *-*"
	from selenium import webdriver
	import time

        browser = webdriver.Firefox()
	url = "https://www.instagram.com/accounts/emailsignup/"
	browser.get(url)

	time.sleep(5)
	browser.find_element_by_name("emailOrPhone").send_keys(Phone)
	time.sleep(2)
	browser.find_element_by_name("fullName").send_keys(Fullname)
	time.sleep(2)
	browser.find_element_by_name("username").send_keys(Username)
	time.sleep(2)
	browser.find_element_by_name("password").send_keys(Password)
	time.sleep(2)
	browser.find_element_by_xpath("//button[@type='submit']").click()
	time.sleep(30)
	browser.find_element_by_xpath("//button[@type='button']").click()
	browser.close()
	jawab= raw_input('ingin input lagi ? \"ya"/"tidak" :')
	if jawab =="tidak" :
		break
print (('hitung perulangan : ' + str('hitung'))
