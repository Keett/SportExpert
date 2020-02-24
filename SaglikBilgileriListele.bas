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

	Private EditTextAra As EditText
	Private ButtonIsim As Button
	Private ButtonTc As Button
	Private ButtonHastalikSaglik As Button
	Private ButtonSaglikBilgileriAciklama As Button
	Private ButtonTarih As Button
	Private WebView1 As WebView
	
	Private ButtonSaglikBilgileriSil As Button
	Private ButtonSaglikBilgileriEkle As Button
	Private LabelCarpi As Label
	Private ButtonAnasayfa As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("SaglikBilgileriListelePage")
	LabelCarpi.Visible = False
	
#region görüntü ayarı
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonIsim.TextColor = Color.koyuMavi
	ButtonIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonIsim.Text = "İSİM"
	ButtonIsim.TextSize = 14
	ButtonIsim.SingleLine = True
	
	ButtonHastalikSaglik.TextColor = Color.koyuMavi
	ButtonHastalikSaglik.Typeface = Typeface.DEFAULT_BOLD
	ButtonHastalikSaglik.Text = "HASTALIK/SAĞLIK"
	ButtonHastalikSaglik.TextSize = 14
	ButtonHastalikSaglik.SingleLine = True
	
	ButtonSaglikBilgileriAciklama.TextColor = Color.koyuMavi
	ButtonSaglikBilgileriAciklama.Typeface = Typeface.DEFAULT_BOLD
	ButtonSaglikBilgileriAciklama.Text = "SAĞLIK BİLGİLERİ AÇIKLAMA"
	ButtonSaglikBilgileriAciklama.TextSize = 14
	ButtonSaglikBilgileriAciklama.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTarih.SingleLine = True
	
	WebView1.JavaScriptEnabled = True
	WebView1.ZoomEnabled = True
	
#end region

	HTMLGosterDB

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'tablo şeklinde gösterme
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT  denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK],saglikBilgileri_aciklama As [SAĞLIK BİLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE SaglikBilgileri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_tarih LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_hastalikSakatlik LIKE '%"& EditTextAra.Text &"%' OR saglikBilgileri_aciklama LIKE '%"& EditTextAra.Text &"%' ) ORDER BY saglikBilgileri_id DESC" ,Null,-1,False))
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#Region Aratma
Sub ButtonIsim_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_isim LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

Sub ButtonTc_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

Sub ButtonHastalikSaglik_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_hastalikSakatlik As [HASTALIK/SAKATLIK] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_hastalikSakatlik LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

Sub ButtonSaglikBilgilerAciklama_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_aciklama  As [SAĞLIK İLGİLERİ AÇIKLAMA] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_aciklama LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

Sub ButtonTarih_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], saglikBilgileri_tarih As [TARİH],saglikBilgileri_saat As [SAAT] FROM SaglikBilgileri,Denek WHERE  SaglikBilgileri.denek_id = Denek.denek_id AND saglikBilgileri_tarih  LIKE '%"& EditTextAra.Text &"%' ORDER BY saglikBilgileri_id DESC",Null,-1,False))
End Sub

#end region

Sub ButtonSaglikBilgileriSil_Click
	StartActivity(SaglikBilgileriSil)
	Activity.Finish
End Sub

Sub ButtonSaglikBilgileriEkle_Click
	Main.Status = "S"
	StartActivity(TestDenekAra)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text= ""
	HTMLGosterDB
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub