B4A=true
Group=SportExpertProjeDosyası
ModulesStructureVersion=1
Type=Service
Version=9.01
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim mp As MediaPlayer

End Sub

Sub Service_Create

End Sub

Sub Service_Start (StartingIntent As Intent)
	Service.StopAutomaticForeground 'Call this when the background task completes (if there is one)
	mp.Initialize
	mp.Load(File.DirAssets, "sound1.mp3")
	mp.Play
End Sub

Sub Service_Destroy

End Sub
