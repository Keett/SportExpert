B4A=true
Group=SportExpertProjeDosyası\Test
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
	
	Dim yapilacakTest As String = ""

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	
	Private ButtonAntropometrik As Button
	Private ButtonPsikolojik As Button
	Private ButtonBiyokimyasal As Button
	Private ButtonMotorOzellik As Button
	Private ButtonSaglikBilgileri As Button
	Private LabelSaglikBilgileri As Label
	Private ButtonAntranorGorusleri As Button
	Private LabelAntranorGorusleri As Label
	Private ButtonAnasayfa As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("TestMenuPage")
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonAntropometrik_Click
	yapilacakTest = "Antropometrik"
	StartActivity(AntropometrikListele)
	' activity.finish bilerek yapmıyoruz bi önceki sayfaya geri dönebilsin test menüsünün içinde kalsın diye -------------------------------------------
End Sub

Sub ButtonPsikolojik_Click
	yapilacakTest = "Psikolojik"
	StartActivity(PsikolojikListele)
End Sub

Sub ButtonBiyokimyasal_Click
	yapilacakTest = "Biyokimyasal"
	StartActivity(BiyokimyasalListele)
End Sub

Sub ButtonMotorOzellik_Click
	yapilacakTest = "MotorOzellik"
	StartActivity(MotorOzellikMenu)
End Sub

Sub ButtonAntranorGorusleri_Click
	yapilacakTest = "AntranorGorusleri"
	StartActivity(AntranorGorusListele)
End Sub

Sub ButtonSaglikBilgileri_Click
	yapilacakTest = "SaglikBilgileri"
	StartActivity(SaglikBilgileriListele)
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub