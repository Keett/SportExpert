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
	
	Private LabelSeviyeIsmi9 As Label
	Private LabelSeviyeIsmi10 As Label
	
	Private LabelHiz9 As Label
	Private LabelHiz10 As Label
	
	Private LabelDakika9 As Label
	Private LabelDakika10 As Label
	
	Private LabelSaniye9 As Label
	Private LabelSaniye10 As Label
	
	Private LabelKoniMesafesi9 As Label
	Private LabelKoniMesafesi10 As Label
	
	Private EditTextKoniMesafesi9 As EditText
	Private EditTextKoniMesafesi10 As EditText
	
	Private EditTextHiz9 As EditText
	Private EditTextHiz10 As EditText
	
	Private EditTextDakika9 As EditText
	Private EditTextDakika10 As EditText
	
	Private EditTextSaniye9 As EditText
	Private EditTextSaniye10 As EditText

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestAyar2Page")
	
	EditTextKoniMesafesi9.TextSize = 20
	EditTextKoniMesafesi9.TextColor = Colors.White
	EditTextKoniMesafesi9.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi9.InputType = EditTextKoniMesafesi9.INPUT_TYPE_NUMBERS

	EditTextKoniMesafesi10.TextSize = 20
	EditTextKoniMesafesi10.TextColor = Colors.White
	EditTextKoniMesafesi10.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi10.InputType = EditTextKoniMesafesi10.INPUT_TYPE_NUMBERS
	
	EditTextHiz9.TextSize = 20
	EditTextHiz9.TextColor = Colors.White
	EditTextHiz9.Typeface = Typeface.DEFAULT
	EditTextHiz9.InputType = EditTextHiz9.INPUT_TYPE_NUMBERS

	EditTextHiz10.TextSize = 20
	EditTextHiz10.TextColor = Colors.White
	EditTextHiz10.Typeface = Typeface.DEFAULT
	EditTextHiz10.InputType = EditTextHiz10.INPUT_TYPE_NUMBERS
	
	EditTextDakika9.TextSize = 20
	EditTextDakika9.TextColor = Colors.White
	EditTextDakika9.Typeface = Typeface.DEFAULT
	EditTextDakika9.InputType = EditTextDakika9.INPUT_TYPE_NUMBERS

	EditTextDakika10.TextSize = 20
	EditTextDakika10.TextColor = Colors.White
	EditTextDakika10.Typeface = Typeface.DEFAULT
	EditTextDakika10.InputType = EditTextDakika10.INPUT_TYPE_NUMBERS

	EditTextSaniye9.TextSize = 20
	EditTextSaniye9.TextColor = Colors.White
	EditTextSaniye9.Typeface = Typeface.DEFAULT
	EditTextSaniye9.InputType = EditTextSaniye9.INPUT_TYPE_NUMBERS

	EditTextSaniye10.TextSize = 20
	EditTextSaniye10.TextColor = Colors.White
	EditTextSaniye10.Typeface = Typeface.DEFAULT
	EditTextSaniye10.InputType = EditTextSaniye10.INPUT_TYPE_NUMBERS
	
	LabelSeviyeIsmi9.TextColor = Colors.White
	LabelSeviyeIsmi9.TextSize = 20
	LabelSeviyeIsmi9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi10.TextColor = Colors.White
	LabelSeviyeIsmi10.TextSize = 20
	LabelSeviyeIsmi10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz9.TextColor = Colors.White
	LabelHiz9.TextSize = 20
	LabelHiz9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz10.TextColor = Colors.White
	LabelHiz10.TextSize = 20
	LabelHiz10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika9.TextColor = Colors.White
	LabelDakika9.TextSize = 20
	LabelDakika9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika10.TextColor = Colors.White
	LabelDakika10.TextSize = 20
	LabelDakika10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye9.TextColor = Colors.White
	LabelSaniye9.TextSize = 20
	LabelSaniye9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye10.TextColor = Colors.White
	LabelSaniye10.TextSize = 20
	LabelSaniye10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi9.TextColor = Colors.White
	LabelKoniMesafesi9.TextSize = 20
	LabelKoniMesafesi9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi10.TextColor = Colors.White
	LabelKoniMesafesi10.TextSize = 20
	LabelKoniMesafesi10.Typeface = Typeface.DEFAULT_BOLD


End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub
