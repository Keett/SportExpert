B4A=true
Group=SportExpertProjeDosyası\Test\AntropometrikOzellikler
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

	Private ButtonOk As Button
	Private EditTextAntropometrikBoy As EditText
	Private EditTextAntropometrikKilo As EditText
	Private EditTextElUzunlugu As EditText
	Private EditTextKulacUzunlugu As EditText
	Private EditTextOturmaYuksekligi As EditText
	Private EditTextAyakUzunlugu As EditText
	Private EditText5DeriKivrimKalinligi As EditText
	Private WebView1 As WebView
	Private LabelAntropometrikBoy As Label
	Private LabelAntropometrikKilo As Label
	Private LabelElUzunlugu As Label
	Private LabelKulacUzunlugu As Label
	Private LabelOturmaYuksekligi As Label
	Private LabelAyakUzunlugu As Label
	Private LabelDeriKivrimKalinligi As Label
	
	Dim AntropometrikID As Int
	Dim rs As ResultSet
	Dim secilenTarih As String
	Dim secilenSaat As String
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AntropometrikEklePage")
	
	#region görüntü ayarı
	
	LabelAntropometrikBoy.TextColor = Colors.White
	LabelAntropometrikBoy.TextSize = 20
	LabelAntropometrikBoy.Typeface = Typeface.DEFAULT_BOLD
	
	LabelAntropometrikKilo.TextColor = Colors.White
	LabelAntropometrikKilo.TextSize = 20
	LabelAntropometrikKilo.Typeface = Typeface.DEFAULT_BOLD
	
	LabelElUzunlugu.TextColor = Colors.White
	LabelElUzunlugu.TextSize = 20
	LabelElUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	
	LabelKulacUzunlugu.TextColor = Colors.White
	LabelKulacUzunlugu.TextSize = 20
	LabelKulacUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	
	LabelOturmaYuksekligi.TextColor = Colors.White
	LabelOturmaYuksekligi.TextSize = 20
	LabelOturmaYuksekligi.Typeface = Typeface.DEFAULT_BOLD
	
	LabelAyakUzunlugu.TextColor = Colors.White
	LabelAyakUzunlugu.TextSize = 20
	LabelAyakUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	
	LabelDeriKivrimKalinligi.TextColor = Colors.White
	LabelDeriKivrimKalinligi.TextSize = 20
	LabelDeriKivrimKalinligi.Typeface = Typeface.DEFAULT_BOLD
	
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	
	EditTextAntropometrikBoy.TextColor = Colors.White
	EditTextAntropometrikBoy.Hint = "Boy değerini cm cinsinden giriniz.."
	EditTextAntropometrikBoy.HintColor = Color.hintColor
	EditTextAntropometrikBoy.TextSize = 20
	EditTextAntropometrikBoy.Typeface = Typeface.DEFAULT
		
	EditTextAntropometrikKilo.TextColor = Colors.White
	EditTextAntropometrikKilo.Hint = "Kilo değerini giriniz.."
	EditTextAntropometrikKilo.HintColor = Color.hintColor
	EditTextAntropometrikKilo.TextSize = 20
	EditTextAntropometrikKilo.Typeface = Typeface.DEFAULT
	
	EditTextElUzunlugu.TextColor = Colors.White
	EditTextElUzunlugu.Hint = "El uzunluk değerini cm cinsinden giriniz.."
	EditTextElUzunlugu.HintColor = Color.hintColor
	EditTextElUzunlugu.TextSize = 20
	EditTextElUzunlugu.Typeface = Typeface.DEFAULT
	
	EditTextKulacUzunlugu.TextColor = Colors.White
	EditTextKulacUzunlugu.Hint = "Kulaç uzunluk değerini cm cinsinden giriniz.."
	EditTextKulacUzunlugu.HintColor = Color.hintColor
	EditTextKulacUzunlugu.TextSize = 20
	EditTextKulacUzunlugu.Typeface = Typeface.DEFAULT
	
	EditTextOturmaYuksekligi.TextColor = Colors.White
	EditTextOturmaYuksekligi.Hint = "Oturma yükseklik değerini cm cinsinden giriniz.."
	EditTextOturmaYuksekligi.HintColor = Color.hintColor
	EditTextOturmaYuksekligi.TextSize = 20
	EditTextOturmaYuksekligi.Typeface = Typeface.DEFAULT

	EditTextAyakUzunlugu.TextColor = Colors.White
	EditTextAyakUzunlugu.Hint = "Ayak uzunluk değerini cm cinsinden giriniz.."
	EditTextAyakUzunlugu.HintColor = Color.hintColor
	EditTextAyakUzunlugu.TextSize = 20
	EditTextAyakUzunlugu.Typeface = Typeface.DEFAULT

	EditText5DeriKivrimKalinligi.TextColor = Colors.White
	EditText5DeriKivrimKalinligi.Hint = "Deri kıvrım kalınlık değerini cm cinsinden giriniz.."
	EditText5DeriKivrimKalinligi.HintColor = Color.hintColor
	EditText5DeriKivrimKalinligi.TextSize = 20
	EditText5DeriKivrimKalinligi.Typeface = Typeface.DEFAULT
	
	#end region
	
	HTMLGosterDB
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'seçilen deneğin özelliklerinin verildiği tablo
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_id As [ID], denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&TestDenekAra.secilenDenek&"' ",Null,-1,False)) 'true olursa tıklanabilir olur
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM Antropometrik ORDER BY antropometrik_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		AntropometrikID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("antropometrik_id"),3))+1),3)
	Else
		AntropometrikID="001"
	End If
	rs.Close
