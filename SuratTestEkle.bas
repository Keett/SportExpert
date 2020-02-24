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
	Dim secilenTarih As String
	Dim secilenSaat As String
	
	Type PeriodWithMs (p As Period, ms As Int)
	Dim Chronometer As Timer
	Dim pm As PeriodWithMs

	Dim timer As Timer
	Dim hedefZaman As Long
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private ListView1 As ListView
	Private LabelDenekIsim As Label
	Private ImageView1 As ImageView
	
	Private LabelTimer As Label
	Private LabelChronometer As Label
	
	Private LabelSetSayisi As Label
	Private LabelGateSayisi As Label
	Private LabelTestIsim As Label
	Private LabelDate As Label
	Private LabelModIsim As Label

	Private ButtonLap As Button
	Private ButtonReset As Button
	Private ButtonBaslamaSuresi As Button
	Private ButtonAyarlar As Button
	Private ButtonOK As Button

	Dim StartTime As Long
	Dim i As Int = 1
	Dim dizi(101) As String
	Dim SuratTestID As Int
	Dim rs As ResultSet
	
	Private LabelTımeDegerleri As Label
	Private LabelResult As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SuratTestEklePage")
	ReadBlob
	
	ButtonOK.Visible = False
	ButtonOK.Enabled = False
	
	ButtonBaslamaSuresi.Tag = "SureBasla"  ' ------------ tag = "SureBasla"   &  tag = "SureBitir"
	
#region görüntü ayarları	
	ListView1.SingleLineLayout.Label.TextColor = Color.koyuMavi
	ListView1.SingleLineLayout.Label.TextSize = 20
	SetDivider(ListView1,Color.acikMavi,3dip)
	
	LabelDenekIsim.Text = TestDenekAra.denekIsim
	LabelDenekIsim.TextSize = 20
	LabelDenekIsim.TextColor = Colors.White
	LabelDenekIsim.Typeface = Typeface.DEFAULT
	
	LabelGateSayisi.Text = $" Bağlı Kapı Sayısı: ${SuratTestAyar.gate}"$
	LabelGateSayisi.TextSize = 20
	LabelGateSayisi.TextColor = Colors.White
	LabelGateSayisi.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSetSayisi.Text = $" Set Sayısı: ${SuratTestAyar.set}"$
	LabelSetSayisi.TextSize = 20
	LabelSetSayisi.TextColor = Colors.White
	LabelSetSayisi.Typeface = Typeface.DEFAULT_BOLD
	
	LabelTestIsim.Text = MotorOzellikMenu.motorOzellikTestAdi
	LabelTestIsim.TextSize = 20
	LabelTestIsim.TextColor = Colors.White
	LabelTestIsim.Typeface = Typeface.DEFAULT_BOLD
	
	LabelModIsim.Text = $"Seçili Mod: ${SuratTestAyar.secilenMode}"$
	LabelModIsim.TextSize = 20
	LabelModIsim.TextColor = Colors.White
	LabelModIsim.Typeface = Typeface.DEFAULT_BOLD
	
	LabelResult.Text = $"#Max. Result = ${SuratTestAyar.result}"$
	LabelResult.TextSize = 20
	LabelResult.TextColor = Colors.White
	LabelResult.Typeface = Typeface.DEFAULT_BOLD
	
	LabelTımeDegerleri.Text = $"TIME DEĞERLERİ"$
	LabelTımeDegerleri.TextSize = 20
	LabelTımeDegerleri.TextColor = Colors.White
	LabelTımeDegerleri.Typeface = Typeface.DEFAULT_BOLD
	
	Dim now As Long = DateTime.Now
	DateTime.DateFormat = "dd/MM/yyyy"
	secilenTarih = DateTime.Date(now)
	secilenSaat = DateTime.Time(now)
	
	LabelDate.Text = $"Tarih: ${secilenTarih}
Zaman: ${secilenSaat}"$
	LabelDate.TextSize = 20
	LabelDate.TextColor = Colors.White
	LabelDate.Typeface = Typeface.DEFAULT_BOLD
#end region

	Chronometer.Initialize("Chronometer",10)
	StartTime = DateTime.Now
	timer.Initialize("timer", 1000)

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

