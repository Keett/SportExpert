B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\SuratTest
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
	Dim rs As ResultSet
	Dim tc,tarih,isim,saat,modDeger As String
	Dim id, gate_sayisi, set_sayisi As Int
	Dim resim() As Byte
	Dim bmp As Bitmap
	
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
	Private ButtonSuratTestEkle As Button
	Private ButtonTablodaGoster As Button
	Private ListView1 As ListView
	Private WebView1 As WebView
	Private EditTextAra As EditText
	
	Private ButtonTc As Button
	Private ButtonIsim As Button
	Private ButtonMod As Button
	Private ButtonTarih As Button
	Private ButtonGateSayisi As Button
	Private ButtonSetSayisi As Button

End Sub


Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SuratTestSilPage")
	
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
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTarih.SingleLine = True
	
	ButtonMod.TextColor = Color.koyuMavi
	ButtonMod.Typeface = Typeface.DEFAULT_BOLD
	ButtonMod.Text = "MOD"
	ButtonMod.TextSize = 14
	ButtonMod.SingleLine = True
	
	ButtonGateSayisi.TextColor = Color.koyuMavi
	ButtonGateSayisi.Typeface = Typeface.DEFAULT_BOLD
	ButtonGateSayisi.Text = "GATE SAYISI"
	ButtonGateSayisi.TextSize = 14
	ButtonGateSayisi.SingleLine = True
	
	ButtonSetSayisi.TextColor = Color.koyuMavi
	ButtonSetSayisi.Typeface = Typeface.DEFAULT_BOLD
	ButtonSetSayisi.Text = "SET SAYISI"
	ButtonSetSayisi.TextSize = 14
	ButtonSetSayisi.SingleLine = True
#End region

	ListViewGosterDB
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Public Sub VeriAl
	'REST DAKİKA, REST SANİTE VE RESULT DEĞERİ ALINMADI
	id = rs.GetInt("surat_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
	tarih = rs.GetString("surat_tarih")
	saat = rs.GetString("surat_saat")
	modDeger = rs.GetString("mod")
	gate_sayisi = rs.GetInt("gateSayisi")
	set_sayisi = rs.GetInt("setSayisi")
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

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub ListViewGosterDB
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id ORDER BY surat_id  DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Mod: ${modDeger}"$,bmp)
	Next
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	WebView1.Visible = False
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR mod LIKE '%"& EditTextAra.Text &"%' OR surat_tarih LIKE '%"& EditTextAra.Text &"%' OR gateSayisi LIKE '%"& EditTextAra.Text &"%' OR setSayisi LIKE '%"& EditTextAra.Text &"%') ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Mod: ${modDeger} // Gate Sayısı: ${gate_sayisi} // Set Sayısı: ${set_sayisi}"$,bmp)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region aratma
Sub ButtonTc_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_Tc LIKE '%"& EditTextAra.Text&"%' ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonIsim_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND denek_isim LIKE '%"& EditTextAra.Text&"%' ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonMod_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND mod LIKE '%"& EditTextAra.Text&"%' ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Mod: ${modDeger}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonTarih_Click
	ButtonTc_Click
End Sub

Sub ButtonGateSayisi_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND gateSayisi LIKE '%"& EditTextAra.Text&"%' ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Gate Sayısı: ${gate_sayisi}"$,bmp)
	Next
	rs.Close
End Sub

Sub ButtonSetSayisi_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND setSayisi LIKE '%"& EditTextAra.Text&"%' ORDER BY surat_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLinesAndBitmap(id,$"TC: ${tc} // Ad Soyad: ${isim} // Tarih: ${tarih} // Saat: ${saat} // Set sayısı: ${set_sayisi}"$,bmp)
	Next
	rs.Close
End Sub
#end region

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	ListViewGosterDB
End Sub

Sub ButtonSuratTestEkle_Click
	WebView1.Visible = False
	StartActivity(TestDenekAra)
	Activity.Finish
End Sub

