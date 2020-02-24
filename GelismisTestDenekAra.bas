B4A=true
Group=SportExpertProjeDosyası\Test
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: True
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim checkedIdList As List
	Dim checkedTcList As List
	Dim checkedIsimList As List
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	
	Private Panel1 As Panel
	Private LabelKimlikNo As Label
	Private Labelisim As Label
	Private LabelCinsiyet As Label
	Private LabelDogumTarihi As Label
	Private LabelDogumYeri As Label
	Private LabelBabaAdi As Label
	Private LabelEngel As Label
	Private EditTextEngelDurumu As EditText
	Private EditTextBabaAdi As EditText
	Private SpinnerDogumYeri As Spinner
	Private ButtonDogumTarihi As Button
	Private SpinnerCinsiyet As Spinner
	Private EditTextIsim As EditText
	Private EditTextKimlikNo As EditText
	Private LabelTakimOkul As Label
	Private LabelBransSinif As Label
	Private LabelMevki As Label
	Private EditTextTakimOkul As EditText
	Private EditTextBransSinif As EditText
	Private EditTextMevki As EditText
	Private ScrollView1 As ScrollView
	
	Private ButtonOK As Button
	
	Private CustomListView1 As CustomListView
	Private LabelId As Label
	Private LabelDenekIsim As Label
	Private LabelDenekTc As Label
	Private CheckBoxSecim As CheckBox
	
	Dim id As Int
	Dim isim,tc As String

	Dim rs As ResultSet
	
	Private Panel2 As Panel
	Private LabelGun As Label
	Private LabelAy As Label
	Private LabelYil As Label
	Private ButtonTarihAyar As Button
	Private SpinnerGun As Spinner
	Private SpinnerAy As Spinner
	Private SpinnerYil As Spinner
	
	Dim araCinsiyet,araDogumYeri As String = ""
	Dim araDogumTarihi ,araAy As String
	Dim araGun As Int
	Dim araYil As Int
	Dim araTc, araIsim, araBabaAdi, araEngelDurumu, araTakimOkul, araBransSinif, araMevki As String = ""

	Dim silinenListe As List
	Dim list As List
	
	Private LabelCarpi1 As Label
	Private LabelCarpi2 As Label
	Private LabelCarpi3 As Label
	Private LabelCarpi4 As Label
	Private LabelCarpi5 As Label
	Private LabelCarpi6 As Label
	Private LabelCarpi7 As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("GelismisTestDenekAraPage")
	
	ScrollView1.Panel.LoadLayout("GelismisTestDenekAraScrollVeriPage")
	ScrollView1.Panel.Width = 2000dip
	ScrollView1.Panel.Height = 1000dip
	
	Panel2.Visible= False
	KisimGoster
	
	LabelCarpi1.Visible = False
	LabelCarpi2.Visible = False
	LabelCarpi3.Visible = False
	LabelCarpi4.Visible = False
	LabelCarpi5.Visible = False
	LabelCarpi6.Visible = False
	LabelCarpi7.Visible = False
	
	#region
	SpinnerCinsiyet.DropdownBackgroundColor= Colors.White
	SpinnerCinsiyet.DropdownTextColor= Color.koyuMavi
	SpinnerCinsiyet.TextColor= Colors.White
	SpinnerCinsiyet.TextSize = 20
	
	SpinnerDogumYeri.DropdownBackgroundColor= Colors.White
	SpinnerDogumYeri.DropdownTextColor= Color.koyuMavi
	SpinnerDogumYeri.TextColor= Colors.White
	SpinnerDogumYeri.TextSize = 20
	
	EditTextKimlikNo.HintColor = Color.hintColor
	EditTextKimlikNo.Hint = "TCKN'i eksiksiz giriniz.."
	EditTextKimlikNo.TextSize = 20
	EditTextKimlikNo.TextColor = Colors.White
	EditTextKimlikNo.Typeface = Typeface.DEFAULT
	EditTextKimlikNo.SingleLine = True
	
	EditTextIsim.HintColor = Color.hintColor
	EditTextIsim.Hint = "Denek ismini giriniz.."
	EditTextIsim.TextSize = 20
	EditTextIsim.TextColor = Colors.White
	EditTextIsim.Typeface = Typeface.DEFAULT
	
	EditTextBabaAdi.HintColor = Color.hintColor
	EditTextBabaAdi.Hint = "Denek baba adını giriniz.."
	EditTextBabaAdi.TextSize = 20
	EditTextBabaAdi.TextColor = Colors.White
	EditTextBabaAdi.Typeface = Typeface.DEFAULT
	
	EditTextEngelDurumu.HintColor = Color.hintColor
	EditTextEngelDurumu.Hint = "Engel durumu varsa lütfen doldurunuz.."
	EditTextEngelDurumu.TextSize = 20
	EditTextEngelDurumu.TextColor = Colors.White
	EditTextEngelDurumu.Typeface = Typeface.DEFAULT
	
	EditTextTakimOkul.HintColor = Color.hintColor
	EditTextTakimOkul.Hint = "Bağlı olduğu Takım/Okul değerini giriniz..."
	EditTextTakimOkul.TextSize = 20
	EditTextTakimOkul.TextColor = Colors.White
	EditTextTakimOkul.Typeface = Typeface.DEFAULT
	
	EditTextBransSinif.HintColor = Color.hintColor
	EditTextBransSinif.Hint = "Bağlı olduğu Branş/Sınıf değerini giriniz..."
	EditTextBransSinif.TextSize = 20
	EditTextBransSinif.TextColor = Colors.White
	EditTextBransSinif.Typeface = Typeface.DEFAULT
	
	EditTextMevki.HintColor = Color.hintColor
	EditTextMevki.Hint = "Bulunduğu mevki değerini giriniz..."
	EditTextMevki.TextSize = 20
	EditTextMevki.TextColor = Colors.White
	EditTextMevki.Typeface = Typeface.DEFAULT
	
	ButtonDogumTarihi.Text = "Doğum Tarihi"
	ButtonDogumTarihi.TextColor = Colors.White
	ButtonDogumTarihi.TextSize = 20
	ButtonDogumTarihi.Typeface = Typeface.DEFAULT
	ButtonDogumTarihi.SingleLine = True
	
	SpinnerGun.DropdownBackgroundColor = Color.acikMavi
	SpinnerGun.DropdownTextColor = Colors.White
	SpinnerGun.TextColor = Color.koyuMavi
	SpinnerGun.TextSize = 20
	
	SpinnerAy.DropdownBackgroundColor = Color.acikMavi
	SpinnerAy.DropdownTextColor = Colors.White
	SpinnerAy.TextColor = Color.koyuMavi
	SpinnerAy.TextSize = 20
	
	SpinnerYil.DropdownBackgroundColor = Color.acikMavi
	SpinnerYil.DropdownTextColor = Colors.White
	SpinnerYil.TextColor = Color.koyuMavi
	SpinnerYil.TextSize = 20
	
	LabelGun.TextColor = Color.koyuMavi
	LabelGun.TextSize = 20
	LabelGun.Typeface = Typeface.DEFAULT
	
	LabelAy.TextColor = Color.koyuMavi
	LabelAy.TextSize = 20
	LabelAy.Typeface = Typeface.DEFAULT
	
	LabelYil.TextColor = Color.koyuMavi
	LabelYil.TextSize = 20
	LabelYil.Typeface = Typeface.DEFAULT
	
	#end region
	
	DBUtils.ExecuteSpinner(Main.sql, "SELECT cinsiyet_adi FROM Cinsiyet", Null,0,SpinnerCinsiyet)
	spinnerCinsiyet_ItemClick(0,SpinnerCinsiyet.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql, "SELECT il_adi FROM Iller", Null,0,SpinnerDogumYeri)
	spinnerCinsiyet_ItemClick(0,SpinnerDogumYeri.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql ,"SELECT gun FROM Gun" ,Null,0,SpinnerGun)
	SpinnerGun_ItemClick(0,SpinnerGun.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql, "SELECT ay FROM Ay", Null,0,SpinnerAy)
	SpinnerAy_ItemClick(0,SpinnerAy.GetItem(0))
	DBUtils.ExecuteSpinner(Main.sql, "SELECT yil FROM Yil", Null, 0, SpinnerYil)
	SpinnerYil_ItemClick(0,SpinnerYil.GetItem(0))
	
	ListViewGosterDB
	list.Initialize
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub KisimGoster
	LabelDogumYeri.Visible = True
	LabelDogumYeri.Enabled = True
	LabelBabaAdi.Visible = True
	LabelBabaAdi.Enabled = True
	LabelEngel.Visible = True
	LabelEngel.Enabled = True
	
	SpinnerDogumYeri.Visible = True
	SpinnerDogumYeri.Enabled = True
	EditTextBabaAdi.Visible = True
	EditTextBabaAdi.Enabled = True
	EditTextEngelDurumu.Visible = True
	EditTextEngelDurumu.Enabled = True
