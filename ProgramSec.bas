B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\DayaniklilikTest
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
	Dim secilenProgramId As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ButtonAnasayfa As Button
	Private EditTextAra As EditText
	Private LabelCarpi As Label
	Private ButtonProgramEkle As Button
	Private ButtonProgramAdi As Button
	Private ButtonTestTuru As Button
	Private ButtonTarih As Button
	Private ButtonLevel As Button
	Private ListView1 As ListView
	
	Dim rs As ResultSet

	Dim programId , level As Int
	Dim programAdi ,testTuru, tarih As String

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ProgramSecPage")
	LabelCarpi.Visible = False
	
	#region listview görüntü ayarı
	ListView1.TwoLinesLayout.Label.Visible = False
	ListView1.TwoLinesLayout.SecondLabel.TextColor = Color.koyuMavi
	ListView1.TwoLinesLayout.SecondLabel.TextSize = 20
	SetDivider(ListView1, Color.acikMavi, 3dip)
	
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
	
	ButtonLevel.TextColor = Color.koyuMavi
	ButtonLevel.Typeface = Typeface.DEFAULT_BOLD
	ButtonLevel.Text = "LEVEL"
	ButtonLevel.TextSize = 14
	ButtonLevel.SingleLine = True
	#end region	
	ListViewGosterDB
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub VeriAl
	programId= rs.GetInt("program_id")
	programAdi = rs.GetString("program_adi")
	testTuru = rs.GetString("program_testTuru")
	level = rs.GetInt("level")
	tarih = rs.GetString("program_tarih")
End Sub

Sub ListViewGosterDB
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih} "$)
	Next
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	ListView1.Clear
	rs = Main.sql.ExecQuery( "SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"& EditTextAra.Text &"%' OR program_testTuru LIKE '%"& EditTextAra.Text &"%' OR level LIKE '%"& EditTextAra.Text &"%' OR program_tarih LIKE '%"& EditTextAra.Text &"%' ORDER BY program_id DESC")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih}"$)
	Next
	rs.Close
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	ListViewGosterDB
End Sub

Sub ButtonProgramEkle_Click
	StartActivity(ProgramAyar)
	Activity.Finish
End Sub

Sub ButtonProgramAdi_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_adi LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Program Adı: ${programAdi} // Test Türü: ${testTuru} // Level: ${level} // Tarih: ${tarih}"$)
	Next
	rs.Close
End Sub

Sub ButtonTestTuru_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_testTuru LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru} // Tarih: ${tarih}"$)
	Next
	rs.Close
End Sub

Sub ButtonTarih_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_tarih LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Tarih: ${tarih} // Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru}"$)
	Next
	rs.Close
End Sub

Sub ButtonLevel_Click
	ListView1.Clear
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE level LIKE '%"& EditTextAra.Text&"%' ORDER BY program_id DESC ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		ListView1.AddTwoLines(programId,$"Level: ${level} // Program Adı: ${programAdi} // Test Türü: ${testTuru} //// Tarih: ${tarih}"$)
	Next
	rs.Close
End Sub

Sub ListView1_ItemClick (Position As Int, Value As Object)
	rs = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram WHERE program_id = '"&Value&"' ")
	
	For i=0 To rs.RowCount-1
		rs.Position = i
		programId = rs.GetInt("program_id")
	Next
	rs.Close
	
	Dim result As Int
	result = Msgbox2("Programı seçmek istediğinizden emin misiniz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result = DialogResponse.POSITIVE Then
		secilenProgramId = programId
		StartActivity(DayaniklilikTestEkle)
	Else if result = DialogResponse.NEGATIVE Then
		ToastMessageShow("Devam etmek için program seçmelisiniz",True)
	End If
End Sub

Sub SetDivider(lv As ListView, Renk As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Renk, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub