B4A=true
Group=SportExpertProjeDosyası\Test\MotorOzellikTestMenu\DayaniklilikTest
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

	Private WebViewDenek As WebView
	Private WebViewProgram As WebView
	Private LabelMekikSayisi As Label
	Private EditTextMekikSayisi As EditText
	Private ButtonEkle As Button
	
	Dim DayananiklilikTestID As Int
	Dim rs As ResultSet
	Dim secilenTarih As String
	Dim secilenSaat As String
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("DayaniklilikTestEklePage")
	
	#region görüntü ayarı
	WebViewDenek.JavaScriptEnabled = True
	WebViewDenek.ZoomEnabled = True
	
	WebViewProgram.JavaScriptEnabled = True
	WebViewProgram.ZoomEnabled = True
	
	LabelMekikSayisi.Text = "MEKİK SAYISI:"
	LabelMekikSayisi.TextSize = 20
	LabelMekikSayisi.Typeface = Typeface.DEFAULT_BOLD
	LabelMekikSayisi.TextColor = Colors.White
	#end region
	
	HtmlGosterDenek
	HtmlGosterProgram

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub HtmlGosterDenek
	Select GelismisTestDenekAra.checkedIdList.Size
		Case 1
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' ", Null,-1,False))
		Case 2
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' ", Null,-1,False))
		Case 3
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' ", Null,-1,False))
		Case 4
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' ", Null,-1,False))
		Case 5
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"'", Null,-1,False))
		Case 6
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(5)&"' ", Null,-1,False))
		Case 7
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(5)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(6)&"' ", Null,-1,False))
		Case 8
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(5)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(6)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(7)&"' ", Null,-1,False))
		Case 9
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(5)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(6)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(7)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(8)&"'  ", Null,-1,False))
		Case 10
			WebViewDenek.LoadHtml(DBUtils.ExecuteHtml(Main.sql, "SELECT denek_tc As [DENEK TC], denek_isim As [DENEK İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(0)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(1)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(2)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(3)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(4)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(5)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(6)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(7)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(8)&"' OR denek_id = '"&GelismisTestDenekAra.checkedIdList.Get(9)&"' ", Null,-1,False))
		Case Else
			Log("Sadece 10 tane kişi gösterilebilir")
	End Select
End Sub

Sub HtmlGosterProgram
	WebViewProgram.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT program_adi As [PROGRAM ADI], program_tarih  As [TARİH],program_saat As [SAAT], level As [LEVEL], program_testTuru  As [TEST TÜRÜ], koniMesafesi1 As [KONİ MESAFESİ1] , hiz1 As [HIZ1], dakika1 As [DAKİKA1] ,saniye1  As [SANİYE1], koniMesafesi2 As [KONİ MESAFESİ2] , hiz2 As [HIZ2],dakika2 As [DAKİKA2],saniye2  As [SANİYE2],koniMesafesi3 As [KONİ MESAFESİ3],hiz3 As [HIZ3],dakika3 As [DAKİKA3] ,saniye3  As [SANİYE3],koniMesafesi4 As [KONİ MESAFESİ4] ,hiz4 As [HIZ4],dakika4 As [DAKİKA4],saniye4  As [SANİYE4],koniMesafesi5 As [KONİ MESAFESİ5],hiz5 As [HIZ5] ,dakika5 As [DAKİKA5],saniye5  As [SANİYE5],koniMesafesi6 As [KONİ MESAFESİ6] ,hiz6 As [HIZ6] ,dakika6 As [DAKİKA6],saniye6  As [SANİYE6],koniMesafesi7 As [KONİ MESAFESİ7] ,hiz7 As [HIZ7] ,dakika7 As [DAKİKA7] ,saniye7  As [SANİYE7], koniMesafesi8 As [KONİ MESAFESİ8] ,hiz8 As [HIZ8],dakika8 As [DAKİKA8] ,saniye8  As [SANİYE8],koniMesafesi9 As [KONİ MESAFESİ9],hiz9 As [HIZ9],dakika9 As [DAKİKA9] ,saniye9  As [SANİYE9],koniMesafesi10 As [KONİ MESAFESİ10] ,hiz10 As [HIZ10] ,dakika10 As [DAKİKA10] ,saniye10  As [SANİYE10],koniMesafesi11 As [KONİ MESAFESİ11] ,hiz11 As [HIZ11] ,dakika11 As [DAKİKA11] ,saniye11  As [SANİYE11],koniMesafesi12 As [KONİ MESAFESİ12],hiz12 As [HIZ12],dakika12 As [DAKİKA12],saniye12  As [SANİYE12],koniMesafesi13 As [KONİ MESAFESİ13] ,hiz13 As [HIZ13] ,dakika13 As [DAKİKA13] ,saniye13  As [SANİYE13],koniMesafesi14 As [KONİ MESAFESİ14],hiz14 As [HIZ14] ,dakika14 As [DAKİKA14],saniye14  As [SANİYE14],koniMesafesi15 As [KONİ MESAFESİ15],hiz15 As [HIZ15] ,dakika15 As [DAKİKA15] ,saniye15  As [SANİYE15],koniMesafesi16 As [KONİ MESAFESİ16],hiz16 As [HIZ16],dakika16 As [DAKİKA16] ,saniye16  As [SANİYE16], koniMesafesi17 As [KONİ MESAFESİ17] ,hiz17 As [HIZ17] ,dakika17 As [DAKİKA17],saniye17  As [SANİYE17] ,koniMesafesi18 As [KONİ MESAFESİ18] ,hiz18 As [HIZ18] ,dakika18 As [DAKİKA18],saniye18  As [SANİYE18] ,koniMesafesi19 As [KONİ MESAFESİ19] ,hiz19 As [HIZ19] ,dakika19 As [DAKİKA19] ,saniye19  As [SANİYE19],koniMesafesi20 As [KONİ MESAFESİ20] ,hiz20 As [HIZ20] ,dakika20 As [DAKİKA20] ,saniye20 As [SANİYE20], koniMesafesi21 As [KONİ MESAFESİ21] ,hiz21 As [HIZ21] ,dakika21 As [DAKİKA21],saniye21 As [SANİYE21], koniMesafesi22 As [KONİ MESAFESİ22] ,hiz22 As [HIZ22],dakika22 As [DAKİKA22] ,saniye22 As [SANİYE22], koniMesafesi23 As [KONİ MESAFESİ23] ,hiz23 As [HIZ23],dakika23 As [DAKİKA23],saniye23 As [SANİYE23], koniMesafesi24 As [KONİ MESAFESİ24] ,hiz24 As [HIZ24] ,dakika24 As [DAKİKA24],saniye24 As [SANİYE24],koniMesafesi25 As [KONİ MESAFESİ25] ,hiz25 As [HIZ25] ,dakika25 As [DAKİKA25] ,saniye25 As [SANİYE25] FROM DayaniklilikTestProgram WHERE program_id = '"&ProgramSec.secilenProgramId&"'", Null,-1,False))
End Sub

Sub ButtonEkle_Click
	Dim result As Int
	result = Msgbox2("Dayanıklılık Test eklemek istiyor musunuz?:", "Onay Mesajı", "Evet", "", "Hayır",Null)
	If result= DialogResponse.POSITIVE Then
		Dim now As Long = DateTime.Now
		DateTime.DateFormat = "dd/MM/yyyy"
		secilenTarih = DateTime.Date(now)
		secilenSaat = DateTime.Time(now)
		ID
		Select GelismisTestDenekAra.checkedIdList.Size
			Case 1
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case 2
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case 3
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case 4
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case 5 
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case 6
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),GelismisTestDenekAra.checkedIdList.Get(5),GelismisTestDenekAra.checkedTcList.Get(5),GelismisTestDenekAra.checkedIsimList.Get(5),Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text ,secilenTarih,secilenSaat))
			Case 7
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),GelismisTestDenekAra.checkedIdList.Get(5),GelismisTestDenekAra.checkedTcList.Get(5),GelismisTestDenekAra.checkedIsimList.Get(5),GelismisTestDenekAra.checkedIdList.Get(6),GelismisTestDenekAra.checkedTcList.Get(6),GelismisTestDenekAra.checkedIsimList.Get(6),Null,Null,Null,Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text ,secilenTarih,secilenSaat))
			Case 8
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),GelismisTestDenekAra.checkedIdList.Get(5),GelismisTestDenekAra.checkedTcList.Get(5),GelismisTestDenekAra.checkedIsimList.Get(5),GelismisTestDenekAra.checkedIdList.Get(6),GelismisTestDenekAra.checkedTcList.Get(6),GelismisTestDenekAra.checkedIsimList.Get(6),GelismisTestDenekAra.checkedIdList.Get(7),GelismisTestDenekAra.checkedTcList.Get(7),GelismisTestDenekAra.checkedIsimList.Get(7),Null,Null,Null,Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text ,secilenTarih,secilenSaat))
			Case 9
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),GelismisTestDenekAra.checkedIdList.Get(5),GelismisTestDenekAra.checkedTcList.Get(5),GelismisTestDenekAra.checkedIsimList.Get(5),GelismisTestDenekAra.checkedIdList.Get(6),GelismisTestDenekAra.checkedTcList.Get(6),GelismisTestDenekAra.checkedIsimList.Get(6),GelismisTestDenekAra.checkedIdList.Get(7),GelismisTestDenekAra.checkedTcList.Get(7),GelismisTestDenekAra.checkedIsimList.Get(7),GelismisTestDenekAra.checkedIdList.Get(8),GelismisTestDenekAra.checkedTcList.Get(8),GelismisTestDenekAra.checkedIsimList.Get(8),Null,Null,Null,ProgramSec.secilenProgramId,EditTextMekikSayisi.Text ,secilenTarih,secilenSaat))
			Case 10
				Main.sql.ExecNonQuery2("INSERT INTO DayaniklilikTest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", Array As Object (DayananiklilikTestID,GelismisTestDenekAra.checkedIdList.Get(0) ,GelismisTestDenekAra.checkedTcList.Get(0), GelismisTestDenekAra.checkedIsimList.Get(0) ,GelismisTestDenekAra.checkedIdList.Get(1) ,GelismisTestDenekAra.checkedTcList.Get(1),GelismisTestDenekAra.checkedIsimList.Get(1),GelismisTestDenekAra.checkedIdList.Get(2),GelismisTestDenekAra.checkedTcList.Get(2),GelismisTestDenekAra.checkedIsimList.Get(2),GelismisTestDenekAra.checkedIdList.Get(3),GelismisTestDenekAra.checkedTcList.Get(3),GelismisTestDenekAra.checkedIsimList.Get(3),GelismisTestDenekAra.checkedIdList.Get(4),GelismisTestDenekAra.checkedTcList.Get(4),GelismisTestDenekAra.checkedIsimList.Get(4),GelismisTestDenekAra.checkedIdList.Get(5),GelismisTestDenekAra.checkedTcList.Get(5),GelismisTestDenekAra.checkedIsimList.Get(5),GelismisTestDenekAra.checkedIdList.Get(6),GelismisTestDenekAra.checkedTcList.Get(6),GelismisTestDenekAra.checkedIsimList.Get(6),GelismisTestDenekAra.checkedIdList.Get(7),GelismisTestDenekAra.checkedTcList.Get(7),GelismisTestDenekAra.checkedIsimList.Get(7),GelismisTestDenekAra.checkedIdList.Get(8),GelismisTestDenekAra.checkedTcList.Get(8),GelismisTestDenekAra.checkedIsimList.Get(8),GelismisTestDenekAra.checkedIdList.Get(9),GelismisTestDenekAra.checkedTcList.Get(9),GelismisTestDenekAra.checkedIsimList.Get(9),ProgramSec.secilenProgramId,EditTextMekikSayisi.Text,secilenTarih,secilenSaat ))
			Case Else
				Log("Sadece 10 tane kişi seçilebilir")
		End Select	
		StartActivity(DayaniklilikTestListele)
		Activity.Finish
	Else If result= DialogResponse.NEGATIVE Then
		ToastMessageShow("Yönlendiriliyorsunuz...",False)
		Return
	End If
End Sub

Sub ID
	Dim sf As StringFunctions
	sf.initialize
	
	rs= Main.sql.ExecQuery("SELECT * FROM DayaniklilikTest ORDER BY dayaniklilik_id DESC")
	If rs.RowCount>0 Then
		rs.Position=0
		DayananiklilikTestID = sf.Right("00" &sf.Trim(sf.Val(sf.Right(rs.GetString("dayaniklilik_id"),3))+1),3)
	Else
		DayananiklilikTestID="001"
	End If
	rs.Close
End Sub
