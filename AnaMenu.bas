B4A=true
Group=SportExpertProjeDosyası
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
	Private ButtonDenek As Button
	Private LabelDenek As Label
	Private ButtonTest As Button
	Private LabelTest As Label
	Private LabelRaporlama As Label
	Private LabelAyarlar As Label
	Private LabelYardimKlavuzu As Label
	Private ButtonAyarlar As Button
	Private ButtonYardimKlavuzu As Button
	Private ButtonAnasayfa As Button
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AnasayfaPage")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonDenek_Click
	StartActivity(DenekListele)
End Sub

Sub ButtonTest_Click
	StartActivity(TestMenu)
End Sub

Sub ButtonRaporlama_Click
	
End Sub

Sub ButtonAyarlar_Click
	
End Sub

Sub ButtonYardimKlavuzu_Click
	
End Sub

Sub ButtonAnasayfa_Click
	Return
End Sub