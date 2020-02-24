B4A=true
Group=SportExpertProjeDosyası\Test\PsikolojikDegerlendirme
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
	Private EditTextPsikolojikAciklama As EditText
	Private ButtonPsikolojikEkle As Button
	Private LabelPsikolojikAciklama As Label
	
	Dim secilenTarih As String
	Dim secilenSaat As String
	Dim PsikolojikID As Int
	Dim rs As ResultSet

End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("PsikolojikEklePage")
	
#region görüntü ayarları
	WebView1.ZoomEnabled = True
	WebView1.JavaScriptEnabled = True
	
	LabelPsikolojikAciklama.TextColor = Colors.White
	LabelPsikolojikAciklama.TextSize = 20
	LabelPsikolojikAciklama.Typeface = Typeface.DEFAULT_BOLD
	
	EditTextPsikolojikAciklama.TextColor = Color.koyuMavi
	EditTextPsikolojikAciklama.Hint = "Psikolojik değerlendirmenizi bu alana yazabilirsiniz.."
	EditTextPsikolojikAciklama.HintColor = Color.acikMavi
	EditTextPsikolojikAciklama.TextSize = 20
	EditTextPsikolojikAciklama.Typeface = Typeface.DEFAULT
	
#end region

	HTMLGosterDB

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'seçilen deneğin özelliklerinin verildiği tablo
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&TestDenekAra.secilenDenek&"' ",Null,-1,False)) 'true olursa tıklanabilir olur
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM Psikolojik ORDER BY psikolojik_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		PsikolojikID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("psikolojik_id"),3))+1),3)
	Else
		PsikolojikID="001"
	End If
	rs.Close
End Sub

Sub ButtonPsikolojikEkle_Click
	Dim result As Int
	result = Msgbox2("Psikolojik analiz verilerini eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		Log(DateTime.Date(now))
		secilenTarih = DateTime.Date(now)
		Log(DateTime.Time(now))
		secilenSaat = DateTime.Time(now)
		ID
		Main.sql.ExecNonQuery2("INSERT INTO Psikolojik VALUES(?,?,?,?,?)", Array As Object (PsikolojikID,TestDenekAra.secilenDenek,secilenTarih,secilenSaat,EditTextPsikolojikAciklama.Text))
		Log("PSİKOLOJİK VERİLER EKLENDİ")
		StartActivity(PsikolojikListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
End Sub