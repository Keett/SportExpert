B4A=true
Group=SportExpertProjeDosyası\TabloInsertIslemleri
ModulesStructureVersion=1
Type=StaticCode
Version=9.01
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
End Sub

Sub SehirlerTablosunuDoldur

	Dim SehirListesi As List
	SehirListesi.Initialize
	Dim dizi() As String
	dizi=Array As String("","ADANA","ADIYAMAN","AFYON","AĞRI","AMASYA","ANKARA","ANTALYA","ARTVİN","AYDIN","BALIKESİR","BİLECİK","BİNGÖL","BİTLİS","BOLU","BURDUR","BURSA","ÇANAKKALE","ÇANKIRI","ÇORUM","DENİZLİ","DİYARBAKIR","EDİRNE","ELAZIĞ","ERZİNCAN","ERZURUM","ESKİŞEHİR","GAZİANTEP","GİRESUN","GÜMÜŞHANE","HAKKARİ","HATAY","ISPARTA","İÇEL(MERSİN)","İSTANBUL","İZMİR","KARS","KASTAMONU","KAYSERİ","KIRKLARELİ","KIRŞEHİR","KOCAELİ","KONYA","KÜTAHYA","MALATYA","MANİSA","KAHRAMANMARAŞ","MARDİN","MUĞLA","MUŞ","NEVŞEHİR","NİĞDE","ORDU","RİZE","SAKARYA","SAMSUN","SİİRT","SİNOP","SİVAS","TEKİRDAĞ","TOKAT","TRABZON","TUNCELİ","ŞANLIURFA","UŞAK","VAN","YOZGAT","ZONGULDAK","AKSARAY","BAYBURT","KARAMAN","KIRIKKALE","BATMAN","ŞIRNAK","BARTIN","ARDAHAN","IĞDIR","YALOVA","KARABÜK","KİLİS","OSMANİYE","DÜZCE")
	
	For i=1 To dizi.Length
		'Log(dizi(i-1))
		Dim Veri As Map = CreateMap("il_id": i, "il_adi": dizi(i-1))
		SehirListesi.Add(Veri)
	Next
'	For i=1 To 20
'		Dim veri As Map = CreateMap("il_id": i, "il": "Sehir  "&i)
'		SehirListesi.Add(veri)
'	Next
	DBUtils.InsertMaps(Main.sql, "Iller", SehirListesi)
	Log("Iller TABLOSUNA INSERT İŞLEMİ")
	
End Sub

Sub CinsiyetTablosunuDoldur
	Dim cinsiyetListesi As List
	cinsiyetListesi.Initialize
	Dim diziCinsiyet() As String
	diziCinsiyet = Array As String("","KADIN","ERKEK")
	
	For i=1 To diziCinsiyet.Length
		'Log(diziCinsiyet(i-1))
		Dim Veri As Map = CreateMap("cinsiyet_id": i, "cinsiyet_adi":diziCinsiyet(i-1))
		cinsiyetListesi.Add(Veri)
	Next
	
	DBUtils.InsertMaps(Main.sql, "Cinsiyet", cinsiyetListesi)
	Log("cinsiyet TABLOSUNA INSERT İŞLEMİ")
End Sub

Sub GunTablosunuDoldur
	Dim gunListesi As List
	gunListesi.Initialize
	Dim diziGun() As Int
	diziGun = Array As Int(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31)
	
	For i = 1 To diziGun.Length
		Dim Veri As Map = CreateMap("gun_id": i, "gun" : diziGun(i-1))
		gunListesi.Add(Veri)
	Next
	DBUtils.InsertMaps(Main.sql, "Gun" , gunListesi)
End Sub

Sub AyTablosunuDoldur
	Dim ayListesi As List
	ayListesi.Initialize
	Dim diziAy() As String
	diziAy = Array As String("Ocak","Şubat","Mart","Nisan","Mayıs","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık")
	
	For i = 1 To diziAy.Length
		Dim veri As Map = CreateMap("ay_id": i, "ay" : diziAy(i-1))
		ayListesi.Add(veri)
	Next
	DBUtils.InsertMaps(Main.sql, "Ay" , ayListesi)
End Sub

Sub YilTablosunuDoldur
	Dim yilListesi As List
	yilListesi.Initialize
	Dim diziYil() As Int
	diziYil = Array As Int(1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029)
	
	For i = 1 To diziYil.Length
		Dim veri As Map = CreateMap("yil_id": i, "yil" : diziYil(i-1))
		yilListesi.Add(veri)
	Next
	DBUtils.InsertMaps(Main.sql, "Yil" , yilListesi)
End Sub


