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
	Dim denekImage() As Byte
	Dim secilenDenek,denekTc,denekIsim,denekCinsiyet,denekDogumTarihi,denekIl, denekBaba, denekEngel,denekTakim, denekBrans,denekMevki As String 
	Dim bmp As Bitmap
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private EditTextAra As EditText
	Private ButtonTc As Button
	Private ButtonIsim As Button
	Private ButtonCinsiyet As Button
	Private ButtonDogumTarihi As Button
	Private ButtonDogumYeri As Button
	Private ButtonBabaAdi As Button
	Private ButtonEngelDurumu As Button
	Private ButtonTakimOkul As Button
	Private ButtonBransSinif As Button
	Private ButtonMevki As Button
	Private ListView1 As ListView
	Dim rs As ResultSet
	Private LabelCarpi As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DenekAraTestPage")
	LabelCarpi.Visible = False
	
#region listview/Edittext/button görüntü ayarı

	ListView1.TwoLinesAndBitmap.Label.Visible = False
	ListView1.TwoLinesAndBitmap.SecondLabel.TextColor = Color.koyuMavi
	ListView1.TwoLinesAndBitmap.SecondLabel.TextSize = 20
	SetDivider(ListView1,Color.acikMavi,3dip)
	
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD

	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.SingleLine = True
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	
	ButtonIsim.TextColor = Color.koyuMavi
	ButtonIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonIsim.SingleLine = True
	ButtonIsim.Text ="İSİM"
	ButtonIsim.TextSize = 14
	
	ButtonCinsiyet.TextColor = Color.koyuMavi
	ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD
	ButtonCinsiyet.SingleLine = True
	ButtonCinsiyet.Text = "CİNSİYET"
	ButtonCinsiyet.TextSize = 14
	
	ButtonDogumTarihi.TextColor = Color.koyuMavi
	ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOLD
	ButtonDogumTarihi.SingleLine = True
	ButtonDogumTarihi.Text = "DOĞUM TARİHİ"
	ButtonDogumTarihi.TextSize = 14
	
	ButtonDogumYeri.TextColor = Color.koyuMavi
	ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD
	ButtonDogumYeri.SingleLine = True
	ButtonDogumYeri.Text = "DOĞUM YERİ"
	ButtonDogumYeri.TextSize = 14
	
	ButtonBabaAdi.TextColor = Color.koyuMavi
	ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD
	ButtonBabaAdi.SingleLine = True
	ButtonBabaAdi.Text = "BABA ADI"
	ButtonBabaAdi.TextSize = 14
	
	ButtonEngelDurumu.TextColor= Color.koyuMavi
	ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD
	ButtonEngelDurumu.SingleLine= True
	ButtonEngelDurumu.Text= "ENGEL DURUMU"
	ButtonEngelDurumu.TextSize= 14
	
	ButtonTakimOkul.TextColor = Color.koyuMavi
	ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD
	ButtonTakimOkul.SingleLine = True
	ButtonTakimOkul.Text = "TAKIM/OKUL"
	ButtonTakimOkul.TextSize = 14
	
	ButtonBransSinif.TextColor = Color.koyuMavi
	ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD
	ButtonBransSinif.SingleLine = True
	ButtonBransSinif.Text = "BRANŞ/SINIF"
	ButtonBransSinif.TextSize = 14
	
	ButtonMevki.TextColor = Color.koyuMavi
	ButtonMevki.Typeface = Typeface.DEFAULT_BOLD
	ButtonMevki.SingleLine = True
	ButtonMevki.Text = "MEVKİ"
	ButtonMevki.TextSize = 14
	
	#End region
	
	ListViewGosterDB

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub VeriAl
	secilenDenek = rs.GetString("denek_id")
	denekTc = rs.GetString("denek_tc")
	denekIsim = rs.GetString("denek_isim")
	denekCinsiyet= rs.GetString("cinsiyet_adi")
	denekDogumTarihi = rs.GetString("denek_dogumTarihi")
	denekIl = rs.GetString("il_adi")
	denekBaba = rs.GetString("denek_babaAdi")
	denekEngel = rs.GetString("denek_engelDurumu")
	denekTakim = rs.GetString("denek_takimOkul")
	denekBrans = rs.GetString("denek_bransSinif")
	denekMevki = rs.GetString("denek_mevki")
	denekImage = rs.GetBlob("denek_image")
	Try
		Dim inputStream As InputStream
		inputStream.InitializeFromBytesArray(denekImage, 0, denekImage.Length)
		bmp.Initialize2(inputStream)
		inputStream.Close
	Catch
		bmp = LoadBitmap(File.DirAssets, "FotoKisi.png")
	End Try
	
