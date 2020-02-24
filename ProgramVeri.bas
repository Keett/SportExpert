B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\DayaniklilikTest\Program
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

	Private ButtonOK As Button
	Private ScrollView1 As ScrollView
	
	Dim ProgramID As Int
	Dim rs As ResultSet
	
	Dim secilenTarih As String
	Dim secilenSaat As String

	Dim koniMesafesi1, koniMesafesi2 ,koniMesafesi3, koniMesafesi4, koniMesafesi5, koniMesafesi6, koniMesafesi7, koniMesafesi8, koniMesafesi9, koniMesafesi10,koniMesafesi11, koniMesafesi12, koniMesafesi13, koniMesafesi14, koniMesafesi15, koniMesafesi16, koniMesafesi17, koniMesafesi18, koniMesafesi19, koniMesafesi20,koniMesafesi21, koniMesafesi22, koniMesafesi23, koniMesafesi24, koniMesafesi25 As Float = 0.0
	Dim hiz1, hiz2, hiz3, hiz4, hiz5, hiz6, hiz7,hiz8,hiz9, hiz10, hiz11, hiz12, hiz13, hiz14, hiz15, hiz16, hiz17, hiz18, hiz19, hiz20, hiz21, hiz22, hiz23, hiz24, hiz25 As Float = 0.0
	Dim dakika1, dakika2,dakika3, dakika4, dakika5, dakika6, dakika7, dakika8, dakika9, dakika10, dakika11,dakika12, dakika13, dakika14, dakika15, dakika16, dakika17, dakika18, dakika19,dakika20, dakika21,dakika22,dakika23,dakika24, dakika25 As Int = 0
	Dim saniye1 ,saniye2 , saniye3 , saniye4 , saniye5, saniye6 ,saniye7 ,saniye8 ,saniye9 ,saniye10 ,saniye11 ,saniye12 ,saniye13 ,saniye14 ,saniye15 ,saniye16 ,saniye17 ,saniye18 ,saniye19 ,saniye20 ,saniye21 ,saniye22 ,saniye23 ,saniye24 ,saniye25 As Int = 0
	
#region label	
	Private LabelSeviyeIsmi1 As Label
	Private LabelSeviyeIsmi2 As Label
	Private LabelSeviyeIsmi3 As Label
	Private LabelSeviyeIsmi4 As Label
	Private LabelSeviyeIsmi5 As Label
	Private LabelSeviyeIsmi6 As Label
	Private LabelSeviyeIsmi7 As Label
	Private LabelSeviyeIsmi8 As Label
	Private LabelSeviyeIsmi9 As Label
	Private LabelSeviyeIsmi10 As Label
	Private LabelSeviyeIsmi11 As Label
	Private LabelSeviyeIsmi12 As Label
	Private LabelSeviyeIsmi13 As Label
	Private LabelSeviyeIsmi14 As Label
	Private LabelSeviyeIsmi15 As Label
	Private LabelSeviyeIsmi16 As Label
	Private LabelSeviyeIsmi17 As Label
	Private LabelSeviyeIsmi18 As Label
	Private LabelSeviyeIsmi19 As Label
	Private LabelSeviyeIsmi20 As Label
	Private LabelSeviyeIsmi21 As Label
	Private LabelSeviyeIsmi22 As Label
	Private LabelSeviyeIsmi23 As Label
	Private LabelSeviyeIsmi24 As Label
	Private LabelSeviyeIsmi25 As Label
	
	Private LabelHiz1 As Label
	Private LabelHiz2 As Label
	Private LabelHiz3 As Label
	Private LabelHiz4 As Label
	Private LabelHiz5 As Label
	Private LabelHiz6 As Label
	Private LabelHiz7 As Label
	Private LabelHiz8 As Label
	Private LabelHiz9 As Label
	Private LabelHiz10 As Label
	Private LabelHiz11 As Label
	Private LabelHiz12 As Label
	Private LabelHiz13 As Label
	Private LabelHiz14 As Label
	Private LabelHiz15 As Label
	Private LabelHiz16 As Label
	Private LabelHiz17 As Label
	Private LabelHiz18 As Label
	Private LabelHiz19 As Label
	Private LabelHiz20 As Label
	Private LabelHiz21 As Label
	Private LabelHiz22 As Label
	Private LabelHiz23 As Label
	Private LabelHiz24 As Label
	Private LabelHiz25 As Label

	Private LabelDakika1 As Label
	Private LabelDakika2 As Label
	Private LabelDakika3 As Label
	Private LabelDakika4 As Label
	Private LabelDakika5 As Label
	Private LabelDakika6 As Label
	Private LabelDakika7 As Label
	Private LabelDakika8 As Label
	Private LabelDakika9 As Label
	Private LabelDakika10 As Label
	Private LabelDakika11 As Label
	Private LabelDakika12 As Label
	Private LabelDakika13 As Label
	Private LabelDakika14 As Label
	Private LabelDakika15 As Label
	Private LabelDakika16 As Label
	Private LabelDakika17 As Label
	Private LabelDakika18 As Label
	Private LabelDakika19 As Label
	Private LabelDakika20 As Label
	Private LabelDakika21 As Label
	Private LabelDakika22 As Label
	Private LabelDakika23 As Label
	Private LabelDakika24 As Label
	Private LabelDakika25 As Label

	
	Private LabelSaniye1 As Label
	Private LabelSaniye2 As Label
	Private LabelSaniye3 As Label
	Private LabelSaniye4 As Label
	Private LabelSaniye5 As Label
	Private LabelSaniye6 As Label
	Private LabelSaniye7 As Label
	Private LabelSaniye8 As Label
	Private LabelSaniye9 As Label
	Private LabelSaniye10 As Label
	Private LabelSaniye11 As Label
	Private LabelSaniye12 As Label
	Private LabelSaniye13 As Label
	Private LabelSaniye14 As Label
	Private LabelSaniye15 As Label
	Private LabelSaniye16 As Label
	Private LabelSaniye17 As Label
	Private LabelSaniye18 As Label
	Private LabelSaniye19 As Label
	Private LabelSaniye20 As Label
	Private LabelSaniye21 As Label
	Private LabelSaniye22 As Label
	Private LabelSaniye23 As Label
	Private LabelSaniye24 As Label
	Private LabelSaniye25 As Label

	
	Private LabelKoniMesafesi1 As Label
	Private LabelKoniMesafesi2 As Label
	Private LabelKoniMesafesi3 As Label
	Private LabelKoniMesafesi4 As Label
	Private LabelKoniMesafesi5 As Label
	Private LabelKoniMesafesi6 As Label
	Private LabelKoniMesafesi7 As Label
	Private LabelKoniMesafesi8 As Label
	Private LabelKoniMesafesi9 As Label
	Private LabelKoniMesafesi10 As Label
	Private LabelKoniMesafesi11 As Label
	Private LabelKoniMesafesi12 As Label
	Private LabelKoniMesafesi13 As Label
	Private LabelKoniMesafesi14 As Label
	Private LabelKoniMesafesi15 As Label
	Private LabelKoniMesafesi16 As Label
	Private LabelKoniMesafesi17 As Label
	Private LabelKoniMesafesi18 As Label
	Private LabelKoniMesafesi19 As Label
	Private LabelKoniMesafesi20 As Label
	Private LabelKoniMesafesi21 As Label
	Private LabelKoniMesafesi22 As Label
	Private LabelKoniMesafesi23 As Label
	Private LabelKoniMesafesi24 As Label
	Private LabelKoniMesafesi25 As Label


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
	Private EditTextKoniMesafesi9 As EditText
	Private EditTextKoniMesafesi10 As EditText
	Private EditTextKoniMesafesi11 As EditText
	Private EditTextKoniMesafesi12 As EditText
	Private EditTextKoniMesafesi13 As EditText
	Private EditTextKoniMesafesi14 As EditText
	Private EditTextKoniMesafesi15 As EditText
	Private EditTextKoniMesafesi16 As EditText
	Private EditTextKoniMesafesi17 As EditText
	Private EditTextKoniMesafesi18 As EditText
	Private EditTextKoniMesafesi19 As EditText
	Private EditTextKoniMesafesi20 As EditText
	Private EditTextKoniMesafesi21 As EditText
	Private EditTextKoniMesafesi22 As EditText
	Private EditTextKoniMesafesi23 As EditText
	Private EditTextKoniMesafesi24 As EditText
	Private EditTextKoniMesafesi25 As EditText

	
	Private EditTextHiz1 As EditText
	Private EditTextHiz2 As EditText
	Private EditTextHiz3 As EditText
	Private EditTextHiz4 As EditText
	Private EditTextHiz5 As EditText
	Private EditTextHiz6 As EditText
	Private EditTextHiz7 As EditText
	Private EditTextHiz8 As EditText
	Private EditTextHiz9 As EditText
	Private EditTextHiz10 As EditText
	Private EditTextHiz11 As EditText
	Private EditTextHiz12 As EditText
	Private EditTextHiz13 As EditText
	Private EditTextHiz14 As EditText
	Private EditTextHiz15 As EditText
	Private EditTextHiz16 As EditText
	Private EditTextHiz17 As EditText
	Private EditTextHiz18 As EditText
	Private EditTextHiz19 As EditText
	Private EditTextHiz20 As EditText
	Private EditTextHiz21 As EditText
	Private EditTextHiz22 As EditText
	Private EditTextHiz23 As EditText
	Private EditTextHiz24 As EditText
	Private EditTextHiz25 As EditText
	
	Private EditTextDakika1 As EditText
	Private EditTextDakika2 As EditText
	Private EditTextDakika3 As EditText
	Private EditTextDakika4 As EditText
	Private EditTextDakika5 As EditText
	Private EditTextDakika6 As EditText
	Private EditTextDakika7 As EditText
	Private EditTextDakika8 As EditText
	Private EditTextDakika9 As EditText
	Private EditTextDakika10 As EditText
	Private EditTextDakika11 As EditText
	Private EditTextDakika12 As EditText
	Private EditTextDakika13 As EditText
	Private EditTextDakika14 As EditText
	Private EditTextDakika15 As EditText
	Private EditTextDakika16 As EditText
	Private EditTextDakika17 As EditText
	Private EditTextDakika18 As EditText
	Private EditTextDakika19 As EditText
	Private EditTextDakika20 As EditText
	Private EditTextDakika21 As EditText
	Private EditTextDakika22 As EditText
	Private EditTextDakika23 As EditText
	Private EditTextDakika24 As EditText
	Private EditTextDakika25 As EditText

	
	Private EditTextSaniye1 As EditText
	Private EditTextSaniye2 As EditText
	Private EditTextSaniye3 As EditText
	Private EditTextSaniye4 As EditText
	Private EditTextSaniye5 As EditText
	Private EditTextSaniye6 As EditText
	Private EditTextSaniye7 As EditText
	Private EditTextSaniye8 As EditText
	Private EditTextSaniye9 As EditText
	Private EditTextSaniye10 As EditText
	Private EditTextSaniye11 As EditText
	Private EditTextSaniye12 As EditText
	Private EditTextSaniye13 As EditText
	Private EditTextSaniye14 As EditText
	Private EditTextSaniye15 As EditText
	Private EditTextSaniye16 As EditText
	Private EditTextSaniye17 As EditText
	Private EditTextSaniye18 As EditText
	Private EditTextSaniye19 As EditText
	Private EditTextSaniye20 As EditText
	Private EditTextSaniye21 As EditText
	Private EditTextSaniye22 As EditText
	Private EditTextSaniye23 As EditText
	Private EditTextSaniye24 As EditText
	Private EditTextSaniye25 As EditText
	
#end region

#Region panel

	Private Panel1 As Panel
	Private Panel2 As Panel
	Private Panel3 As Panel
	Private Panel4 As Panel
	Private Panel5 As Panel
	Private Panel6 As Panel
	Private Panel7 As Panel
	Private Panel8 As Panel
	Private Panel9 As Panel
	Private Panel10 As Panel
	Private Panel11 As Panel
	Private Panel12 As Panel
	Private Panel13 As Panel
	Private Panel14 As Panel
	Private Panel15 As Panel
	Private Panel16 As Panel
	Private Panel17 As Panel
	Private Panel18 As Panel
	Private Panel19 As Panel
	Private Panel20 As Panel
	Private Panel21 As Panel
	Private Panel22 As Panel
	Private Panel23 As Panel
	Private Panel24 As Panel
	Private Panel25 As Panel
	
#end region	


End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("ProgramAyar1Page")
	
	ScrollView1.Panel.LoadLayout("ProgramVeriPage")
	ScrollView1.Panel.Width = 2000dip
	ScrollView1.Panel.Height = 2030dip

	levelPanelGoster
	
#region	Edittext görüntü ayarı

#region edittext koni mesafesi
	EditTextKoniMesafesi1.TextSize = 20
	EditTextKoniMesafesi1.TextColor = Colors.White
	EditTextKoniMesafesi1.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi1.InputType = EditTextKoniMesafesi1.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi2.TextSize = 20
	EditTextKoniMesafesi2.TextColor = Colors.White
	EditTextKoniMesafesi2.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi2.InputType = EditTextKoniMesafesi2.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi3.TextSize = 20
	EditTextKoniMesafesi3.TextColor = Colors.White
	EditTextKoniMesafesi3.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi3.InputType = EditTextKoniMesafesi3.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi4.TextSize = 20
	EditTextKoniMesafesi4.TextColor = Colors.White
	EditTextKoniMesafesi4.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi4.InputType = EditTextKoniMesafesi4.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi5.TextSize = 20
	EditTextKoniMesafesi5.TextColor = Colors.White
	EditTextKoniMesafesi5.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi5.InputType = EditTextKoniMesafesi5.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi6.TextSize = 20
	EditTextKoniMesafesi6.TextColor = Colors.White
	EditTextKoniMesafesi6.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi6.InputType = EditTextKoniMesafesi6.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi7.TextSize = 20
	EditTextKoniMesafesi7.TextColor = Colors.White
	EditTextKoniMesafesi7.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi7.InputType = EditTextKoniMesafesi7.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi8.TextSize = 20
	EditTextKoniMesafesi8.TextColor = Colors.White
	EditTextKoniMesafesi8.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi8.InputType = EditTextKoniMesafesi8.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi9.TextSize = 20
	EditTextKoniMesafesi9.TextColor = Colors.White
	EditTextKoniMesafesi9.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi9.InputType = EditTextKoniMesafesi9.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi10.TextSize = 20
	EditTextKoniMesafesi10.TextColor = Colors.White
	EditTextKoniMesafesi10.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi10.InputType = EditTextKoniMesafesi10.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi11.TextSize = 20
	EditTextKoniMesafesi11.TextColor = Colors.White
	EditTextKoniMesafesi11.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi11.InputType = EditTextKoniMesafesi11.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi12.TextSize = 20
	EditTextKoniMesafesi12.TextColor = Colors.White
	EditTextKoniMesafesi12.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi12.InputType = EditTextKoniMesafesi12.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi13.TextSize = 20
	EditTextKoniMesafesi13.TextColor = Colors.White
	EditTextKoniMesafesi13.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi13.InputType = EditTextKoniMesafesi13.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi14.TextSize = 20
	EditTextKoniMesafesi14.TextColor = Colors.White
	EditTextKoniMesafesi14.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi14.InputType = EditTextKoniMesafesi14.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi15.TextSize = 20
	EditTextKoniMesafesi15.TextColor = Colors.White
	EditTextKoniMesafesi15.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi15.InputType = EditTextKoniMesafesi15.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi16.TextSize = 20
	EditTextKoniMesafesi16.TextColor = Colors.White
	EditTextKoniMesafesi16.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi16.InputType = EditTextKoniMesafesi16.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi17.TextSize = 20
	EditTextKoniMesafesi17.TextColor = Colors.White
	EditTextKoniMesafesi17.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi17.InputType = EditTextKoniMesafesi17.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi18.TextSize = 20
	EditTextKoniMesafesi18.TextColor = Colors.White
	EditTextKoniMesafesi18.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi18.InputType = EditTextKoniMesafesi18.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi19.TextSize = 20
	EditTextKoniMesafesi19.TextColor = Colors.White
	EditTextKoniMesafesi19.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi19.InputType = EditTextKoniMesafesi19.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi20.TextSize = 20
	EditTextKoniMesafesi20.TextColor = Colors.White
	EditTextKoniMesafesi20.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi20.InputType = EditTextKoniMesafesi20.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi21.TextSize = 20
	EditTextKoniMesafesi21.TextColor = Colors.White
	EditTextKoniMesafesi21.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi21.InputType = EditTextKoniMesafesi21.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi22.TextSize = 20
	EditTextKoniMesafesi22.TextColor = Colors.White
	EditTextKoniMesafesi22.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi22.InputType = EditTextKoniMesafesi22.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi23.TextSize = 20
	EditTextKoniMesafesi23.TextColor = Colors.White
	EditTextKoniMesafesi23.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi23.InputType = EditTextKoniMesafesi23.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi24.TextSize = 20
	EditTextKoniMesafesi24.TextColor = Colors.White
	EditTextKoniMesafesi24.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi24.InputType = EditTextKoniMesafesi24.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextKoniMesafesi25.TextSize = 20
	EditTextKoniMesafesi25.TextColor = Colors.White
	EditTextKoniMesafesi25.Typeface = Typeface.DEFAULT
	EditTextKoniMesafesi25.InputType = EditTextKoniMesafesi25.INPUT_TYPE_DECIMAL_NUMBERS
	
#end region	
#region edittext dakika
		
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
	
	EditTextDakika9.TextSize = 20
	EditTextDakika9.TextColor = Colors.White
	EditTextDakika9.Typeface = Typeface.DEFAULT
	EditTextDakika9.InputType = EditTextDakika9.INPUT_TYPE_NUMBERS
	
	EditTextDakika10.TextSize = 20
	EditTextDakika10.TextColor = Colors.White
	EditTextDakika10.Typeface = Typeface.DEFAULT
	EditTextDakika10.InputType = EditTextDakika10.INPUT_TYPE_NUMBERS
	
	EditTextDakika11.TextSize = 20
	EditTextDakika11.TextColor = Colors.White
	EditTextDakika11.Typeface = Typeface.DEFAULT
	EditTextDakika11.InputType = EditTextDakika11.INPUT_TYPE_NUMBERS
	
	EditTextDakika12.TextSize = 20
	EditTextDakika12.TextColor = Colors.White
	EditTextDakika12.Typeface = Typeface.DEFAULT
	EditTextDakika12.InputType = EditTextDakika12.INPUT_TYPE_NUMBERS
	
	EditTextDakika13.TextSize = 20
	EditTextDakika13.TextColor = Colors.White
	EditTextDakika13.Typeface = Typeface.DEFAULT
	EditTextDakika13.InputType = EditTextDakika13.INPUT_TYPE_NUMBERS
	
	EditTextDakika14.TextSize = 20
	EditTextDakika14.TextColor = Colors.White
	EditTextDakika14.Typeface = Typeface.DEFAULT
	EditTextDakika14.InputType = EditTextDakika14.INPUT_TYPE_NUMBERS
	
	EditTextDakika15.TextSize = 20
	EditTextDakika15.TextColor = Colors.White
	EditTextDakika15.Typeface = Typeface.DEFAULT
	EditTextDakika15.InputType = EditTextDakika15.INPUT_TYPE_NUMBERS
	
	EditTextDakika16.TextSize = 20
	EditTextDakika16.TextColor = Colors.White
	EditTextDakika16.Typeface = Typeface.DEFAULT
	EditTextDakika16.InputType = EditTextDakika16.INPUT_TYPE_NUMBERS
	
	EditTextDakika17.TextSize = 20
	EditTextDakika17.TextColor = Colors.White
	EditTextDakika17.Typeface = Typeface.DEFAULT
	EditTextDakika17.InputType = EditTextDakika17.INPUT_TYPE_NUMBERS
	
	EditTextDakika18.TextSize = 20
	EditTextDakika18.TextColor = Colors.White
	EditTextDakika18.Typeface = Typeface.DEFAULT
	EditTextDakika18.InputType = EditTextDakika18.INPUT_TYPE_NUMBERS
	
	EditTextDakika19.TextSize = 20
	EditTextDakika19.TextColor = Colors.White
	EditTextDakika19.Typeface = Typeface.DEFAULT
	EditTextDakika19.InputType = EditTextDakika19.INPUT_TYPE_NUMBERS
	
	EditTextDakika20.TextSize = 20
	EditTextDakika20.TextColor = Colors.White
	EditTextDakika20.Typeface = Typeface.DEFAULT
	EditTextDakika20.InputType = EditTextDakika20.INPUT_TYPE_NUMBERS
	
	EditTextDakika21.TextSize = 20
	EditTextDakika21.TextColor = Colors.White
	EditTextDakika21.Typeface = Typeface.DEFAULT
	EditTextDakika21.InputType = EditTextDakika21.INPUT_TYPE_NUMBERS
	
	EditTextDakika22.TextSize = 20
	EditTextDakika22.TextColor = Colors.White
	EditTextDakika22.Typeface = Typeface.DEFAULT
	EditTextDakika22.InputType = EditTextDakika22.INPUT_TYPE_NUMBERS
	
	EditTextDakika23.TextSize = 20
	EditTextDakika23.TextColor = Colors.White
	EditTextDakika23.Typeface = Typeface.DEFAULT
	EditTextDakika23.InputType = EditTextDakika23.INPUT_TYPE_NUMBERS
	
	EditTextDakika24.TextSize = 20
	EditTextDakika24.TextColor = Colors.White
	EditTextDakika24.Typeface = Typeface.DEFAULT
	EditTextDakika24.InputType = EditTextDakika24.INPUT_TYPE_NUMBERS
	
	EditTextDakika25.TextSize = 20
	EditTextDakika25.TextColor = Colors.White
	EditTextDakika25.Typeface = Typeface.DEFAULT
	EditTextDakika25.InputType = EditTextDakika25.INPUT_TYPE_NUMBERS
	