Sub ButtonTablodaGoster_Click
	WebView1.Visible = False
	StartActivity(SuratTestListele)
	Activity.Finish
End Sub


Sub ListView1_ItemClick (Position As Int, Value As Object)
	WebView1.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , mod As [SEÇİLEN MOD], surat_tarih As [TARİH], surat_saat As [SAAT], rest_dakika  As [REST DK.], rest_saniye As [REST SN.], result As [RESULT] , gateSayisi As [BAĞLI GATE SAYISI] ,setSayisi As [SET SAYISI], veri1 As [LAP1], veri2 As [LAP2], veri3 As [LAP], veri4 As [LAP], veri5 As [LAP], veri6 As [LAP],veri7 As [LAP7],veri8 As [LAP8],veri9 As [LAP9],veri10 As [LAP10],veri11 As [LAP11],veri12 As [LAP12],veri13 As [LAP13],veri14 As [LAP14],veri15 As [LAP15],veri16 As [LAP16],veri17 As [LAP17],veri18 As [LAP18],veri19 As [LAP19],veri20 As [LAP20],veri21 As [LAP21],veri22 As [LAP22],veri23 As [LAP23],veri24 As [LAP24],veri25 As [LAP25],veri26 As [LAP26],veri27 As [LAP27],veri28 As [LAP28],veri29 As [LAP29],veri30 As [LAP30],veri31 As [LAP31],veri32 As [LAP32],veri33 As [LAP33],veri34 As [LAP34],veri35 As [LAP35],veri36 As [LAP36],veri37 As [LAP37],veri38 As [LAP38],veri39 As [LAP39],veri40 As [LAP40],veri41 As [LAP41],veri42 As [LAP42],veri43 As [LAP43],veri44 As [LAP44],veri45 As [LAP45],veri46 As [LAP46],veri47 As [LAP47],veri48 As [LAP48],veri49 As [LAP49],veri50 As [LAP50],veri51 As [LAP51],veri52 As [LAP52],veri53 As [LAP53],veri54 As [LAP54],veri55 As [LAP55],veri56 As [LAP56],veri57 As [LAP57],veri58 As [LAP58],veri59 As [LAP59],veri60 As [LAP60],veri61 As [LAP61],veri62 As [LAP62],veri63 As [LAP63],veri64 As [LAP64],veri65 As [LAP65],veri66 As [LAP66],veri67 As [LAP67],veri68 As [LAP68],veri69 As [LAP69],veri70 As [LAP70],veri71 As [LAP71],veri72 As [LAP72],veri73 As [LAP73],veri74 As [LAP74],veri75 As [LAP75],veri76 As [LAP76],veri77 As [LAP77],veri78 As [LAP78],veri79 As [LAP79],veri80 As [LAP80],veri81 As [LAP81],veri82 As [LAP82],veri83 As [LAP83],veri84 As [LAP84],veri85 As [LAP85],veri86 As [LAP86],veri87 As [LAP87],veri88 As [LAP88],veri89 As [LAP89],veri90 As [LAP90],veri91 As [LAP91],veri92 As [LAP92],veri93 As [LAP93],veri94 As [LAP94],veri95 As [LAP95],veri96 As [LAP96],veri97 As [LAP97],veri98 As [LAP98],veri99 As [LAP99],veri100 As [LAP100] FROM SuratTest,Denek WHERE SuratTest.denek_id = Denek.denek_id AND surat_id = '"&Value&"'",Null,-1,False))
	Return
End Sub

Sub ListView1_ItemLongClick (Position As Int, Value As Object)
	WebView1.Visible = False
	rs = Main.sql.ExecQuery("SELECT * FROM SuratTest WHERE surat_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		'veri al fonksiyonu da kullanılabilir..
		id = rs.GetInt("surat_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Sürat test bilgisini silmek istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		Main.sql.ExecNonQuery("DELETE FROM SuratTest WHERE surat_id = '"&id&"' ")
		ToastMessageShow("Sürat test bilgisini silindi...",False)
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
