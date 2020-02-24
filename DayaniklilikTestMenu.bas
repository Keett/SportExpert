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

	Private ButtonProgram As Button
	Private LabelProgram As Label
	Private ButtonDayaniklilikTest As Button
	Private LabelDayaniklilikTest As Label
	Private ButtonAnasayfa As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestMenuPage")
	
	LabelDayaniklilikTest.Text = "DAYANIKLILIK TEST"
	LabelDayaniklilikTest.TextColor = Colors.White
	LabelDayaniklilikTest.TextSize = 20
	LabelDayaniklilikTest.Typeface = Typeface.DEFAULT_BOLD
	
	LabelProgram.Text = "PROGRAM"
	LabelProgram.TextColor = Colors.White
	LabelProgram.TextSize = 20
	LabelProgram.Typeface = Typeface.DEFAULT_BOLD
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonProgram_Click
	StartActivity(ProgramListele)
End Sub

Sub ButtonDayaniklilikTest_Click
	StartActivity(DayaniklilikTestListele)
End Sub

Sub LabelDayaniklilikTest_Click
	ButtonDayaniklilikTest_Click
End Sub

Sub LabelProgram_Click
	ButtonProgram_Click
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub