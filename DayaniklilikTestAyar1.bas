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

	Private ButtonGec As Button
	Private ButtonOK As Button
	
#region label	
	Private LabelSeviyeIsmi1 As Label
	Private LabelSeviyeIsmi2 As Label
	Private LabelSeviyeIsmi3 As Label
	Private LabelSeviyeIsmi4 As Label
	Private LabelSeviyeIsmi5 As Label
	Private LabelSeviyeIsmi6 As Label
	Private LabelSeviyeIsmi7 As Label
	Private LabelSeviyeIsmi8 As Label

	
	Private LabelHiz1 As Label
	Private LabelHiz2 As Label
	Private LabelHiz3 As Label
	Private LabelHiz4 As Label
	Private LabelHiz5 As Label
	Private LabelHiz6 As Label
	Private LabelHiz7 As Label
	Private LabelHiz8 As Label

	
	Private LabelDakika1 As Label
	Private LabelDakika2 As Label
	Private LabelDakika3 As Label
	Private LabelDakika4 As Label
	Private LabelDakika5 As Label
	Private LabelDakika6 As Label
	Private LabelDakika7 As Label
	Private LabelDakika8 As Label

	
	Private LabelSaniye1 As Label
	Private LabelSaniye2 As Label
	Private LabelSaniye3 As Label
	Private LabelSaniye4 As Label
	Private LabelSaniye5 As Label
	Private LabelSaniye6 As Label
	Private LabelSaniye7 As Label
	Private LabelSaniye8 As Label

	
	Private LabelKoniMesafesi1 As Label
	Private LabelKoniMesafesi2 As Label
	Private LabelKoniMesafesi3 As Label
	Private LabelKoniMesafesi4 As Label
	Private LabelKoniMesafesi5 As Label
	Private LabelKoniMesafesi6 As Label
	Private LabelKoniMesafesi7 As Label
	Private LabelKoniMesafesi8 As Label

#end region
	
#region edittext
	Private EditTextKoniMesafesi1 As EditText
	Private EditTextKoniMesafesi2 As EditText
	Private EditTextKoniMesafesi3 As EditText
	Private EditTextKoniMesafesi4 As EditText
	Private EditTextKoniMesafesi5 As EditText
	Private EditTextKoniMesafesi6 As EditText
	Private EditTextKoniMesafesi7 As EditText
	Private EditTextKoniMesafesi8 As EditText

	
	Private EditTextHiz1 As EditText
	Private EditTextHiz2 As EditText
	Private EditTextHiz3 As EditText
	Private EditTextHiz4 As EditText
	Private EditTextHiz5 As EditText
	Private EditTextHiz6 As EditText
	Private EditTextHiz7 As EditText
	Private EditTextHiz8 As EditText

	
	Private EditTextDakika1 As EditText
	Private EditTextDakika2 As EditText
	Private EditTextDakika3 As EditText
	Private EditTextDakika4 As EditText
	Private EditTextDakika5 As EditText
	Private EditTextDakika6 As EditText
	Private EditTextDakika7 As EditText
	Private EditTextDakika8 As EditText

	
	Private EditTextSaniye1 As EditText
	Private EditTextSaniye2 As EditText
	Private EditTextSaniye3 As EditText
	Private EditTextSaniye4 As EditText
	Private EditTextSaniye5 As EditText
	Private EditTextSaniye6 As EditText
	Private EditTextSaniye7 As EditText
	Private EditTextSaniye8 As EditText

	
#end region

	Private Panel1 As Panel
	Private Panel2 As Panel
	Private Panel3 As Panel
	Private Panel4 As Panel
	Private Panel5 As Panel
	Private Panel6 As Panel
	Private Panel7 As Panel
	Private Panel8 As Panel
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestAyar1Page")

