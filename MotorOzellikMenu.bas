B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu
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
	Dim yapilacakMotorOzellikTest As String = ""
	Dim motorOzellikTestAdi As String = ""
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ButtonSuratTest As Button
	Private ButtonDayaniklilikTest As Button
	Private ButtonDikeySicramaTest As Button
	Private ButtonDengeTest As Button
	Private ButtonKuvvetTest As Button
	Private ButtonReaksiyonTest As Button
	Private LabelSuratTest As Label
	Private LabelDikeySicramaTest As Label
	Private LabelDengeTest As Label
	Private LabelKuvvetTest As Label
	Private LabelReaksiyonTest As Label

	Private ButtonAnasayfa As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("MotorOzellikMenuPage")

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonSuratTest_Click
	yapilacakMotorOzellikTest = "SuratTest"
	motorOzellikTestAdi = "Sürat (Sprint) Testi"
	StartActivity(SuratTestListele)
	' activity.finish bilerek yapmıyoruz bi önceki sayfaya geri dönebilsin motor test menüsünün içinde kalsın diye -------------------------------------------
End Sub

Sub ButtonDayaniklilikTest_Click
	yapilacakMotorOzellikTest = "DayaniklilikTest"
	motorOzellikTestAdi = "Dayanıklılık Testi"
	StartActivity(DayaniklilikTestMenu)

End Sub

Sub ButtonDikeySicramaTest_Click
	yapilacakMotorOzellikTest = "DikeySicramaTest"
	motorOzellikTestAdi = "Dikey Sıçrama Testi"
	StartActivity(DikeySicramaTest)

End Sub

Sub ButtonDengeTest_Click
	yapilacakMotorOzellikTest = "DengeTest"
	motorOzellikTestAdi = "Denge Testi"
	StartActivity(DengeTest)

End Sub

Sub ButtonKuvvetTest_Click
	yapilacakMotorOzellikTest = "KuvvetTest"
	motorOzellikTestAdi = "Kuvvet Testi"
	StartActivity(KuvvetTest)

End Sub

Sub ButtonReaksiyonTest_Click
	yapilacakMotorOzellikTest = "ReaksiyonTest"
	motorOzellikTestAdi = "Reaksiyon Testi"
	StartActivity(ReaksiyonTest)

End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub