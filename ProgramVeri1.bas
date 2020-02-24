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

	Private CustomListView1 As CustomListView
	Private LabelSeviyeIsmi As Label
	Private LabelKoniMesafesi As Label
	Private EditTextKoniMesafesi As EditText
	Private LabelHiz As Label
	Private EditTextHiz As EditText
	Private LabelDakika As Label
	Private EditTextDakika As EditText
	Private LabelSaniye As Label
	Private EditTextSaniye As EditText
	Private Button1 As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("Ayar1Page")
	
	For i = 1 To ProgramAyar.secilenLevel
		CustomListView1.Add(CreateListItem($"Seviye${i}"$, $"Koni${i}"$,$"Hız${i}"$,CustomListView1.AsView.Width,100dip),$"Value${i}"$)
	Next
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateListItem(lblSeviye As String, lblKoni As String,lblHiz As String, Width As Int, Height As Int) As Panel
	Dim panel As Panel
	panel.Initialize("")
	panel.SetLayout(0,0,Width,Height)
	panel.LoadLayout("veriPage")
	
	LabelSeviyeIsmi.Text = lblSeviye
	LabelKoniMesafesi.Text = lblKoni
	LabelHiz.Text = lblHiz
	LabelDakika.Text = "Dakika"
	LabelSaniye.Text = "Saniye"
	
	Return panel
End Sub

Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	Log(Value)
	Log(Index)

End Sub

Sub Button1_Click
'	Dim Index As Int = CustomListView1.GetItemFromView(Sender)
	Dim deger(3) As String
	For i=0 To CustomListView1.Size -1
		Dim panel As B4XView = CustomListView1.GetPanel(i)
		Dim EdtKoni As B4XView = panel.GetView(2)
		If EdtKoni.Text.Length <> 0  Then
			deger(i) = CustomListView1.GetValue(i)
		End If
		Log(deger)
	Next
	
End Sub

Sub EditTextKoniMesafesi_TextChanged (Old As String, New As String)

End Sub