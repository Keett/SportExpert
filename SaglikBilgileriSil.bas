B4A=true
Group=SportExpertProjeDosyası\Test\SaglikBilgileri
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
	Dim rs As ResultSet
	Dim id As Int
	Private ButtonIsim As Button
	Private ButtonTc As Button
	Private ButtonHastalikSaglik As Button
	Private ButtonSaglikBilgileriAciklama As Button
	Private ButtonTarih As Button
	
	Dim tc,tarih,isim, saat, hastalik_saglik, aciklama As String
	Dim resim() As Byte
	Dim bmp As Bitmap
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SaglikBilgileriSilPage")
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
	
	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonIsim.TextColor = Color.koyuMavi
	ButtonIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonIsim.Text = "İSİM"
	ButtonIsim.TextSize = 14
	ButtonIsim.SingleLine = True
	
	ButtonHastalikSaglik.TextColor = Color.koyuMavi
	ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_BOLD
	ButtonHastalikSaglik.Text = "HASTALIK/SAĞLIK"
	ButtonHastalikSaglik.TextSize = 14
	ButtonHastalikSaglik.SingleLine = True
	
	ButtonSaglikBilgileriAciklama.TextColor = Color.koyuMavi
	ButtonSaglikBilgileriAciklama.Typeface = Typeface.DEFAULT_BOLD
	ButtonSaglikBilgileriAciklama.Text = "SAĞLIK BİLGİLERİ AÇIKLAMA"
	ButtonSaglikBilgileriAciklama.TextSize = 14
	ButtonSaglikBilgileriAciklama.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTc.SingleLine = True
	
	#End region
	
	ListViewGosterDB
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub VeriAl
	id = rs.GetInt("saglikBilgileri_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
	tarih = rs.GetString("saglikBilgileri_tarih")
	saat = rs.GetString("saglikBilgileri_saat")
	hastalik_saglik = rs.GetInt("saglikBilgileri_hastalikSakatlik")
	aciklama = rs.GetInt("saglikBilgileri_aciklama")
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
	rs = Main.sql.ExecQuery("SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Hastalık/Sağlık: ${hastalik_saglik} // Açıklama: ${aciklama}"$,bmp)
	Next
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_tarih LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_hastalikSakatlik LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_aciklama LIKE '%"& EditTextAra.Text &"%') ORDER BY saglikBilgileri_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} "$,bmp)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#Region Aratma
Sub ButtonTarih_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT saglikBilgileri_tarih ,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih LIKE '%"& EditTextAra.Text&"%' ORDER BY saglikBilgileri_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonSaglikBilgilerAciklama_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT saglikBilgileri_aciklama,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"& EditTextAra.Text&"%' ORDER BY saglikBilgileri_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Açıklama: ${aciklama}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonHastalikSaglik_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT saglikBilgileri_hastalikSakatlik ,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"& EditTextAra.Text&"%' ORDER BY saglikBilgileri_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Hastalık/Sağlık: ${hastalik_saglik}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonTc_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT denek_tc,saglikBilgileri_id FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} "$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonIsim_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT denek_isim,saglikBilgileri_id  FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat}"$,bmp)
	Next
	rs.Close
End Sub

#end region

Sub ButtonSaglikBilgileriEkle_Click
	WebView1.Visible = False
	StartActivity(SaglikBilgileriEkle)
	Activity.Finish
End Sub

Sub ButtonSaglikBilgileriTabloVeri_Click
	WebView1.Visible = False
	StartActivity(SaglikBilgileriListele)
	Activity.Finish
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	WebView1.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK], saglikBilgileri_aciklama As [AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_id  = '"&Value&"' ",Null,-1,False))
	Return
End Sub

Sub ListView1_ItemLongClick (Position As Int, Value As Object)
	rs = Main.sql.ExecQuery("SELECT * FROM SaglikBilgileri WHERE saglikBilgileri_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		id = rs.GetInt("saglikBilgileri_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Sağlık bilgilerini silmek istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		Main.sql.ExecNonQuery("DELETE FROM SaglikBilgileri WHERE saglikBilgileri_id = '"&id&"' ")
		ToastMessageShow("Sağlık bilgileri silindi...",False)
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

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	ListViewGosterDB
End Sub