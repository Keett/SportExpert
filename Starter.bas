﻿B4A=true
Group=SportExpertProjeDosyası
ModulesStructureVersion=1
Type=Service
Version=6
@EndOfDesignText@
#Region  Service Attributes 
	#StartAtBoot: False
	#ExcludeFromLibrary: True
#End Region

Sub Process_Globals
	Public rp As RuntimePermissions
	Public provider As FileProvider
End Sub

Sub Service_Create
	provider.Initialize
End Sub

Sub Service_Start (StartingIntent As Intent)

End Sub

'Return true to allow the OS default exceptions handler to handle the uncaught exception.
Sub Application_Error (Error As Exception, StackTrace As String) As Boolean
	Return True
End Sub

Sub Service_Destroy

End Sub
