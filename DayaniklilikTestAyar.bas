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
	
	Dim secilenLevel As Int 
	Dim secilenTestTuru As String 
	Dim programAdi As String
	

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private LabelLevel As Label
	Private SpinnerLevel As Spinner
	Private LabelTestTuru As Label
	Private SpinnerTestTuru As Spinner
	
	Private ButtonGec As Button
	Private LabelProgramAdi As Label
	Private EditTextProgramAdi As EditText
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestAyarPage")
	
#region görüntü ayarı
	SpinnerLevel.DropdownBackgroundColor = Colors.White
	SpinnerLevel.DropdownTextColor = Color.koyuMavi
	SpinnerLevel.TextColor = Colors.White
	SpinnerLevel.TextSize = 20
	
	LabelLevel.TextColor = Colors.White
	LabelLevel.Text = "LEVEL"
	LabelLevel.TextSize = 20
	LabelLevel.Typeface = Typeface.DEFAULT_BOLD
	
	LabelTestTuru.TextColor = Colors.White
	LabelTestTuru.Text = "LEVEL"
	LabelTestTuru.TextSize = 20
	LabelTestTuru.Typeface = Typeface.DEFAULT_BOLD
	
	SpinnerTestTuru.DropdownBackgroundColor = Colors.White
	SpinnerTestTuru.DropdownTextColor = Color.koyuMavi
	SpinnerTestTuru.TextColor = Colors.White
	SpinnerTestTuru.TextSize = 20
	
	LabelProgramAdi.TextColor = Colors.White
	LabelProgramAdi.Text = "PROGRAM ADI"
	LabelProgramAdi.TextSize = 20
	LabelProgramAdi.Typeface = Typeface.DEFAULT_BOLD
	
	EditTextProgramAdi.TextColor = Colors.White
	EditTextProgramAdi.Hint = "Program adını buraya yazmalısınız.."
	EditTextProgramAdi.HintColor = Color.hintColor
	EditTextProgramAdi.TextSize = 20
	EditTextProgramAdi.Typeface = Typeface.DEFAULT
	
#end region

	SpinnerLevel.AddAll(Array As Int(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25))
	SpinnerTestTuru.AddAll(Array As String("Shuttle Run","Conconi"))
	
	secilenLevel = 1
	secilenTestTuru = "Shuttle Run"
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub SpinnerLevel_ItemClick (Position As Int, Value As Object)
	secilenLevel= Value

End Sub

Sub SpinnerTestTuru_ItemClick (Position As Int, Value As Object)
	secilenTestTuru = Value
End Sub

Sub ButtonGec_Click
	If EditTextProgramAdi.Text.Length == 0 Then
		ToastMessageShow("Program adını girmelisiniz", True)
		Return
	End If
	
	Dim rs As ResultSet = Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram  WHERE program_adi  ='" &EditTextProgramAdi.Text&"'")
	If rs.RowCount >0 Then
		Msgbox("Bu program adı kaydedildi","")
		Return
	End If
	rs.Close
	
	programAdi = EditTextProgramAdi.Text
	StartActivity(DayaniklilikTestVeri)
	Activity.Finish
End Sub