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

	Private EditTextAra As EditText
	Private ButtonAntranorGorusleriEkle As Button
	Private ButtonAntranorGorusleriSil As Button
	Private ButtonAnasayfa As Button
	
	Private ButtonTarih As Button
	Private ButtonAntranorGorusleriAciklama As Button
	Private ButtonTc As Button
	Private ButtonIsim As Button
	Private WebView1 As WebView
	Private LabelCarpi As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AntranorGorusleriListelePage")
	LabelCarpi.Visible = False
	
#region görüntü ayarları
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
	
	ButtonAntranorGorusleriAciklama.TextColor = Color.koyuMavi
	ButtonAntranorGorusleriAciklama.Typeface = Typeface.DEFAULT_BOLD
	ButtonAntranorGorusleriAciklama.Text = "ANTRANÖR GÖRÜŞ AÇIKLAMA"
	ButtonAntranorGorusleriAciklama.TextSize = 14
	ButtonAntranorGorusleriAciklama.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize  =14
	ButtonTarih.SingleLine = True
	
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	WebView1.ZoomEnabled = True
	WebView1.JavaScriptEnabled = True
	
	
#end region	

	HTMLGosterDB
	
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HTMLGosterDB
	'tablo şeklinde gösterme
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat  As [SAAT], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id ORDER BY antranorGorüsleri_id DESC",Null,-1,False))
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] ,antranorGorüsleri_tarih   As [TARİH],antranorGorüsleri_saat  As [SAAT],antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE AntranorGorusleri.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR denek_isim LIKE '%"& EditTextAra.Text &"%' OR antranorGorüsleri_tarih LIKE '%"& EditTextAra.Text &"%' OR antranorGorüsleri_aciklama LIKE '%"& EditTextAra.Text &"%' ) ORDER BY antranorGorüsleri_id DESC" ,Null,-1,False))
	If EditTextAra.Text = "" Then
		LabelCarpi.Visible = False
	End If
End Sub

#region Aratma
Sub ButtonIsim_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT  denek_isim As [DENEK İSİM], denek_tc As [Denek TC] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_isim LIKE '%"& EditTextAra.Text &"%' ORDER BY antranorGorüsleri_id DESC",Null,-1,False))
End Sub

Sub ButtonTc_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY antranorGorüsleri_id DESC ",Null,-1,False))
End Sub

Sub ButtonAntranorGorusleriAciklama_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_aciklama As [ANTRANOR GÖRÜŞLERİ AÇIKLAMA] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_aciklama LIKE '%"& EditTextAra.Text &"%' ORDER BY antranorGorüsleri_id DESC",Null,-1,False))
End Sub

Sub ButtonTarih_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM], antranorGorüsleri_tarih As [TARİH],antranorGorüsleri_saat As [SAAT] FROM AntranorGorusleri,Denek WHERE  AntranorGorusleri.denek_id = Denek.denek_id AND antranorGorüsleri_tarih LIKE '%"& EditTextAra.Text &"%' ORDER BY antranorGorüsleri_id DESC",Null,-1,False))
End Sub
#end region

Sub ButtonAntranorGorusleriEkle_Click
	Main.Status = "S"
	StartActivity(TestDenekAra)
	Activity.Finish
End Sub

Sub ButtonAntranorGorusleriSil_Click
	StartActivity(AntranorGorusSil)
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