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

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ButtonAnasayfa As Button
	Private EditTextAra As EditText
	Private LabelCarpi As Label
	Private ButtonDayaniklilikTestEkle As Button
	Private ButtonSil As Button
	Private WebView1 As WebView
	Private ButtonDenekTC As Button
	Private ButtonDenekIsim As Button
	Private ButtonProgramAdi As Button
	Private ButtonTestTuru As Button
	Private ButtonLevel As Button
	Private ButtonMekikSayisi As Button
	Private ButtonTarih As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestListelePage")
	LabelCarpi.Visible = False
	
	#region görüntü ayarı
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	ButtonDenekTC.TextColor = Color.koyuMavi
	ButtonDenekTC.Typeface = Typeface.DEFAULT_BOLD
	ButtonDenekTC.TextSize = 14
	ButtonDenekTC.SingleLine = True
	
	ButtonDenekIsim.TextColor = Color.koyuMavi
	ButtonDenekIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonDenekIsim.TextSize = 14
	ButtonDenekIsim.SingleLine = True
	
	ButtonProgramAdi.TextColor = Color.koyuMavi
	ButtonProgramAdi.Typeface = Typeface.DEFAULT_BOLD
	ButtonProgramAdi.TextSize = 14
	ButtonProgramAdi.SingleLine = True
	
	ButtonTestTuru.TextColor = Color.koyuMavi
	ButtonTestTuru.Typeface = Typeface.DEFAULT_BOLD
	ButtonTestTuru.TextSize = 14
	ButtonTestTuru.SingleLine = True
	
	ButtonLevel.TextColor = Color.koyuMavi
	ButtonLevel.Typeface = Typeface.DEFAULT_BOLD
	ButtonLevel.TextSize = 14
	ButtonLevel.SingleLine = True
	
	ButtonMekikSayisi.TextColor = Color.koyuMavi
	ButtonMekikSayisi.Typeface = Typeface.DEFAULT_BOLD
	ButtonMekikSayisi.TextSize = 14
	ButtonMekikSayisi.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.TextSize = 14
	ButtonTarih.SingleLine = True
	
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	
	#end region
	
	HTMLGosterDB
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
 
Sub HTMLGosterDB
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT dayaniklilik_tarih As [TARİH],dayaniklilik_saat As [SAAT], program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id ORDER BY dayaniklilik_id DESC ", Null,-1,False))
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK], denektc1 As [TC1], denekIsim1 As [İSİM1], denektc2 As [TC2], denekIsim2 As [İSİM2],denektc3 As [TC3], denekIsim3 As [İSİM3],denektc4 As [TC4], denekIsim4 As [İSİM4],denektc5 As [TC5], denekIsim5 As [İSİM5],denektc6 As [TC6], denekIsim6 As [İSİM6],denektc7 As [TC7], denekIsim7 As [İSİM7],denektc8 As [TC8], denekIsim8 As [İSİM8],denektc9 As [TC9], denekIsim9 As [İSİM9],denektc10 As [TC10], denekIsim10 As [İSİM10] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"& EditTextAra.Text &"%' OR denekIsim1 LIKE '%"& EditTextAra.Text &"%' OR denektc2 LIKE '%"& EditTextAra.Text &"%' OR denekIsim2 LIKE '%"& EditTextAra.Text &"%' OR denektc3 LIKE '%"& EditTextAra.Text &"%' OR denekIsim3 LIKE '%"& EditTextAra.Text &"%' OR denektc4 LIKE '%"& EditTextAra.Text &"%' OR denekIsim4 LIKE '%"& EditTextAra.Text &"%' OR denektc5 LIKE '%"& EditTextAra.Text &"%' OR denekIsim5 LIKE '%"& EditTextAra.Text &"%' OR denektc6 LIKE '%"& EditTextAra.Text &"%' OR denekIsim6 LIKE '%"& EditTextAra.Text &"%' OR denektc7 LIKE '%"& EditTextAra.Text &"%' OR denekIsim7 LIKE '%"& EditTextAra.Text &"%' OR denektc8 LIKE '%"& EditTextAra.Text &"%' OR denekIsim8 LIKE '%"& EditTextAra.Text &"%' OR denektc9 LIKE '%"& EditTextAra.Text &"%' OR denekIsim9 LIKE '%"& EditTextAra.Text &"%' OR denektc10 LIKE '%"& EditTextAra.Text &"%' OR denekIsim10 LIKE '%"& EditTextAra.Text &"%' OR program_adi LIKE '%"& EditTextAra.Text &"%' OR  program_testTuru LIKE '%"& EditTextAra.Text &"%' OR  level LIKE '%"& EditTextAra.Text &"%' OR  mekik_sayisi LIKE '%"& EditTextAra.Text &"%' OR dayaniklilik_tarih LIKE '%"& EditTextAra.Text &"%' ) ORDER BY dayaniklilik_id DESC" ,Null,-1,False))
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	HTMLGosterDB
End Sub

Sub ButtonDayaniklilikTestEkle_Click
	StartActivity(GelismisTestDenekAra)
	Activity.finish
End Sub

Sub ButtonSil_Click
	StartActivity(DayaniklilikTestSil)
	Activity.Finish
End Sub

#region Aratma
Sub ButtonDenekTC_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denektc1 As [TC1],denektc2 As [TC2], denektc3 As [TC3],denektc4 As [TC4],denektc5 As [TC5],denektc6 As [TC6],denektc7 As [TC7],denektc8 As [TC8],denektc9 As [TC9],denektc10 As [TC10],dayaniklilik_tarih As [TARİH],program_adi As [PROGRAM], mekik_sayisi As [MEKİK] FROM DayaniklilikTest, DayaniklilikTestProgram WHERE DayaniklilikTest.program_id = DayaniklilikTestProgram.program_id AND (denektc1 LIKE '%"& EditTextAra.Text &"%' OR denektc2 LIKE '%"& EditTextAra.Text &"%' OR denektc3 LIKE '%"& EditTextAra.Text &"%' OR denektc4 LIKE '%"& EditTextAra.Text &"%' OR denektc5 LIKE '%"& EditTextAra.Text &"%' OR denektc6 LIKE '%"& EditTextAra.Text &"%'  OR denektc7 LIKE '%"& EditTextAra.Text &"%' OR denektc8 LIKE '%"& EditTextAra.Text &"%' OR denektc9 LIKE '%"& EditTextAra.Text &"%' OR denektc10 LIKE '%"& EditTextAra.Text &"%') ORDER BY dayaniklilik_id DESC",Null,-1,False))
End Sub

Sub ButtonDenekIsim_Click
	
End Sub

Sub ButtonProgramAdi_Click
	
End Sub

Sub ButtonTestTuru_Click
	
End Sub

Sub ButtonLevel_Click
	
End Sub

Sub ButtonMekikSayisi_Click
	
End Sub

Sub ButtonTarih_Click
	
End Sub
#end region