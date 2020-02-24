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

	Private EditTextAra As EditText
	Private WebView1 As WebView
	
	Private ButtonTarih As Button
	Private ButtonKulacUzunlugu As Button
	Private ButtonDeriKivrimKalinligi As Button
	Private ButtonAyakUzunlugu As Button
	Private ButtonOturmaYuksekligi As Button
	Private ButtonElUzunlugu As Button
	Private ButtonKilo As Button
	Private ButtonBoy As Button
	Private ButtonTc As Button
	Private ButtonAnasayfa As Button
	Private LabelCarpi As Label
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("AntropometrikListelePage")
	LabelCarpi.Visible = False
	
#region görüntü ayarı
	EditTextAra.TextColor = Colors.White
	EditTextAra.Hint = "Bu alana yazarak aratabilirsiniz.."
	EditTextAra.HintColor = Color.hintColor
	EditTextAra.TextSize = 20
	EditTextAra.Typeface = Typeface.DEFAULT_BOLD
	
	ButtonDeriKivrimKalinligi.TextColor = Color.koyuMavi
	ButtonDeriKivrimKalinligi.Typeface = Typeface.DEFAULT_BOLD
	ButtonDeriKivrimKalinligi.Text = "DERİ KIVRIM KALINLIĞI"
	ButtonDeriKivrimKalinligi.TextSize = 14
	ButtonDeriKivrimKalinligi.SingleLine = True
	
	ButtonAyakUzunlugu.TextColor = Color.koyuMavi
	ButtonAyakUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonAyakUzunlugu.Text = "AYAK UZUNLUĞU"
	ButtonAyakUzunlugu.TextSize = 14
	ButtonAyakUzunlugu.SingleLine = True
	
	ButtonKulacUzunlugu.TextColor = Color.koyuMavi
	ButtonKulacUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonKulacUzunlugu.Text = "KULAÇ UZUNLUĞU"
	ButtonKulacUzunlugu.TextSize = 14
	ButtonKulacUzunlugu.SingleLine = True
	
	ButtonOturmaYuksekligi.TextColor = Color.koyuMavi
	ButtonOturmaYuksekligi.Typeface = Typeface.DEFAULT_BOLD
	ButtonOturmaYuksekligi.Text = "OTURMA YÜKSEKLİĞİ"
	ButtonOturmaYuksekligi.TextSize = 14
	ButtonOturmaYuksekligi.SingleLine = True
	
	ButtonElUzunlugu.TextColor = Color.koyuMavi
	ButtonElUzunlugu.Typeface = Typeface.DEFAULT_BOLD
	ButtonElUzunlugu.Text = "EL UZUNLUĞU"
	ButtonElUzunlugu.TextSize = 14
	ButtonElUzunlugu.SingleLine = True
	
	ButtonKilo.TextColor = Color.koyuMavi
	ButtonKilo.Typeface = Typeface.DEFAULT_BOLD
	ButtonKilo.Text = "KİLO"
	ButtonKilo.TextSize = 14
	ButtonKilo.SingleLine = True
	
	ButtonTc.TextColor = Color.koyuMavi
	ButtonTc.Typeface = Typeface.DEFAULT_BOLD
	ButtonTc.Text = "TC"
	ButtonTc.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonTarih.TextColor = Color.koyuMavi
	ButtonTarih.Typeface = Typeface.DEFAULT_BOLD
	ButtonTarih.Text = "TARİH"
	ButtonTarih.TextSize = 14
	ButtonTc.SingleLine = True
	
	ButtonBoy.TextColor = Color.koyuMavi
	ButtonBoy.Typeface = Typeface.DEFAULT_BOLD
	ButtonBoy.Text = "BOY"
	ButtonBoy.TextSize = 14
	ButtonBoy.SingleLine = True
	
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
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [DENEK İSİM] , antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] , antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id ORDER BY antropometrik_id DESC",Null,-1,False)) 'true olursa tıklanabilir olur
End Sub

Sub EditTextAra_TextChanged (Old As String, New As String)
	LabelCarpi.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc  As [Denek TC],antropometrik_tarih As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY],antropometrik_kilo As [KİLO],antropometrik_elUzunlugu As [EL UZUNLUĞU],antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU],antropometrik_oturmaYuksekligi As [OTURMA YÜKSEKLİĞİ],antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU],antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND (denek_tc LIKE '%"& EditTextAra.Text &"%' OR antropometrik_tarih LIKE '%"& EditTextAra.Text &"%' OR antropometrik_boy LIKE '%"& EditTextAra.Text &"%' OR antropometrik_kilo LIKE '%"& EditTextAra.Text &"%') ORDER BY antropometrik_id DESC" ,Null,-1,False))
	 If EditTextAra.Text = "" Then
	 	LabelCarpi.Visible = False
	End If
End Sub

#Region Aratma 
Sub ButtonTarih_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_tarih LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonTc_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [Denek TC],denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND denek_tc LIKE '%"& EditTextAra.Text &"%' ORDER BY antropometrik_id DESC  ",Null,-1,False))
End Sub

Sub ButtonBoy_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT],antropometrik_boy As [BOY] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_boy LIKE '%"& EditTextAra.Text &"%' ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonKilo_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kilo As [KİLO] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_kilo LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonElUzunlugu_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_elUzunlugu As [EL UZUNLUĞU] FROM Antropometrik,Denek WHERE Antropometrik.denek_id = Denek.denek_id AND antropometrik_elUzunlugu LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonKulacUzunlugu_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_kulacUzunlugu As [KULAÇ UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND  antropometrik_kulacUzunlugu LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonOturmaYuksekligi_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_oturmaYuksekligi As [OTURMA UZUNLUĞU] FROM Antropometrik,Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_oturmaYuksekligi LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonAyakUzunlugu_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_ayakUzunlugu As [AYAK UZUNLUĞU] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_ayakUzunlugu LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub

Sub ButtonDeriKivrimKalinligi_Click
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [TC], denek_isim As [DENEK İSİM], antropometrik_tarih  As [TARİH], antropometrik_saat As [SAAT], antropometrik_deriKivrimKalinligi As [DERİ KIVRIM KALINLIĞI] FROM Antropometrik, Denek WHERE  Antropometrik.denek_id = Denek.denek_id AND antropometrik_deriKivrimKalinligi LIKE '%"& EditTextAra.Text &"%'  ORDER BY antropometrik_id DESC ",Null,-1,False))
End Sub
#end region

Sub ButtonSil_Click
	StartActivity(AntropometrikSil)
	Activity.Finish
End Sub

Sub ButtonAntropometrikEkle_Click
	StartActivity(TestDenekAra)
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