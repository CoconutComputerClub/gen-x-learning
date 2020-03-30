
print "\n Tugas Membuat akun proton mail otomatis  \n"
print "                      Anha                 \n"
print "                   by: coconut             \n"
print "===========================================\n"

# inputan untuk isi form 
userName = raw_input("Masukan User Name: ")
Pass = raw_input("Masukan Password: ")
confrmPass = raw_input("Masukan Confirmasi Password: ")
confrmEmail = raw_input("Masikan Confirmasi Email: ")

# Menampilkan output
print "Silakan Tunggu !!!"

# untuk menjalankan firefox
from selenium import webdriver
from selenium.webdriver.support.select import Select
from selenium.webdriver.support.ui import Select
import time
firefox_options = webdriver.FirefoxOptions()
firefox_options.add_argument("--private")
browser = webdriver.Firefox(firefox_options=firefox_options)
url = "https://protonmail.com"
browser.get(url)
time.sleep(5)
linkElem = browser.find_elment_by_link_text("SIGN UP").click()
time.sleep(10)
browser.find_element_by_css_selector(".panel:nth-child(1) > .panel-heading > .row").click()
time.sleep(20)
browser.find_element_by_id("freePlan").click()
time.sleep(50)
browser.switch_to.frame(browser.find_element_by_tag_name("iframe"))
time.sleep(10)
browser.find_element_by_id("username").send_keys(userName)
time.sleep(10)
browser.switch_to.default_content()
time.sleep(10)
browser.find_element_by_id("password").send_keys(Pass)
time.sleep(10)
browser.find_element_by_id("passwordc").send_keys(confrmPass)
time.sleep(10)
browser.switch_to.frame(browser.find_element_by_class_name("bottom"))
time.sleep(10)
browser.find_element_by_id("notificationEmail").send_keys(confrmEmail)
time.sleep(20)
browser.find_element_by_name("submitBtn").click()
time.sleep(50)

print 'selesai'
