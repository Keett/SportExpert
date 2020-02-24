B4A=true
Group=SportExpertProjeDosyası\Denek
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
	Dim id,tc,isim,cinsiyet,dogum_tarihi,il,baba_adi,engel_durumu,takim_okul,brans_sinif,mevki As String
	Dim resim() As Byte
	Dim bmp As Bitmap
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditTextAra As EditText
	Private ListView1 As ListView
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
	
	Dim rs As ResultSet
	Private ButtonDenekTabloVeri As Button
	Private ButtonDenekEkle As Button
	Private Label1 As Label
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DenekDuzenleSilPage")
	LabelCarpi.Visible = False
	
	#region görüntü ayarı
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

Public Sub VeriAl
	id = rs.GetString("denek_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
	cinsiyet= rs.GetString("cinsiyet_adi")
	dogum_tarihi = rs.GetString("denek_dogumTarihi")
	il = rs.GetString("il_adi")
	baba_adi = rs.GetString("denek_babaAdi")
	engel_durumu = rs.GetString("denek_engelDurumu")
	takim_okul = rs.GetString("denek_takimOkul")
	brans_sinif = rs.GetString("denek_bransSinif")
	mevki = rs.GetString("denek_mevki")
	resim = rs.GetBlob("denek_image")
	Try
		Dim inputStream As InputStream
		inputStream.InitializeFromBytesArray(resim, 0, resim.Length)
		bmp.Initialize2(inputStream)
		inputStream.Close
		Log("try")
	Catch
		bmp = LoadBitmap(File.DirAssets, "FotoKisi.png")
		Log("catch")
	End Try
End Sub

Sub ListViewGosterDB
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Cinsiyet: ${cinsiyet}"$,bmp)
	Next
	rs.Close
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR cinsiyet_adi LIKE '%"& EditTextAra.Text &"%' OR denek_dogumTarihi LIKE '%"& EditTextAra.Text &"%' OR il_adi LIKE '%"& EditTextAra.Text &"%' OR denek_babaAdi LIKE '%"& EditTextAra.Text &"%' OR denek_engelDurumu LIKE '%"& EditTextAra.Text &"%' OR denek_takimOkul LIKE '%"& EditTextAra.Text &"%' OR denek_bransSinif LIKE '%"& EditTextAra.Text &"%' OR denek_mevki LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC ")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Cinsiyet: ${cinsiyet}"$,bmp)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region listview da aratılana göre gösterme
Sub ButtonTc_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonIsim_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_isim LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonCinsiyet_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE cinsiyet_adi LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Cinsiyet: ${cinsiyet} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonDogumTarihi_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_dogumTarihi LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Doğum Tarihi: ${dogum_tarihi} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonDogumYeri_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE il_adi LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Doğum Yeri: ${il} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonBabaAdi_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_babaAdi LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Baba Adı: ${baba_adi} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonEngelDurumu_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_engelDurumu LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Engel Durumu: ${engel_durumu} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonTakimOkul_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_takimOkul LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Takım/Okul: ${takim_okul} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonBransSinif_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_bransSinif LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Doğum Tarihi: ${dogum_tarihi} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonMevki_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_mevki LIKE '%"& EditTextAra.Text&"%' ORDER BY denek_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc}, // Mevki: ${mevki} "$,bmp)
	Next
	rs.Close
End Sub

#end region 

Sub ButtonDenekTabloVeri_Click
	StartActivity(DenekListele)
	Activity.Finish
End Sub

Sub ButtonDenekEkle_Click
	StartActivity(DenekEkleGuncelle)
	Activity.Finish
End Sub

'update işlemi
Sub ListView1_ItemClick (Position As Int, Value As Object)
	Main.Status= "U"
	rs = Main.sql.ExecQuery("SELECT * FROM Denek WHERE denek_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount -1
		rs.Position = i
		Try
			VeriAl
		Catch
			Log(LastException)
		End Try
	Next
	rs.Close
	StartActivity(DenekEkleGuncelle)
	Activity.Finish
End Sub

'silme işlemi
Sub ListView1_ItemLongClick (Position As Int, Value As Object)
	rs = Main.sql.ExecQuery("SELECT denek_id FROM Denek WHERE denek_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		id=rs.GetString("denek_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Kişiyi silme istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		Main.sql.ExecNonQuery("DELETE FROM Denek WHERE denek_id = '"&id&"' ")
		ToastMessageShow("Denek silindi...",False)
	End If
	
	ListViewGosterDB
End Sub

Sub SetDivider(lv As ListView, Renk As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Renk, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub

Sub Label1_Click
	ListViewGosterDB
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	ListViewGosterDB
End Sub
