B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\DayaniklilikTest\Program
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

	Private ButtonAnasayfa As Button
	Private EditTextAra As EditText
	Private LabelCarpi As Label
	Private ButtonDayaniklilikProgramEkle As Button
	Private ButtonDayaniklilikProgramTabloVeri As Button
	Private ListView1 As ListView
	Private WebView1 As WebView
	
	Private ButtonProgramAdi As Button
	Private ButtonLevel As Button
	Private ButtonTestTuru As Button
	Private ButtonTarih As Button
	Private ButtonPistUzunlugu As Button
	Private ButtonKoniArasiMesafe As Button
	Private ButtonKoniSayisi As Button
	Private ButtonHiz As Button
	
	Dim rs As ResultSet
	Dim id , level As Int
	Dim programAdi ,testTuru, tarih, saat As String
	Dim koniMesafesi, hiz As Float
	

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ProgramSilPage")
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
	
	ButtonProgramAdi.TextColor = Color.koyuMavi
	ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD
	ButtonProgramAdi.TextSize = 14
	ButtonProgramAdi.SingleLine = True
	
	ButtonTestTuru.TextColor = Color.koyuMavi
	ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD
	ButtonTestTuru.TextSize = 14
	ButtonTestTuru.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTarih.SingleLine = True
	
	ButtonPistUzunlugu.TextColor = Color.koyuMavi
	ButtonPistUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonPistUzunlugu.Text = "PİST UZUNLUĞU"
	ButtonPistUzunlugu.TextSize = 14
	ButtonPistUzunlugu.SingleLine = True
	
	ButtonKoniArasiMesafe.TextColor = Color.koyuMavi
	ButtonKoniArasiMesafe.Typeface = Typeface.DEFAULT_BOLD
	ButtonKoniArasiMesafe.Text = "KONİ ARASI MESAFE"
	ButtonKoniArasiMesafe.TextSize = 14
	ButtonKoniArasiMesafe.SingleLine = True
	
	ButtonKoniSayisi.TextColor = Color.koyuMavi
	ButtonKoniSayisi.Typeface = Typeface.DEFAULT_BOLD
	ButtonKoniSayisi.Text = "KONİ SAYISI"
	ButtonKoniSayisi.TextSize = 14
	ButtonKoniSayisi.SingleLine = True
	
	ButtonHiz.TextColor = Color.koyuMavi
	ButtonHiz.Typeface = Typeface.DEFAULT_BOLD
	ButtonHiz.Text = "HIZ"
	ButtonHiz.TextSize = 14
	ButtonHiz.SingleLine = True
	
	ButtonLevel.TextColor = Color.koyuMavi
	ButtonLevel.Typeface = Typeface.DEFAULT_BOLD
	ButtonLevel.Text = "LEVEL"
	ButtonLevel.TextSize = 14
	ButtonLevel.SingleLine = True
	
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	#end region
	
	ListViewGosterDB
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub VeriAl
	id= rs.GetInt("program_id")
	programAdi = rs.GetString("program_adi")
	testTuru = rs.GetString("program_testTuru")
	level = rs.GetInt("level")
	tarih = rs.GetString("program_tarih")
	saat = rs.GetString("program_saat")
	koniMesafesi = rs.GetString("koniMesafesi1")
	hiz = rs.GetString("hiz1")
End Sub

Sub ListViewGosterDB
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} // Saat: ${saat}"$)
	Next
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	WebView1.Visible = False
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"& EditTextAra.Text &"%' OR program_testTuru LIKE '%"& EditTextAra.Text &"%' OR level LIKE '%"& EditTextAra.Text &"%' OR program_tarih LIKE '%"& EditTextAra.Text &"%' OR program_saat LIKE '%"& EditTextAra.Text &"%' ORDER BY program_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} // Saat: ${saat}"$)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region aratma
Sub ButtonProgramAdi_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} // Saat: ${saat}"$)
	Next
	rs.Close
End Sub

Sub ButtonLevel_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru} //// Tarih: ${tarih} // Saat: ${saat}"$)
	Next
	rs.Close
End Sub

Sub ButtonTestTuru_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru  LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru} // Tarih: ${tarih} // Saat: ${saat}"$)
	Next
	rs.Close
End Sub

Sub ButtonTarih_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Tarih: ${tarih} // Saat: ${saat} // Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru}"$)
	Next
	rs.Close
End Sub

Sub ButtonPistUzunlugu_Click
	'''olacak mı olmayacak mı sorulacak
End Sub

Sub ButtonKoniArasiMesafe_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE koniMesafesi1 LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} // Saat: ${saat} // Koni Mesafesi: ${koniMesafesi}"$)
	Next
	rs.Close
End Sub

Sub ButtonKoniSayisi_Click
	'''olacak mı olmayacak mı sorulacak
End Sub

Sub ButtonHiz_Click
	WebView1.Visible = False
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE hiz1 LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(id,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} // Saat: ${saat} // Hız: ${hiz}"$)
	Next
	rs.Close
End Sub

#end region

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	ListViewGosterDB
End Sub

Sub ListView1_ItemLongClick (Position As Int, Value As Object)
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		id = rs.GetInt("program_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Programı silmek istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		Main.sql.ExecNonQuery("DELETE FROM DayaniklilikTestProgram WHERE program_id = '"&id&"' ")
		ToastMessageShow("Program silindi...",False)
	End If
	ListViewGosterDB
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	Dim result As Int = Msgbox2($"Program ismi: ${programAdi} olan program bilgilerini görüntülemek için Görüntüle'yi tıklayın ya da Seçili program için Dayanıklılık Testi yapmak için lütfen Test Yap'ı seçin"$,"Bildirim Mesajı", "Görüntüle", "", "Test Yap",Null)
	If result = DialogResponse.POSITIVE Then
		WebView1.Visible = True
		WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT program_adi  As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ],koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1] ,koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram WHERE program_id = '"&Value&"' ",Null,-1,False))
		Return
	Else if result = DialogResponse.NEGATIVE Then
'		StartActivity(CokluDenekSecim)
		Activity.finish
	End If
	
End Sub

Sub ButtonDayaniklilikProgramEkle_Click
	WebView1.Visible = False
	StartActivity(ProgramAyar)
	Activity.Finish
End Sub

Sub ButtonDayaniklilikProgramTabloVeri_Click
	WebView1.Visible = False
	StartActivity(ProgramListele)
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