#region	Edittext görüntü ayarı
	EditTextKoniMesafesi1.TextSize = 20
	EditTextKoniMesafesi1.TextColor = Colors.White
	EditTextKoniMesafesi1.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi1.InputType = EditTextKoniMesafesi1.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi2.TextSize = 20
	EditTextKoniMesafesi2.TextColor = Colors.White
	EditTextKoniMesafesi2.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi2.InputType = EditTextKoniMesafesi2.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi3.TextSize = 20
	EditTextKoniMesafesi3.TextColor = Colors.White
	EditTextKoniMesafesi3.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi3.InputType = EditTextKoniMesafesi3.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi4.TextSize = 20
	EditTextKoniMesafesi4.TextColor = Colors.White
	EditTextKoniMesafesi4.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi4.InputType = EditTextKoniMesafesi4.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi5.TextSize = 20
	EditTextKoniMesafesi5.TextColor = Colors.White
	EditTextKoniMesafesi5.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi5.InputType = EditTextKoniMesafesi5.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi6.TextSize = 20
	EditTextKoniMesafesi6.TextColor = Colors.White
	EditTextKoniMesafesi6.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi6.InputType = EditTextKoniMesafesi6.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi7.TextSize = 20
	EditTextKoniMesafesi7.TextColor = Colors.White
	EditTextKoniMesafesi7.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi7.InputType = EditTextKoniMesafesi7.INPUT_TYPE_NUMBERS
	
	EditTextKoniMesafesi8.TextSize = 20
	EditTextKoniMesafesi8.TextColor = Colors.White
	EditTextKoniMesafesi8.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi8.InputType = EditTextKoniMesafesi8.INPUT_TYPE_NUMBERS
	
	EditTextHiz1.TextSize = 20
	EditTextHiz1.TextColor = Colors.White
	EditTextHiz1.Typeface = Typeface.DEFAULT
	EditTextHiz1.InputType = EditTextHiz1.INPUT_TYPE_NUMBERS
	
	EditTextHiz2.TextSize = 20
	EditTextHiz2.TextColor = Colors.White
	EditTextHiz2.Typeface = Typeface.DEFAULT
	EditTextHiz2.InputType = EditTextHiz2.INPUT_TYPE_NUMBERS
	
	EditTextHiz3.TextSize = 20
	EditTextHiz3.TextColor = Colors.White
	EditTextHiz3.Typeface = Typeface.DEFAULT
	EditTextHiz3.InputType = EditTextHiz3.INPUT_TYPE_NUMBERS
	
	EditTextHiz4.TextSize = 20
	EditTextHiz4.TextColor = Colors.White
	EditTextHiz4.Typeface = Typeface.DEFAULT
	EditTextHiz4.InputType = EditTextHiz4.INPUT_TYPE_NUMBERS
	
	EditTextHiz5.TextSize = 20
	EditTextHiz5.TextColor = Colors.White
	EditTextHiz5.Typeface = Typeface.DEFAULT
	EditTextHiz5.InputType = EditTextHiz5.INPUT_TYPE_NUMBERS
	
	EditTextHiz6.TextSize = 20
	EditTextHiz6.TextColor = Colors.White
	EditTextHiz6.Typeface = Typeface.DEFAULT
	EditTextHiz6.InputType = EditTextHiz6.INPUT_TYPE_NUMBERS
	
	EditTextHiz7.TextSize = 20
	EditTextHiz7.TextColor = Colors.White
	EditTextHiz7.Typeface = Typeface.DEFAULT
	EditTextHiz7.InputType = EditTextHiz7.INPUT_TYPE_NUMBERS
	
	EditTextHiz8.TextSize = 20
	EditTextHiz8.TextColor = Colors.White
	EditTextHiz8.Typeface = Typeface.DEFAULT
	EditTextHiz8.InputType = EditTextHiz8.INPUT_TYPE_NUMBERS
	
	EditTextDakika1.TextSize = 20
	EditTextDakika1.TextColor = Colors.White
	EditTextDakika1.Typeface = Typeface.DEFAULT
	EditTextDakika1.InputType = EditTextDakika1.INPUT_TYPE_NUMBERS
	
	EditTextDakika2.TextSize = 20
	EditTextDakika2.TextColor = Colors.White
	EditTextDakika2.Typeface = Typeface.DEFAULT
	EditTextDakika2.InputType = EditTextDakika2.INPUT_TYPE_NUMBERS
	
	EditTextDakika3.TextSize = 20
	EditTextDakika3.TextColor = Colors.White
	EditTextDakika3.Typeface = Typeface.DEFAULT
	EditTextDakika3.InputType = EditTextDakika3.INPUT_TYPE_NUMBERS
	
	EditTextDakika4.TextSize = 20
	EditTextDakika4.TextColor = Colors.White
	EditTextDakika4.Typeface = Typeface.DEFAULT
	EditTextDakika4.InputType = EditTextDakika4.INPUT_TYPE_NUMBERS
	
	EditTextDakika5.TextSize = 20
	EditTextDakika5.TextColor = Colors.White
	EditTextDakika5.Typeface = Typeface.DEFAULT
	EditTextDakika5.InputType = EditTextDakika5.INPUT_TYPE_NUMBERS
	
	EditTextDakika6.TextSize = 20
	EditTextDakika6.TextColor = Colors.White
	EditTextDakika6.Typeface = Typeface.DEFAULT
	EditTextDakika6.InputType = EditTextDakika6.INPUT_TYPE_NUMBERS
	
	EditTextDakika7.TextSize = 20
	EditTextDakika7.TextColor = Colors.White
	EditTextDakika7.Typeface = Typeface.DEFAULT
	EditTextDakika7.InputType = EditTextDakika7.INPUT_TYPE_NUMBERS
	
	EditTextDakika8.TextSize = 20
	EditTextDakika8.TextColor = Colors.White
	EditTextDakika8.Typeface = Typeface.DEFAULT
	EditTextDakika8.InputType = EditTextDakika8.INPUT_TYPE_NUMBERS
	
	EditTextSaniye1.TextSize = 20
	EditTextSaniye1.TextColor = Colors.White
	EditTextSaniye1.Typeface = Typeface.DEFAULT
	EditTextSaniye1.InputType = EditTextSaniye1.INPUT_TYPE_NUMBERS
	
	EditTextSaniye2.TextSize = 20
	EditTextSaniye2.TextColor = Colors.White
	EditTextSaniye2.Typeface = Typeface.DEFAULT
	EditTextSaniye2.InputType = EditTextSaniye2.INPUT_TYPE_NUMBERS
	
	EditTextSaniye3.TextSize = 20
	EditTextSaniye3.TextColor = Colors.White
	EditTextSaniye3.Typeface = Typeface.DEFAULT
	EditTextSaniye3.InputType = EditTextSaniye3.INPUT_TYPE_NUMBERS
	
	EditTextSaniye4.TextSize = 20
	EditTextSaniye4.TextColor = Colors.White
	EditTextSaniye4.Typeface = Typeface.DEFAULT
	EditTextSaniye4.InputType = EditTextSaniye4.INPUT_TYPE_NUMBERS
	
	EditTextSaniye5.TextSize = 20
	EditTextSaniye5.TextColor = Colors.White
	EditTextSaniye5.Typeface = Typeface.DEFAULT
	EditTextSaniye5.InputType = EditTextSaniye5.INPUT_TYPE_NUMBERS
	
	EditTextSaniye6.TextSize = 20
	EditTextSaniye6.TextColor = Colors.White
	EditTextSaniye6.Typeface = Typeface.DEFAULT
	EditTextSaniye6.InputType = EditTextSaniye6.INPUT_TYPE_NUMBERS
	
	EditTextSaniye7.TextSize = 20
	EditTextSaniye7.TextColor = Colors.White
	EditTextSaniye7.Typeface = Typeface.DEFAULT
	EditTextSaniye7.InputType = EditTextSaniye7.INPUT_TYPE_NUMBERS
	
	EditTextSaniye8.TextSize = 20
	EditTextSaniye8.TextColor = Colors.White
	EditTextSaniye8.Typeface = Typeface.DEFAULT
	EditTextSaniye8.InputType = EditTextSaniye8.INPUT_TYPE_NUMBERS
	