End Sub

Sub KisimGizle
	LabelDogumYeri.Visible = False
	LabelDogumYeri.Enabled = False
	LabelBabaAdi.Visible = False
	LabelBabaAdi.Enabled = False
	LabelEngel.Visible = False
	LabelEngel.Enabled = False
	
	SpinnerDogumYeri.Visible = False
	SpinnerDogumYeri.Enabled = False
	EditTextBabaAdi.Visible = False
	EditTextBabaAdi.Enabled = False
	EditTextEngelDurumu.Visible = False
	EditTextEngelDurumu.Enabled = False
End Sub

Sub CreateListItem(TextTC As String, TextIsim As String,TextID As Int, Width As Int, Height As Int) As Panel
	Dim panel As Panel
	panel.Initialize("")
	panel.SetLayout(0,0,Width,Height)
	panel.LoadLayout("GelismisTestDenekAraCustomLvVeriPage")
	
	LabelId.Visible = False
	LabelDenekTc.Text = TextTC 
	LabelDenekIsim.Text = TextIsim
	LabelId.Text = TextID
	
	Return panel
End Sub

Sub VeriAl
	id = rs.GetInt("denek_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
End Sub

Sub ListViewGosterDB
	CustomListView1.Clear		
	rs = Main.sql.ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")
	For i = 0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		CustomListView1.Add(CreateListItem(tc,isim,id,CustomListView1.AsView.Width,60dip),id)
	Next
	rs.Close
End Sub

Sub CheckBoxSecim_CheckedChange(Checked As Boolean)
	checkedIdList.Initialize
	checkedTcList.Initialize
	checkedIsimList.Initialize
	
	silinenListe.Initialize
	Log("BURADA")
	For i=0 To CustomListView1.GetSize - 1
		Dim pnl As B4XView = CustomListView1.GetPanel(i)
		Dim chk As B4XView = pnl.GetView(0)
		Dim tclabel As B4XView = pnl.GetView(1)
		Dim isimLabel As B4XView = pnl.GetView(2)
		If chk.Checked Then
			checkedIdList.Add(CustomListView1.GetValue(i))
			checkedTcList.Add(tclabel.Text)
			checkedIsimList.Add(isimLabel.Text)
		Else If chk.Checked = False Then
			'bir başka liste oluşturup 
			silinenListe.Add(CustomListView1.GetValue(i))
		End If
	Next
'	Log("Silinen liste "&silinenListe)
	Log("BURADA")
	#region Listeyi tekrar eden verilerden kurtar
	If checkedIdList.Size<>0 Then
		list.AddAll(checkedIdList)
		If  list.Size > 1 Then
'			Log(list&"  listenin uzunluğu "&list.Size)
			For i=0 To list.Size-1
				For j=1 To list.Size-1
					If list.Size>j And list.Size>i And i<>j Then
						If list.Get(i) == list.Get(j) Then
							list.RemoveAt(j)
							Log(list&"  listenin uzunluğu "&list.Size)
						End If
					End If	
				Next
			Next
		End If
		Log("BURADA")
		'checkbox da check'in false yapıldığı denekler için düzenlenmiş listeyi tekrardan düzenler
		'aşağıdaki çalışan bir kod bloğudur
		'bu kod bloğu açıldığında chk false yapılanı listeden siler fakat ara fonksiyonu bozuluyor
		'tag işlemleri ile çözmeye çalışılacak
'		
'		If silinenListe.Size <> 0 Then
'			For i=0 To list.Size-1
'				For j=0 To silinenListe.Size-1
'					If list.Size > i Then
'						If list.Get(i) == silinenListe.Get(j) Then
'							list.RemoveAt(i)
'							Log(list&"  listenin uzunluğu "&list.Size)
'						End If
'					End If
'		
'				Next
'			Next
'		End If

	End If
	#end region
	
End Sub

Sub CheckAt
#region daha yavaş çalıştığı için kod bloğu çalıştırılmadı
'	For i=0 To CustomListView1.Size -1
'		For j=0 To list.Size-1
'			Dim pnl As B4XView = CustomListView1.GetPanel(i)
'			Dim chk As B4XView = pnl.GetView(0)
'			If list.Size > j Then
'				If list.Get(j) == CustomListView1.GetValue(i) Then
'					Log("listenin "&j&"  .elemanı   "&list.Get(j) &"== eşit "& i&"  .elemanındaki değere   "&CustomListView1.GetValue(i))
'					chk.Checked = True
'				End If
'			End If
'		Next
'	Next
#end region
	Log("BURADA")
	For i=0 To list.Size-1
		For j=0 To CustomListView1.Size -1
			Dim pnl As B4XView = CustomListView1.GetPanel(j)
			Dim chk As B4XView = pnl.GetView(0)
			If list.Size > i Then
				Log(list)
				If list.Get(i) == CustomListView1.GetValue(j) Then
					Log("listenin "&i&"  .elemanı   "&list.Get(i) &"== eşit "& j&"  .elemanındaki değere   "&CustomListView1.GetValue(j))
					chk.Checked = True
				End If
			End If
		Next
	Next

End Sub

Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	Log(Value)
'	WebView1.Visible = True
'	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&Value&"' ",Null,-1,False))
End Sub

Sub ButtonOK_Click
	For i=0 To checkedIdList.Size-1
		Log(checkedIdList.Size)
		Log(i &"   :   "&" : " &checkedIdList.Get(i) )
	Next
	StartActivity(ProgramSec)
End Sub

Sub Ara
	Log("BURADA")
	CustomListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM Denek WHERE denek_tc LIKE '%"& araTc &"%' AND denek_isim LIKE '%"&araIsim &"%' AND cinsiyet_adi LIKE '%"&araCinsiyet&"%' AND il_adi LIKE '%"&araDogumYeri&"%' AND denek_babaAdi LIKE '%"& araBabaAdi &"%' AND denek_engelDurumu LIKE '%"& araEngelDurumu &"%' AND denek_takimOkul LIKE '%"& araTakimOkul &"%' AND denek_bransSinif LIKE '%"& araBransSinif &"%' AND denek_mevki LIKE '%"& araMevki &"%' ORDER BY denek_id DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		CustomListView1.Add(CreateListItem(tc,isim,id,CustomListView1.AsView.Width,60dip),id)
	Next
	rs.Close
	If list.Size == 0 Then
		Log("liste boş seçili checkbox yok")
	Else if list.Size > 0 Then
		CheckAt
	End If
End Sub

#Region EDİTTEXT 

Sub editTextKimlikNo_TextChanged (Old As String, New As String)
	Log("BURADA")
	LabelCarpi1.Visible = True
	araTc = EditTextKimlikNo.Text
	Ara
	If EditTextKimlikNo.Text == "" Then
		LabelCarpi1.Visible = False
	End If
End Sub

Sub editTextIsim_TextChanged (Old As String, New As String)
	LabelCarpi2.Visible = True
	araIsim = EditTextIsim.Text
	Ara
	If EditTextIsim.Text == "" Then
		LabelCarpi2.Visible = False
	End If
End Sub

Sub editTextBabaAdi_TextChanged (Old As String, New As String)
	araBabaAdi = EditTextBabaAdi.Text
	Ara
	If EditTextBabaAdi.Text == "" Then
		LabelCarpi3.Visible = False
	End If
End Sub

Sub editTextEngelDurumu_TextChanged (Old As String, New As String)
	araEngelDurumu = EditTextEngelDurumu.Text
	Ara
	If EditTextEngelDurumu.Text == "" Then
		LabelCarpi4.Visible = False
	End If
End Sub

Sub EditTextTakimOkul_TextChanged (Old As String, New As String)
	araTakimOkul = EditTextTakimOkul.Text
	Ara
	If EditTextTakimOkul.Text == "" Then
		LabelCarpi5.Visible = False
	End If
End Sub

Sub editTextBransSinif_TextChanged (Old As String, New As String)
	araBransSinif = EditTextBransSinif.Text
	Ara
	If EditTextBransSinif.Text == "" Then
		LabelCarpi6.Visible = False
	End If
End Sub

Sub editTextMevki_TextChanged (Old As String, New As String)
	araMevki = EditTextMevki.Text
	Ara
	If EditTextMevki.Text == "" Then
		LabelCarpi7.Visible = False
	End If
End Sub
#End Region

#Region SPINNER
Sub spinnerCinsiyet_ItemClick (Position As Int, Value As Object)
	Try
		araCinsiyet= Value
		Ara
	Catch
		Log(LastException)
	End Try
End Sub

Sub spinnerDogumYeri_ItemClick (Position As Int, Value As Object)
	Try
		araDogumYeri= Value
		Ara
	Catch
		Log(LastException)
	End Try

End Sub

Sub SpinnerGun_ItemClick (Position As Int, Value As Object)
	Try
		araGun = Value
	Catch
		araGun = 28
		Log(LastException)
	End Try
End Sub

Sub SpinnerAy_ItemClick (Position As Int, Value As Object)
	Try
		If Value == "Ocak" Then
			araAy = 1
		Else if Value == "Şubat" Then
			araAy = 2
		Else if Value == "Mart" Then
			araAy = 3
		Else if Value == "Nisan" Then
			araAy = 4
		Else if Value == "Mayıs" Then
			araAy = 5
		Else if Value == "Haziran" Then
			araAy = 6
		Else if Value == "Temmuz" Then
			araAy = 7
		Else if Value == "Ağustos" Then
			araAy = 8
		Else if Value == "Eylül" Then
			araAy = 9
		Else if Value == "Ekim" Then
			araAy = 10
		Else if Value == "Kasım" Then
			araAy = 11
		Else if Value == "Aralık" Then
			araAy = 12
		End If
	Catch
		araAy = 6
		Log(LastException)
	End Try
End Sub

Sub SpinnerYil_ItemClick (Position As Int, Value As Object)
	Try
		araYil = Value
	Catch
		araYil = 1996
		Log(LastException)
	End Try
End Sub

#End Region

Sub ButtonDogumTarihi_Click
	Panel2.Visible = True
	KisimGizle
End Sub

Sub ButtonTarihAyar_Click
	Panel2.Visible = False
'	CustomListView1.Clear
	Dim Dd As DateDialog

	If araYil == 1950 Or araYil == 1951 Then
		If araAy == 2 Then
			If araGun == 29 Or araGun == 30 Or araGun == 31 Then
				ToastMessageShow($" Şubat ayı ${araYil} yılında 28 gündür"$, True)
				araGun = 28
			End If
		Else if araAy == 4 Or araAy == 6 Or araAy == 9 Or araAy == 11 Then
			If araGun == 31 Then
				ToastMessageShow($"${araYil} yılında ${araAy}. ay 30 gündür"$, True)
				araGun = 30
			End If
		End If
	End If
	
	#region opsiyon
'	Dim yilSubatHesabi(78) As Int
'	For i=0 To 77
'		yilSubatHesabi(i) = i+1952
'	Next
	#end region
	
	Dim yilSubatHesabi() As Int = Array As Int(1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1981,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022,2023,2024,2025,2026,2027,2028,2029)
	For i=0 To yilSubatHesabi.Length-1
		If araYil == yilSubatHesabi(i) Then
			If araAy == 2 Then
				If i Mod 4 == 0 Then
					If araGun == 30 Or araGun == 31 Then
						ToastMessageShow($" Şubat ayı ${yilSubatHesabi(i)} yılında 29 gündür"$, True)
						araGun = 29
					End If
				Else
					If araGun == 29 Or araGun == 30 Or araGun == 31 Then
						ToastMessageShow($" Şubat ayı ${yilSubatHesabi(i)} yılında 28 gündür"$, True)
						araGun = 28
					End If
				End If
			Else if araAy == 4 Or araAy == 6 Or araAy == 9 Or araAy == 11 Then
				If araGun == 31 Then
					ToastMessageShow($" ${yilSubatHesabi(i)} yılında ${araAy}. ay 30 gündür"$, True)
					araGun = 30
				End If
			End If
		End If
	Next

	Dim secilen As String = $"${araAy}/${araGun}/${araYil}"$
	Dd.Year = DateTime.GetYear(DateTime.DateParse(secilen))
	Dd.Month = DateTime.GetMonth(DateTime.DateParse(secilen))
	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.DateParse(secilen))
	
	Dim result As Int = Dd.Show("Tarih seçiniz", "SPORT EXPERT TARİH SEÇİM PANELİ", "Evet", "İptal","", Null)
	If result = DialogResponse.POSITIVE Then
		araDogumTarihi = Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year
		ButtonDogumTarihi.Text = araDogumTarihi
		Ara
	Else If result = DialogResponse.CANCEL Then
		ButtonDogumTarihi.Text = ""
		ToastMessageShow("Seçim yapılmadı",True)
	End If
	
	KisimGoster

End Sub

#region label çarpı 

Sub LabelCarpi1_Click
	EditTextKimlikNo.SelectAll
	EditTextKimlikNo.Text = ""
	'check edildiyse çarpıya basıldıktan sonra check at
End Sub

Sub LabelCarpi2_Click
	EditTextIsim.SelectAll
	EditTextIsim.Text = ""
End Sub

Sub LabelCarpi3_Click
	EditTextBabaAdi.SelectAll
	EditTextBabaAdi.Text = ""
End Sub

Sub LabelCarpi4_Click
	EditTextEngelDurumu.SelectAll
	EditTextEngelDurumu.Text = ""
End Sub

Sub LabelCarpi5_Click
	EditTextTakimOkul.SelectAll
	EditTextTakimOkul.Text = ""
End Sub

Sub LabelCarpi6_Click
	EditTextBransSinif.SelectAll
	EditTextBransSinif.Text = ""
End Sub

Sub LabelCarpi7_Click
	EditTextMevki.SelectAll
	EditTextMevki.Text = ""
End Sub

#end region
