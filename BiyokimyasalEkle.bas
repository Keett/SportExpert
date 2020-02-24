B4A=true
Group=SportExpertProjeDosyası\Test\BiyokimyasalAnalizler
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

	Private EditTextBiyokimyasalAciklama As EditText
	Private ButtonBiyokimyasalEkle As Button
	Private WebView1 As WebView
	Private LabelBiyokimyasalAciklama As Label
	
	Dim BiyokimyasalID As Int
	Dim rs As ResultSet
	Dim secilenTarih As String
	Dim secilenSaat As String

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("BiyokimyasalEklePage")
	
#region görüntü ayarı
	EditTextBiyokimyasalAciklama.TextColor = Color.koyuMavi
	EditTextBiyokimyasalAciklama.Hint = "Biyokimyasal analizlerinizi bu alana yazabilirsiniz.."
	EditTextBiyokimyasalAciklama.HintColor = Color.acikMavi
	EditTextBiyokimyasalAciklama.TextSize = 20
	EditTextBiyokimyasalAciklama.Typeface = Typeface.DEFAULT
	
	WebView1.ZoomEnabled = True
	WebView1.JavaScriptEnabled = True
	
	LabelBiyokimyasalAciklama.TextColor = Colors.White
	LabelBiyokimyasalAciklama.TextSize = 20
	LabelBiyokimyasalAciklama.Typeface = Typeface.DEFAULT_BOLD
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
	
	rs= Main.sql.ExecQuery("SELECT * FROM Biyokimyasal ORDER BY biyokimyasal_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		BiyokimyasalID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("biyokimyasal_id"),3))+1),3)
	Else
		BiyokimyasalID="001"
	End If
	rs.Close
End Sub

Sub ButtonBiyokimyasalEkle_Click
	Dim result As Int
	result = Msgbox2("Biyokimyasal analiz verilerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		secilenTarih = DateTime.Date(now)
		secilenSaat = DateTime.Time(now)
		
		ID
		Main.sql.ExecNonQuery2("INSERT INTO Biyokimyasal VALUES(?,?,?,?,?)", Array As Object (BiyokimyasalID,TestDenekAra.secilenDenek,secilenTarih,secilenSaat,EditTextBiyokimyasalAciklama.Text))
		Log("BİYOKİMYASAL VERİLER EKLENDİ")
		StartActivity(BiyokimyasalListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
	
End Sub