#end region	

#region label görüntü ayarı
	LabelSeviyeIsmi1.TextColor = Colors.White
	LabelSeviyeIsmi1.TextSize = 20
	LabelSeviyeIsmi1.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi2.TextColor = Colors.White
	LabelSeviyeIsmi2.TextSize = 20
	LabelSeviyeIsmi2.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi3.TextColor = Colors.White
	LabelSeviyeIsmi3.TextSize = 20
	LabelSeviyeIsmi3.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi4.TextColor = Colors.White
	LabelSeviyeIsmi4.TextSize = 20
	LabelSeviyeIsmi4.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi5.TextColor = Colors.White
	LabelSeviyeIsmi5.TextSize = 20
	LabelSeviyeIsmi5.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi6.TextColor = Colors.White
	LabelSeviyeIsmi6.TextSize = 20
	LabelSeviyeIsmi6.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi7.TextColor = Colors.White
	LabelSeviyeIsmi7.TextSize = 20
	LabelSeviyeIsmi7.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi8.TextColor = Colors.White
	LabelSeviyeIsmi8.TextSize = 20
	LabelSeviyeIsmi8.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz1.TextColor = Colors.White
	LabelHiz1.TextSize = 20
	LabelHiz1.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz2.TextColor = Colors.White
	LabelHiz2.TextSize = 20
	LabelHiz2.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz3.TextColor = Colors.White
	LabelHiz3.TextSize = 20
	LabelHiz3.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz4.TextColor = Colors.White
	LabelHiz4.TextSize = 20
	LabelHiz4.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz5.TextColor = Colors.White
	LabelHiz5.TextSize = 20
	LabelHiz5.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz6.TextColor = Colors.White
	LabelHiz6.TextSize = 20
	LabelHiz6.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz7.TextColor = Colors.White
	LabelHiz7.TextSize = 20
	LabelHiz7.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz8.TextColor = Colors.White
	LabelHiz8.TextSize = 20
	LabelHiz8.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika1.TextColor = Colors.White
	LabelDakika1.TextSize = 20
	LabelDakika1.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika2.TextColor = Colors.White
	LabelDakika2.TextSize = 20
	LabelDakika2.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika3.TextColor = Colors.White
	LabelDakika3.TextSize = 20
	LabelDakika3.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika4.TextColor = Colors.White
	LabelDakika4.TextSize = 20
	LabelDakika4.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika5.TextColor = Colors.White
	LabelDakika5.TextSize = 20
	LabelDakika5.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika6.TextColor = Colors.White
	LabelDakika6.TextSize = 20
	LabelDakika6.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika7.TextColor = Colors.White
	LabelDakika7.TextSize = 20
	LabelDakika7.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika8.TextColor = Colors.White
	LabelDakika8.TextSize = 20
	LabelDakika8.Typeface = Typeface.DEFAULT_BOLD

	LabelSaniye1.TextColor = Colors.White
	LabelSaniye1.TextSize = 20
	LabelSaniye1.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye2.TextColor = Colors.White
	LabelSaniye2.TextSize = 20
	LabelSaniye2.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye3.TextColor = Colors.White
	LabelSaniye3.TextSize = 20
	LabelSaniye3.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye4.TextColor = Colors.White
	LabelSaniye4.TextSize = 20
	LabelSaniye4.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye5.TextColor = Colors.White
	LabelSaniye5.TextSize = 20
	LabelSaniye5.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye6.TextColor = Colors.White
	LabelSaniye6.TextSize = 20
	LabelSaniye6.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye7.TextColor = Colors.White
	LabelSaniye7.TextSize = 20
	LabelSaniye7.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye8.TextColor = Colors.White
	LabelSaniye8.TextSize = 20
	LabelSaniye8.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi1.TextColor = Colors.White
	LabelKoniMesafesi1.TextSize = 20
	LabelKoniMesafesi1.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi2.TextColor = Colors.White
	LabelKoniMesafesi2.TextSize = 20
	LabelKoniMesafesi2.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi3.TextColor = Colors.White
	LabelKoniMesafesi3.TextSize = 20
	LabelKoniMesafesi3.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi4.TextColor = Colors.White
	LabelKoniMesafesi4.TextSize = 20
	LabelKoniMesafesi4.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi5.TextColor = Colors.White
	LabelKoniMesafesi5.TextSize = 20
	LabelKoniMesafesi5.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi6.TextColor = Colors.White
	LabelKoniMesafesi6.TextSize = 20
	LabelKoniMesafesi6.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi7.TextColor = Colors.White
	LabelKoniMesafesi7.TextSize = 20
	LabelKoniMesafesi7.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi8.TextColor = Colors.White
	LabelKoniMesafesi8.TextSize = 20
	LabelKoniMesafesi8.Typeface = Typeface.DEFAULT_BOLD
	
#end region	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub Seviye1Goster
	Panel1.Visible = True
	Panel2.Visible = False
	Panel3.Visible = False
	Panel4.Visible = False
	Panel5.Visible = False
	Panel6.Visible = False
	Panel7.Visible = False
	Panel8.Visible = False
End Sub

Sub Seviye2Goster
	Panel1.Visible = True
	Panel2.Visible = True
	Panel3.Visible = False
	Panel4.Visible = False
	Panel5.Visible = False
	Panel6.Visible = False
	Panel7.Visible = False
	Panel8.Visible = False
End Sub

Sub ButtonOK_Click
	
End Sub

Sub ButtonGec_Click
	
End Sub