#end region	
#region edittext saniye	
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
	
	EditTextSaniye9.TextSize = 20
	EditTextSaniye9.TextColor = Colors.White
	EditTextSaniye9.Typeface = Typeface.DEFAULT
	EditTextSaniye9.InputType = EditTextSaniye9.INPUT_TYPE_NUMBERS
	
	EditTextSaniye10.TextSize = 20
	EditTextSaniye10.TextColor = Colors.White
	EditTextSaniye10.Typeface = Typeface.DEFAULT
	EditTextSaniye10.InputType = EditTextSaniye10.INPUT_TYPE_NUMBERS
	
	EditTextSaniye11.TextSize = 20
	EditTextSaniye11.TextColor = Colors.White
	EditTextSaniye11.Typeface = Typeface.DEFAULT
	EditTextSaniye11.InputType = EditTextSaniye11.INPUT_TYPE_NUMBERS
	
	EditTextSaniye12.TextSize = 20
	EditTextSaniye12.TextColor = Colors.White
	EditTextSaniye12.Typeface = Typeface.DEFAULT
	EditTextSaniye12.InputType = EditTextSaniye12.INPUT_TYPE_NUMBERS
	
	EditTextSaniye13.TextSize = 20
	EditTextSaniye13.TextColor = Colors.White
	EditTextSaniye13.Typeface = Typeface.DEFAULT
	EditTextSaniye13.InputType = EditTextSaniye13.INPUT_TYPE_NUMBERS
	
	EditTextSaniye14.TextSize = 20
	EditTextSaniye14.TextColor = Colors.White
	EditTextSaniye14.Typeface = Typeface.DEFAULT
	EditTextSaniye14.InputType = EditTextSaniye14.INPUT_TYPE_NUMBERS
	
	EditTextSaniye15.TextSize = 20
	EditTextSaniye15.TextColor = Colors.White
	EditTextSaniye15.Typeface = Typeface.DEFAULT
	EditTextSaniye15.InputType = EditTextSaniye15.INPUT_TYPE_NUMBERS
	
	EditTextSaniye16.TextSize = 20
	EditTextSaniye16.TextColor = Colors.White
	EditTextSaniye16.Typeface = Typeface.DEFAULT
	EditTextSaniye16.InputType = EditTextSaniye16.INPUT_TYPE_NUMBERS
	
	EditTextSaniye17.TextSize = 20
	EditTextSaniye17.TextColor = Colors.White
	EditTextSaniye17.Typeface = Typeface.DEFAULT
	EditTextSaniye17.InputType = EditTextSaniye17.INPUT_TYPE_NUMBERS
	
	EditTextSaniye18.TextSize = 20
	EditTextSaniye18.TextColor = Colors.White
	EditTextSaniye18.Typeface = Typeface.DEFAULT
	EditTextSaniye18.InputType = EditTextSaniye18.INPUT_TYPE_NUMBERS
	
	EditTextSaniye19.TextSize = 20
	EditTextSaniye19.TextColor = Colors.White
	EditTextSaniye19.Typeface = Typeface.DEFAULT
	EditTextSaniye19.InputType = EditTextSaniye19.INPUT_TYPE_NUMBERS
	
	EditTextSaniye20.TextSize = 20
	EditTextSaniye20.TextColor = Colors.White
	EditTextSaniye20.Typeface = Typeface.DEFAULT
	EditTextSaniye20.InputType = EditTextSaniye20.INPUT_TYPE_NUMBERS
	
	EditTextSaniye21.TextSize = 20
	EditTextSaniye21.TextColor = Colors.White
	EditTextSaniye21.Typeface = Typeface.DEFAULT
	EditTextSaniye21.InputType = EditTextSaniye21.INPUT_TYPE_NUMBERS
	
	EditTextSaniye22.TextSize = 20
	EditTextSaniye22.TextColor = Colors.White
	EditTextSaniye22.Typeface = Typeface.DEFAULT
	EditTextSaniye22.InputType = EditTextSaniye22.INPUT_TYPE_NUMBERS
	
	EditTextSaniye23.TextSize = 20
	EditTextSaniye23.TextColor = Colors.White
	EditTextSaniye23.Typeface = Typeface.DEFAULT
	EditTextSaniye23.InputType = EditTextSaniye23.INPUT_TYPE_NUMBERS
	
	EditTextSaniye24.TextSize = 20
	EditTextSaniye24.TextColor = Colors.White
	EditTextSaniye24.Typeface = Typeface.DEFAULT
	EditTextSaniye24.InputType = EditTextSaniye24.INPUT_TYPE_NUMBERS
	
	EditTextSaniye25.TextSize = 20
	EditTextSaniye25.TextColor = Colors.White
	EditTextSaniye25.Typeface = Typeface.DEFAULT
	EditTextSaniye25.InputType = EditTextSaniye25.INPUT_TYPE_NUMBERS
	
	#end region
#region edittext hız
	
	EditTextHiz1.TextSize = 20
	EditTextHiz1.TextColor = Colors.White
	EditTextHiz1.Typeface = Typeface.DEFAULT
	EditTextHiz1.InputType = EditTextHiz1.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz2.TextSize = 20
	EditTextHiz2.TextColor = Colors.White
	EditTextHiz2.Typeface = Typeface.DEFAULT
	EditTextHiz2.InputType = EditTextHiz2.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz3.TextSize = 20
	EditTextHiz3.TextColor = Colors.White
	EditTextHiz3.Typeface = Typeface.DEFAULT
	EditTextHiz3.InputType = EditTextHiz3.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz4.TextSize = 20
	EditTextHiz4.TextColor = Colors.White
	EditTextHiz4.Typeface = Typeface.DEFAULT
	EditTextHiz4.InputType = EditTextHiz4.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz5.TextSize = 20
	EditTextHiz5.TextColor = Colors.White
	EditTextHiz5.Typeface = Typeface.DEFAULT
	EditTextHiz5.InputType = EditTextHiz5.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz6.TextSize = 20
	EditTextHiz6.TextColor = Colors.White
	EditTextHiz6.Typeface = Typeface.DEFAULT
	EditTextHiz6.InputType = EditTextHiz6.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz7.TextSize = 20
	EditTextHiz7.TextColor = Colors.White
	EditTextHiz7.Typeface = Typeface.DEFAULT
	EditTextHiz7.InputType = EditTextHiz7.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz8.TextSize = 20
	EditTextHiz8.TextColor = Colors.White
	EditTextHiz8.Typeface = Typeface.DEFAULT
	EditTextHiz8.InputType = EditTextHiz8.INPUT_TYPE_DECIMAL_NUMBERS

	EditTextHiz9.TextSize = 20
	EditTextHiz9.TextColor = Colors.White
	EditTextHiz9.Typeface = Typeface.DEFAULT
	EditTextHiz9.InputType = EditTextHiz9.INPUT_TYPE_DECIMAL_NUMBERS

	EditTextHiz10.TextSize = 20
	EditTextHiz10.TextColor = Colors.White
	EditTextHiz10.Typeface = Typeface.DEFAULT
	EditTextHiz10.InputType = EditTextHiz10.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz11.TextSize = 20
	EditTextHiz11.TextColor = Colors.White
	EditTextHiz11.Typeface = Typeface.DEFAULT
	EditTextHiz11.InputType = EditTextHiz11.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz12.TextSize = 20
	EditTextHiz12.TextColor = Colors.White
	EditTextHiz12.Typeface = Typeface.DEFAULT
	EditTextHiz12.InputType = EditTextHiz12.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz13.TextSize = 20
	EditTextHiz13.TextColor = Colors.White
	EditTextHiz13.Typeface = Typeface.DEFAULT
	EditTextHiz13.InputType = EditTextHiz13.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz14.TextSize = 20
	EditTextHiz14.TextColor = Colors.White
	EditTextHiz14.Typeface = Typeface.DEFAULT
	EditTextHiz14.InputType = EditTextHiz14.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz15.TextSize = 20
	EditTextHiz15.TextColor = Colors.White
	EditTextHiz15.Typeface = Typeface.DEFAULT
	EditTextHiz15.InputType = EditTextHiz15.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz16.TextSize = 20
	EditTextHiz16.TextColor = Colors.White
	EditTextHiz16.Typeface = Typeface.DEFAULT
	EditTextHiz16.InputType = EditTextHiz16.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz17.TextSize = 20
	EditTextHiz17.TextColor = Colors.White
	EditTextHiz17.Typeface = Typeface.DEFAULT
	EditTextHiz17.InputType = EditTextHiz17.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz18.TextSize = 20
	EditTextHiz18.TextColor = Colors.White
	EditTextHiz18.Typeface = Typeface.DEFAULT
	EditTextHiz18.InputType = EditTextHiz18.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz19.TextSize = 20
	EditTextHiz19.TextColor = Colors.White
	EditTextHiz19.Typeface = Typeface.DEFAULT
	EditTextHiz19.InputType = EditTextHiz19.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz20.TextSize = 20
	EditTextHiz20.TextColor = Colors.White
	EditTextHiz20.Typeface = Typeface.DEFAULT
	EditTextHiz20.InputType = EditTextHiz20.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz21.TextSize = 20
	EditTextHiz21.TextColor = Colors.White
	EditTextHiz21.Typeface = Typeface.DEFAULT
	EditTextHiz21.InputType = EditTextHiz21.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz22.TextSize = 20
	EditTextHiz22.TextColor = Colors.White
	EditTextHiz22.Typeface = Typeface.DEFAULT
	EditTextHiz22.InputType = EditTextHiz22.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz23.TextSize = 20
	EditTextHiz23.TextColor = Colors.White
	EditTextHiz23.Typeface = Typeface.DEFAULT
	EditTextHiz23.InputType = EditTextHiz23.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz24.TextSize = 20
	EditTextHiz24.TextColor = Colors.White
	EditTextHiz24.Typeface = Typeface.DEFAULT
	EditTextHiz24.InputType = EditTextHiz24.INPUT_TYPE_DECIMAL_NUMBERS
	
	EditTextHiz25.TextSize = 20
	EditTextHiz25.TextColor = Colors.White
	EditTextHiz25.Typeface = Typeface.DEFAULT
	EditTextHiz25.InputType = EditTextHiz25.INPUT_TYPE_DECIMAL_NUMBERS
	