End Sub

Sub ListViewGosterDB
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek")

	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"TC: ${denekTc} // Ad Soyad: ${denekIsim}"$,bmp)
	Next
	rs.Close
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR cinsiyet_adi LIKE '%"& EditTextAra.Text &"%' OR denek_dogumTarihi LIKE '%"& EditTextAra.Text &"%' OR il_adi LIKE '%"& EditTextAra.Text &"%' OR denek_babaAdi LIKE '%"& EditTextAra.Text &"%' OR denek_engelDurumu LIKE '%"& EditTextAra.Text &"%' OR denek_takimOkul LIKE '%"& EditTextAra.Text &"%' OR denek_bransSinif LIKE '%"& EditTextAra.Text &"%' OR denek_mevki LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"TC: ${denekTc} // Ad Soyad: ${denekIsim} // Cinsiyet: ${denekCinsiyet}"$,bmp)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region Aratma 
Sub ButtonTc_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"TC: ${denekTc}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonIsim_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_isim LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"Ad Soyad: ${denekIsim} // TC: ${denekTc}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonCinsiyet_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"TC: ${denekTc}, // Cinsiyet: ${denekCinsiyet} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonDogumTarihi_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek,$"TC: ${denekTc}, // Doğum Tarihi: ${denekDogumTarihi} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonDogumYeri_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE il_adi LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Doğum Yeri: ${denekIl}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonBabaAdi_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Baba Adı: ${denekBaba}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonEngelDurumu_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Engel Durumu: ${denekEngel}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonTakimOkul_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Takım/Okul: ${denekTakim}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonBransSinif_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Branş/Sınıf: ${denekBrans}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonMevki_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_mevki LIKE '%"& EditTextAra.Text&"%' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(secilenDenek, $"TC: ${denekTc}, // Mevki: ${denekMevki}"$,bmp)
	Next
	rs.Close
End Sub
#end region

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim rs As ResultSet 
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		Try
			VeriAl
		Catch
			Log(LastException)
		End Try	
	Next
	rs.Close
	
'	secilenDenek = Value
	Log(secilenDenek)
	
	If TestMenu.yapilacakTest = "Antropometrik" Then
		StartActivity(AntropometrikEkle)
	Else If TestMenu.yapilacakTest  ="Biyokimyasal" Then
		StartActivity(BiyokimyasalEkle)
	Else If TestMenu.yapilacakTest = "Psikolojik"  Then
		StartActivity(PsikolojikEkle)
	Else If TestMenu.yapilacakTest = "MotorOzellik" Then  
		If MotorOzellikMenu.yapilacakMotorOzellikTest = "SuratTest" Then
			StartActivity(SuratTestAyar)
		Else if MotorOzellikMenu.yapilacakMotorOzellikTest = "DayaniklilikTest" Then
'			StartActivity(DayaniklilikTestAyar)
'BURADA DENEK SEÇİLMİYOR GRUP SEÇİLİYOR 
		Else if MotorOzellikMenu.yapilacakMotorOzellikTest = "DikeySicramaTest" Then
		Else If MotorOzellikMenu.yapilacakMotorOzellikTest = "DengeTest" Then
		Else if MotorOzellikMenu.yapilacakMotorOzellikTest = "KuvvetTest" Then
		Else if MotorOzellikMenu.yapilacakMotorOzellikTest = "ReaksiyonTest" Then
		Else
			ToastMessageShow("motor özellik testleri menüsünden seçim yapılamadı",True)
		End If
	Else If TestMenu.yapilacakTest = "AntranorGorusleri" Then  
		StartActivity(AntranorGorusEkle)
	Else If TestMenu.yapilacakTest = "SaglikBilgileri" Then
		StartActivity(SaglikBilgileriEkle)
	Else
		ToastMessageShow("Test menüsünden seçim yapılamadı",True)
	End If
	'Activity finish edilmedi çünkü bi önceki denek ekleme mevzuna dönmek istiyoruz
End Sub

Sub SetDivider(lv As ListView, Renk As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Renk, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text =""
	ListViewGosterDB
End Sub
