B4A=true
Group=SportExpertProjeDosyası\Test\AntranorGorusleri
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

	Private WebView1 As WebView
	Private EditTextAntranorGorusleriAciklama As EditText
	Private LabelAntranorGorusleriAciklama As Label
	Private ButtonAntranorGorusleriEkle As Button
	
	Dim AntranorGorusleriID As Int
	Dim rs As ResultSet
	Dim secilenTarih As String
	Dim secilenSaat As String

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AntranorGorusleriEklePage")
	
#region görüntü ayarları
	LabelAntranorGorusleriAciklama.TextColor = Colors.White
	LabelAntranorGorusleriAciklama.TextSize = 20
	LabelAntranorGorusleriAciklama.Typeface = Typeface.DEFAULT_BOLD
	
	WebView1.ZoomEnabled = True
	WebView1.JavaScriptEnabled = True
	
	EditTextAntranorGorusleriAciklama.TextColor = Color.koyuMavi
	EditTextAntranorGorusleriAciklama.Hint = "Antranör görüşlerinizi bu alana yazabilirsiniz.."
	EditTextAntranorGorusleriAciklama.HintColor = Color.acikMavi
	EditTextAntranorGorusleriAciklama.TextSize = 20
	EditTextAntranorGorusleriAciklama.Typeface = Typeface.DEFAULT
	
#end region

	HTMLGosterDB
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'seçilen deneğin özelliklerinin verildiği tablo
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&TestDenekAra.secilenDenek&"'",Null,-1,False)) 'true olursa tıklanabilir olur
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM AntranorGorusleri ORDER BY antranorGorüsleri_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		AntranorGorusleriID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("antranorGorüsleri_id"),3))+1),3)
	Else
		AntranorGorusleriID="001"
	End If
	rs.Close
End Sub

Sub ButtonAntranorGorusleriEkle_Click
	Dim result As Int
	result = Msgbox2("Antranor Görüşlerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		Log(DateTime.Date(now))
		secilenTarih = DateTime.Date(now)
		Log(DateTime.Time(now))
		secilenSaat = DateTime.Time(now)
		ID
		Main.sql.ExecNonQuery2("INSERT INTO AntranorGorusleri VALUES(?,?,?,?,?)", Array As Object (AntranorGorusleriID,TestDenekAra.secilenDenek,secilenTarih,secilenSaat,EditTextAntranorGorusleriAciklama.Text))
		Log("Antranor görüşleri eklendi")
		StartActivity(AntranorGorusListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
End Sub