#end region
#region edittext atama
'	EditTextKoniMesafesi1.Text = 0
'	EditTextKoniMesafesi1.SelectAll
'	EditTextHiz1.Text= 0
'	EditTextHiz1.SelectAll
'	EditTextDakika1.Text= 0
'	EditTextDakika1.SelectAll
'	EditTextSaniye1.Text= 0
'	EditTextSaniye1.SelectAll
'	EditTextKoniMesafesi2.Text= 0
'	EditTextKoniMesafesi2.SelectAll
'	EditTextHiz2.Text= 0
'	EditTextHiz2.SelectAll
'	EditTextDakika2.Text= 0
'	EditTextDakika2.SelectAll
'	EditTextSaniye2.Text=0
'	EditTextSaniye2.SelectAll
'	EditTextKoniMesafesi3.Text= 0	
'	EditTextKoniMesafesi3.SelectAll
'	EditTextHiz3.Text= 0
'	EditTextHiz3.SelectAll
'	EditTextDakika3.Text= 0
'	EditTextDakika3.SelectAll
'	EditTextSaniye3.Text= 0
'	EditTextSaniye3.SelectAll
'	EditTextKoniMesafesi4.Text= 0
'	EditTextKoniMesafesi4.SelectAll
'	EditTextHiz4.Text= 0
'	EditTextHiz4.SelectAll
'	EditTextDakika4.Text= 0
'	EditTextDakika4.SelectAll
'	EditTextSaniye4.Text= 0
'	EditTextSaniye4.SelectAll
'	
'	
'	EditTextKoniMesafesi5.Text= 0
'	EditTextHiz5.Text= 0
'	EditTextDakika5.Text= 0
'	EditTextSaniye5.Text= 0
'	EditTextKoniMesafesi6.Text= 0
'	EditTextHiz6.Text= 0
'	EditTextDakika6.Text= 0
'	EditTextSaniye6.Text= 0
'	EditTextKoniMesafesi7.Text= 0
'	EditTextHiz7.Text= 0
'	EditTextDakika7.Text= 0
'	EditTextSaniye7.Text= 0
'	EditTextKoniMesafesi8.Text = 0
'	EditTextHiz8.Text = 0
'	EditTextDakika8.Text = 0
'	EditTextSaniye8.Text= 0
'	EditTextKoniMesafesi9.Text= 0
'	EditTextHiz9.Text= 0
'	EditTextDakika9.Text= 0
'	EditTextSaniye9.Text= 0
'	EditTextKoniMesafesi10.Text= 0
'	EditTextHiz10.Text= 0
'	EditTextDakika10.Text= 0
'	EditTextSaniye10.Text= 0
'	EditTextKoniMesafesi11.Text= 0
'	EditTextHiz11.Text= 0
'	EditTextDakika11.Text= 0
'	EditTextSaniye11.Text= 0
'	EditTextKoniMesafesi12.Text= 0
'	EditTextHiz12.Text= 0
'	EditTextDakika12.Text= 0
'	EditTextSaniye12.Text= 0
'	EditTextKoniMesafesi13.Text=0
'	EditTextHiz13.Text= 0
'	EditTextDakika13.Text= 0
'	EditTextSaniye13.Text= 0
'	EditTextKoniMesafesi14.Text= 0
'	EditTextHiz14.Text=0
'	EditTextDakika14.Text= 0
'	EditTextSaniye14.Text= 0
'	EditTextKoniMesafesi15.Text= 0
'	EditTextHiz15.Text= 0
'	EditTextDakika15.Text= 0
'	EditTextSaniye15.Text= 0
'	EditTextKoniMesafesi16.Text=0
'	EditTextHiz16.Text= 0
'	EditTextDakika16.Text= 0
'	EditTextSaniye16.Text= 0
'	EditTextKoniMesafesi17.Text= 0
'	EditTextHiz17.Text= 0
'	EditTextDakika17.Text= 0
'	EditTextSaniye17.Text=0
'	EditTextKoniMesafesi18.Text= 0
'	EditTextHiz18.Text= 0
'	EditTextDakika18.Text= 0
'	EditTextSaniye18.Text= 0
'	EditTextKoniMesafesi19.Text= 0
'	EditTextHiz19.Text= 0
'	EditTextDakika19.Text= 0
'	EditTextSaniye19.Text= 0
'	EditTextKoniMesafesi20.Text= 0
'	EditTextHiz20.Text= 0
'	EditTextDakika20.Text= 0
'	EditTextSaniye20.Text= 0
'	EditTextKoniMesafesi21.Text= 0
'	EditTextHiz21.Text= 0
'	EditTextDakika21.Text= 0
'	EditTextSaniye21.Text= 0
'	EditTextKoniMesafesi22.Text= 0
'	EditTextHiz22.Text= 0
'	EditTextDakika22.Text=0
'	EditTextSaniye22.Text= 0
'	EditTextKoniMesafesi23.Text= 0
'	EditTextHiz23.Text= 0
'	EditTextDakika23.Text= 0
'	EditTextSaniye23.Text= 0
'	EditTextKoniMesafesi24.Text= 0
'	EditTextHiz24.Text= 0
'	EditTextDakika24.Text= 0
'	EditTextSaniye24.Text= 0
'	EditTextKoniMesafesi25.Text= 0
'	EditTextHiz25.Text= 0
'	EditTextDakika25.Text= 0
'	EditTextSaniye25.Text= 0
	#end region
#end region	

#region label görüntü ayarı

#region label seviye ismi
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
	
	LabelSeviyeIsmi9.TextColor = Colors.White
	LabelSeviyeIsmi9.TextSize = 20
	LabelSeviyeIsmi9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi10.TextColor = Colors.White
	LabelSeviyeIsmi10.TextSize = 20
	LabelSeviyeIsmi10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi11.TextColor = Colors.White
	LabelSeviyeIsmi11.TextSize = 20
	LabelSeviyeIsmi11.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi12.TextColor = Colors.White
	LabelSeviyeIsmi12.TextSize = 20
	LabelSeviyeIsmi12.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi13.TextColor = Colors.White
	LabelSeviyeIsmi13.TextSize = 20
	LabelSeviyeIsmi13.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi14.TextColor = Colors.White
	LabelSeviyeIsmi14.TextSize = 20
	LabelSeviyeIsmi14.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi15.TextColor = Colors.White
	LabelSeviyeIsmi15.TextSize = 20
	LabelSeviyeIsmi15.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi16.TextColor = Colors.White
	LabelSeviyeIsmi16.TextSize = 20
	LabelSeviyeIsmi16.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi17.TextColor = Colors.White
	LabelSeviyeIsmi17.TextSize = 20
	LabelSeviyeIsmi17.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi18.TextColor = Colors.White
	LabelSeviyeIsmi18.TextSize = 20
	LabelSeviyeIsmi18.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi19.TextColor = Colors.White
	LabelSeviyeIsmi19.TextSize = 20
	LabelSeviyeIsmi19.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi20.TextColor = Colors.White
	LabelSeviyeIsmi20.TextSize = 20
	LabelSeviyeIsmi20.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi21.TextColor = Colors.White
	LabelSeviyeIsmi21.TextSize = 20
	LabelSeviyeIsmi21.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi22.TextColor = Colors.White
	LabelSeviyeIsmi22.TextSize = 20
	LabelSeviyeIsmi22.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi23.TextColor = Colors.White
	LabelSeviyeIsmi23.TextSize = 20
	LabelSeviyeIsmi23.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi24.TextColor = Colors.White
	LabelSeviyeIsmi24.TextSize = 20
	LabelSeviyeIsmi24.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSeviyeIsmi25.TextColor = Colors.White
	LabelSeviyeIsmi25.TextSize = 20
	LabelSeviyeIsmi25.Typeface = Typeface.DEFAULT_BOLD
	
#end region
#region label hız
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
	
	LabelHiz9.TextColor = Colors.White
	LabelHiz9.TextSize = 20
	LabelHiz9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz10.TextColor = Colors.White
	LabelHiz10.TextSize = 20
	LabelHiz10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz11.TextColor = Colors.White
	LabelHiz11.TextSize = 20
	LabelHiz11.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz12.TextColor = Colors.White
	LabelHiz12.TextSize = 20
	LabelHiz12.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz13.TextColor = Colors.White
	LabelHiz13.TextSize = 20
	LabelHiz13.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz14.TextColor = Colors.White
	LabelHiz14.TextSize = 20
	LabelHiz14.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz15.TextColor = Colors.White
	LabelHiz15.TextSize = 20
	LabelHiz15.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz16.TextColor = Colors.White
	LabelHiz16.TextSize = 20
	LabelHiz16.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz17.TextColor = Colors.White
	LabelHiz17.TextSize = 20
	LabelHiz17.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz18.TextColor = Colors.White
	LabelHiz18.TextSize = 20
	LabelHiz18.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz19.TextColor = Colors.White
	LabelHiz19.TextSize = 20
	LabelHiz19.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz20.TextColor = Colors.White
	LabelHiz20.TextSize = 20
	LabelHiz20.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz21.TextColor = Colors.White
	LabelHiz21.TextSize = 20
	LabelHiz21.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz22.TextColor = Colors.White
	LabelHiz22.TextSize = 20
	LabelHiz22.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz23.TextColor = Colors.White
	LabelHiz23.TextSize = 20
	LabelHiz23.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz24.TextColor = Colors.White
	LabelHiz24.TextSize = 20
	LabelHiz24.Typeface = Typeface.DEFAULT_BOLD
	
	LabelHiz25.TextColor = Colors.White
	LabelHiz25.TextSize = 20
	LabelHiz25.Typeface = Typeface.DEFAULT_BOLD
	