#Region TIMER İÇİN
Sub StartTimer(minute As Int, second As Int)
	hedefZaman = DateTime.Now + minute * DateTime.TicksPerMinute + second * DateTime.TicksPerSecond
	timer.Enabled = True
End Sub

Sub timer_Tick
	Dim t As Long = Max(0, hedefZaman - DateTime.Now)
	Dim minutes, seconds As Int
	minutes = (t Mod DateTime.TicksPerHour) / DateTime.TicksPerMinute
	seconds = (t Mod DateTime.TicksPerMinute) / DateTime.TicksPerSecond
	LabelTimer.Text = $" $1.0{minutes} : $1.0{seconds} "$
	
	If t=0 Then
'		StartService(SesService)			-------------------------------------------------------SES DOSYASININ ÇALMASI İÇİN YORUMU KALDIR
		ToastMessageShow("Dinleniş sona erdi",True)
		timer.Enabled = False
		LabelChronometer.Visible = True
		LabelTimer.Visible = False
	End If
End Sub
#End Region

#Region Chronometer İÇİN
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

#End Region

Sub ReadBlob
	Try
		Dim inputStream As InputStream
		Dim bmp As Bitmap
		inputStream.InitializeFromBytesArray(TestDenekAra.denekImage, 0, TestDenekAra.denekImage.Length)
		bmp.Initialize2(inputStream)
		inputStream.Close
		ImageView1.SetBackgroundImage(bmp)
		Log("try")
	Catch
		ImageView1.Bitmap = LoadBitmap(File.DirAssets, "FotoKisi.png")
		Log("catch")
	End Try
End Sub

Sub Start
	'	If i Mod SuratTestAyar.restDegerBul == 0 Then
'		Log("burada")
'		DinlenmeCikisSureYakalama
'	End If
	ButtonReset_Click
	LabelChronometer.Visible = True
	Chronometer.Enabled = True
	LabelTimer.Visible = False
	
	ButtonReset.Enabled = True
	ButtonLap.Enabled = True
End Sub

Sub Pause
	'ButtonReset_Click
	Chronometer.Enabled = False
	ButtonReset.Visible = False
	timer.Enabled = True
End Sub

Sub DinlenmeCikisSureYakalama
	Dim Dinlenme As String = LabelTimer.Text
	ListView1.AddSingleLine($"Dinlenme Süresi:             =>>            ${Dinlenme}"$)
End Sub

Sub ButtonLap_Click
	If i < SuratTestAyar.result  Then
		If SuratTestAyar.secilenMode = "Lap Mode" Then
			Dim LapDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Lap Deger : ${i}                 =>>            ${LapDeger}"$)
			dizi(i) = LapDeger
		Else If SuratTestAyar.secilenMode = "Split Mode" Then
			Dim splitDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Split Deger : ${i}               =>>            ${splitDeger}"$)
			dizi(i) = splitDeger
			ButtonReset_Click
		Else If SuratTestAyar.secilenMode = "Rest Mode" Then
			Dim restDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Rest Deger : ${i}                =>>            ${restDeger}"$)
			dizi(i) = restDeger
		 	If i Mod SuratTestAyar.restDegerBul == 0 Then
				Pause
				ButtonBaslamaSuresi_Click
			End If
		End If
	Else if i == SuratTestAyar.result Then
		If SuratTestAyar.secilenMode = "Lap Mode" Then
			Dim LapDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Lap Deger : ${i}                 =>>            ${LapDeger}"$)
			dizi(i) = LapDeger
		Else If SuratTestAyar.secilenMode = "Split Mode" Then
			Dim splitDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Split Deger : ${i}               =>>            ${splitDeger}"$)
			dizi(i) = splitDeger
		Else If SuratTestAyar.secilenMode = "Rest Mode" Then
			Dim restDeger As String = LabelChronometer.Text
			ListView1.AddSingleLine($"Rest Deger : ${i}                =>>            ${restDeger}"$)
			dizi(i) = restDeger
		End If
		Pause
		LabelChronometer.Text = "Test Bitti"	
		ButtonBaslamaSuresi.Enabled = False
		ButtonBaslamaSuresi.Visible = False
		ButtonLap.Enabled = False
		ButtonLap.Visible = False
		ButtonReset.Enabled = False
		ButtonReset.Visible = False
		ButtonOK.Visible = True
		ButtonOK.Enabled = True
	Else
		Pause
		LabelChronometer.Text = "Test Bitti"
	End If
	i=i+1
