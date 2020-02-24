B4A=true
Group=SportExpertProjeDosyası\Test\AntropometrikOzellikler
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
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private EditTextAra As EditText
	Private ListView1 As ListView
	Private WebView1 As WebView
	Private LabelCarpi As Label
	Dim rs As ResultSet
	
	Private ButtonTc As Button
	Private ButtonTarih As Button
	Private ButtonBoy As Button
	Private ButtonKilo As Button
	Private ButtonElUzunlugu As Button
	Private ButtonKulacUzunlugu As Button
	Private ButtonOturmaYuksekligi As Button
	Private ButtonAyakUzunlugu As Button
	Private ButtonDeriKivrimKalinligi As Button
	
	Dim tc,tarih,isim, saat As String
	Dim id,boy,kilo,el_uzunlugu,kulac_uzunlugu,oturma_yuksekligi,ayak_uzunlugu,deriKivrim_kalinligi As Int
	Dim resim() As Byte
	Dim bmp As Bitmap
	
	Private ButtonAnasayfa As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AntropometrikSilPage")
	WebView1.Visible = False
	LabelCarpi.Visible = False
	
	#region listview görüntü ayarı
	ListView1.TwoLinesAndBitmap.Label.Visible = False
	ListView1.TwoLinesAndBitmap.SecondLabel.TextColor = Color.koyuMavi
	ListView1.TwoLinesAndBitmap.SecondLabel.TextSize = 20
	SetDivider(ListView1,Color.acikMavi,3dip)
	
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	
	ButtonDeriKivrimKalinligi.TextColor = Color.koyuMavi
	ButtonDeriKivrimKalinligi.Typeface = Typeface.DEFAULT_BOLD
	ButtonDeriKivrimKalinligi.Text = "DERİ KIVRIM KALINLIĞI"
	ButtonDeriKivrimKalinligi.TextSize = 14
	ButtonDeriKivrimKalinligi.SingleLine = True
	
	ButtonAyakUzunlugu.TextColor = Color.koyuMavi
	ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonAyakUzunlugu.Text = "AYAK UZUNLUĞU"
	ButtonAyakUzunlugu.TextSize = 14
	ButtonAyakUzunlugu.SingleLine = True
	
	ButtonKulacUzunlugu.TextColor = Color.koyuMavi
	ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonKulacUzunlugu.Text = "KULAÇ UZUNLUĞU"
	ButtonKulacUzunlugu.TextSize = 14
	ButtonKulacUzunlugu.SingleLine = True
	
	ButtonOturmaYuksekligi.TextColor = Color.koyuMavi
	ButtonOturmaYuksekligi.Typeface = Typeface.DEFAULT_BOLD
	ButtonOturmaYuksekligi.Text = "OTURMA YÜKSEKLİĞİ"
	ButtonOturmaYuksekligi.TextSize = 14
	ButtonOturmaYuksekligi.SingleLine = True
	
	ButtonElUzunlugu.TextColor = Color.koyuMavi
	ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonElUzunlugu.Text = "EL UZUNLUĞU"
	ButtonElUzunlugu.TextSize = 14
	ButtonElUzunlugu.SingleLine = True
	
	ButtonKilo.TextColor = Color.koyuMavi
	ButtonKilo.Typeface = Typeface.DEFAULT_BOLD
	ButtonKilo.Text = "KİLO"
	ButtonKilo.TextSize = 14
	ButtonKilo.SingleLine = True
	
	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonBoy.TextColor = Color.koyuMavi
	ButtonBoy.Typeface = Typeface.DEFAULT_BOLD
	ButtonBoy.Text = "BOY"
	ButtonBoy.TextSize = 14
	ButtonBoy.SingleLine = True

	#End region
	
	ListViewGosterDB
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub VeriAl
	id = rs.GetInt("antropometrik_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
	tarih = rs.GetString("antropometrik_tarih")
	saat = rs.GetString("antropometrik_saat")
	boy = rs.GetInt("antropometrik_boy")
	kilo = rs.GetInt("antropometrik_kilo")
	el_uzunlugu = rs.GetInt("antropometrik_elUzunlugu")
	kulac_uzunlugu = rs.GetInt("antropometrik_kulacUzunlugu")
	oturma_yuksekligi = rs.GetInt("antropometrik_oturmaYuksekligi")
	ayak_uzunlugu = rs.GetInt("antropometrik_ayakUzunlugu")
	deriKivrim_kalinligi = rs.GetInt("antropometrik_deriKivrimKalinligi")
	resim = rs.GetBlob("denek_image")
	Try
		Dim inputStream As InputStream
		inputStream.InitializeFromBytesArray(resim, 0, resim.Length)
		bmp.Initialize2(inputStream)
		inputStream.Close
	Catch
		bmp = LoadBitmap(File.DirAssets, "FotoKisi.png")
	End Try
End Sub

Sub ListViewGosterDB
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Boy: ${boy} // Kilo: ${kilo}"$,bmp)
	Next
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	WebView1.Visible = False
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR antropometrik_tarih  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_boy  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_kilo  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_elUzunlugu  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_kulacUzunlugu  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_oturmaYuksekligi  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_ayakUzunlugu  LIKE '%"& EditTextAra.Text &"%' OR antropometrik_deriKivrimKalinligi  LIKE '%"& EditTextAra.Text &"%' ) ORDER BY antropometrik_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Boy: ${boy} // Kilo: ${kilo}"$,bmp)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region Aratma
Sub ButtonTarih_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonTc_Click
	ButtonTarih_Click
End Sub

Sub ButtonBoy_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Boy: ${boy}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonKilo_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Kilo: ${kilo}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonElUzunlugu_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // El Uzunluğu: ${el_uzunlugu}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonKulacUzunlugu_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik ,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_kulacUzunlugu LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Kulaç Uzunluğu: ${kulac_uzunlugu}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonOturmaYuksekligi_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Oturma Yüksekliği: ${oturma_yuksekligi}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonAyakUzunlugu_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Ayak Uzunluğu: ${ayak_uzunlugu}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonDeriKivrimKalinligi_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik, Denek WHERE Antropometrik.denek_id = Denek.denek_id  AND antropometrik_deriKivrimKalinligi  LIKE '%"& EditTextAra.Text&"%' ORDER BY antropometrik_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Deri Kıvrım Kalınlığı: ${deriKivrim_kalinligi}"$,bmp)
	Next
	rs.Close
End Sub

#end region

'antropometrik verileri siler
Sub ListView1_ItemLongClick (Position As Int, Value As Object)
	WebView1.Visible = False
	rs = Main.sql.ExecQuery("SELECT * FROM Antropometrik WHERE antropometrik_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		'veri al fonksiyonu da kullanılabilir..
		id = rs.GetInt("antropometrik_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Antropometrik bilgiyi silmek istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		Main.sql.ExecNonQuery("DELETE FROM Antropometrik WHERE antropometrik_id = '"&id&"' ")
		ToastMessageShow("Denek silindi...",False)
	End If
	ListViewGosterDB
End Sub

'secilen denek bilgisini getirir
Sub ListView1_ItemClick (Position As Int, Value As Object)
	WebView1.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT] ,antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_id = '"&Value&"'",Null,-1,False))
	Return
End Sub

Sub ButtonAntropometrikEkle_Click
	WebView1.Visible = False
	StartActivity(AntropometrikEkle)
	Activity.Finish
End Sub

Sub ButtonTabloVeri_Click
	WebView1.Visible = False
	StartActivity(AntropometrikListele)
	Activity.Finish
End Sub

Sub SetDivider(lv As ListView, Renk As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Renk, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	ListViewGosterDB
End Sub