#end region
#region label dakika	
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
	
	LabelDakika9.TextColor = Colors.White
	LabelDakika9.TextSize = 20
	LabelDakika9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika10.TextColor = Colors.White
	LabelDakika10.TextSize = 20
	LabelDakika10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika11.TextColor = Colors.White
	LabelDakika11.TextSize = 20
	LabelDakika11.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika12.TextColor = Colors.White
	LabelDakika12.TextSize = 20
	LabelDakika12.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika13.TextColor = Colors.White
	LabelDakika13.TextSize = 20
	LabelDakika13.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika14.TextColor = Colors.White
	LabelDakika14.TextSize = 20
	LabelDakika14.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika15.TextColor = Colors.White
	LabelDakika15.TextSize = 20
	LabelDakika15.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika16.TextColor = Colors.White
	LabelDakika16.TextSize = 20
	LabelDakika16.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika17.TextColor = Colors.White
	LabelDakika17.TextSize = 20
	LabelDakika17.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika18.TextColor = Colors.White
	LabelDakika18.TextSize = 20
	LabelDakika18.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika19.TextColor = Colors.White
	LabelDakika19.TextSize = 20
	LabelDakika19.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika20.TextColor = Colors.White
	LabelDakika20.TextSize = 20
	LabelDakika20.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika21.TextColor = Colors.White
	LabelDakika21.TextSize = 20
	LabelDakika21.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika22.TextColor = Colors.White
	LabelDakika22.TextSize = 20
	LabelDakika22.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika23.TextColor = Colors.White
	LabelDakika23.TextSize = 20
	LabelDakika23.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika24.TextColor = Colors.White
	LabelDakika24.TextSize = 20
	LabelDakika24.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika25.TextColor = Colors.White
	LabelDakika25.TextSize = 20
	LabelDakika25.Typeface = Typeface.DEFAULT_BOLD

#end region
#region label saniye
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
	
	LabelSaniye9.TextColor = Colors.White
	LabelSaniye9.TextSize = 20
	LabelSaniye9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye10.TextColor = Colors.White
	LabelSaniye10.TextSize = 20
	LabelSaniye10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye11.TextColor = Colors.White
	LabelSaniye11.TextSize = 20
	LabelSaniye11.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye12.TextColor = Colors.White
	LabelSaniye12.TextSize = 20
	LabelSaniye12.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye13.TextColor = Colors.White
	LabelSaniye13.TextSize = 20
	LabelSaniye13.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye14.TextColor = Colors.White
	LabelSaniye14.TextSize = 20
	LabelSaniye14.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye15.TextColor = Colors.White
	LabelSaniye15.TextSize = 20
	LabelSaniye15.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye16.TextColor = Colors.White
	LabelSaniye16.TextSize = 20
	LabelSaniye16.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye17.TextColor = Colors.White
	LabelSaniye17.TextSize = 20
	LabelSaniye17.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye18.TextColor = Colors.White
	LabelSaniye18.TextSize = 20
	LabelSaniye18.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye19.TextColor = Colors.White
	LabelSaniye19.TextSize = 20
	LabelSaniye19.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye20.TextColor = Colors.White
	LabelSaniye20.TextSize = 20
	LabelSaniye20.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye21.TextColor = Colors.White
	LabelSaniye21.TextSize = 20
	LabelSaniye21.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye22.TextColor = Colors.White
	LabelSaniye22.TextSize = 20
	LabelSaniye22.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye23.TextColor = Colors.White
	LabelSaniye23.TextSize = 20
	LabelSaniye23.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye24.TextColor = Colors.White
	LabelSaniye24.TextSize = 20
	LabelSaniye24.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye25.TextColor = Colors.White
	LabelSaniye25.TextSize = 20
	LabelSaniye25.Typeface = Typeface.DEFAULT_BOLD
#end region	
#region labrl koni mesafesi
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
	
	LabelKoniMesafesi9.TextColor = Colors.White
	LabelKoniMesafesi9.TextSize = 20
	LabelKoniMesafesi9.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi10.TextColor = Colors.White
	LabelKoniMesafesi10.TextSize = 20
	LabelKoniMesafesi10.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi11.TextColor = Colors.White
	LabelKoniMesafesi11.TextSize = 20
	LabelKoniMesafesi11.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi12.TextColor = Colors.White
	LabelKoniMesafesi12.TextSize = 20
	LabelKoniMesafesi12.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi13.TextColor = Colors.White
	LabelKoniMesafesi13.TextSize = 20
	LabelKoniMesafesi13.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi14.TextColor = Colors.White
	LabelKoniMesafesi14.TextSize = 20
	LabelKoniMesafesi14.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi15.TextColor = Colors.White
	LabelKoniMesafesi15.TextSize = 20
	LabelKoniMesafesi15.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi16.TextColor = Colors.White
	LabelKoniMesafesi16.TextSize = 20
	LabelKoniMesafesi16.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi17.TextColor = Colors.White
	LabelKoniMesafesi17.TextSize = 20
	LabelKoniMesafesi17.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi18.TextColor = Colors.White
	LabelKoniMesafesi18.TextSize = 20
	LabelKoniMesafesi18.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi19.TextColor = Colors.White
	LabelKoniMesafesi19.TextSize = 20
	LabelKoniMesafesi19.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi20.TextColor = Colors.White
	LabelKoniMesafesi20.TextSize = 20
	LabelKoniMesafesi20.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi21.TextColor = Colors.White
	LabelKoniMesafesi21.TextSize = 20
	LabelKoniMesafesi21.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi22.TextColor = Colors.White
	LabelKoniMesafesi22.TextSize = 20
	LabelKoniMesafesi22.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi23.TextColor = Colors.White
	LabelKoniMesafesi23.TextSize = 20
	LabelKoniMesafesi23.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi24.TextColor = Colors.White
	LabelKoniMesafesi24.TextSize = 20
	LabelKoniMesafesi24.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKoniMesafesi25.TextColor = Colors.White
	LabelKoniMesafesi25.TextSize = 20
	LabelKoniMesafesi25.Typeface = Typeface.DEFAULT_BOLD	
#end region	

#end region

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub PanelKapat
	Panel1.Visible = False
	Panel2.Visible = False
	Panel3.Visible = False
	Panel4.Visible = False
	Panel5.Visible = False
	Panel6.Visible = False
	Panel7.Visible = False
	Panel8.Visible = False
	Panel9.Visible = False
	Panel10.Visible = False
	Panel11.Visible = False
	Panel12.Visible = False
	Panel13.Visible = False
	Panel14.Visible = False
	Panel15.Visible = False
	Panel16.Visible = False
	Panel17.Visible = False
	Panel18.Visible = False
	Panel19.Visible = False
	Panel20.Visible = False
	Panel21.Visible = False
	Panel22.Visible = False
	Panel23.Visible = False
	Panel24.Visible = False
	Panel25.Visible = False
End Sub

Sub levelPanelGoster
	PanelKapat
	If ProgramAyar.secilenLevel >= 1 Then
		Panel1.Visible = True
		If ProgramAyar.secilenLevel >= 2 Then
			Panel2.Visible = True
			If ProgramAyar.secilenLevel >=3 Then
				Panel3.Visible = True
				If ProgramAyar.secilenLevel >= 4 Then
					Panel4.Visible = True
					If ProgramAyar.secilenLevel >= 5 Then
						Panel5.Visible = True
						If ProgramAyar.secilenLevel >= 6 Then
							Panel6.Visible = True
							If ProgramAyar.secilenLevel >= 7 Then
								Panel7.Visible = True
								If ProgramAyar.secilenLevel >= 8 Then
									Panel8.Visible = True
									If ProgramAyar.secilenLevel >= 9 Then
										Panel9.Visible = True
										If ProgramAyar.secilenLevel >= 10 Then
											Panel10.Visible = True
											If ProgramAyar.secilenLevel >= 11 Then
												Panel11.Visible = True
												If ProgramAyar.secilenLevel >= 12 Then
													Panel12.Visible = True
													If ProgramAyar.secilenLevel >= 13 Then
														Panel13.Visible = True
														If ProgramAyar.secilenLevel >= 14 Then
															Panel14.Visible = True
															If ProgramAyar.secilenLevel >= 15 Then
																Panel15.Visible = True
																If ProgramAyar.secilenLevel >= 16 Then
																	Panel16. Visible = True
																	If ProgramAyar.secilenLevel >= 17 Then
																		Panel17.Visible = True
																		If ProgramAyar.secilenLevel >= 18 Then
																			Panel18.Visible = True
																			If ProgramAyar.secilenLevel >= 19 Then
																				Panel19.Visible = True
																				If ProgramAyar.secilenLevel >= 20 Then
																					Panel20.Visible = True
																					If ProgramAyar.secilenLevel >= 21 Then
																						Panel21.Visible = True
																						If ProgramAyar.secilenLevel >= 22 Then
																							Panel22.Visible = True
																							If ProgramAyar.secilenLevel >= 23 Then
																								Panel23.Visible = True
																								If ProgramAyar.secilenLevel >= 24 Then
																									Panel24.Visible = True
																									If ProgramAyar.secilenLevel == 25 Then
																										Panel25.Visible = True
																									End If
																								End If
																							End If
																						End If
																					End If
																				End If
																			End If
																		End If
																	End If
																End If
															End If
														End If
													End If
												End If
											End If
										End If
									End If
								End If
							End If
						End If
					End If
				End If
			End If
		End If
	End If
	
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM DayaniklilikTestProgram ORDER BY program_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		ProgramID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("program_id"),3))+1),3)
	Else
		ProgramID="001"
	End If
	rs.Close
End Sub