End Sub

Sub ButtonReset_Click
	StartTime = DateTime.Now
End Sub

Sub ButtonBaslamaSuresi_Click
	If ButtonBaslamaSuresi.Tag = "SureBasla" Then
		ButtonLap.Visible = False
		ButtonReset.Visible = False
		If i == SuratTestAyar.result Then
			Pause
			LabelChronometer.Text = "Test Bitti"
		Else
			LabelChronometer.Visible = False
			LabelTimer.Visible = True
			StartTimer(SuratTestAyar.degerDakika,SuratTestAyar.degerSaniye+2)
		End If

		ButtonBaslamaSuresi.Tag ="SureBitir"
		ButtonBaslamaSuresi.Text = "Çıkış yaptı"

	Else if ButtonBaslamaSuresi.Tag = "SureBitir" Then
		ButtonReset.Visible = True
		ButtonLap.Visible = True
		
			DinlenmeCikisSureYakalama
			LabelTimer.Visible = False
			LabelChronometer.Visible = True
			Start
		ButtonBaslamaSuresi.Tag = "SureBasla"
		ButtonBaslamaSuresi.Text = "Dinleniş süresi başlat"
	End If
	
End Sub

Sub ButtonAyarlar_Click
	Pause
	StartActivity(SuratTestAyar)
	Activity.Finish
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM SuratTest ORDER BY surat_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		SuratTestID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("surat_id"),3))+1),3)
	Else
		SuratTestID="001"
	End If
	rs.Close
	
End Sub

Sub ButtonOK_Click
	Dim result As Int
	result = Msgbox2("Sürat Test verilerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"

		secilenTarih = DateTime.Date(now)
		secilenSaat = DateTime.Time(now)
		ID
		Main.sql.ExecNonQuery2("INSERT INTO SuratTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (SuratTestID,TestDenekAra.secilenDenek,SuratTestAyar.secilenMode,secilenTarih,secilenSaat,SuratTestAyar.degerDakika,SuratTestAyar.degerSaniye, SuratTestAyar.result, SuratTestAyar.gate, SuratTestAyar.set,dizi(1), dizi(2), dizi(3), dizi(4), dizi(5), dizi(6), dizi(7), dizi(8), dizi(9), dizi(10), dizi(11), dizi(12), dizi(13), dizi(14), dizi(15), dizi(16), dizi(17), dizi(18), dizi(19), dizi(20), dizi(21), dizi(22), dizi(23), dizi(24), dizi(25), dizi(26),dizi(27),dizi(28),dizi(29),dizi(30),dizi(31),dizi(32),dizi(33), dizi(34), dizi(35), dizi(36), dizi(37), dizi(38),dizi(39),dizi(40), dizi(41), dizi(42), dizi(43), dizi(44), dizi(45), dizi(46), dizi(47), dizi(48), dizi(49), dizi(50), dizi(51), dizi(52), dizi(53), dizi(54), dizi(55), dizi(56), dizi(57), dizi(58), dizi(59), dizi(60), dizi(61), dizi(62), dizi(63), dizi(64), dizi(65), dizi(66), dizi(67), dizi(68), dizi(69), dizi(70), dizi(71), dizi(72), dizi(73), dizi(74), dizi(75), dizi(76), dizi(77), dizi(78), dizi(79), dizi(80), dizi(81), dizi(82), dizi(83), dizi(84), dizi(85), dizi(86), dizi(87), dizi(88), dizi(89), dizi(90), dizi(91), dizi(92), dizi(93), dizi(94), dizi(95), dizi(96), dizi(97), dizi(98), dizi(99), dizi(100) ))
		Log(" VERİLER EKLENDİ")
		StartActivity(SuratTestListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
End Sub

Sub SetDivider(lv As ListView, Renk As Int, Height As Int)
	Dim r As Reflector
	r.Target = lv
	Dim CD As ColorDrawable
	CD.Initialize(Renk, 0)
	r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
End Sub