End Sub

Sub ButtonOk_Click
	Dim result As Int
	result = Msgbox2("Antropometrik analiz verilerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		Log(DateTime.Date(now))
		secilenTarih = DateTime.Date(now)
		Log(DateTime.Time(now))
		secilenSaat = DateTime.Time(now)
		ID
'	Main.sql.ExecNonQuery2("INSERT INTO Antropometrik VALUES(?,?,?,?,?,?,?,?,?,?)", Array As Object (AntropometrikID,("SELECT denek_id FROM Denek WHERE denek_id = '"&TestDenekAra.secilenDenek&"' "),EditTextAntropometrikTarih.Text, EditTextAntropometrikBoy.Text, EditTextAntropometrikKilo.Text, EditTextElUzunlugu.Text, EditTextKulacUzunlugu.Text, EditTextOturmaYuksekligi.Text, EditTextAyakUzunlugu.Text, EditText5DeriKivrimKalinligi.Text))
		Main.sql.ExecNonQuery2("INSERT INTO Antropometrik VALUES(?,?,?,?,?,?,?,?,?,?,?)", Array As Object (AntropometrikID,TestDenekAra.secilenDenek,secilenTarih,secilenSaat,EditTextAntropometrikBoy.Text, EditTextAntropometrikKilo.Text, EditTextElUzunlugu.Text, EditTextKulacUzunlugu.Text, EditTextOturmaYuksekligi.Text, EditTextAyakUzunlugu.Text, EditText5DeriKivrimKalinligi.Text))
		Log("ANTROPOMETRİK VERİLER EKLENDİ")
		StartActivity(AntropometrikListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
End Sub

#region NOT TARİH - SAAT

'TARİH SEÇİMİ YAPMAK İÇİN
'	Dim Dd As DateDialog
'	'Dd.ShowCalendar = False
'	Dd.Year = DateTime.GetYear(DateTime.Now)
'	Dd.Month = DateTime.GetMonth(DateTime.Now)
'	Dd.DayOfMonth = DateTime.GetDayOfMonth(DateTime.Now)
'	Dd.Show("Set the required date", "B4A Date Dialog", "Yes", "No", "Maybe", Null)
'	ToastMessageShow(Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year , False)
'	secilenTarih = Dd.DayOfMonth & "/" & Dd.Month & "/" & Dd.Year
'	ButtonAtropometrikTarih.Text = secilenTarih

'SAAT SEÇİMİ YAPMAK İÇİN
'	Dim result As Int
'	result = Msgbox2("Saat ayarı yapmak için lütfen ekranı döndürünüz..", "Onay Mesajı", "Anladım", "", "",Null)
'	If result= DialogResponse.POSITIVE Then
'		Dim td As TimeDialog
'		td.TimeTicks = DateTime.Now
'		td.Is24Hours = True
'		td.Hour= DateTime.GetHour(DateTime.Now)
'		td.Minute =DateTime.GetMinute(DateTime.Now)
'		td.Show("cgxf", "Select time", "Yes", "No", "", Null)
'		ToastMessageShow(td.Hour & ":" & td.Minute , False)
'		secilenSaat = td.Hour & ":" & td.Minute
'		ButtonAntropometrikSaat.Text = secilenSaat
'	End If

#end region	