Sub VeriAl
	If ProgramAyar.secilenLevel >= 1 Then
		EditTextKoniMesafesi1_TextChanged("0",EditTextKoniMesafesi1.Text)
		EditTextHiz1_TextChanged("0",EditTextHiz1.Text)
		EditTextDakika1_TextChanged("0", EditTextDakika1.Text)
		EditTextSaniye1_TextChanged("0", EditTextSaniye1.Text)
		If ProgramAyar.secilenLevel >= 2 Then
			EditTextKoniMesafesi2_TextChanged("0",EditTextKoniMesafesi2.Text)
			EditTextHiz2_TextChanged("0",EditTextHiz2.Text)
			EditTextDakika2_TextChanged("0",EditTextDakika2.Text)
			EditTextSaniye2_TextChanged("0", EditTextSaniye2.Text)
			If ProgramAyar.secilenLevel >=3 Then
				EditTextKoniMesafesi3_TextChanged("0",EditTextKoniMesafesi3.Text)
				EditTextHiz3_TextChanged("0",  EditTextHiz3.Text)
				EditTextDakika3_TextChanged("0", EditTextDakika3.Text)
				EditTextSaniye3_TextChanged("0", EditTextSaniye3.Text)
				If ProgramAyar.secilenLevel >= 4 Then
					EditTextKoniMesafesi4_TextChanged("0",EditTextKoniMesafesi4.Text)
					EditTextHiz4_TextChanged("0",  EditTextHiz4.Text)
					EditTextDakika4_TextChanged("0", EditTextDakika4.Text)
					EditTextSaniye4_TextChanged("0", EditTextSaniye4.Text)
					If ProgramAyar.secilenLevel >= 5 Then
						EditTextKoniMesafesi5_TextChanged("0",EditTextKoniMesafesi5.Text)
						EditTextHiz5_TextChanged("0",  EditTextHiz5.Text)
						EditTextDakika5_TextChanged("0", EditTextDakika5.Text)
						EditTextSaniye5_TextChanged("0", EditTextSaniye5.Text)
						If ProgramAyar.secilenLevel >= 6 Then
							EditTextKoniMesafesi6_TextChanged("0",EditTextKoniMesafesi6.Text)
							EditTextHiz6_TextChanged("0",  EditTextHiz6.Text)
							EditTextDakika6_TextChanged("0", EditTextDakika6.Text)
							EditTextSaniye6_TextChanged("0", EditTextSaniye6.Text)
							If ProgramAyar.secilenLevel >= 7 Then
								EditTextKoniMesafesi7_TextChanged("0",EditTextKoniMesafesi7.Text)
								EditTextHiz7_TextChanged("0",  EditTextHiz7.Text)
								EditTextDakika7_TextChanged("0", EditTextDakika7.Text)
								EditTextSaniye7_TextChanged("0", EditTextSaniye7.Text)
								If ProgramAyar.secilenLevel >= 8 Then
									EditTextKoniMesafesi8_TextChanged("0",EditTextKoniMesafesi8.Text)
									EditTextHiz8_TextChanged("0",  EditTextHiz8.Text)
									EditTextDakika8_TextChanged("0", EditTextDakika8.Text)
									EditTextSaniye8_TextChanged("0", EditTextSaniye8.Text)
									If ProgramAyar.secilenLevel >= 9 Then
										EditTextKoniMesafesi9_TextChanged("0",EditTextKoniMesafesi9.Text)
										EditTextHiz9_TextChanged("0",  EditTextHiz9.Text)
										EditTextDakika9_TextChanged("0", EditTextDakika9.Text)
										EditTextSaniye9_TextChanged("0", EditTextSaniye9.Text)
										If ProgramAyar.secilenLevel >= 10 Then
											EditTextKoniMesafesi10_TextChanged("0",EditTextKoniMesafesi10.Text)
											EditTextHiz10_TextChanged("0",  EditTextHiz10.Text)
											EditTextDakika10_TextChanged("0", EditTextDakika10.Text)
											EditTextSaniye10_TextChanged("0", EditTextSaniye10.Text)
											If ProgramAyar.secilenLevel >= 11 Then
												EditTextKoniMesafesi11_TextChanged("0",EditTextKoniMesafesi11.Text)
												EditTextHiz11_TextChanged("0",  EditTextHiz11.Text)
												EditTextDakika11_TextChanged("0", EditTextDakika11.Text)
												EditTextSaniye11_TextChanged("0", EditTextSaniye11.Text)
												If ProgramAyar.secilenLevel >= 12 Then
													EditTextKoniMesafesi12_TextChanged("0",EditTextKoniMesafesi12.Text)
													EditTextHiz12_TextChanged("0",  EditTextHiz12.Text)
													EditTextDakika12_TextChanged("0", EditTextDakika12.Text)
													EditTextSaniye12_TextChanged("0", EditTextSaniye12.Text)
													If ProgramAyar.secilenLevel >= 13 Then
														EditTextKoniMesafesi13_TextChanged("0",EditTextKoniMesafesi13.Text)
														EditTextHiz13_TextChanged("0",  EditTextHiz13.Text)
														EditTextDakika13_TextChanged("0", EditTextDakika13.Text)
														EditTextSaniye13_TextChanged("0", EditTextSaniye13.Text)
														If ProgramAyar.secilenLevel >= 14 Then
															EditTextKoniMesafesi14_TextChanged("0",EditTextKoniMesafesi14.Text)
															EditTextHiz14_TextChanged("0",  EditTextHiz14.Text)
															EditTextDakika14_TextChanged("0", EditTextDakika14.Text)
															EditTextSaniye14_TextChanged("0", EditTextSaniye14.Text)
															If ProgramAyar.secilenLevel >= 15 Then
																EditTextKoniMesafesi15_TextChanged("0",EditTextKoniMesafesi15.Text)
																EditTextHiz15_TextChanged("0",  EditTextHiz15.Text)
																EditTextDakika15_TextChanged("0", EditTextDakika15.Text)
																EditTextSaniye15_TextChanged("0", EditTextSaniye15.Text)
																If ProgramAyar.secilenLevel >= 16 Then
																	EditTextKoniMesafesi16_TextChanged("0",EditTextKoniMesafesi16.Text)
																	EditTextHiz16_TextChanged("0",  EditTextHiz16.Text)
																	EditTextDakika16_TextChanged("0", EditTextDakika16.Text)
																	EditTextSaniye16_TextChanged("0", EditTextSaniye16.Text)
																	If ProgramAyar.secilenLevel >= 17 Then
																		EditTextKoniMesafesi17_TextChanged("0",EditTextKoniMesafesi17.Text)
																		EditTextHiz17_TextChanged("0",  EditTextHiz17.Text)
																		EditTextDakika17_TextChanged("0", EditTextDakika17.Text)
																		EditTextSaniye17_TextChanged("0", EditTextSaniye17.Text)
																		If ProgramAyar.secilenLevel >= 18 Then
																			EditTextKoniMesafesi18_TextChanged("0",EditTextKoniMesafesi18.Text)
																			EditTextHiz18_TextChanged("0",  EditTextHiz18.Text)
																			EditTextDakika18_TextChanged("0", EditTextDakika18.Text)
																			EditTextSaniye18_TextChanged("0", EditTextSaniye18.Text)
																			If ProgramAyar.secilenLevel >= 19 Then
																				EditTextKoniMesafesi19_TextChanged("0",EditTextKoniMesafesi19.Text)
																				EditTextHiz19_TextChanged("0",  EditTextHiz19.Text)
																				EditTextDakika19_TextChanged("0", EditTextDakika19.Text)
																				EditTextSaniye19_TextChanged("0", EditTextSaniye19.Text)
																				If ProgramAyar.secilenLevel >= 20 Then
																					EditTextKoniMesafesi20_TextChanged("0",EditTextKoniMesafesi20.Text)
																					EditTextHiz20_TextChanged("0",  EditTextHiz20.Text)
																					EditTextDakika20_TextChanged("0", EditTextDakika20.Text)
																					EditTextSaniye20_TextChanged("0", EditTextSaniye20.Text)
																					If ProgramAyar.secilenLevel >= 21 Then
																						EditTextKoniMesafesi21_TextChanged("0",EditTextKoniMesafesi21.Text)
																						EditTextHiz21_TextChanged("0",  EditTextHiz21.Text)
																						EditTextDakika21_TextChanged("0", EditTextDakika21.Text)
																						EditTextSaniye21_TextChanged("0", EditTextSaniye21.Text)
																						If ProgramAyar.secilenLevel >= 22 Then
																							EditTextKoniMesafesi22_TextChanged("0",EditTextKoniMesafesi22.Text)
																							EditTextHiz22_TextChanged("0",  EditTextHiz22.Text)
																							EditTextDakika22_TextChanged("0", EditTextDakika22.Text)
																							EditTextSaniye22_TextChanged("0", EditTextSaniye22.Text)
																							If ProgramAyar.secilenLevel >= 23 Then
																								EditTextKoniMesafesi23_TextChanged("0",EditTextKoniMesafesi23.Text)
																								EditTextHiz23_TextChanged("0",  EditTextHiz23.Text)
																								EditTextDakika23_TextChanged("0", EditTextDakika23.Text)
																								EditTextSaniye23_TextChanged("0", EditTextSaniye23.Text)
																								If ProgramAyar.secilenLevel >= 24 Then
																									EditTextKoniMesafesi24_TextChanged("0",EditTextKoniMesafesi24.Text)
																									EditTextHiz24_TextChanged("0",  EditTextHiz24.Text)
																									EditTextDakika24_TextChanged("0", EditTextDakika24.Text)
																									EditTextSaniye24_TextChanged("0", EditTextSaniye24.Text)
																									If ProgramAyar.secilenLevel == 25 Then
																										EditTextKoniMesafesi25_TextChanged("0",EditTextKoniMesafesi25.Text)
																										EditTextHiz25_TextChanged("0",  EditTextHiz25.Text)
																										EditTextDakika25_TextChanged("0", EditTextDakika25.Text)
																										EditTextSaniye25_TextChanged("0", EditTextSaniye25.Text)
																									End If
																								End If
																							End If
																						End If
																					End If
																				End If
																			End If
																		End If
																	End If
																End If
															End If
														End If
													End If
												End If
											End If
										End If
									End If
								End If
							End If
						End If
					End If
				End If
			End If
		End If
	End If
End Sub

