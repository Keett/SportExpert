B4A=true
Group=SportExpertProjeDosyası\Test\SaglikBilgileri
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
	Private EditTextSaglikBilgileriHastalikSakatlik As EditText
	Private EditTextSaglikBilgileriAciklama As EditText
	Private ButtonSaglikBilgileriEkle As Button
	Private LabelSaglikBilgileriHastalikSakatlik As Label
	Private LabelSaglikBilgileriAciklama As Label
	
	Dim SaglikBilgileriID As Int
	Dim rs As ResultSet
	Dim secilenTarih As String
	Dim secilenSaat As String

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SaglikBilgileriEklePage")
	
#region görüntü ayarları
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	
	EditTextSaglikBilgileriHastalikSakatlik.TextColor = Color.koyuMavi
	EditTextSaglikBilgileriHastalikSakatlik.Hint = "Hastalık/Sakatlık bilgierini bu alana yazabilirsiniz.."
	EditTextSaglikBilgileriHastalikSakatlik.HintColor = Color.acikMavi
	EditTextSaglikBilgileriHastalikSakatlik.TextSize = 20
	EditTextSaglikBilgileriHastalikSakatlik.Typeface = Typeface.DEFAULT
	
	EditTextSaglikBilgileriAciklama.TextColor = Color.koyuMavi
	EditTextSaglikBilgileriAciklama.Hint = "Sağlık bilgileri açıklamanızı bu alana yazabilirsiniz.."
	EditTextSaglikBilgileriAciklama.HintColor = Color.acikMavi
	EditTextSaglikBilgileriAciklama.TextSize = 20
	EditTextSaglikBilgileriAciklama.Typeface = Typeface.DEFAULT
	
	LabelSaglikBilgileriHastalikSakatlik.TextColor = Colors.White
	LabelSaglikBilgileriHastalikSakatlik.TextSize = 20
	LabelSaglikBilgileriHastalikSakatlik.Typeface = Typeface.DEFAULT_BOLD
	
	LabelSaglikBilgileriAciklama.TextColor = Colors.White
	LabelSaglikBilgileriAciklama.TextSize = 20
	LabelSaglikBilgileriAciklama.Typeface = Typeface.DEFAULT_BOLD
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
	
	rs= Main.sql.ExecQuery("SELECT * FROM SaglikBilgileri ORDER BY saglikBilgileri_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		SaglikBilgileriID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("saglikBilgileri_id"),3))+1),3)
	Else
		SaglikBilgileriID="001"
	End If
	rs.Close
End Sub

Sub ButtonSaglikBilgileriEkle_Click
	Dim result As Int
	result = Msgbox2("Sağlık Bilgilerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		Log(DateTime.Date(now))
		secilenTarih = DateTime.Date(now)
		Log(DateTime.Time(now))
		secilenSaat = DateTime.Time(now)
		ID
		Main.sql.ExecNonQuery2("INSERT INTO SaglikBilgileri VALUES(?,?,?,?,?,?)", Array As Object (SaglikBilgileriID,TestDenekAra.secilenDenek,secilenTarih,secilenSaat,EditTextSaglikBilgileriHastalikSakatlik.Text, EditTextSaglikBilgileriAciklama.Text))
		Log("SAĞLIK BİLGİLERİ EKLENDİ")
		StartActivity(SaglikBilgileriListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
	
End Sub