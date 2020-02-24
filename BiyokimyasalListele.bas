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

	Private EditTextAra As EditText
	Private ButtonIsim As Button
	Private ButtonTc As Button
	Private ButtonBiyokimyasalAciklama As Button
	Private ButtonTarih As Button
	Private WebView1 As WebView
	Private ButtonBiyokimyasalEkle As Button
	Private ButtonBiyokimyasalSil As Button
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("BiyokimyasalListelePage")
	LabelCarpi.Visible = False
	
#region görüntü ayarları
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
	
	ButtonBiyokimyasalAciklama.TextColor = Color.koyuMavi
	ButtonBiyokimyasalAciklama.Typeface = Typeface.DEFAULT_BOLD
	ButtonBiyokimyasalAciklama.Text = "BİYOKİMYASAL AÇIKLAMA"
	ButtonBiyokimyasalAciklama.TextSize = 14
	ButtonBiyokimyasalAciklama.SingleLine = True

	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonIsim.TextColor = Color.koyuMavi
	ButtonIsim.Typeface = Typeface.DEFAULT_BOLD
	ButtonIsim.Text = "İSİM"
	ButtonIsim.TextSize = 14
	ButtonIsim.SingleLine = True
	
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
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], biyokimyasal_tarih  As [TARİH],biyokimyasal_saat As [SAAT], biyokimyasal_aciklama As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id ORDER BY biyokimyasal_id DESC ",Null,-1,False))
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,biyokimyasal_tarih As [TARİH], biyokimyasal_saat As [SAAT],biyokimyasal_aciklama  As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE Biyokimyasal.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR biyokimyasal_tarih LIKE '%"& EditTextAra.Text &"%' OR biyokimyasal_aciklama  LIKE '%"& EditTextAra.Text &"%' ) ORDER BY biyokimyasal_id DESC" ,Null,-1,False))
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region Aratma 
Sub ButtonIsim_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND denek_isim LIKE '%"& EditTextAra.Text &"%' ORDER BY biyokimyasal_id DESC ",Null,-1,False))
End Sub

Sub ButtonTc_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY biyokimyasal_id DESC",Null,-1,False))
End Sub

Sub ButtonBiyokimyasalAciklama_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], biyokimyasal_aciklama As [BİYOKİMYASAL AÇIKLAMA] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_aciklama LIKE '%"& EditTextAra.Text &"%' ORDER BY biyokimyasal_id DESC",Null,-1,False))
End Sub

Sub ButtonTarih_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], biyokimyasal_tarih  As [TARİH], biyokimyasal_saat As [SAAT] FROM Biyokimyasal,Denek WHERE  Biyokimyasal.denek_id = Denek.denek_id AND biyokimyasal_tarih LIKE '%"& EditTextAra.Text &"%' ORDER BY biyokimyasal_id DESC",Null,-1,False))
End Sub

#end region

Sub ButtonBiyokimyasalEkle_Click
	Main.Status = "S"
	StartActivity(TestDenekAra)
	Activity.Finish
End Sub

Sub ButtonBiyokimyasalSil_Click
	StartActivity(BiyokimyasalSil)
	Activity.Finish
End Sub

Sub ButtonAnasayfa_Click
	StartActivity(AnaMenu)
	Activity.Finish
End Sub

Sub LabelCarpi_Click
	EditTextAra.SelectAll
	EditTextAra.Text = ""
	HTMLGosterDB
End Sub