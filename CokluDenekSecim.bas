B4A=true
Group=SportExpertProjeDosyası\Test
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

	Private CheckBoxSecim As CheckBox
	Private LabelDenekTc As Label
	Private LabelDenekIsim As Label
	Private LabelId As Label
	Private CustomListView1 As CustomListView
	Private WebView1 As WebView
	
	Dim id As Int
	Dim isim,tc As String
	
	Dim rs As ResultSet
	Dim checkedItemList As List
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("CokluDenekSecimiPage")
	

	ListViewGosterDB
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub CreateListItem(TextTC As String, TextIsim As String,TextID As Int, Width As Int, Height As Int) As Panel
	Dim panel As Panel
	panel.Initialize("")
	panel.SetLayout(0,0,Width,Height)
	panel.LoadLayout("GelismisTestDenekAraCustomLvVeriPage")
	
'	LabelId.Visible = False
	LabelDenekTc.Text = TextTC
	LabelDenekIsim.Text = TextIsim
	LabelId.Text = TextID
	
	Return panel
End Sub

Sub VeriAl
	id = rs.GetInt("denek_id")
	tc = rs.GetString("denek_tc")
	isim = rs.GetString("denek_isim")
End Sub

Sub ListViewGosterDB
	rs = Main.sql.ExecQuery("SELECT * FROM Denek ORDER BY denek_id DESC")
	For i = 0 To rs.RowCount-1
		rs.Position = i
		VeriAl
		CustomListView1.Add(CreateListItem(tc,isim,id,CustomListView1.AsView.Width,100dip),id)
	Next
	rs.Close
End Sub

Sub CheckBoxSecim_CheckedChange(Checked As Boolean)
'	Dim index As Int = CustomListView1.GetItemFromView(Sender)
'	Dim panel As B4XView = CustomListView1.GetPanel(index)
'	Dim check As B4XView = panel.GetView(0)
'	MsgboxAsync($" Deger : ${CustomListView1.GetValue(index)}
'Check Box Degeri : ${check.Checked}"$, "Bildirim")

	checkedItemList.Initialize
	
	For i=0 To CustomListView1.GetSize - 1
		Dim panel2 As B4XView = CustomListView1.GetPanel(i)
		Dim chk As B4XView = panel2.GetView(0)
		
		If chk.Checked Then
			checkedItemList.Add(CustomListView1.GetValue(i)) 
		End If
	Next
End Sub

Sub CustomListView1_ItemClick (Index As Int, Value As Object)
	WebView1.Visible = True
	WebView1.LoadHtml(DBUtils.ExecuteHtml(Main.sql,"SELECT denek_tc As [Denek TC], denek_isim As [Denek İSİM],cinsiyet_adi As [CİNSİYET],denek_dogumTarihi As[DENEK DOĞUM TARİHİ],il_adi As [DOĞUM YERİ],denek_babaAdi As [DENEK BABA ADI],denek_engelDurumu As [DENEK ENGEL DURUMU],denek_takimOkul As [TAKIM/OKUL],denek_bransSinif As [BRANŞ/SINIF],denek_mevki As [MEVKİ] FROM Denek WHERE denek_id = '"&Value&"' ",Null,-1,False))
End Sub

Sub ButtonOK_Click
	For i=0 To checkedItemList.Size -1
		checkedItemList.Get(i)
		Log(checkedItemList.Get(i))
	Next
End Sub