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
	
'	Type PeriodWithMs (p As Period, ms As Int)
	Dim Chronometer As Timer
	Dim pm As PeriodWithMs
	Dim ModeStatus As String
	
	Dim timer As Timer
	Dim hedefZaman As Long
	
	Dim degerDakika As Int
	Dim degerSaniye As Int
	Dim minutes, seconds As Int
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListView1 As ListView
	Private ButtonAyarlar As Button
	Private ButtonStart As Button
	Private ButtonStop As Button
	Private ButtonLap As Button
	Dim StartTime As Long 
	Private ButtonReset As Button
	Private LabelStatus As Label
	Dim i As Int = 1
	Private LabelChronometer As Label
	Private LabelTimer As Label
	Private ButtonOK As Button
	Private EditTextDakika As EditText
	Private EditTextSaniye As EditText
	Private LabelDakika As Label
	Private LabelSaniye As Label
	Private Panel1 As Panel
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SuratTestPage")

	#region listview görüntü ayarı
	ListView1.TwoLinesLayout.Label.TextColor = Colors.black
	ListView1.TwoLinesLayout.Label.TextSize = 25
	ListView1.TwoLinesLayout.SecondLabel.TextColor= Colors.DarkGray
	ListView1.TwoLinesLayout.SecondLabel.TextSize = 20
	SetDivider(ListView1,Colors.Blue,1dip)
	#End region

	Chronometer.Initialize("Chronometer",10)
	StartTime = DateTime.Now
	
	timer.Initialize("timer", 1000)
	Panel1.Visible = False
	
	ModeStatus = SuratTestAyar.secilenMode
	LabelStatus.Text = ModeStatus
	ButtonLap.Text = ModeStatus
	
	If ModeStatus = "Rest Mode" Then
		Panel1.Visible = True
		LabelChronometer.Visible = False
		LabelTimer.Visible = True
		ButtonReset.Visible = False
		
		EditTextDakika.Text = "0"
		EditTextSaniye.Text = "0"
	Else if ModeStatus = "Lap Mode" Or ModeStatus = "Split Mode" Then
		Panel1.Visible = False
		LabelChronometer.Visible = True
		LabelTimer.Visible = False
	Else
		Log(LastException)
	End If
	
End Sub

Sub StartTimer(minute As Int, second As Int)
	hedefZaman = DateTime.Now + minute * DateTime.TicksPerMinute + second* DateTime.TicksPerSecond
	timer.Enabled = True
End Sub

Sub SetDivider(lv As ListView, Color As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Color, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub

Sub timer_Tick
	Dim t As Long = Max(0, hedefZaman - DateTime.Now)
	Dim minutes, seconds As Int
	minutes = (t Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute
	seconds = (t Mod DateTime.TicksPerMinute) / DateTime.TicksPerSecond
	LabelTimer.Text = $" $1.0{minutes} : $1.0{seconds} "$
	
	If t=0 Then
		ToastMessageShow("Dinleniş sona erdi",True)
		timer.Enabled = False
	End If
End Sub

Sub Chronometer_Tick
	pm = PeriodBetweenWithMilliseconds(StartTime, DateTime.Now)
	LabelChronometer.Text = FN(pm.p.Hours) & ":" & FN(pm.p.Minutes) & ":" & FN(pm.p.Seconds) & "." & _
     NumberFormat(pm.ms, 3, 0)
End Sub

Sub FN(n As Int) As String
	Return NumberFormat(n, 2, 0)
End Sub

Sub PeriodBetweenWithMilliseconds(time1 As Long, time2 As Long) As PeriodWithMs
	Dim p As Period = DateUtils.PeriodBetween(time1, time2)
	Dim ms As Int = (time2 - time1) Mod DateTime.TicksPerSecond
	If ms < 0 Then 
		ms = ms + 1000
	End If
	Dim pm As PeriodWithMs
	pm.p = p
	pm.ms = ms
	Return pm
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub ButtonAyarlar_Click
	ButtonStop_Click
	ButtonReset.Enabled = True
	StartActivity(SuratTestAyar)
	Activity.Finish
End Sub

Sub ButtonStart_Click
	If ModeStatus = "Rest Mode" Then
		StartTimer(degerDakika,degerSaniye+2)
	Else
		ButtonReset.Enabled = True
		Chronometer.Enabled = True
	End If
	ButtonLap.Enabled = True
End Sub

Sub ButtonStop_Click
	If ModeStatus = "Rest Mode" Then
		timer.Enabled = False
	Else
		Chronometer.Enabled = False
		ButtonReset.Enabled = False
	End If
End Sub

Sub ButtonLap_Click
	If i <= SuratTestAyar.result  Then
		If ModeStatus = "Lap Mode" Then
			Dim LapDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Lap Deger : ${i} =>> ${LapDeger}"$)
		Else If ModeStatus = "Split Mode" Then
			Dim splitDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Split Deger : ${i} =>> ${splitDeger}"$)
			ButtonReset_Click
		Else If ModeStatus = "Rest Mode" Then
			Dim restDeger As String = LabelTimer.Text
			ListView1.AddSingleLine($"Rest Deger : ${i}. dinleniş sona erdi =>> ${restDeger}"$)
		Else
			Log(LastException)
		End If
	End If
	i=i+1
End Sub

Sub ButtonReset_Click
	StartTime = DateTime.Now
End Sub

Sub ButtonOK_Click
	degerDakika = EditTextDakika.Text
	degerSaniye = EditTextSaniye.Text
	Panel1.Visible = False
End Sub
