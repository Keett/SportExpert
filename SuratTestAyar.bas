B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\SuratTest
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
	Dim secilenMode As String = "Lap Mode" 
	Dim gate As Int = 0
	Dim set As Int = 0
	Dim result As Int
	
	Dim degerDakika As Int
	Dim degerSaniye As Int
	
	Dim restDegerBul As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private LabelMode As Label
	Private SpinnerMode As Spinner
	Private LabelGate As Label
	Private LabelSet As Label
	Private ButtonOK As Button
	Private SpinnerGate As Spinner
	Private SpinnerSet As Spinner
	Private LabelDakika As Label
	Private LabelSaniye As Label
	Private EditTextDakika As EditText
	Private EditTextSaniye As EditText

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SuratTestAyarPage")
	
#region görüntü ayarları
	SpinnerMode.DropdownBackgroundColor = Colors.White
	SpinnerMode.DropdownTextColor = Color.koyuMavi
	SpinnerMode.TextColor= Colors.White
	SpinnerMode.TextSize = 20
	
	SpinnerGate.DropdownBackgroundColor= Colors.White
	SpinnerGate.DropdownTextColor= Color.koyuMavi
	SpinnerGate.TextColor= Colors.White
	SpinnerGate.TextSize = 20
	
	SpinnerSet.DropdownBackgroundColor= Colors.White
	SpinnerSet.DropdownTextColor= Color.koyuMavi
	SpinnerSet.TextColor= Colors.White
	SpinnerSet.TextSize = 20
	
	LabelMode.TextColor = Colors.White
	LabelMode.TextSize = 20
	LabelMode.Typeface = Typeface.DEFAULT_BOLD
	
	LabelGate.TextColor = Colors.White
	LabelGate.TextSize = 20
	LabelGate.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSet.TextColor = Colors.White
	LabelSet.TextSize = 20
	LabelSet.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDakika.TextColor = Colors.White
	LabelDakika.TextSize = 20
	LabelDakika.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaniye.TextColor = Colors.White
	LabelSaniye.TextSize = 20
	LabelSaniye.Typeface = Typeface.DEFAULT_BOLD
	
	EditTextDakika.TextSize = 20
	EditTextDakika.TextColor = Colors.White
	EditTextDakika.Typeface = Typeface.DEFAULT
	EditTextDakika.Text = 0
	
	EditTextSaniye.TextSize = 20
	EditTextSaniye.TextColor = Colors.White
	EditTextSaniye.Typeface = Typeface.DEFAULT
	EditTextSaniye.Text = 5
	
#end region 
	
	SpinnerMode.AddAll(Array As String("Lap Mode","Split Mode", "Rest Mode"))
	SpinnerGate.AddAll(Array As Int(0,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20))
	
	SpinnerSet.Visible = False
	LabelSet.Visible = False
	set = 1
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub SpinnerMode_ItemClick (Position As Int, Value As Object)
	secilenMode = Value
	If secilenMode = "Rest Mode" Then
		SpinnerSet.Visible = True
		LabelSet.Visible = True
	Else
		SpinnerSet.Visible = False
		LabelSet.Visible = False
		set = 1
	End If
End Sub

Sub ButtonOK_Click
	If gate == 0 Then
		Msgbox("Gate Sayısı boş bırakılamaz","Bildirim Mesajı")
		Return
	End If
	If set == 0 Then
		Msgbox("Set sayısı boş bırakılamaz","Bildirim Mesajı")
		Return
	End If
	If set <> 0 And gate <> 0 Then
		result = set * (gate -1)
		Log("result :" &result)
		restDegerBul = result/set
		Log("restDeger Bul:" &restDegerBul)
		
		If EditTextDakika.Text > 59 Then
			ToastMessageShow("Dakika değerini en fazla 59 yapınız",True)
			Return
		Else
			Log("burada")
			degerDakika = EditTextDakika.Text
			degerSaniye = EditTextSaniye.Text
		End If

		StartActivity(SuratTestEkle)
		Activity.Finish
	End If
End Sub

Sub SpinnerGate_ItemClick (Position As Int, Value As Object)
	gate = Value
	If gate == 0 Then
		ToastMessageShow("Varsayılan gate sayısı 2 olarak ayarlandı", True)
		gate = 2
	End If
	
#region SpinnerSet Filtresi
	If gate== 20 Or gate==19 Or gate==18 Then
		Dim setDizi(6) As Int
		For i=1 To 5
			setDizi(i) = i
		Next
	Else If gate== 16 Or gate ==17 Then
		Dim setDizi(7) As Int
		For i=1 To 6
			setDizi(i) = i
		Next
	Else if gate== 14 Or gate== 15 Then
		Dim setDizi(8) As Int
		For i=1 To 7
			setDizi(i) = i
		Next
	Else if gate == 13 Then
		Dim setDizi(9) As Int
		For i=1 To 8
			setDizi(i) = i
		Next
	Else if gate == 12 Then
		Dim setDizi(10) As Int
		For i=1 To 9
			setDizi(i) = i
		Next
	else if gate== 11 Then
		Dim setDizi(11) As Int
		For i=1 To 10
			setDizi(i) = i
		Next
	Else if gate==10 Then
		Dim setDizi(12) As Int
		For i=1 To 11
			setDizi(i) = i
		Next
	Else If gate== 9 Then
		Dim setDizi(13) As Int
		For i=1 To 12
			setDizi(i) = i
		Next
	Else if gate == 8 Then
		Dim setDizi(15) As Int
		For i=1 To 14
			setDizi(i) = i
		Next
	Else if gate == 7 Then
		Dim setDizi(17) As Int
		For i=1 To 16
			setDizi(i) = i
		Next
	Else if gate == 6 Then
		Dim setDizi(21) As Int
		For i=1 To 20
			setDizi(i) = i
		Next
	Else if gate== 5 Then
		Dim setDizi(26) As Int
		For i=1 To 25
			setDizi(i) = i
		Next
	Else If gate==4 Then
		Dim setDizi(34) As Int
		For i=1 To 33
			setDizi(i) = i
		Next
	Else if gate==3 Then
		Dim setDizi(51) As Int
		For i=1 To 50
			setDizi(i) = i
		Next
	Else if gate == 2 Then
		Dim setDizi(101) As Int
		For i=1 To 100
			setDizi(i) = i
		Next
	Else
		ToastMessageShow("gate seçilmedi",True)
	End If
#end region 

	SpinnerSet.Clear
	SpinnerSet.AddAll(setDizi)
End Sub

Sub SpinnerSet_ItemClick (Position As Int, Value As Object)
	set = Value
End Sub
