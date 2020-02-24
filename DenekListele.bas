B4A=true
Group=SportExpertProjeDosyası\Denek
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
	Private EditTextAra As EditText
	Private ButtonDuzenleSil As Button
	Private ButtonDenekEkle As Button
	Private ButtonMevki As Button
	Private ButtonBransSinif As Button
	Private ButtonTakimOkul As Button
	Private ButtonEngelDurumu As Button
	Private ButtonBabaAdi As Button
	Private ButtonDogumYeri As Button
	Private ButtonDogumTarihi As Button
	Private ButtonCinsiyet As Button
	Private ButtonIsim As Button
	Private ButtonTc As Button
	Private Label1 As Label
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DenekListelePage")
	LabelCarpi.Visible = False
	HTMLGosterDB
	
#region Görüntü ayarları
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.SingleLine = True
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	
	ButtonIsim.TextColor = Color.koyuMavi
	ButtonIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonIsim.SingleLine = True
	ButtonIsim.Text ="İSİM"
	ButtonIsim.TextSize = 14
	
	ButtonCinsiyet.TextColor = Color.koyuMavi
	ButtonCinsiyet.Typeface = Typeface.DEFAULT_BOLD
	ButtonCinsiyet.SingleLine = True
	ButtonCinsiyet.Text = "CİNSİYET"
	ButtonCinsiyet.TextSize = 14
	
	ButtonDogumTarihi.TextColor = Color.koyuMavi
	ButtonDogumTarihi.Typeface = Typeface.DEFAULT_BOLD
	ButtonDogumTarihi.SingleLine = True
	ButtonDogumTarihi.Text = "DOĞUM TARİHİ"
	ButtonDogumTarihi.TextSize = 14
	
	ButtonDogumYeri.TextColor = Color.koyuMavi
	ButtonDogumYeri.Typeface = Typeface.DEFAULT_BOLD
	ButtonDogumYeri.SingleLine = True
	ButtonDogumYeri.Text = "DOĞUM YERİ"
	ButtonDogumYeri.TextSize = 14
	
	ButtonBabaAdi.TextColor = Color.koyuMavi
	ButtonBabaAdi.Typeface = Typeface.DEFAULT_BOLD
	ButtonBabaAdi.SingleLine = True
	ButtonBabaAdi.Text = "BABA ADI"
	ButtonBabaAdi.TextSize = 14
	
	ButtonEngelDurumu.TextColor= Color.koyuMavi
	ButtonEngelDurumu.Typeface= Typeface.DEFAULT_BOLD
	ButtonEngelDurumu.SingleLine= True
	ButtonEngelDurumu.Text= "ENGEL DURUMU"
	ButtonEngelDurumu.TextSize= 14
	
	ButtonTakimOkul.TextColor = Color.koyuMavi
	ButtonTakimOkul.Typeface = Typeface.DEFAULT_BOLD
	ButtonTakimOkul.SingleLine = True
	ButtonTakimOkul.Text = "TAKIM/OKUL"
	ButtonTakimOkul.TextSize = 14
	
	ButtonBransSinif.TextColor = Color.koyuMavi
	ButtonBransSinif.Typeface = Typeface.DEFAULT_BOLD
	ButtonBransSinif.SingleLine = True
	ButtonBransSinif.Text = "BRANŞ/SINIF"
	ButtonBransSinif.TextSize = 14
	
	ButtonMevki.TextColor = Color.koyuMavi
	ButtonMevki.Typeface = Typeface.DEFAULT_BOLD
	ButtonMevki.SingleLine = True
	ButtonMevki.Text = "MEVKİ"
	ButtonMevki.TextSize = 14
	
	ButtonDuzenleSil.TextColor = Color.koyuMavi
	ButtonDenekEkle.TextColor = Color.koyuMavi
#end region

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'tablo şeklinde gösterme
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek ORDER BY denek_id DESC",Null,-1,False)) 'true olursa tıklanabilir olur
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC],denek_isim  As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi  As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki  As [MEVKİ] FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR cinsiyet_adi LIKE '%"& EditTextAra.Text &"%' OR denek_dogumTarihi LIKE '%"& EditTextAra.Text &"%' OR il_adi LIKE '%"& EditTextAra.Text &"%' OR denek_babaAdi LIKE '%"& EditTextAra.Text &"%' OR denek_engelDurumu LIKE '%"& EditTextAra.Text &"%' OR denek_takimOkul LIKE '%"& EditTextAra.Text &"%' OR denek_bransSinif LIKE '%"& EditTextAra.Text &"%' OR denek_mevki LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC" ,Null,-1,False))
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region tabloda verileri aratılana göre gösterme
Sub ButtonTc_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] FROM Denek WHERE denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonIsim_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] , denek_isim As [DENEK İSİM] FROM Denek WHERE denek_isim LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonCinsiyet_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] , cinsiyet_adi As [CİNSİYET] FROM Denek WHERE cinsiyet_adi LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonDogumTarihi_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] , denek_dogumTarihi As [DENEK DOĞUM TARİHİ] FROM Denek WHERE denek_dogumTarihi LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonDogumYeri_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] , il_adi As [DOĞUM YERİ] FROM Denek WHERE il_adi LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub


Sub ButtonBabaAdi_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] ,denek_babaAdi As [DENEK BABA ADI] FROM Denek WHERE denek_babaAdi LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonEngelDurumu_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] ,denek_engelDurumu As [DENEK ENGEL DURUMU] FROM Denek WHERE denek_engelDurumu LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonTakimOkul_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] ,denek_takimOkul As [TAKIM/OKUL] FROM Denek WHERE denek_takimOkul LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC ",Null,-1,False))
End Sub

Sub ButtonBransSinif_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] ,denek_bransSinif  As [BRANŞ/SINIF] FROM Denek WHERE denek_bransSinif LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub

Sub ButtonMevki_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC] ,denek_mevki As [MEVKİ] FROM Denek WHERE denek_mevki LIKE '%"& EditTextAra.Text &"%' ORDER BY denek_id DESC",Null,-1,False))
End Sub
#end region

Sub ButtonDuzenleSil_Click
	StartActivity(DenekDuzenleSil)
	Activity.Finish
End Sub

Sub ButtonDenekEkle_Click
	Main.Status = "S"
	StartActivity(DenekEkleGuncelle)
	Activity.Finish
End Sub

Sub Label1_Click
	HTMLGosterDB
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	HTMLGosterDB
End Sub