Sub ButtonOK_Click
	VeriAl
	Dim result As Int
	result = Msgbox2("Programı eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		Log(DateTime.Date(now))
		secilenTarih = DateTime.Date(now)
		Log(DateTime.Time(now))
		secilenSaat = DateTime.Time(now)
		ID
		Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTestProgram VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (ProgramID,ProgramAyar.programAdi,secilenTarih,secilenSaat,ProgramAyar.secilenLevel,ProgramAyar.secilenTestTuru,koniMesafesi1, hiz1, dakika1,saniye1, koniMesafesi2 , hiz2,dakika2,saniye2,koniMesafesi3 ,hiz3 ,dakika3 ,saniye3,koniMesafesi4 ,hiz4 ,dakika4 ,saniye4,koniMesafesi5 ,hiz5 ,dakika5 ,saniye5,koniMesafesi6 ,hiz6 ,dakika6 ,saniye6,koniMesafesi7 ,hiz7 ,dakika7 ,saniye7, koniMesafesi8 ,hiz8 ,dakika8 ,saniye8,koniMesafesi9 ,hiz9 ,dakika9 ,saniye9,koniMesafesi10 ,hiz10 ,dakika10 ,saniye10,koniMesafesi11 ,hiz11 ,dakika11 ,saniye11,koniMesafesi12 ,hiz12 ,dakika12 ,saniye12,koniMesafesi13 ,hiz13 ,dakika13 ,saniye13,koniMesafesi14 ,hiz14 ,dakika14 ,saniye14,koniMesafesi15 ,hiz15 ,dakika15 ,saniye15,koniMesafesi16 ,hiz16 ,dakika16 ,saniye16, koniMesafesi17 ,hiz17 ,dakika17 ,saniye17 ,koniMesafesi18 ,hiz18 ,dakika18 ,saniye18,koniMesafesi19 ,hiz19 ,dakika19 ,saniye19,koniMesafesi20 ,hiz20 ,dakika20 ,saniye20,koniMesafesi21 ,hiz21 ,dakika21 ,saniye21, koniMesafesi22 ,hiz22 ,dakika22 ,saniye22,koniMesafesi23 ,hiz23 ,dakika23 ,saniye23, koniMesafesi24 ,hiz24 ,dakika24 ,saniye24,koniMesafesi25 ,hiz25 ,dakika25 ,saniye25 ))
		StartActivity(ProgramListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If

End Sub

#region TextChanged 

Sub EditTextKoniMesafesi1_TextChanged (Old As String,New As String)
'	If EditTextKoniMesafesi1.Text.Length == 0 Then
'		koniMesafesi1 = Old
'	Else
'		koniMesafesi1 = New
'	End If
	
	If New.Length <> 0 Then
		koniMesafesi1 = New
	End If

End Sub

Sub EditTextHiz1_TextChanged (Old As String, New As String)
	If EditTextHiz1.Text.Length == 0 Then
		hiz1 = Old
	Else
		hiz1 = New
	End If
End Sub

Sub EditTextDakika1_TextChanged (Old As String, New As String)
	If EditTextDakika1.Text.Length == 0 Then
		dakika1 = Old
	Else
		dakika1 = New
	End If
End Sub

Sub EditTextSaniye1_TextChanged (Old As String, New As String)
	If EditTextSaniye1.Text.Length == 0 Then
		saniye1 = Old
	Else
		saniye1 = New
	End If
End Sub

Sub EditTextKoniMesafesi2_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi2.Text.Length == 0 Then
		koniMesafesi2 = Old
	Else
		koniMesafesi2 = New
	End If
End Sub

Sub EditTextHiz2_TextChanged (Old As String, New As String)
	If EditTextHiz2.Text.Length == 0 Then
		hiz2 = Old
	Else
		hiz2 = New
	End If
End Sub

Sub EditTextDakika2_TextChanged (Old As String, New As String)
	If EditTextDakika2.Text.Length == 0 Then
		dakika2 = Old
	Else
		dakika2 = New
	End If
End Sub

Sub EditTextSaniye2_TextChanged (Old As String, New As String)
	If EditTextSaniye2.Text.Length == 0 Then
		saniye2 = Old
	Else
		saniye2 = New
	End If
End Sub

Sub EditTextKoniMesafesi3_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi3.Text.Length == 0 Then
		koniMesafesi3 = Old
	Else
		koniMesafesi3 = New
	End If
End Sub

Sub EditTextHiz3_TextChanged (Old As String, New As String)
	If EditTextHiz3.Text.Length == 0 Then
		hiz3 = Old
	Else
		hiz3 = New
	End If
End Sub

Sub EditTextDakika3_TextChanged (Old As String, New As String)
	If EditTextDakika3.Text.Length == 0 Then
		dakika3 = Old
	Else
		dakika3 = New
	End If
End Sub

Sub EditTextSaniye3_TextChanged (Old As String, New As String)
	If EditTextSaniye3.Text.Length == 0 Then
		saniye3 = Old
	Else
		saniye3 = New
	End If
End Sub
					
Sub EditTextKoniMesafesi4_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi4.Text.Length == 0 Then
		koniMesafesi4 = Old
	Else
		koniMesafesi4 = New
	End If
End Sub

Sub EditTextHiz4_TextChanged (Old As String, New As String)
	If EditTextHiz4.Text.Length == 0 Then
		hiz4 = Old
	Else
		hiz4 = New
	End If
End Sub

Sub EditTextDakika4_TextChanged (Old As String, New As String)
	If EditTextDakika4.Text.Length == 0 Then
		dakika4 = Old
	Else
		dakika4 = New
	End If
End Sub

Sub EditTextSaniye4_TextChanged (Old As String, New As String)
	If EditTextSaniye4.Text.Length == 0 Then
		saniye4 = Old
	Else
		saniye4 = New
	End If
End Sub

Sub EditTextKoniMesafesi5_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi5.Text.Length == 0 Then
		koniMesafesi5 = Old
	Else
		koniMesafesi5 = New
	End If
End Sub

Sub EditTextHiz5_TextChanged (Old As String, New As String)
	If EditTextHiz5.Text.Length == 0 Then
		hiz5 = Old
	Else
		hiz5 = New
	End If
End Sub

Sub EditTextDakika5_TextChanged (Old As String, New As String)
	If EditTextDakika5.Text.Length == 0 Then
		dakika5 = Old
	Else
		dakika5 = New
	End If
End Sub

Sub EditTextSaniye5_TextChanged (Old As String, New As String)
	If EditTextSaniye5.Text.Length == 0 Then
		saniye5 = Old
	Else
		saniye5 = New
	End If
End Sub

Sub EditTextKoniMesafesi6_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi6.Text.Length == 0 Then
		koniMesafesi6 = Old
	Else
		koniMesafesi6 = New
	End If
End Sub

Sub EditTextHiz6_TextChanged (Old As String, New As String)
	If EditTextHiz6.Text.Length == 0 Then
		hiz6 = Old
	Else
		hiz6 = New
	End If
End Sub

Sub EditTextDakika6_TextChanged (Old As String, New As String)
	If EditTextDakika6.Text.Length == 0 Then
		dakika6 = Old
	Else
		dakika6 = New
	End If
End Sub

Sub EditTextSaniye6_TextChanged (Old As String, New As String)
	If EditTextSaniye6.Text.Length == 0 Then
		saniye6 = Old
	Else
		saniye6 = New
	End If
End Sub

Sub EditTextKoniMesafesi7_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi7.Text.Length == 0 Then
		koniMesafesi7 = Old
	Else
		koniMesafesi7 = New
	End If
End Sub

Sub EditTextHiz7_TextChanged (Old As String, New As String)
	If EditTextHiz7.Text.Length == 0 Then
		hiz7 = Old
	Else
		hiz7 = New
	End If
End Sub

Sub EditTextDakika7_TextChanged (Old As String, New As String)
	If EditTextDakika7.Text.Length == 0 Then
		dakika7 = Old
	Else
		dakika7 = New
	End If
End Sub

Sub EditTextSaniye7_TextChanged (Old As String, New As String)
	If EditTextSaniye7.Text.Length == 0 Then
		saniye7 = Old
	Else
		saniye7 = New
	End If
End Sub

Sub EditTextKoniMesafesi8_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi8.Text.Length == 0 Then
		koniMesafesi8 = Old
	Else
		koniMesafesi8 = New
	End If
End Sub

Sub EditTextHiz8_TextChanged (Old As String, New As String)
	If EditTextHiz8.Text.Length == 0 Then
		hiz8 = Old
	Else
		hiz8 = New
	End If
End Sub

Sub EditTextDakika8_TextChanged (Old As String, New As String)
	If EditTextDakika8.Text.Length == 0 Then
		dakika8 = Old
	Else
		dakika8 = New
	End If
End Sub

Sub EditTextSaniye8_TextChanged (Old As String, New As String)
	If EditTextSaniye8.Text.Length == 0 Then
		saniye8 = Old
	Else
		saniye8 = New
	End If
End Sub

Sub EditTextKoniMesafesi9_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi9.Text.Length == 0 Then
		koniMesafesi9 = Old
	Else
		koniMesafesi9 = New
	End If
End Sub

Sub EditTextHiz9_TextChanged (Old As String, New As String)
	If EditTextHiz9.Text.Length == 0 Then
		hiz9 = Old
	Else
		hiz9 = New
	End If
End Sub

Sub EditTextDakika9_TextChanged (Old As String, New As String)
	If EditTextDakika9.Text.Length == 0 Then
		dakika9 = Old
	Else
		dakika9 = New
	End If
End Sub

Sub EditTextSaniye9_TextChanged (Old As String, New As String)
	If EditTextSaniye9.Text.Length == 0 Then
		saniye9 = Old
	Else
		saniye9 = New
	End If
End Sub

Sub EditTextKoniMesafesi10_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi10.Text.Length == 0 Then
		koniMesafesi10 = Old
	Else
		koniMesafesi10 = New
	End If
End Sub

Sub EditTextHiz10_TextChanged (Old As String, New As String)
	If EditTextHiz10.Text.Length == 0 Then
		hiz10 = Old
	Else
		hiz10 = New
	End If
End Sub

Sub EditTextDakika10_TextChanged (Old As String, New As String)
	If EditTextDakika10.Text.Length == 0 Then
		dakika10 = Old
	Else
		dakika10 = New
	End If
End Sub

Sub EditTextSaniye10_TextChanged (Old As String, New As String)
	If EditTextSaniye10.Text.Length == 0 Then
		saniye10 = Old
	Else
		saniye10 = New
	End If
End Sub
										
Sub EditTextKoniMesafesi11_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi11.Text.Length == 0 Then
		koniMesafesi11 = Old
	Else
		koniMesafesi11 = New
	End If
End Sub

Sub EditTextHiz11_TextChanged (Old As String, New As String)
	If EditTextHiz11.Text.Length == 0 Then
		hiz11 = Old
	Else
		hiz11 = New
	End If
End Sub

Sub EditTextDakika11_TextChanged (Old As String, New As String)
	If EditTextDakika11.Text.Length == 0 Then
		dakika11 = Old
	Else
		dakika11 = New
	End If
End Sub

Sub EditTextSaniye11_TextChanged (Old As String, New As String)
	If EditTextSaniye11.Text.Length == 0 Then
		saniye11 = Old
	Else
		saniye11 = New
	End If
End Sub

Sub EditTextKoniMesafesi12_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi12.Text.Length == 0 Then
		koniMesafesi12 = Old
	Else
		koniMesafesi12 = New
	End If
End Sub

Sub EditTextHiz12_TextChanged (Old As String, New As String)
	If EditTextHiz12.Text.Length == 0 Then
		hiz12 = Old
	Else
		hiz12 = New
	End If
End Sub

Sub EditTextDakika12_TextChanged (Old As String, New As String)
	If EditTextDakika12.Text.Length == 0 Then
		dakika12 = Old
	Else
		dakika12 = New
	End If
End Sub

Sub EditTextSaniye12_TextChanged (Old As String, New As String)
	If EditTextSaniye12.Text.Length == 0 Then
		saniye12 = Old
	Else
		saniye12 = New
	End If
End Sub
														
Sub EditTextKoniMesafesi13_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi13.Text.Length == 0 Then
		koniMesafesi13 = Old
	Else
		koniMesafesi13 = New
	End If
End Sub

Sub EditTextHiz13_TextChanged (Old As String, New As String)
	If EditTextHiz13.Text.Length == 0 Then
		hiz13 = Old
	Else
		hiz13 = New
	End If
End Sub

Sub EditTextDakika13_TextChanged (Old As String, New As String)
	If EditTextDakika13.Text.Length == 0 Then
		dakika13 = Old
	Else
		dakika13 = New
	End If
End Sub

Sub EditTextSaniye13_TextChanged (Old As String, New As String)
	If EditTextSaniye13.Text.Length == 0 Then
		saniye13 = Old
	Else
		saniye13 = New
	End If
End Sub
														
Sub EditTextKoniMesafesi14_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi14.Text.Length == 0 Then
		koniMesafesi14 = Old
	Else
		koniMesafesi14 = New
	End If
End Sub

Sub EditTextHiz14_TextChanged (Old As String, New As String)
	If EditTextHiz14.Text.Length == 0 Then
		hiz14 = Old
	Else
		hiz14 = New
	End If
End Sub

Sub EditTextDakika14_TextChanged (Old As String, New As String)
	If EditTextDakika14.Text.Length == 0 Then
		dakika14 = Old
	Else
		dakika14 = New
	End If
End Sub

Sub EditTextSaniye14_TextChanged (Old As String, New As String)
	If EditTextSaniye14.Text.Length == 0 Then
		saniye14 = Old
	Else
		saniye14 = New
	End If
End Sub

Sub EditTextKoniMesafesi15_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi15.Text.Length == 0 Then
		koniMesafesi15 = Old
	Else
		koniMesafesi15 = New
	End If
End Sub

Sub EditTextHiz15_TextChanged (Old As String, New As String)
	If EditTextHiz15.Text.Length == 0 Then
		hiz15 = Old
	Else
		hiz15 = New
	End If
End Sub

Sub EditTextDakika15_TextChanged (Old As String, New As String)
	If EditTextDakika15.Text.Length == 0 Then
		dakika15 = Old
	Else
		dakika15 = New
	End If
End Sub

Sub EditTextSaniye15_TextChanged (Old As String, New As String)
	If EditTextSaniye15.Text.Length == 0 Then
		saniye15 = Old
	Else
		saniye15 = New
	End If
End Sub
																	
Sub EditTextKoniMesafesi16_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi16.Text.Length == 0 Then
		koniMesafesi16 = Old
	Else
		koniMesafesi16 = New
	End If
End Sub

Sub EditTextHiz16_TextChanged (Old As String, New As String)
	If EditTextHiz16.Text.Length == 0 Then
		hiz16 = Old
	Else
		hiz16 = New
	End If
End Sub

Sub EditTextDakika16_TextChanged (Old As String, New As String)
	If EditTextDakika16.Text.Length == 0 Then
		dakika16 = Old
	Else
		dakika16 = New
	End If
End Sub

Sub EditTextSaniye16_TextChanged (Old As String, New As String)
	If EditTextSaniye16.Text.Length == 0 Then
		saniye16 = Old
	Else
		saniye16 = New
	End If
End Sub
																		
Sub EditTextKoniMesafesi17_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi17.Text.Length == 0 Then
		koniMesafesi17 = Old
	Else
		koniMesafesi17 = New
	End If
End Sub

Sub EditTextHiz17_TextChanged (Old As String, New As String)
	If EditTextHiz17.Text.Length == 0 Then
		hiz17 = Old
	Else
		hiz17 = New
	End If
End Sub

Sub EditTextDakika17_TextChanged (Old As String, New As String)
	If EditTextDakika17.Text.Length == 0 Then
		dakika17 = Old
	Else
		dakika17 = New
	End If
End Sub

Sub EditTextSaniye17_TextChanged (Old As String, New As String)
	If EditTextSaniye17.Text.Length == 0 Then
		saniye17 = Old
	Else
		saniye17 = New
	End If
End Sub
																			
Sub EditTextKoniMesafesi18_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi18.Text.Length == 0 Then
		koniMesafesi18 = Old
	Else
		koniMesafesi18 = New
	End If
End Sub

Sub EditTextHiz18_TextChanged (Old As String, New As String)
	If EditTextHiz18.Text.Length == 0 Then
		hiz18 = Old
	Else
		hiz18 = New
	End If
End Sub

Sub EditTextDakika18_TextChanged (Old As String, New As String)
	If EditTextDakika18.Text.Length == 0 Then
		dakika18 = Old
	Else
		dakika18 = New
	End If
End Sub

Sub EditTextSaniye18_TextChanged (Old As String, New As String)
	If EditTextSaniye18.Text.Length == 0 Then
		saniye18 = Old
	Else
		saniye18 = New
	End If
End Sub
																				
Sub EditTextKoniMesafesi19_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi19.Text.Length == 0 Then
		koniMesafesi19 = Old
	Else
		koniMesafesi19 = New
	End If
End Sub

Sub EditTextHiz19_TextChanged (Old As String, New As String)
	If EditTextHiz19.Text.Length == 0 Then
		hiz19 = Old
	Else
		hiz19 = New
	End If
End Sub

Sub EditTextDakika19_TextChanged (Old As String, New As String)
	If EditTextDakika19.Text.Length == 0 Then
		dakika19 = Old
	Else
		dakika19 = New
	End If
End Sub

Sub EditTextSaniye19_TextChanged (Old As String, New As String)
	If EditTextSaniye19.Text.Length == 0 Then
		saniye19 = Old
	Else
		saniye19 = New
	End If
End Sub
																					
Sub EditTextKoniMesafesi20_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi20.Text.Length == 0 Then
		koniMesafesi20 = Old
	Else
		koniMesafesi20 = New
	End If
End Sub

Sub EditTextHiz20_TextChanged (Old As String, New As String)
	If EditTextHiz20.Text.Length == 0 Then
		hiz20 = Old
	Else
		hiz20 = New
	End If
End Sub

Sub EditTextDakika20_TextChanged (Old As String, New As String)
	If EditTextDakika20.Text.Length == 0 Then
		dakika20 = Old
	Else
		dakika20 = New
	End If
End Sub

Sub EditTextSaniye20_TextChanged (Old As String, New As String)
	If EditTextSaniye20.Text.Length == 0 Then
		saniye20 = Old
	Else
		saniye20 = New
	End If
End Sub

Sub EditTextKoniMesafesi21_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi21.Text.Length == 0 Then
		koniMesafesi21 = Old
	Else
		koniMesafesi21 = New
	End If
End Sub

Sub EditTextHiz21_TextChanged (Old As String, New As String)
	If EditTextHiz21.Text.Length == 0 Then
		hiz21 = Old
	Else
		hiz21 = New
	End If
End Sub

Sub EditTextDakika21_TextChanged (Old As String, New As String)
	If EditTextDakika21.Text.Length == 0 Then
		dakika21 = Old
	Else
		dakika21 = New
	End If
End Sub

Sub EditTextSaniye21_TextChanged (Old As String, New As String)
	If EditTextSaniye21.Text.Length == 0 Then
		saniye21 = Old
	Else
		saniye21 = New
	End If
End Sub
																							
Sub EditTextKoniMesafesi22_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi22.Text.Length == 0 Then
		koniMesafesi22 = Old
	Else
		koniMesafesi22 = New
	End If
End Sub

Sub EditTextHiz22_TextChanged (Old As String, New As String)
	If EditTextHiz22.Text.Length == 0 Then
		hiz22 = Old
	Else
		hiz22 = New
	End If
End Sub

Sub EditTextDakika22_TextChanged (Old As String, New As String)
	If EditTextDakika22.Text.Length == 0 Then
		dakika22 = Old
	Else
		dakika22 = New
	End If
End Sub

Sub EditTextSaniye22_TextChanged (Old As String, New As String)
	If EditTextSaniye22.Text.Length == 0 Then
		saniye22 = Old
	Else
		saniye22 = New
	End If
End Sub		
																				
Sub EditTextSaniye23_TextChanged (Old As String, New As String)
	If EditTextSaniye23.Text.Length == 0 Then
		saniye23 = Old
	Else
		saniye23 = New
	End If
End Sub

Sub EditTextDakika23_TextChanged (Old As String, New As String)
	If EditTextDakika23.Text.Length == 0 Then
		dakika23 = Old
	Else
		dakika23 = New
	End If
End Sub

Sub EditTextHiz23_TextChanged (Old As String, New As String)
	If EditTextHiz23.Text.Length == 0 Then
		hiz23 = Old
	Else
		hiz23 = New
	End If
End Sub

Sub EditTextKoniMesafesi23_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi23.Text.Length == 0 Then
		koniMesafesi23 = Old
	Else
		koniMesafesi23 = New
	End If
End Sub
																									
Sub EditTextKoniMesafesi24_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi24.Text.Length == 0 Then
		koniMesafesi24 = Old
	Else
		koniMesafesi24 = New
	End If
End Sub

Sub EditTextHiz24_TextChanged (Old As String, New As String)
	If EditTextHiz24.Text.Length == 0 Then
		hiz24 = Old
	Else
		hiz24 = New
	End If
End Sub

Sub EditTextDakika24_TextChanged (Old As String, New As String)
	If EditTextDakika24.Text.Length == 0 Then
		dakika24 = Old
	Else
		dakika24 = New
	End If
End Sub

Sub EditTextSaniye24_TextChanged (Old As String, New As String)
	If EditTextSaniye24.Text.Length == 0 Then
		saniye24 = Old
	Else
		saniye24 = New
	End If
End Sub

Sub EditTextSaniye25_TextChanged (Old As String, New As String)
	If EditTextSaniye25.Text.Length == 0 Then
		saniye25 = Old
	Else
		saniye25 = New
	End If
End Sub

Sub EditTextDakika25_TextChanged (Old As String, New As String)
	If EditTextDakika25.Text.Length == 0 Then
		dakika25 = Old
	Else
		dakika25 = New
	End If
End Sub

Sub EditTextHiz25_TextChanged (Old As String, New As String)
	If EditTextHiz25.Text.Length == 0 Then
		hiz25 = Old
	Else
		hiz25 = New
	End If
End Sub

Sub EditTextKoniMesafesi25_TextChanged (Old As String, New As String)
	If EditTextKoniMesafesi25.Text.Length == 0 Then
		koniMesafesi25 = Old
	Else
		koniMesafesi25 = New
	End If
End Sub

#end region